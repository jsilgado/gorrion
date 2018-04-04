package com.jsilgado.gorrion.bs.impl;

import java.util.ArrayList;
import java.util.Iterator;
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
import com.jsilgado.gorrion.bs.interfaces.PeticionBS;
import com.jsilgado.gorrion.dao.PeticionDAO;
import com.jsilgado.gorrion.dao.TareaDAO;
import com.jsilgado.gorrion.domain.Peticion;
import com.jsilgado.gorrion.dto.PeticionDTO;
import com.jsilgado.gorrion.dto.TareaDTO;
import com.jsilgado.gorrion.dto.converters.PeticionToDTO;
import com.jsilgado.gorrion.dto.converters.TareaToDTO;
import com.jsilgado.gorrion.exception.BusinessException;
import com.jsilgado.gorrion.exception.DAOException;

/**
 * Clase contenedora de la logica de negocio de las Peticiones
 *
 * @author jsilgado
 * @date 24/11/2017
 *
 */
@Service
@Transactional
@Configurable
public class PeticionBSImpl extends GenericBSImpl<PeticionDTO, Peticion, Long> implements PeticionBS {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 4621658443445899613L;

	/**
	 * Log
	 */
	private static final Logger LOG = LoggerFactory.getLogger( PeticionBSImpl.class );

	@Autowired
	private PeticionDAO peticionDAO;

	@Autowired
	private TareaDAO tareaDAO;

	@Override
	public List<PeticionDTO> obtenerPeticiones() throws BusinessException {

		List<PeticionDTO> lstPeticionDTO = null;

		try {
			lstPeticionDTO = new ArrayList<PeticionDTO>( Lists.transform( peticionDAO.obtenerPeticiones(), getConverterToDTO() ) );

		} catch( DAOException e ) {
			LOG.error( e.getDescription() );
			throw new BusinessException( e );
		}

		return lstPeticionDTO;
	}

	@Override
	public List<PeticionDTO> obtenerPeticionesActivas() throws BusinessException {

		List<PeticionDTO> lstPeticionDTO = null;
		try {
			lstPeticionDTO = new ArrayList<PeticionDTO>( Lists.transform( peticionDAO.obtenerPeticionesActivas(), getConverterToDTO() ) );

			Iterator<PeticionDTO> it = lstPeticionDTO.iterator();
			while( it.hasNext() ) {
				PeticionDTO peticionDTO = it.next();
				peticionDTO.setLstTareas( new ArrayList<TareaDTO>( Lists.transform( tareaDAO.obtenerTareasPeticion( peticionDTO.getId() ), TareaToDTO.INSTANCE ) ) );
			}

		} catch( DAOException e ) {
			LOG.error( e.getDescription() );
			throw new BusinessException( e );
		}

		return lstPeticionDTO;
	}

	@Override
	public List<PeticionDTO> obtenerPeticionesEvolutivas() throws BusinessException {

		List<PeticionDTO> lstPeticionDTO = null;

		try {
			lstPeticionDTO = new ArrayList<PeticionDTO>( Lists.transform( peticionDAO.obtenerPeticionesEvolutivas(), getConverterToDTO() ) );

			Iterator<PeticionDTO> it = lstPeticionDTO.iterator();
			while( it.hasNext() ) {
				PeticionDTO peticionDTO = it.next();
				peticionDTO.setLstTareas( new ArrayList<TareaDTO>( Lists.transform( tareaDAO.obtenerTareasPeticion( peticionDTO.getId() ), TareaToDTO.INSTANCE ) ) );
			}

		} catch( DAOException e ) {
			LOG.error( e.getDescription() );
			throw new BusinessException( e );
		}

		return lstPeticionDTO;
	}

	// TODO: Hacer metodo de obtencion de tareas

	@Override
	protected JpaRepository<Peticion, Long> getDao() {
		return peticionDAO;
	}

	@Override
	protected Function<Peticion, PeticionDTO> getConverterToDTO() {
		return PeticionToDTO.INSTANCE;
	}

	@Override
	protected Function<PeticionDTO, Peticion> getConverterToEntity() {
		return null;
	}

}
