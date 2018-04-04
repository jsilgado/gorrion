package com.jsilgado.gorrion.dao;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.jsilgado.gorrion.exception.DAOException;
import com.jsilgado.gorrion.domain.Empleado;

@Transactional( readOnly = true )
public interface EmpleadoDAO extends JpaRepository<Empleado, Long> {

	@Cacheable( "empleadosActivos" )
	@Query( "select e from Empleado e where e.linea = 'L. UNAV' and e.fechaBaja = null order by e.nroEmpleado" )
	List<Empleado> obtenerEmpleadosActivos() throws DAOException;
}
