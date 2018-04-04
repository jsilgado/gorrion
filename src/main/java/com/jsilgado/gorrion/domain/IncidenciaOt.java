package com.jsilgado.gorrion.domain;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

@Entity
@Table( name = "REPORT_INCIDENCIAS_OT" )
@Access(AccessType.FIELD)
@Transactional( readOnly = true )
public class IncidenciaOt implements Serializable {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 4238821279062314625L;

	@Id
	@Column( name = "ID_INCIDENCIA" )
	private Long id;

	@Column( name = "LINEA" )
	private String linea;

	@Column( name = "CENTRO" )
	private String centro;

	@Column( name = "OT_CREADOR" )
	private String otCreador;

	@Column( name = "ESTADO" )
	private String estado;

	@Column( name = "NOMBRE" )
	private String nombre;

	/**
	 * @return Valor de la propiedad id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            Valor de la propiedad id a setear
	 */
	public void setId( final Long id ) {
		this.id = id;
	}

	/**
	 * @return Valor de la propiedad linea
	 */
	public String getLinea() {
		return linea;
	}

	/**
	 * @param linea
	 *            Valor de la propiedad linea a setear
	 */
	public void setLinea( final String linea ) {
		this.linea = linea;
	}

	/**
	 * @return Valor de la propiedad otCreador
	 */
	public String getOtCreador() {
		return otCreador;
	}

	/**
	 * @param otCreador
	 *            Valor de la propiedad otCreador a setear
	 */
	public void setOtCreador( final String otCreador ) {
		this.otCreador = otCreador;
	}

	/**
	 * @return Valor de la propiedad estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 *            Valor de la propiedad estado a setear
	 */
	public void setEstado( final String estado ) {
		this.estado = estado;
	}

	/**
	 * @return Valor de la propiedad nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            Valor de la propiedad nombre a setear
	 */
	public void setNombre( final String nombre ) {
		this.nombre = nombre;
	}

	/**
	 * @return Valor de la propiedad centro
	 */
	public String getCentro() {
		return centro;
	}

	/**
	 * @param centro
	 *            Valor de la propiedad centro a setear
	 */
	public void setCentro( final String centro ) {
		this.centro = centro;
	}

}
