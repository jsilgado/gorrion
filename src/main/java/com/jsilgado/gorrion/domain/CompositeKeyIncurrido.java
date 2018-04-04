package com.jsilgado.gorrion.domain;

import java.io.Serializable;
import java.util.Date;

public class CompositeKeyIncurrido implements Serializable {

	/**
	 * Descripcion del campo
	 */
	private static final long serialVersionUID = 1908436225565459235L;

	private Long nroEmpleado;

	private Date fecha;

	private String comentarioTarea;

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

}
