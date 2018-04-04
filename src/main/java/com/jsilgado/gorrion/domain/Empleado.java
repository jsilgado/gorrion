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
@Table( name = "REPORT_IND_HEADCOUNT" )
@Access( AccessType.FIELD )
@Transactional( readOnly = true )
public class Empleado implements Serializable {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 4238821279062314625L;

	@Id
	@Column( name = "NRO_EMPLEADO" )
	private Long nroEmpleado;

	@Column( name = "FECHA_BAJA" )
	private Date fechaBaja;

	@Column( name = "FECHA_ALTA" )
	private Date fechaAlta;

	@Column( name = "USERNAME" )
	private String username;

	@Column( name = "NOMBRE" )
	private String nombre;

	@Column( name = "APELLIDO" )
	private String apellido;

	@Column( name = "CARGO" )
	private String cargo;

	@Column( name = "CENTRO" )
	private String centro;

	@Column( name = "LINEA" )
	private String linea;

	@Column( name = "DESCRIPCION_HORARIO" )
	private String descripcionHorario;

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
	 * @return Valor de la propiedad username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            Valor de la propiedad username a setear
	 */
	public void setUsername( final String username ) {
		this.username = username;
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
	 * @return Valor de la propiedad descripcionHorario
	 */
	public String getDescripcionHorario() {
		return descripcionHorario;
	}

	/**
	 * @param descripcionHorario
	 *            Valor de la propiedad descripcionHorario a setear
	 */
	public void setDescripcionHorario( final String descripcionHorario ) {
		this.descripcionHorario = descripcionHorario;
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
	 * @return Valor de la propiedad apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido
	 *            Valor de la propiedad apellido a setear
	 */
	public void setApellido( final String apellido ) {
		this.apellido = apellido;
	}

	/**
	 * @return Valor de la propiedad cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo
	 *            Valor de la propiedad cargo a setear
	 */
	public void setCargo( final String cargo ) {
		this.cargo = cargo;
	}

	/**
	 * @return Valor de la propiedad fechaBaja
	 */
	public Date getFechaBaja() {
		return fechaBaja;
	}

	/**
	 * @param fechaBaja
	 *            Valor de la propiedad fechaBaja a setear
	 */
	public void setFechaBaja( final Date fechaBaja ) {
		this.fechaBaja = fechaBaja;
	}

	/**
	 * @return Valor de la propiedad fechaAlta
	 */
	public Date getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * @param fechaAlta
	 *            Valor de la propiedad fechaAlta a setear
	 */
	public void setFechaAlta( final Date fechaAlta ) {
		this.fechaAlta = fechaAlta;
	}

}
