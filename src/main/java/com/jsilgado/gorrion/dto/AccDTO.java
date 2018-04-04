package com.jsilgado.gorrion.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * DTO Peticion
 *
 * @author everis
 */
public class AccDTO implements Serializable {
	/**
	 * Serializacion
	 */
	private static final long serialVersionUID = 5432537407773134409L;

	/**
	 * Id
	 */
	private Long id;

	private Long peticion;

	private String nombre;

	private String lineaPet;

	private String tipo;

	private String estado;

	private String colorEstado;

	private String responsable;

	private Double esfuerzo;

	private Double incurrido;

	private Double etc;

	private Date fechaEntrega;

	private String descripcion;

	private List<AccDTO> lstParticipantes;

	private String subtipo;

	private String criticidad;

	private String ordenEstado;

	private String codPetCliente;

	/**
	 * Constructor de clase
	 */
	public AccDTO() {
		super();
		setLstParticipantes( new ArrayList<>() );
	}

	/**
	 * Constructor de clase
	 *
	 * @param nombre
	 * @param responsable
	 * @param esfuerzo
	 * @param incurrido
	 * @param etc
	 */
	public AccDTO( final String responsable, final Double esfuerzo, final Double incurrido, final Double etc ) {
		super();
		this.responsable = responsable;
		this.esfuerzo = esfuerzo;
		this.incurrido = incurrido;
		this.etc = etc;
	}

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
	 * @return Valor de la propiedad esfuerzo
	 */
	public Double getEsfuerzo() {
		return esfuerzo;
	}

	/**
	 * @param esfuerzo
	 *            Valor de la propiedad esfuerzo a setear
	 */
	public void setEsfuerzo( final Double esfuerzo ) {
		this.esfuerzo = esfuerzo;
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
	 * @return Valor de la propiedad fechaEntrega
	 */
	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	/**
	 * @param fechaEntrega
	 *            Valor de la propiedad fechaEntrega a setear
	 */
	public void setFechaEntrega( final Date fechaEntrega ) {
		this.fechaEntrega = fechaEntrega;
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
	 * @return Valor de la propiedad lstParticipantes
	 */
	public List<AccDTO> getLstParticipantes() {
		return lstParticipantes;
	}

	/**
	 * @param lstParticipantes
	 *            Valor de la propiedad lstParticipantes a setear
	 */
	public void setLstParticipantes( final List<AccDTO> lstParticipantes ) {
		this.lstParticipantes = lstParticipantes;
	}

	/**
	 * @return Valor de la propiedad subtipo
	 */
	public String getSubtipo() {
		return subtipo;
	}

	/**
	 * @param subtipo
	 *            Valor de la propiedad subtipo a setear
	 */
	public void setSubtipo( final String subtipo ) {
		this.subtipo = subtipo;
	}

	/**
	 * @return Valor de la propiedad criticidad
	 */
	public String getCriticidad() {
		return criticidad;
	}

	/**
	 * @param criticidad
	 *            Valor de la propiedad criticidad a setear
	 */
	public void setCriticidad( final String criticidad ) {
		this.criticidad = criticidad;
	}

	/**
	 * @return Valor de la propiedad ordenEstado
	 */
	public String getOrdenEstado() {
		return ordenEstado;
	}

	/**
	 * @param ordenEstado
	 *            Valor de la propiedad ordenEstado a setear
	 */
	public void setOrdenEstado( final String ordenEstado ) {
		this.ordenEstado = ordenEstado;
	}

	/**
	 * @return Valor de la propiedad codPetCliente
	 */
	public String getCodPetCliente() {
		return codPetCliente;
	}

	/**
	 * @param codPetCliente
	 *            Valor de la propiedad codPetCliente a setear
	 */
	public void setCodPetCliente( final String codPetCliente ) {
		this.codPetCliente = codPetCliente;
	}

	/**
	 * @return Valor de la propiedad colorEstado
	 */
	public String getColorEstado() {
		return colorEstado;
	}

	/**
	 * @param colorEstado
	 *            Valor de la propiedad colorEstado a setear
	 */
	public void setColorEstado( final String colorEstado ) {
		this.colorEstado = colorEstado;
	}

}
