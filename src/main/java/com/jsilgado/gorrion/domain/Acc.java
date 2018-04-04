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

import org.hibernate.annotations.Formula;
import org.springframework.transaction.annotation.Transactional;

@Entity
@Table( name = "REPORT_SEG_ACC" )
@Access( AccessType.FIELD )
@Transactional( readOnly = true )
@IdClass( CompositeKeyAcc.class )
public class Acc implements Serializable {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 4238821279062314625L;

	@Id
	@Column( name = "ID_ACC" )
	private Long id;

	@Id
	@Column( name = "TAREA" )
	private String tarea;

	@Column( name = "NRO_EMPLEADO" )
	private Long nroEmpleado;

	@Column( name = "PETICION" )
	private Long peticion;

	@Column( name = "NOMBRE" )
	private String nombre;

	@Column( name = "DESCRIPCION" )
	private String descripcion;

	@Column( name = "LINEA_PET" )
	private String lineaPet;

	@Column( name = "TIPO" )
	private String tipo;

	@Column( name = "ESTADO" )
	private String estado;

	@Column( name = "RESPONSABLE" )
	private String responsable;

	@Column( name = "ESFUERZO" )
	private Double esfuerzo;

	@Column( name = "INCURRIDO" )
	private Double incurrido;

	@Column( name = "ETC" )
	private Double etc;

	@Column( name = "FECHA_ENTREGA" )
	private Date fechaEntrega;

	@Column( name = "CENTRO_PET" )
	private String centroPet;

	@Column( name = "SUBTIPO" )
	private String subtipo;

	@Column( name = "CRITICIDAD" )
	private String criticidad;

	@Column( name = "COD_PET_CLIENTE" )
	private String codPetCliente;

	@Formula( "DECODE(estado, 'APLAZADA', 1, 'EN_EJECUCION', 2, 'PTE_ASIGNACION', 3, 'ENTREGADA', 4, 'CERRADA', 5)" )
	private String ordenEstado;

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
	 * @return Valor de la propiedad centroPet
	 */
	public String getCentroPet() {
		return centroPet;
	}

	/**
	 * @param centroPet
	 *            Valor de la propiedad centroPet a setear
	 */
	public void setCentroPet( final String centroPet ) {
		this.centroPet = centroPet;
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
	 * @return Valor de la propiedad tarea
	 */
	public String getTarea() {
		return tarea;
	}

	/**
	 * @param tarea
	 *            Valor de la propiedad tarea a setear
	 */
	public void setTarea( final String tarea ) {
		this.tarea = tarea;
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

}
