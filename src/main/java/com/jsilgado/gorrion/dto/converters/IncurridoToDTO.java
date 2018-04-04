package com.jsilgado.gorrion.dto.converters;

import org.modelmapper.ModelMapper;

import com.google.common.base.Function;
import com.jsilgado.gorrion.domain.Incurrido;
import com.jsilgado.gorrion.dto.IncurridoDTO;

public enum IncurridoToDTO implements Function<Incurrido, IncurridoDTO> {

	INSTANCE;

	@Override
	public IncurridoDTO apply( final Incurrido input ) {
		IncurridoDTO output = new IncurridoDTO();

		if( input != null ) {
			ModelMapper modelMapper = new ModelMapper();
			output = modelMapper.map( input, IncurridoDTO.class );
		}

		return output;
	}

}
