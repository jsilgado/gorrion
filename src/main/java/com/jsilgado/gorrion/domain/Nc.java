package com.jsilgado.gorrion.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

@Entity
@Table( name = "REPORT_NC" )
@Access( AccessType.FIELD )
@Transactional( readOnly = true )
@IdClass( CompositeKeyNc.class )
public class Nc implements Serializable {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 4238821279062314625L;

	@Id
	@Column( name = "ID_AUDITORIA" )
	private Long idAuditoria;

	@Id
	@Column( name = "ID_NC" )
	private String idNc;

	@Column( name = "LINEA" )
	private String linea;

	@Column( name = "CENTRO" )
	private String centro;

	@Column( name = "ID_REQUERIMIENTO" )
	private Long peticion;

	@Column( name = "DESCRIPCION_NC" )
	private String descripcion;

	@Column( name = "ACCION_CORRECTORA" )
	private String accionCorrectora;

	@Column( name = "ESTADO_NC" )
	private String estado;

	@Column( name = "PLAZO_CORRECCION" )
	private Date plazoCorreccion;

	@Column( name = "RESPONSABLE_IMPLANTACION" )
	private String responsable;

	/**
	 * @return Valor de la propiedad idAuditoria
	 */
	public Long getIdAuditoria() {
		return idAuditoria;
	}

	/**
	 * @param idAuditoria
	 *            Valor de la propiedad idAuditoria a setear
	 */
	public void setIdAuditoria( final Long idAuditoria ) {
		this.idAuditoria = idAuditoria;
	}

	/**
	 * @return Valor de la propiedad idNc
	 */
	public String getIdNc() {
		return idNc;
	}

	/**
	 * @param idNc
	 *            Valor de la propiedad idNc a setear
	 */
	public void setIdNc( final String idNc ) {
		this.idNc = idNc;
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
	 * @return Valor de la propiedad accionCorrectora
	 */
	public String getAccionCorrectora() {
		return accionCorrectora;
	}

	/**
	 * @param accionCorrectora
	 *            Valor de la propiedad accionCorrectora a setear
	 */
	public void setAccionCorrectora( final String accionCorrectora ) {
		this.accionCorrectora = accionCorrectora;
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
	 * @return Valor de la propiedad plazoCorreccion
	 */
	public Date getPlazoCorreccion() {
		return plazoCorreccion;
	}

	/**
	 * @param plazoCorreccion
	 *            Valor de la propiedad plazoCorreccion a setear
	 */
	public void setPlazoCorreccion( final Date plazoCorreccion ) {
		this.plazoCorreccion = plazoCorreccion;
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

}
