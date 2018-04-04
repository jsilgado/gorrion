package com.jsilgado.gorrion.dto.converters;

import org.modelmapper.ModelMapper;

import com.google.common.base.Function;
import com.jsilgado.gorrion.domain.Empleado;
import com.jsilgado.gorrion.dto.EmpleadoDTO;


public enum EmpleadoToDTO implements Function<Empleado, EmpleadoDTO> {

	INSTANCE;

	@Override
	public EmpleadoDTO apply( final Empleado input ) {
		EmpleadoDTO output = new EmpleadoDTO();

		if( input != null ) {
			ModelMapper modelMapper = new ModelMapper();
			output = modelMapper.map( input, EmpleadoDTO.class );
		}

		return output;
	}

}
