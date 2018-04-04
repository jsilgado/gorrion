package com.jsilgado.gorrion.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.jsilgado.gorrion.exception.DAOException;
import com.jsilgado.gorrion.domain.Incurrido;

@Transactional( readOnly = true )
public interface IncurridoDAO extends JpaRepository<Incurrido, Long> {

	@Query( "select i from Incurrido i where i.nroEmpleado = :nroEmpleado and i.fecha between :fechaInicio and :fechaFin order by fecha desc" )
	List<Incurrido> obtenerIncurridosEmpleadoEntreFechas( @Param( "nroEmpleado" ) final Long lNroEmpleado, @Param( "fechaInicio" ) final Date fechaInicio, @Param( "fechaFin" ) final Date fechaFin) throws DAOException;

}
