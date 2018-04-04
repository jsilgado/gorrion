package com.jsilgado.gorrion.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.jsilgado.gorrion.exception.DAOException;
import com.jsilgado.gorrion.domain.Acc;
import com.jsilgado.gorrion.domain.IncidenciaOt;

@Transactional( readOnly = true )
public interface IncidenciaOtDAO extends JpaRepository<IncidenciaOt, Long> {

	@Query( "select a from IncidenciaOt a where a.otCreador = :peticion and estado != 'DESESTIMADA' and centro = 'DMF Sevilla' and linea = 'L. UNAV' order by id asc" )
	List<Acc> obtenerIncidenciasOt( @Param( "peticion" ) final Long lPeticion) throws DAOException;
}
