package com.jsilgado.gorrion.dto;

import java.io.Serializable;

/**
 * DTO Peticion
 *
 * @author everis
 */
public class HorasDTO implements Serializable {
	/**
	 * Serializacion
	 */
	private static final long serialVersionUID = 5432537407773134409L;

	private Double correctivo = 0D;

	private Double soporte = 0D;

	private Double evolutivo = 0D;

	private Double siEvolutivo = 0D;

	private Double noEvolutivo = 0D;

	/**
	 * @return Valor de la propiedad correctivo
	 */
	public Double getCorrectivo() {
		return correctivo;
	}

	/**
	 * @param correctivo
	 *            Valor de la propiedad correctivo a setear
	 */
	public void setCorrectivo( final Double correctivo ) {
		this.correctivo = correctivo;
	}

	/**
	 * @return Valor de la propiedad soporte
	 */
	public Double getSoporte() {
		return soporte;
	}

	/**
	 * @param soporte
	 *            Valor de la propiedad soporte a setear
	 */
	public void setSoporte( final Double soporte ) {
		this.soporte = soporte;
	}

	/**
	 * @return Valor de la propiedad evolutivo
	 */
	public Double getEvolutivo() {
		return evolutivo;
	}

	/**
	 * @param evolutivo
	 *            Valor de la propiedad evolutivo a setear
	 */
	public void setEvolutivo( final Double evolutivo ) {
		this.evolutivo = evolutivo;
	}

	/**
	 * @return Valor de la propiedad siEvolutivo
	 */
	public Double getSiEvolutivo() {
		return siEvolutivo;
	}

	/**
	 * @param siEvolutivo
	 *            Valor de la propiedad siEvolutivo a setear
	 */
	public void setSiEvolutivo( final Double siEvolutivo ) {
		this.siEvolutivo = siEvolutivo;
	}

	/**
	 * @return Valor de la propiedad noEvolutivo
	 */
	public Double getNoEvolutivo() {
		return noEvolutivo;
	}

	/**
	 * @param noEvolutivo
	 *            Valor de la propiedad noEvolutivo a setear
	 */
	public void setNoEvolutivo( final Double noEvolutivo ) {
		this.noEvolutivo = noEvolutivo;
	}

}
