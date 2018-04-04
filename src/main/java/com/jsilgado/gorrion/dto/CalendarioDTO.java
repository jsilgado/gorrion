package com.jsilgado.gorrion.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO Peticion
 *
 * @author everis
 */
public class CalendarioDTO implements Serializable {
	/**
	 * Serializacion
	 */
	private static final long serialVersionUID = 5432537407773134409L;

	private Date fechaInicio;

	private Date fechaFin;

	private Double lunes = 0D;

	private Double martes = 0D;

	private Double miercoles = 0D;

	private Double jueves = 0D;

	private Double viernes = 0D;

	private Double sabado = 0D;

	private Double domingo = 0D;

	/**
	 * @return Valor de la propiedad fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio
	 *            Valor de la propiedad fechaInicio a setear
	 */
	public void setFechaInicio( final Date fechaInicio ) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return Valor de la propiedad fechaFin
	 */
	public Date getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin
	 *            Valor de la propiedad fechaFin a setear
	 */
	public void setFechaFin( final Date fechaFin ) {
		this.fechaFin = fechaFin;
	}

	/**
	 * @return Valor de la propiedad lunes
	 */
	public Double getLunes() {
		return lunes;
	}

	/**
	 * @param lunes
	 *            Valor de la propiedad lunes a setear
	 */
	public void setLunes( final Double lunes ) {
		this.lunes = lunes;
	}

	/**
	 * @return Valor de la propiedad martes
	 */
	public Double getMartes() {
		return martes;
	}

	/**
	 * @param martes
	 *            Valor de la propiedad martes a setear
	 */
	public void setMartes( final Double martes ) {
		this.martes = martes;
	}

	/**
	 * @return Valor de la propiedad miercoles
	 */
	public Double getMiercoles() {
		return miercoles;
	}

	/**
	 * @param miercoles
	 *            Valor de la propiedad miercoles a setear
	 */
	public void setMiercoles( final Double miercoles ) {
		this.miercoles = miercoles;
	}

	/**
	 * @return Valor de la propiedad jueves
	 */
	public Double getJueves() {
		return jueves;
	}

	/**
	 * @param jueves
	 *            Valor de la propiedad jueves a setear
	 */
	public void setJueves( final Double jueves ) {
		this.jueves = jueves;
	}

	/**
	 * @return Valor de la propiedad viernes
	 */
	public Double getViernes() {
		return viernes;
	}

	/**
	 * @param viernes
	 *            Valor de la propiedad viernes a setear
	 */
	public void setViernes( final Double viernes ) {
		this.viernes = viernes;
	}

	/**
	 * @return Valor de la propiedad sabado
	 */
	public Double getSabado() {
		return sabado;
	}

	/**
	 * @param sabado
	 *            Valor de la propiedad sabado a setear
	 */
	public void setSabado( final Double sabado ) {
		this.sabado = sabado;
	}

	/**
	 * @return Valor de la propiedad domingo
	 */
	public Double getDomingo() {
		return domingo;
	}

	/**
	 * @param domingo
	 *            Valor de la propiedad domingo a setear
	 */
	public void setDomingo( final Double domingo ) {
		this.domingo = domingo;
	}

}
