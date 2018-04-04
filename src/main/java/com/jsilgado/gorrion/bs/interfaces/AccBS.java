package com.jsilgado.gorrion.bs.interfaces;

import java.util.List;

import com.jsilgado.gorrion.domain.Acc;
import com.jsilgado.gorrion.dto.AccDTO;
import com.jsilgado.gorrion.exception.BusinessException;

/**
 * Clase contenedora de la logica de negocio para las TPVs
 *
 * @author ndiaruiz
 * @date 21/11/2017
 *
 */
public interface AccBS extends GenericBS<AccDTO, Acc, Long> {

	/**
	 * Metodo que obtiene la lista de accs de la peticion de correctivo
	 *
	 * @return
	 * @throws BusinessException
	 */
	List<AccDTO> obtenerAccCorrectivas() throws BusinessException;

	/**
	 * Metodo que obtiene la lista de accs de la peticion de soporte
	 *
	 * @return
	 * @throws BusinessException
	 */
	List<AccDTO> obtenerAccSoportes() throws BusinessException;

	/**
	 * Metodo que obtiene la lista de accs Highlights
	 *
	 * @return
	 * @throws BusinessException
	 */
	List<AccDTO> obtenerAccHighlights() throws BusinessException;

}
