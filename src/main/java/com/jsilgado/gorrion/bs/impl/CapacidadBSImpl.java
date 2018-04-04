package com.jsilgado.gorrion.bs.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsilgado.gorrion.bs.interfaces.CapacidadBS;
import com.jsilgado.gorrion.bs.interfaces.EmpleadoBS;
import com.jsilgado.gorrion.bs.interfaces.IncurridoBS;
import com.jsilgado.gorrion.dto.CalendarioDTO;
import com.jsilgado.gorrion.dto.CapacidadDiaDTO;
import com.jsilgado.gorrion.dto.EmpleadoDTO;
import com.jsilgado.gorrion.dto.IncurridoDTO;
import com.jsilgado.gorrion.exception.BusinessException;
import com.jsilgado.gorrion.util.Constantes;


/**
 * Clase contenedora de la logica de negocio para la capacidad
 *
 * @author jsilgado
 * @date 24/11/2017
 *
 */
@Service
@Transactional
@Configurable
public class CapacidadBSImpl implements CapacidadBS {

	/**
	 * Log
	 */
	private static final Logger LOG = LoggerFactory.getLogger( CapacidadBSImpl.class );

	@Autowired
	private IncurridoBS incurridoBS;

	@Autowired
	private EmpleadoBS empleadoBS;

	@Override
	public Double calcularHorasCapacidad( final Date fechaInicial, final Date fechaFinal ) throws BusinessException {

		// Salida
		Double dHorasCapacidad = 0D;

		List<EmpleadoDTO> lstEmpleadosActivos = empleadoBS.obtenerEmpleadosActivos();

		Iterator<EmpleadoDTO> it = lstEmpleadosActivos.iterator();
		while( it.hasNext() ) {
			EmpleadoDTO empleadoDTO = it.next();
			HashMap<String, CapacidadDiaDTO> hamCapacidad = this.calcularCapacidadEmpleado( empleadoDTO, fechaInicial, fechaFinal );
			CapacidadDiaDTO capacidadDiaDTO = hamCapacidad.get( "TOTAL" );
			dHorasCapacidad += capacidadDiaDTO.getHoras();

		}

		return dHorasCapacidad;
	}

	@Override
	public HashMap<String, CapacidadDiaDTO> calcularCapacidadEmpleado( final EmpleadoDTO empleadoDTO, final Date fechaInicial, final Date fechaFinal ) throws BusinessException {

		// HashMap de Salida
		HashMap<String, CapacidadDiaDTO> hamCapacidad = new HashMap<>();

		// Recuperamos todos los calendarios del anyo del empleado
		List<CalendarioDTO> lstCalendarios = this.obtieneCalendarios( empleadoDTO.getDescripcionHorario() );

		// Obtenemos la capacidad a partir de los calendarios
		hamCapacidad = this.obtenerCapacidad( fechaInicial, fechaFinal, lstCalendarios );

		// Recuperamos los incurridos del empleado
		List<IncurridoDTO> lstIncurridos = incurridoBS.obtenerIncurridosEmpleadoEntreFechas( empleadoDTO.getNroEmpleado(), fechaInicial, fechaFinal );

		// A la capacidad sin incurridos le aplicamos los incurridos
		hamCapacidad = calculaCapacidadConIncurridos( hamCapacidad, lstIncurridos );

		hamCapacidad = calculaTotalCapacidad( hamCapacidad );

		return hamCapacidad;
	}

	/**
	 * Calcula los calendarios a partir del String de la descripcion del horario Descripcion del metodo
	 *
	 * @param strDescripcionHorario
	 * @return
	 */
	private List<CalendarioDTO> obtieneCalendarios( final String strDescripcionHorario ) {

		Collection<String> lstHorarios = Arrays.asList( strDescripcionHorario.split( ", " ) );

		ArrayList<CalendarioDTO> lstCalendarios = new ArrayList<>();

		Iterator<String> it = lstHorarios.iterator();
		while( it.hasNext() ) {
			String strHorario = it.next();
			String strFechas = strHorario.substring( 0, strHorario.lastIndexOf( ": " ) );
			String strHoras = strHorario.substring( strHorario.lastIndexOf( ": " ) + 2 );

			String strFechaInicio = strFechas.substring( 0, strFechas.lastIndexOf( "- " ) - 1 );
			String strFechaFin = strFechas.substring( strFechas.lastIndexOf( "- " ) + 2 );

			String[] arrayHoras = strHoras.split( "-" );

			SimpleDateFormat formatter = new SimpleDateFormat( "dd/MM" );

			CalendarioDTO calendarioDTO = new CalendarioDTO();
			try {
				calendarioDTO.setFechaInicio( formatter.parse( strFechaInicio ) );
				calendarioDTO.setFechaFin( formatter.parse( strFechaFin ) );
			} catch( ParseException e ) {
				LOG.error( e.getMessage() );
			}

			calendarioDTO.setLunes( Double.parseDouble( arrayHoras[0] ) );
			calendarioDTO.setMartes( Double.parseDouble( arrayHoras[1] ) );
			calendarioDTO.setMiercoles( Double.parseDouble( arrayHoras[2] ) );
			calendarioDTO.setJueves( Double.parseDouble( arrayHoras[3] ) );
			calendarioDTO.setViernes( Double.parseDouble( arrayHoras[4] ) );

			lstCalendarios.add( calendarioDTO );

		}

		return lstCalendarios;
	}

	/**
	 *
	 * @param fechaInicial
	 * @param fechaFinal
	 * @return horas capacidad
	 */
	private HashMap<String, CapacidadDiaDTO> obtenerCapacidad( final Date fechaInicial, final Date fechaFinal, final List<CalendarioDTO> lstCalendarios ) {

		HashMap<String, CapacidadDiaDTO> hamCapacidad = new HashMap<>();

		Calendar calInicial = Calendar.getInstance();
		calInicial.setTime( fechaInicial );

		Calendar calFinal = Calendar.getInstance();
		calFinal.setTime( fechaFinal );

		SimpleDateFormat formatter = new SimpleDateFormat( Constantes.FORMATTER_DATE );

		// mientras la fecha inicial sea menor o igual que la fecha final se cuentan los dias
		while( calInicial.before( calFinal ) || calInicial.equals( calFinal ) ) {

			CalendarioDTO calendarioDTO = calculaCalendarioFecha( calInicial.getTime(), lstCalendarios );

			CapacidadDiaDTO capacidadDiaDTO = new CapacidadDiaDTO();
			if( calInicial.get( Calendar.DAY_OF_WEEK ) == Calendar.MONDAY ) {
				capacidadDiaDTO.setHoras( calendarioDTO.getLunes() );
			}
			if( calInicial.get( Calendar.DAY_OF_WEEK ) == Calendar.TUESDAY ) {
				capacidadDiaDTO.setHoras( calendarioDTO.getMartes() );
			}

			if( calInicial.get( Calendar.DAY_OF_WEEK ) == Calendar.WEDNESDAY ) {
				capacidadDiaDTO.setHoras( calendarioDTO.getMiercoles() );
			}

			if( calInicial.get( Calendar.DAY_OF_WEEK ) == Calendar.THURSDAY ) {
				capacidadDiaDTO.setHoras( calendarioDTO.getJueves() );
			}

			if( calInicial.get( Calendar.DAY_OF_WEEK ) == Calendar.FRIDAY ) {
				capacidadDiaDTO.setHoras( calendarioDTO.getViernes() );
			}
			if( calInicial.get( Calendar.DAY_OF_WEEK ) == Calendar.SATURDAY ) {
				capacidadDiaDTO.setHoras( calendarioDTO.getSabado() );
				capacidadDiaDTO.setLeyenda( Constantes.CAPACIDAD_LEYENDA.FIN_DE_SEMANA );
				capacidadDiaDTO.setColor( Constantes.CAPACIDAD_COLOR.FIN_DE_SEMANA );
			}
			if( calInicial.get( Calendar.DAY_OF_WEEK ) == Calendar.SUNDAY ) {
				capacidadDiaDTO.setHoras( calendarioDTO.getDomingo() );
				capacidadDiaDTO.setLeyenda( Constantes.CAPACIDAD_LEYENDA.FIN_DE_SEMANA );
				capacidadDiaDTO.setColor( Constantes.CAPACIDAD_COLOR.FIN_DE_SEMANA );
			}

			// Si el dia es completo se pone la leyenda si hay alguna hora se pone la hora.
			if( capacidadDiaDTO.getHoras().equals( 0D ) ) {
				capacidadDiaDTO.setCasilla( capacidadDiaDTO.getLeyenda() );
			} else {
				capacidadDiaDTO.setCasilla( capacidadDiaDTO.getHoras().toString() );
			}
			hamCapacidad.put( formatter.format( calInicial.getTime() ), capacidadDiaDTO );

			// se suma 1 dia para hacer la validación del siguiente dia.
			calInicial.add( Calendar.DATE, 1 );
		}
		return hamCapacidad;
	}

	private CalendarioDTO calculaCalendarioFecha( final Date dateFecha, final List<CalendarioDTO> lstCalendarios ) {

		CalendarioDTO calendarioDTO = new CalendarioDTO();

		Calendar calendarFecha = Calendar.getInstance();
		calendarFecha.setTime( dateFecha );

		Iterator<CalendarioDTO> it = lstCalendarios.iterator();
		while( it.hasNext() ) {
			CalendarioDTO calendarioTemp = it.next();

			Calendar calendarFechaInicio = Calendar.getInstance();
			calendarFechaInicio.setTime( calendarioTemp.getFechaInicio() );
			calendarFechaInicio.set( Calendar.YEAR, calendarFecha.get( Calendar.YEAR ) );

			Calendar calendarFechaFin = Calendar.getInstance();
			calendarFechaFin.setTime( calendarioTemp.getFechaFin() );
			calendarFechaFin.set( Calendar.YEAR, calendarFecha.get( Calendar.YEAR ) );

			if( calendarFechaInicio.compareTo( calendarFecha ) * calendarFecha.compareTo( calendarFechaFin ) >= 0 ) {
				calendarioDTO = calendarioTemp;
			}

		}

		return calendarioDTO;

	}

	private HashMap<String, CapacidadDiaDTO> calculaCapacidadConIncurridos( final HashMap<String, CapacidadDiaDTO> hamCapacidad, final List<IncurridoDTO> lstIncurridos ) {

		// HashMap de Salida
		HashMap<String, CapacidadDiaDTO> hamCapacidadSalida = hamCapacidad;

		SimpleDateFormat formatter = new SimpleDateFormat( Constantes.FORMATTER_DATE );

		Iterator<IncurridoDTO> it = lstIncurridos.iterator();
		while( it.hasNext() ) {
			IncurridoDTO incurridoDTO = it.next();

			CapacidadDiaDTO capacidadDiaDTO = hamCapacidadSalida.get( formatter.format( incurridoDTO.getFecha() ) );

			capacidadDiaDTO.setTooltip( incurridoDTO.getComentarioTarea() );
			if( incurridoDTO.getDescripcionTarea().contains( Constantes.CAPACIDAD_TEXTO_TAREA.AUSENCIA_LEGAL ) ) {
				capacidadDiaDTO.setColor( Constantes.CAPACIDAD_COLOR.AUSENCIA_LEGAL );
				capacidadDiaDTO.setLeyenda( Constantes.CAPACIDAD_LEYENDA.AUSENCIA_LEGAL );
				capacidadDiaDTO.setHoras( Double.sum( capacidadDiaDTO.getHoras(), -incurridoDTO.getHorasIncurridas() ) );
			}
			if( incurridoDTO.getDescripcionTarea().contains( Constantes.CAPACIDAD_TEXTO_TAREA.VACACIONES ) ) {
				capacidadDiaDTO.setColor( Constantes.CAPACIDAD_COLOR.VACACIONES );
				capacidadDiaDTO.setLeyenda( Constantes.CAPACIDAD_LEYENDA.VACACIONES );
				capacidadDiaDTO.setHoras( Double.sum( capacidadDiaDTO.getHoras(), -incurridoDTO.getHorasIncurridas() ) );
			}
			if( incurridoDTO.getDescripcionTarea().contains( Constantes.CAPACIDAD_TEXTO_TAREA.FESTIVO ) ) {
				capacidadDiaDTO.setColor( Constantes.CAPACIDAD_COLOR.FESTIVO );
				capacidadDiaDTO.setLeyenda( Constantes.CAPACIDAD_LEYENDA.FESTIVO );
				capacidadDiaDTO.setHoras( Double.sum( capacidadDiaDTO.getHoras(), -incurridoDTO.getHorasIncurridas() ) );
			}
			if( incurridoDTO.getDescripcionTarea().contains( Constantes.CAPACIDAD_TEXTO_TAREA.COMPENSADOS ) ) {
				capacidadDiaDTO.setColor( Constantes.CAPACIDAD_COLOR.COMPENSADO );
				capacidadDiaDTO.setLeyenda( Constantes.CAPACIDAD_LEYENDA.COMPENSADO );
				capacidadDiaDTO.setHoras( Double.sum( capacidadDiaDTO.getHoras(), -incurridoDTO.getHorasIncurridas() ) );
			}
			if( incurridoDTO.getDescripcionTarea().contains( Constantes.CAPACIDAD_TEXTO_TAREA.ENFERMEDAD ) ) {
				capacidadDiaDTO.setColor( Constantes.CAPACIDAD_COLOR.ENFERMEDAD );
				capacidadDiaDTO.setLeyenda( Constantes.CAPACIDAD_LEYENDA.ENFERMEDAD );
				capacidadDiaDTO.setHoras( Double.sum( capacidadDiaDTO.getHoras(), -incurridoDTO.getHorasIncurridas() ) );
			}
			if( incurridoDTO.getDescripcionTarea().contains( Constantes.CAPACIDAD_TEXTO_TAREA.FORMACION ) ) {
				capacidadDiaDTO.setColor( Constantes.CAPACIDAD_COLOR.FORMACION );
				capacidadDiaDTO.setLeyenda( Constantes.CAPACIDAD_LEYENDA.FORMACION );
				capacidadDiaDTO.setHoras( Double.sum( capacidadDiaDTO.getHoras(), -incurridoDTO.getHorasIncurridas() ) );
			}

			// Si es una tarea no cargable y aun no la tenemos tipificada, restamos las horas
			if( incurridoDTO.getConceptoDisponible().contains( Constantes.CONCEPTO_DISPONIBLE.NO_FACTURABLE ) && StringUtils.isBlank( capacidadDiaDTO.getLeyenda() ) ) {
				capacidadDiaDTO.setHoras( Double.sum( capacidadDiaDTO.getHoras(), -incurridoDTO.getHorasIncurridas() ) );
			}

			// Si el dia es completo se pone la leyenda si hay alguna hora se pone la hora.
			if( capacidadDiaDTO.getHoras().equals( 0D ) ) {
				capacidadDiaDTO.setCasilla( capacidadDiaDTO.getLeyenda() );
			} else {
				capacidadDiaDTO.setCasilla( capacidadDiaDTO.getHoras().toString() );
			}

		}

		return hamCapacidadSalida;
	}

	private HashMap<String, CapacidadDiaDTO> calculaTotalCapacidad( final HashMap<String, CapacidadDiaDTO> hamCapacidad ) {

		// HashMap de Salida
		HashMap<String, CapacidadDiaDTO> hamCapacidadSalida = hamCapacidad;

		CapacidadDiaDTO capacidadDiaDTOTotal = new CapacidadDiaDTO();
		capacidadDiaDTOTotal.setHoras( Double.valueOf( 0D ) );

		Iterator<String> it = hamCapacidadSalida.keySet().iterator();
		while( it.hasNext() ) {
			String strFecha = it.next();
			CapacidadDiaDTO capacidadDiaDTOTemp = hamCapacidadSalida.get( strFecha );
			capacidadDiaDTOTotal.setHoras( Double.sum( capacidadDiaDTOTotal.getHoras(), capacidadDiaDTOTemp.getHoras() ) );
		}

		capacidadDiaDTOTotal.setCasilla( capacidadDiaDTOTotal.getHoras().toString() );
		hamCapacidadSalida.put( "TOTAL", capacidadDiaDTOTotal );

		return hamCapacidadSalida;
	}

}
