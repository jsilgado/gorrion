package com.jsilgado.gorrion.dto.converters;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;

import com.google.common.base.Function;
import com.jsilgado.gorrion.domain.Acc;
import com.jsilgado.gorrion.dto.AccDTO;
import com.jsilgado.gorrion.util.Constantes;

public enum AccToDTO implements Function<Acc, AccDTO> {

	INSTANCE;

	@Override
	public AccDTO apply( final Acc input ) {
		AccDTO output = new AccDTO();

		if( input != null ) {
			ModelMapper modelMapper = new ModelMapper();
			output = modelMapper.map( input, AccDTO.class );
		}

		output.setLstParticipantes( new ArrayList<>() );

		// Color Estado
		if( output.getEstado().equalsIgnoreCase( Constantes.ACC_ESTADO.ENTREGADA ) ) {
			output.setColorEstado( Constantes.COLOR.VERDE );
		}
		if( output.getEstado().equalsIgnoreCase( Constantes.ACC_ESTADO.EN_EJECUCION ) ) {
			output.setColorEstado( Constantes.COLOR.AMARILLO );
		}
		if( output.getEstado().equalsIgnoreCase( Constantes.ACC_ESTADO.APLAZADA ) ) {
			output.setColorEstado( Constantes.COLOR.ROJO );
		}
		if( output.getEstado().equalsIgnoreCase( Constantes.ACC_ESTADO.CERRADA ) ) {
			output.setColorEstado( Constantes.COLOR.AZUL );
		}

		return output;
	}

}
