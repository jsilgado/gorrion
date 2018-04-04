package com.jsilgado.gorrion.bs.interfaces;

import java.util.List;

import com.jsilgado.gorrion.domain.Empleado;
import com.jsilgado.gorrion.dto.EmpleadoDTO;
import com.jsilgado.gorrion.exception.BusinessException;

/**
 * Clase contenedora de la logica de negocio para los empleados
 *
 * @author jsilgado
 *
 */
public interface EmpleadoBS extends GenericBS<EmpleadoDTO, Empleado, Long> {

	/**
	 * Metodo que obtiene la lista empleados
	 *
	 * @return
	 * @throws BusinessException
	 */
	List<EmpleadoDTO> obtenerEmpleadosActivos() throws BusinessException;

}
