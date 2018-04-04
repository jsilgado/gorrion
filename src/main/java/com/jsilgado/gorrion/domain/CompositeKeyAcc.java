package com.jsilgado.gorrion.domain;

import java.io.Serializable;

public class CompositeKeyAcc implements Serializable {

	/**
	 * Descripcion del campo
	 */
	private static final long serialVersionUID = 1908436225535459235L;

	private Long id;
	private String tarea;

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

}
