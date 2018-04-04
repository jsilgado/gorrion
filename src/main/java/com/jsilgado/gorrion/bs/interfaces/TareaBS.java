package com.jsilgado.gorrion.bs.interfaces;

import java.util.List;

import com.jsilgado.gorrion.domain.Tarea;
import com.jsilgado.gorrion.dto.TareaDTO;
import com.jsilgado.gorrion.exception.BusinessException;

/**
 * Clase contenedora de la logica de negocio para las Tareas
 *
 * @author jsilgado
 * @date 21/11/2017
 *
 */
public interface TareaBS extends GenericBS<TareaDTO, Tarea, Long> {

	/**
	 * Metodo que obtiene la lista de tareas de una peticion
	 *
	 * @return
	 * @throws BusinessException
	 */
	List<TareaDTO> obtenerTareasPeticion( Long lPeticion ) throws BusinessException;

}
