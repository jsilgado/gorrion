package com.jsilgado.gorrion.dto;

import java.io.Serializable;

/**
 * DTO Alarma
 *
 * @author everis
 */
public class AlarmaDTO implements Serializable {
	/**
	 * Serializacion
	 */
	private static final long serialVersionUID = 5432537407773134409L;

	private Long peticion;

	private String nombrePeticion;

	private Integer numero;

	private String descripcion;

	private String detalle;

	/**
	 * Constructor de clase
	 */
	public AlarmaDTO() {
		super();
	}

	/**
	 * Constructor de clase
	 *
	 * @param peticion
	 * @param nombrePeticion
	 * @param numero
	 * @param descripcion
	 */
	public AlarmaDTO( final Long peticion, final String nombrePeticion, final Integer numero, final String descripcion ) {
		super();
		this.peticion = peticion;
		this.nombrePeticion = nombrePeticion;
		this.numero = numero;
		this.descripcion = descripcion;
	}

	/**
	 * @return Valor de la propiedad peticion
	 */
	public Long getPeticion() {
		return peticion;
	}

	/**
	 * @param peticion
	 *            Valor de la propiedad peticion a setear
	 */
	public void setPeticion( final Long peticion ) {
		this.peticion = peticion;
	}

	/**
	 * @return Valor de la propiedad numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param tipo
	 *            Valor de la propiedad numero a setear
	 */
	public void setNumero( final Integer numero ) {
		this.numero = numero;
	}

	/**
	 * @return Valor de la propiedad descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            Valor de la propiedad descripcion a setear
	 */
	public void setDescripcion( final String descripcion ) {
		this.descripcion = descripcion;
	}

	/**
	 * @return Valor de la propiedad nombrePeticion
	 */
	public String getNombrePeticion() {
		return nombrePeticion;
	}

	/**
	 * @param nombrePeticion
	 *            Valor de la propiedad nombrePeticion a setear
	 */
	public void setNombrePeticion( final String nombrePeticion ) {
		this.nombrePeticion = nombrePeticion;
	}

	/**
	 * @return Valor de la propiedad detalle
	 */
	public String getDetalle() {
		return detalle;
	}

	/**
	 * @param detalle
	 *            Valor de la propiedad detalle a setear
	 */
	public void setDetalle( final String detalle ) {
		this.detalle = detalle;
	}

}
