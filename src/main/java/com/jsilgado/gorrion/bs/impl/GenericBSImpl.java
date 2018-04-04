package com.jsilgado.gorrion.bs.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.jsilgado.gorrion.bs.interfaces.GenericBS;

/**
 * Clase generica de metodos de BS
 *
 * @author jsilgado
 */
public abstract class GenericBSImpl<D, E, K extends Serializable> implements GenericBS<D, E, K> {

	private static final long serialVersionUID = 1L;

	protected abstract JpaRepository<E, K> getDao();

	protected abstract Function<E, D> getConverterToDTO();

	protected abstract Function<D, E> getConverterToEntity();

	@Override
	public List<D> findAll() {
		List<E> entities = getDao().findAll();
		return new ArrayList<D>( Lists.transform( entities, getConverterToDTO() ) );
	}

	@Override
	public void delete( final D dto ) {
		getDao().delete( getConverterToEntity().apply( dto ) );
	}

	@Override
	public void deleteById( final K key ) {
		getDao().deleteById( key );
	}

	@Override
	public D getById( final K key ) {
		return getConverterToDTO().apply( getDao().getOne( key ) );
	}

	@Override
	public void save( final D dto ) {
		getDao().save( getConverterToEntity().apply( dto ) );

	}

}
