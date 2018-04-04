package com.jsilgado.gorrion.bs.interfaces;

import java.io.Serializable;
import java.util.List;

import com.jsilgado.gorrion.exception.BusinessException;

/**
 * Descripcion de clase
 *
 * @author dblancoc
 * @version 1.0
 * @created: 16 de ago. de 2016
 */
public interface GenericBS<D, E, K extends Serializable> extends Serializable {

	List<D> findAll() throws BusinessException;

	void delete( D entity ) throws BusinessException;

	void deleteById( K key ) throws BusinessException;

	D getById( K key ) throws BusinessException;

	void save( D entity ) throws BusinessException;

}
