package com.jsilgado.gorrion.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO Peticion
 *
 * @author everis
 */
public class TareaDTO implements Serializable {
	/**
	 * Serializacion
	 */
	private static final long serialVersionUID = 5432537407773134409L;

	/**
	 * Id
	 */
	private Long id;

	private Long peticion;

	private String descripcion;

	private String lineaPet;

	private String tipo;

	private String responsable;

	private Double estimado;

	private Double incurrido;

	private Double etc;

	private Date fechaInicio;

	private Date fechaFin;

	private String colorFechaFin;

	private Double planificado;

	private Double etcAutomatico;

	private Double desvio;

	private Double porcentajeDesvio;

	private String colorPorcentajeDesvio;

	private Double avance;

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
	 * @return Valor de la propiedad lineaPet
	 */
	public String getLineaPet() {
		return lineaPet;
	}

	/**
	 * @param lineaPet
	 *            Valor de la propiedad lineaPet a setear
	 */
	public void setLineaPet( final String lineaPet ) {
		this.lineaPet = lineaPet;
	}

	/**
	 * @return Valor de la propiedad tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 *            Valor de la propiedad tipo a setear
	 */
	public void setTipo( final String tipo ) {
		this.tipo = tipo;
	}

	/**
	 * @return Valor de la propiedad responsable
	 */
	public String getResponsable() {
		return responsable;
	}

	/**
	 * @param responsable
	 *            Valor de la propiedad responsable a setear
	 */
	public void setResponsable( final String responsable ) {
		this.responsable = responsable;
	}

	/**
	 * @return Valor de la propiedad estimado
	 */
	public Double getEstimado() {
		return estimado;
	}

	/**
	 * @param estimado
	 *            Valor de la propiedad estimado a setear
	 */
	public void setEstimado( final Double estimado ) {
		this.estimado = estimado;
	}

	/**
	 * @return Valor de la propiedad incurrido
	 */
	public Double getIncurrido() {
		return incurrido;
	}

	/**
	 * @param incurrido
	 *            Valor de la propiedad incurrido a setear
	 */
	public void setIncurrido( final Double incurrido ) {
		this.incurrido = incurrido;
	}

	/**
	 * @return Valor de la propiedad etc
	 */
	public Double getEtc() {
		return etc;
	}

	/**
	 * @param etc
	 *            Valor de la propiedad etc a setear
	 */
	public void setEtc( final Double etc ) {
		this.etc = etc;
	}

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
	 * @return Valor de la propiedad planificado
	 */
	public Double getPlanificado() {
		return planificado;
	}

	/**
	 * @param planificado
	 *            Valor de la propiedad planificado a setear
	 */
	public void setPlanificado( final Double planificado ) {
		this.planificado = planificado;
	}

	/**
	 * @return Valor de la propiedad etcAutomatico
	 */
	public Double getEtcAutomatico() {
		return etcAutomatico;
	}

	/**
	 * @param etcAutomatico
	 *            Valor de la propiedad etcAutomatico a setear
	 */
	public void setEtcAutomatico( final Double etcAutomatico ) {
		this.etcAutomatico = etcAutomatico;
	}

	/**
	 * @return Valor de la propiedad desvio
	 */
	public Double getDesvio() {
		return desvio;
	}

	/**
	 * @param desvio
	 *            Valor de la propiedad desvio a setear
	 */
	public void setDesvio( final Double desvio ) {
		this.desvio = desvio;
	}

	/**
	 * @return Valor de la propiedad avance
	 */
	public Double getAvance() {
		return avance;
	}

	/**
	 * @param avance
	 *            Valor de la propiedad avance a setear
	 */
	public void setAvance( final Double avance ) {
		this.avance = avance;
	}

	/**
	 * @return Valor de la propiedad porcentajeDesvio
	 */
	public Double getPorcentajeDesvio() {
		return porcentajeDesvio;
	}

	/**
	 * @param porcentajeDesvio
	 *            Valor de la propiedad porcentajeDesvio a setear
	 */
	public void setPorcentajeDesvio( final Double porcentajeDesvio ) {
		this.porcentajeDesvio = porcentajeDesvio;
	}

	/**
	 * @return Valor de la propiedad colorPorcentajeDesvio
	 */
	public String getColorPorcentajeDesvio() {
		return colorPorcentajeDesvio;
	}

	/**
	 * @param colorPorcentajeDesvio
	 *            Valor de la propiedad colorPorcentajeDesvio a setear
	 */
	public void setColorPorcentajeDesvio( final String colorPorcentajeDesvio ) {
		this.colorPorcentajeDesvio = colorPorcentajeDesvio;
	}

	/**
	 * @return Valor de la propiedad colorFechaFin
	 */
	public String getColorFechaFin() {
		return colorFechaFin;
	}

	/**
	 * @param colorFechaFin
	 *            Valor de la propiedad colorFechaFin a setear
	 */
	public void setColorFechaFin( final String colorFechaFin ) {
		this.colorFechaFin = colorFechaFin;
	}

}
