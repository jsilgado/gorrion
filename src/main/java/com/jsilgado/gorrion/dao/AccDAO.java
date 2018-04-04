package com.jsilgado.gorrion.dao;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.jsilgado.gorrion.exception.DAOException;
import com.jsilgado.gorrion.domain.Acc;


@Transactional( readOnly = true )
public interface AccDAO extends JpaRepository<Acc, Long> {

	@Query( "select a from Acc a where a.peticion = :peticion and estado != 'DESESTIMADA' and centroPet = 'DMF Sevilla' order by id asc" )
	List<Acc> obtenerAccsPeticion( @Param( "peticion" ) final Long lPeticion) throws DAOException;

	@Cacheable( "highlights" )
	@Query( "select a from Acc a where (a.peticion = :peticionCorrectivo or a.peticion = :peticionSoporte or a.peticion = :peticionEvoExpress) and estado != 'DESESTIMADA' and centroPet = 'DMF Sevilla' and subtipo != 'Gestión' order by id" )
	List<Acc> obtenerAccHighlights( @Param( "peticionCorrectivo" ) final Long lPeticionCorrectivo, @Param( "peticionSoporte" ) final Long lPeticionSoporte, @Param( "peticionEvoExpress" ) final Long lPeticionEvoExpress) throws DAOException;

}
