package com.jsilgado.gorrion.dto.converters;

import org.modelmapper.ModelMapper;

import com.google.common.base.Function;
import com.jsilgado.gorrion.domain.IncidenciaOt;
import com.jsilgado.gorrion.dto.IncidenciaOtDTO;

public enum IncidenciaOtToDTO implements Function<IncidenciaOt, IncidenciaOtDTO> {

	INSTANCE;

	@Override
	public IncidenciaOtDTO apply( final IncidenciaOt input ) {
		IncidenciaOtDTO output = new IncidenciaOtDTO();

		if( input != null ) {
			ModelMapper modelMapper = new ModelMapper();
			output = modelMapper.map( input, IncidenciaOtDTO.class );
		}

		return output;
	}

}
