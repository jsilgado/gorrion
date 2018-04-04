package com.jsilgado.gorrion.dto.converters;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;

import com.google.common.base.Function;
import com.jsilgado.gorrion.domain.Peticion;
import com.jsilgado.gorrion.dto.PeticionDTO;
import com.jsilgado.gorrion.util.Constantes;


public enum PeticionToDTO implements Function<Peticion, PeticionDTO> {

	INSTANCE;

	@Override
	public PeticionDTO apply( final Peticion input ) {
		PeticionDTO output = new PeticionDTO();

		if( input != null ) {
			ModelMapper modelMapper = new ModelMapper();
			output = modelMapper.map( input, PeticionDTO.class );

			if( !input.getCodigoCliente().contains( "AMEVERIS" ) ) {
				output.setCodigoCliente( StringUtils.EMPTY );
			}

			if( input.getHorasAcuerdo() == null ) {
				output.setHorasAcuerdo( Double.valueOf( 0 ) );
			}

			if( input.getIncurridoTotal() != null && input.getIncurridoTotal() != 0 && input.getHorasAcuerdo() != null ) {
				BigDecimal bdAvance = new BigDecimal( 100 * (1 - input.getEtc() / (input.getEtc() + input.getIncurridoTotal())) );
				bdAvance = bdAvance.setScale( 2, RoundingMode.HALF_UP );
				output.setAvance( bdAvance.doubleValue() );

				BigDecimal bdDesvio = new BigDecimal( input.getIncurridoTotal() + input.getEtc() - input.getHorasAcuerdo() );
				bdDesvio = bdDesvio.setScale( 2, RoundingMode.HALF_UP );
				output.setDesvio( bdDesvio.doubleValue() );
			}

			if( input.getHorasAcuerdo() != null && input.getHorasAcuerdo() != 0 ) {
				BigDecimal bdPorcentajeDesvio = new BigDecimal( 100 * (input.getIncurridoTotal() + input.getEtc() - input.getHorasAcuerdo()) / input.getHorasAcuerdo() );
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
			if( input.getCentroFechaFin() != null ) {
				Date dateHoy = new Date();
				Calendar c = Calendar.getInstance();
				c.setTime( dateHoy );
				c.add( Calendar.DATE, -2 );
				Date dateAlarma = c.getTime();

				if( dateHoy.after( input.getCentroFechaFin() ) && input.getEtc() > 0 ) {
					output.setColorCentroFechaFin( Constantes.COLOR.ROJO );
				}
				if( input.getCentroFechaFin().after( dateAlarma ) && input.getCentroFechaFin().before( dateAlarma ) ) {
					output.setColorCentroFechaFin( Constantes.COLOR.AMARILLO );
				}
			}
		}
		return output;
	}

}
