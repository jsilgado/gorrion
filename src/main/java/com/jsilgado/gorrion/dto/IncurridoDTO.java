package com.jsilgado.gorrion.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO Peticion
 *
 * @author everis
 */
public class IncurridoDTO implements Serializable {
	/**
	 * Serializacion
	 */
	private static final long serialVersionUID = 5432537407773134409L;

	/**
	 * Id
	 */
	private Long nroEmpleado;

	private Date fecha;

	private String descripcionTarea;

	private String factoria;

	private String linea;

	private Long peticion;

	private String persona;

	private Double horasIncurridas;

	private String comentarioTarea;

	private String conceptoDisponible;

	/**
	 * @return Valor de la propiedad nroEmpleado
	 */
	public Long getNroEmpleado() {
		return nroEmpleado;
	}

	/**
	 * @param nroEmpleado
	 *            Valor de la propiedad nroEmpleado a setear
	 */
	public void setNroEmpleado( final Long nroEmpleado ) {
		this.nroEmpleado = nroEmpleado;
	}

	/**
	 * @return Valor de la propiedad fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha
	 *            Valor de la propiedad fecha a setear
	 */
	public void setFecha( final Date fecha ) {
		this.fecha = fecha;
	}

	/**
	 * @return Valor de la propiedad descripcionTarea
	 */
	public String getDescripcionTarea() {
		return descripcionTarea;
	}

	/**
	 * @param descripcionTarea
	 *            Valor de la propiedad descripcionTarea a setear
	 */
	public void setDescripcionTarea( final String descripcionTarea ) {
		this.descripcionTarea = descripcionTarea;
	}

	/**
	 * @return Valor de la propiedad factoria
	 */
	public String getFactoria() {
		return factoria;
	}

	/**
	 * @param factoria
	 *            Valor de la propiedad factoria a setear
	 */
	public void setFactoria( final String factoria ) {
		this.factoria = factoria;
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
	 * @return Valor de la propiedad persona
	 */
	public String getPersona() {
		return persona;
	}

	/**
	 * @param persona
	 *            Valor de la propiedad persona a setear
	 */
	public void setPersona( final String persona ) {
		this.persona = persona;
	}

	/**
	 * @return Valor de la propiedad horasIncurridas
	 */
	public Double getHorasIncurridas() {
		return horasIncurridas;
	}

	/**
	 * @param horasIncurridas
	 *            Valor de la propiedad horasIncurridas a setear
	 */
	public void setHorasIncurridas( final Double horasIncurridas ) {
		this.horasIncurridas = horasIncurridas;
	}

	/**
	 * @return Valor de la propiedad comentarioTarea
	 */
	public String getComentarioTarea() {
		return comentarioTarea;
	}

	/**
	 * @param comentarioTarea
	 *            Valor de la propiedad comentarioTarea a setear
	 */
	public void setComentarioTarea( final String comentarioTarea ) {
		this.comentarioTarea = comentarioTarea;
	}

	/**
	 * @return Valor de la propiedad conceptoDisponible
	 */
	public String getConceptoDisponible() {
		return conceptoDisponible;
	}

	/**
	 * @param conceptoDisponible
	 *            Valor de la propiedad conceptoDisponible a setear
	 */
	public void setConceptoDisponible( final String conceptoDisponible ) {
		this.conceptoDisponible = conceptoDisponible;
	}

}
