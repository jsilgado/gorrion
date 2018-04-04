package com.jsilgado.gorrion.dto;

import java.io.Serializable;

/**
 * DTO Peticion
 *
 * @author everis
 */
public class IncidenciaOtDTO implements Serializable {
	/**
	 * Serializacion
	 */
	private static final long serialVersionUID = 5432537407773134409L;

	private Long id;

	private String linea;

	private String centro;

	private String otCreador;

	private String estado;

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
