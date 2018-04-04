package com.jsilgado.gorrion.bs.interfaces;

import java.util.Date;
import java.util.HashMap;

import com.jsilgado.gorrion.dto.CapacidadDiaDTO;
import com.jsilgado.gorrion.dto.EmpleadoDTO;
import com.jsilgado.gorrion.exception.BusinessException;

/**
 * Clase contenedora de la logica de negocio para las Tareas
 *
 * @author ndiaruiz
 * @date 21/11/2017
 *
 */
public interface CapacidadBS {

	/**
	 * Metodo que devuelve la capacidad de un empleado entre un rango de fechas Se devuelve un HashMap cuya key es el dia y el value un DTO con los datos de la capacidad
	 *
	 * @return
	 * @throws BusinessException
	 */
	HashMap<String, CapacidadDiaDTO> calcularCapacidadEmpleado( final EmpleadoDTO empleadoDTO, final Date fechaInicial, final Date fechaFinal ) throws BusinessException;

	/**
	 * Metodo que devuelve las horas de capacidad del equipo entre un rango de fechas.
	 *
	 * @return
	 * @throws BusinessException
	 */
	Double calcularHorasCapacidad( final Date fechaInicial, final Date fechaFinal ) throws BusinessException;

}
