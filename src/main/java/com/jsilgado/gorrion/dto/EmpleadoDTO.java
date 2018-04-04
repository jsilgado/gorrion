package com.jsilgado.gorrion.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

/**
 * DTO Peticion
 *
 * @author everis
 */
public class EmpleadoDTO implements Serializable {
	/**
	 * Serializacion
	 */
	private static final long serialVersionUID = 5432537407773134409L;

	private Long nroEmpleado;

	private Date fechaBaja;

	private Date fechaAlta;

	private String username;

	private String nombre;

	private String apellido;

	private String cargo;

	private String centro;

	private String linea;

	private String descripcionHorario;

	private HashMap<String, CapacidadDiaDTO> hamCapacidad;

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

	/**
	 * @return Valor de la propiedad hamCapacidad
	 */
	public HashMap<String, CapacidadDiaDTO> getHamCapacidad() {
		return hamCapacidad;
	}

	/**
	 * @param hamCapacidad
	 *            Valor de la propiedad hamCapacidad a setear
	 */
	public void setHamCapacidad( final HashMap<String, CapacidadDiaDTO> hamCapacidad ) {
		this.hamCapacidad = hamCapacidad;
	}

}
