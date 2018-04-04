package com.jsilgado.gorrion.bs.impl;

import java.util.ArrayList;
import java.util.Date;
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
import com.jsilgado.gorrion.bs.interfaces.IncurridoBS;
import com.jsilgado.gorrion.dao.IncurridoDAO;
import com.jsilgado.gorrion.domain.Incurrido;
import com.jsilgado.gorrion.dto.IncurridoDTO;
import com.jsilgado.gorrion.dto.converters.IncurridoToDTO;
import com.jsilgado.gorrion.exception.BusinessException;
import com.jsilgado.gorrion.exception.DAOException;

/**
 * Clase contenedora de la logica de negocio para los incurridos
 *
 * @author jsilgado
 *
 */
@Service
@Transactional
@Configurable
public class IncurridoBSImpl extends GenericBSImpl<IncurridoDTO, Incurrido, Long> implements IncurridoBS {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 4621658443445899613L;

	/**
	 * Log
	 */
	private static final Logger LOG = LoggerFactory.getLogger( IncurridoBSImpl.class );

	@Autowired
	private IncurridoDAO incurridoDAO;

	@Override
	public List<IncurridoDTO> obtenerIncurridosEmpleadoEntreFechas( final Long lNroEmpleado, final Date fechaInicial, final Date fechaFinal ) throws BusinessException {

		List<IncurridoDTO> lstIncurridos = null;

		try {
			lstIncurridos = new ArrayList<IncurridoDTO>( Lists.transform( incurridoDAO.obtenerIncurridosEmpleadoEntreFechas( lNroEmpleado, fechaInicial, fechaFinal ), getConverterToDTO() ) );

		} catch( DAOException e ) {
			LOG.error( e.getDescription() );
			throw new BusinessException( e );
		}

		return lstIncurridos;
	}

	@Override
	protected JpaRepository<Incurrido, Long> getDao() {
		return incurridoDAO;
	}

	@Override
	protected Function<Incurrido, IncurridoDTO> getConverterToDTO() {
		return IncurridoToDTO.INSTANCE;
	}

	@Override
	protected Function<IncurridoDTO, Incurrido> getConverterToEntity() {
		return null;
	}

}
