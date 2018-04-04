package com.jsilgado.gorrion.bs.interfaces;

import java.util.List;

import com.jsilgado.gorrion.domain.Peticion;
import com.jsilgado.gorrion.dto.PeticionDTO;
import com.jsilgado.gorrion.exception.BusinessException;


/**
 * Clase contenedora de la logica de negocio para las TPVs
 *
 * @author jsilgado
 * @date 21/11/2017
 *
 */
public interface PeticionBS extends GenericBS<PeticionDTO, Peticion, Long> {

	/**
	 * Metodo que obtiene una lista de todas las peticiones
	 *
	 * @return
	 * @throws BusinessException
	 */
	List<PeticionDTO> obtenerPeticiones() throws BusinessException;

	/**
	 * Metodo que obtiene una lista de peticiones activas de BD
	 *
	 * @return
	 * @throws BusinessException
	 */
	List<PeticionDTO> obtenerPeticionesActivas() throws BusinessException;

	/**
	 * Metodo que obtiene una lista de peticiones evolutivas
	 *
	 * @return
	 * @throws BusinessException
	 */
	List<PeticionDTO> obtenerPeticionesEvolutivas() throws BusinessException;

}
