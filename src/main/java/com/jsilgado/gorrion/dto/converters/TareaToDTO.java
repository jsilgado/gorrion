package com.jsilgado.gorrion.dto.converters;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;

import org.modelmapper.ModelMapper;

import com.google.common.base.Function;
import com.jsilgado.gorrion.domain.Tarea;
import com.jsilgado.gorrion.dto.TareaDTO;
import com.jsilgado.gorrion.util.Constantes;


public enum TareaToDTO implements Function<Tarea, TareaDTO> {

	INSTANCE;

	@Override
	public TareaDTO apply( final Tarea input ) {
		TareaDTO output = new TareaDTO();

		if( input != null ) {
			ModelMapper modelMapper = new ModelMapper();
			output = modelMapper.map( input, TareaDTO.class );
		}

		if( input.getEtc() != null && input.getIncurrido() != null && input.getEstimado() != null ) {
			if( input.getEtc() + input.getIncurrido() != 0 ) {
				BigDecimal bdAvance = new BigDecimal( 100 * (1 - input.getEtc() / (input.getEtc() + input.getIncurrido())) );
				bdAvance = bdAvance.setScale( 2, RoundingMode.HALF_UP );
				output.setAvance( bdAvance.doubleValue() );
			}

			BigDecimal bdDesvio = new BigDecimal( input.getIncurrido() + input.getEtc() - input.getEstimado() );
			bdDesvio = bdDesvio.setScale( 2, RoundingMode.HALF_UP );
			output.setDesvio( bdDesvio.doubleValue() );

			if( input.getEstimado() != 0 ) {

				// Porcentaje desvio
				BigDecimal bdPorcentajeDesvio = new BigDecimal( 100 * (input.getIncurrido() + input.getEtc() - input.getEstimado()) / input.getEstimado() );
				bdPorcentajeDesvio = bdPorcentajeDesvio.setScale( 2, RoundingMode.HALF_UP );
				output.setPorcentajeDesvio( bdPorcentajeDesvio.doubleValue() );

				// Color del desvio
				if( bdPorcentajeDesvio.doubleValue() > Constantes.DESVIO.PORCENTAJE_DESVIO_OBJETIVO ) {
					output.setColorPorcentajeDesvio( Constantes.COLOR.ROJO );
				} else if( bdPorcentajeDesvio.doubleValue() <= 0 ) {
					output.setColorPorcentajeDesvio( Constantes.COLOR.VERDE );
				} else {
					output.setColorPorcentajeDesvio( Constantes.COLOR.AMARILLO );
				}
			}

			// Color Fecha Fin
			if( input.getFechaFin() != null ) {
				Date dateHoy = new Date();
				Calendar c = Calendar.getInstance();
				c.setTime( dateHoy );
				c.add( Calendar.DATE, -2 );
				Date dateAlarma = c.getTime();

				if( dateHoy.after( input.getFechaFin() ) && input.getEtc() > 0 ) {
					output.setColorFechaFin( Constantes.COLOR.ROJO );
				}
				if( input.getFechaFin().after( dateAlarma ) && input.getFechaFin().before( dateAlarma ) ) {
					output.setColorFechaFin( Constantes.COLOR.AMARILLO );
				}
			}
		}

		return output;
	}

}
