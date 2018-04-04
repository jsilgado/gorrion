package com.jsilgado.gorrion.dto;

import java.io.Serializable;

/**
 * DTO Alarma
 *
 * @author everis
 */
public class CapacidadDiaDTO implements Serializable {
	/**
	 * Serializacion
	 */
	private static final long serialVersionUID = 5432537407773134409L;

	/**
	 * Numero de horas
	 */
	private Double horas;

	/**
	 * Letra en vez de horas
	 */
	private String leyenda;

	/**
	 * Fecha
	 */
	private String casilla;

	/**
	 * Color de la casilla
	 */
	private String color;

	/**
	 * Tooltip de la casilla
	 */
	private String tooltip;

	/**
	 * Constructor de clase
	 */
	public CapacidadDiaDTO() {
		super();
	}

	/**
	 * @return Valor de la propiedad horas
	 */
	public Double getHoras() {
		return horas;
	}

	/**
	 * @param horas
	 *            Valor de la propiedad horas a setear
	 */
	public void setHoras( final Double horas ) {
		this.horas = horas;
	}

	/**
	 * @return Valor de la propiedad leyenda
	 */
	public String getLeyenda() {
		return leyenda;
	}

	/**
	 * @param leyenda
	 *            Valor de la propiedad leyenda a setear
	 */
	public void setLeyenda( final String leyenda ) {
		this.leyenda = leyenda;
	}

	/**
	 * @return Valor de la propiedad casilla
	 */
	public String getCasilla() {
		return casilla;
	}

	/**
	 * @param casilla
	 *            Valor de la propiedad casilla a setear
	 */
	public void setCasilla( final String casilla ) {
		this.casilla = casilla;
	}

	/**
	 * @return Valor de la propiedad color
	 */
	public String getColor() {

		return color;
	}

	/**
	 * @param color
	 *            Valor de la propiedad color a setear
	 */
	public void setColor( final String color ) {
		this.color = color;
	}

	/**
	 * @return Valor de la propiedad tooltip
	 */
	public String getTooltip() {
		return tooltip;
	}

	/**
	 * @param tooltip
	 *            Valor de la propiedad tooltip a setear
	 */
	public void setTooltip( final String tooltip ) {
		this.tooltip = tooltip;
	}

}
