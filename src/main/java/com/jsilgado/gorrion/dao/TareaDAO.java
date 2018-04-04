package com.jsilgado.gorrion.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.jsilgado.gorrion.exception.DAOException;
import com.jsilgado.gorrion.domain.Tarea;

@Transactional( readOnly = true )
public interface TareaDAO extends JpaRepository<Tarea, Long> {

	@Query( "select a from Tarea a where a.peticion = :peticion order by orden asc" )
	List<Tarea> obtenerTareasPeticion( @Param( "peticion" ) final Long lPeticion) throws DAOException;

}
