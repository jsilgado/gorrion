package com.jsilgado.gorrion.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

@Entity
@Table( name = "REPORT_TAREAS" )
@Access( AccessType.FIELD )
@Transactional( readOnly = true )
public class Tarea implements Serializable {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 4238821279062314625L;

	@Id
	@Column( name = "ID_TAREA" )
	private Long id;

	@Column( name = "ID_PETICION" )
	private Long peticion;

	@Column( name = "DESC_TAREA" )
	private String descripcion;

	@Column( name = "LINEA_ORG" )
	private String lineaPet;

	@Column( name = "TIPO_TAREA" )
	private String tipo;

	@Column( name = "RESPONSABLE" )
	private String responsable;

	@Column( name = "ESTIMADO" )
	private Double estimado;

	@Column( name = "INCURRIDO" )
	private Double incurrido;

	@Column( name = "ETC" )
	private Double etc;

	@Column( name = "FECHA_INICIO" )
	private Date fechaInicio;

	@Column( name = "FECHA_FIN" )
	private Date fechaFin;

	@Column( name = "PLANIFICADO" )
	private Double planificado;

	@Column( name = "ETC_AUTOMATICO" )
	private Double etcAutomatico;

	@Column( name = "ORDEN" )
	private Integer orden;

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
	 * @return Valor de la propiedad orden
	 */
	public Integer getOrden() {
		return orden;
	}

	/**
	 * @param orden
	 *            Valor de la propiedad orden a setear
	 */
	public void setOrden( final Integer orden ) {
		this.orden = orden;
	}

}
