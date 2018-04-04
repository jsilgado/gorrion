package com.jsilgado.gorrion.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.jsilgado.gorrion.exception.DAOException;
import com.jsilgado.gorrion.domain.Peticion;


@Transactional( readOnly = false )
public interface PeticionDAO extends JpaRepository<Peticion, Long> {

	@Query( "select p from Peticion p where linea = 'L. UNAV' and peticionOt = 'OT' and tipoPeticion != 'AJUSTE_LINEA_BASE' and estado != 'DESESTIMADA' and estado != 'CERRADA' and estado != 'ENTREGADA' and estado != 'ENTREGA_ACEPTADA' order by id desc" )
	List<Peticion> obtenerPeticionesActivas() throws DAOException;

	@Query( "select p from Peticion p where linea = 'L. UNAV' and peticionOt = 'OT' and tipoPeticion != 'AJUSTE_LINEA_BASE' and estado != 'DESESTIMADA' and estado != 'CERRADA' and tipoPeticion = 'MANTENIMIENTO_EVOLUTIVO' order by id desc" )
	List<Peticion> obtenerPeticionesEvolutivas() throws DAOException;

	@Query( "select p from Peticion p where linea = 'L. UNAV' and peticionOt = 'OT' and tipoPeticion != 'AJUSTE_LINEA_BASE' and estado != 'DESESTIMADA' order by id desc" )
	List<Peticion> obtenerPeticiones() throws DAOException;

	@Query( "select p from Peticion p where id = (select max(p.id) from Peticion p where linea = 'L. UNAV' and peticionOt = 'OT' and tipoPeticion = 'MANTENIMIENTO_CORRECTIVO')" )
	Peticion obtenerPeticionCorrectivos() throws DAOException;

	@Query( "select p from Peticion p where id = (select max(p.id) from Peticion p where linea = 'L. UNAV' and peticionOt = 'OT' and tipoPeticion = 'SOPORTE')" )
	Peticion obtenerPeticionSoportes() throws DAOException;

	@Query( "select p from Peticion p where id = (select max(p.id) from Peticion p where linea = 'L. UNAV' and peticionOt = 'OT' and tipoPeticion = 'MANTENIMIENTO_EVOLUTIVO' and descripcionFlujo = 'Gestión ACC' )" )
	Peticion obtenerPeticionEvolutivoExpress() throws DAOException;

}
