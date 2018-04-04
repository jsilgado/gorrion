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
import com.jsilgado.gorrion.bs.interfaces.EmpleadoBS;
import com.jsilgado.gorrion.dao.EmpleadoDAO;
import com.jsilgado.gorrion.domain.Empleado;
import com.jsilgado.gorrion.dto.EmpleadoDTO;
import com.jsilgado.gorrion.dto.converters.EmpleadoToDTO;
import com.jsilgado.gorrion.exception.BusinessException;
import com.jsilgado.gorrion.exception.DAOException;

/**
 * Clase contenedora de la logica de negocio para los Empleados
 *
 * @author jsilgado
 *
 */
@Service
@Transactional
@Configurable
public class EmpleadoBSImpl extends GenericBSImpl<EmpleadoDTO, Empleado, Long>implements EmpleadoBS {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 4621658443445899613L;

	/**
	 * Log
	 */
	private static final Logger LOG = LoggerFactory.getLogger( EmpleadoBSImpl.class );

	@Autowired
	private EmpleadoDAO empleadoDAO;

	@Override
	public List<EmpleadoDTO> obtenerEmpleadosActivos() throws BusinessException {

		List<EmpleadoDTO> lstEmpleado = null;
		try {

			lstEmpleado = new ArrayList<EmpleadoDTO>( Lists.transform( empleadoDAO.obtenerEmpleadosActivos(), getConverterToDTO() ) );

		} catch( DAOException e ) {
			LOG.error( e.getDescription() );
			throw new BusinessException( e );
		}

		return lstEmpleado;
	}

	@Override
	protected JpaRepository<Empleado, Long> getDao() {
		return empleadoDAO;
	}

	@Override
	protected Function<Empleado, EmpleadoDTO> getConverterToDTO() {
		return EmpleadoToDTO.INSTANCE;
	}

	@Override
	protected Function<EmpleadoDTO, Empleado> getConverterToEntity() {
		return null;
	}

}
