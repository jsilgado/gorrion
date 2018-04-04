package com.jsilgado.gorrion.bs.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
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
import com.jsilgado.gorrion.bs.interfaces.AccBS;
import com.jsilgado.gorrion.dao.AccDAO;
import com.jsilgado.gorrion.dao.PeticionDAO;
import com.jsilgado.gorrion.domain.Acc;
import com.jsilgado.gorrion.dto.AccDTO;
import com.jsilgado.gorrion.dto.converters.AccToDTO;
import com.jsilgado.gorrion.exception.BusinessException;
import com.jsilgado.gorrion.exception.DAOException;


/**
 * Clase contenedora de la logica de negocio para las Acc
 *
 * @author jsilgado
 *
 */
@Service
@Transactional
@Configurable
public class AccBSImpl extends GenericBSImpl<AccDTO, Acc, Long>implements AccBS {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 4621658443445899613L;

	/**
	 * Log
	 */
	private static final Logger LOG = LoggerFactory.getLogger( AccBSImpl.class );
	
	@Autowired
	protected AccDAO accDAO;

	@Autowired
	private PeticionDAO peticionDAO;

	@Override
	public List<AccDTO> obtenerAccCorrectivas() throws BusinessException {

		List<AccDTO> lstAcc = null;
		try {

			final Long lPet = peticionDAO.obtenerPeticionCorrectivos().getId();

			lstAcc = new ArrayList<AccDTO>( Lists.transform( accDAO.obtenerAccsPeticion( lPet ), getConverterToDTO() ) );

			lstAcc = tratarAccs( lstAcc );
		} catch( DAOException e ) {
			LOG.error( e.getDescription() );
			throw new BusinessException( e );
		}

		return lstAcc;
	}

	@Override
	public List<AccDTO> obtenerAccSoportes() throws BusinessException {

		List<AccDTO> lstAcc = null;
		try {
			final Long lPet = peticionDAO.obtenerPeticionSoportes().getId();

			lstAcc = new ArrayList<AccDTO>( Lists.transform( accDAO.obtenerAccsPeticion( lPet ), getConverterToDTO() ) );

			lstAcc = tratarAccs( lstAcc );
		} catch( DAOException e ) {
			LOG.error( e.getDescription() );
			throw new BusinessException( e );
		}

		return lstAcc;
	}

	@SuppressWarnings( { "rawtypes", "unchecked" } )
	@Override
	public List<AccDTO> obtenerAccHighlights() throws BusinessException {

		List<AccDTO> lstAcc = null;
		try {

			final Long lPetSoporte = peticionDAO.obtenerPeticionSoportes().getId();
			final Long lPetCorrectivo = peticionDAO.obtenerPeticionCorrectivos().getId();
			final Long lPetEvoExpress = peticionDAO.obtenerPeticionEvolutivoExpress().getId();

			lstAcc = new ArrayList<AccDTO>( Lists.transform( accDAO.obtenerAccHighlights( lPetCorrectivo, lPetSoporte, lPetEvoExpress ), getConverterToDTO() ) );

			lstAcc = tratarAccs( lstAcc );

			Collections.sort( lstAcc, new Comparator() {
				@Override
				public int compare( final Object o1, final Object o2 ) {
					final AccDTO acc1 = (AccDTO) o1;
					final AccDTO acc2 = (AccDTO) o2;
					return acc1.getOrdenEstado().compareTo( acc2.getOrdenEstado() );
				}
			} );
		} catch( DAOException e ) {
			LOG.error( e.getDescription() );
			throw new BusinessException( e );
		}

		return lstAcc;
	}

	private List<AccDTO> tratarAccs( final List<AccDTO> lstAcc ) {

		List<AccDTO> lstAccSalida = new ArrayList<>();

		HashMap<Long, AccDTO> hamAcc = new HashMap<>();
		Iterator<AccDTO> it = lstAcc.iterator();
		while( it.hasNext() ) {
			AccDTO accDTO = it.next();

			if( !hamAcc.containsKey( accDTO.getId() ) ) {
				accDTO.getLstParticipantes().add( new AccDTO( accDTO.getResponsable(), accDTO.getEsfuerzo(), accDTO.getIncurrido(), accDTO.getEtc() ) );
				hamAcc.put( accDTO.getId(), accDTO );
			} else {
				AccDTO accDTOTemp = hamAcc.get( accDTO.getId() );
				accDTOTemp.getLstParticipantes().add( new AccDTO( accDTO.getResponsable(), accDTO.getEsfuerzo(), accDTO.getIncurrido(), accDTO.getEtc() ) );
				if( accDTOTemp.getEsfuerzo() != null && accDTO.getEsfuerzo() != null ) {
					accDTOTemp.setEsfuerzo( Double.sum( accDTOTemp.getEsfuerzo(), accDTO.getEsfuerzo() ) );
				}
				if( accDTOTemp.getIncurrido() != null && accDTO.getIncurrido() != null ) {
					accDTOTemp.setIncurrido( Double.sum( accDTOTemp.getIncurrido(), accDTO.getIncurrido() ) );
				}
				if( accDTOTemp.getEtc() != null && accDTO.getEtc() != null ) {
					accDTOTemp.setEtc( Double.sum( accDTOTemp.getEtc(), accDTO.getEtc() ) );
				}
				if( accDTOTemp.getResponsable() != null && accDTO.getResponsable() != null ) {
					accDTOTemp.setResponsable( accDTOTemp.getResponsable() + " / " + accDTO.getResponsable() );
				}
				hamAcc.put( accDTO.getId(), accDTOTemp );
			}
		}

		lstAccSalida.addAll( hamAcc.values() );

		return lstAccSalida;
	}

	@Override
	protected JpaRepository<Acc, Long> getDao() {
		return accDAO;
	}

	@Override
	protected Function<Acc, AccDTO> getConverterToDTO() {
		return AccToDTO.INSTANCE;
	}

	@Override
	protected Function<AccDTO, Acc> getConverterToEntity() {
		return null;
	}

}
