package com.jsilgado.gorrion.bs.interfaces;

import java.util.Date;
import java.util.List;

import com.jsilgado.gorrion.domain.Incurrido;
import com.jsilgado.gorrion.dto.IncurridoDTO;
import com.jsilgado.gorrion.exception.BusinessException;

/**
 * Clase contenedora de la logica de negocio para los Incurridos
 *
 * @author jsilgado
 * @date 21/11/2017
 *
 */
public interface IncurridoBS extends GenericBS<IncurridoDTO, Incurrido, Long> {

	/**
	 * Metodo que obtiene los incurridos de un empleado
	 *
	 * @return
	 * @throws BusinessException
	 */
	List<IncurridoDTO> obtenerIncurridosEmpleadoEntreFechas( Long lNroEmpleado, Date fechaInicial, Date fechaFinal ) throws BusinessException;

}
