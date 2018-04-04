package com.jsilgado.gorrion.bs.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.jsilgado.gorrion.bs.interfaces.TareaBS;
import com.jsilgado.gorrion.dao.TareaDAO;
import com.jsilgado.gorrion.domain.Tarea;
import com.jsilgado.gorrion.dto.TareaDTO;
import com.jsilgado.gorrion.dto.converters.TareaToDTO;
import com.jsilgado.gorrion.exception.BusinessException;
import com.jsilgado.gorrion.exception.DAOException;

/**
 * Clase contenedora de la logica de negocio para las Tareas
 *
 * @author jsilgado
 * @date 24/11/2017
 *
 */
@Service
@Transactional
@Configurable
public class TareaBSImpl extends GenericBSImpl<TareaDTO, Tarea, Long> implements TareaBS {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 4621658443445899613L;

	/**
	 * Log
	 */
	private static final Logger LOG = LoggerFactory.getLogger( TareaBSImpl.class );

	@Autowired
	private TareaDAO tareaDAO;

	@Override
	public List<TareaDTO> obtenerTareasPeticion( final Long lPeticion ) throws BusinessException {

		List<TareaDTO> lstTarea = new ArrayList<>();
		try {
			lstTarea = new ArrayList<TareaDTO>( Lists.transform( tareaDAO.obtenerTareasPeticion( lPeticion ), getConverterToDTO() ) );
		} catch( DAOException e ) {
			LOG.error( e.getDescription() );
			throw new BusinessException( e );
		}

		return lstTarea;
	}

	@Override
	protected JpaRepository<Tarea, Long> getDao() {
		return tareaDAO;
	}

	@Override
	protected Function<Tarea, TareaDTO> getConverterToDTO() {
		return TareaToDTO.INSTANCE;
	}

	@Override
	protected Function<TareaDTO, Tarea> getConverterToEntity() {
		return null;
	}

}
