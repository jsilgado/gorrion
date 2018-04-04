package com.jsilgado.gorrion.domain;

import java.io.Serializable;

public class CompositeKeyNc implements Serializable {

	/**
	 * Descripcion del campo
	 */
	private static final long serialVersionUID = 1908436225535459235L;

	private Long idAuditoria;
	private Long idNc;

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
	public Long getIdNc() {
		return idNc;
	}

	/**
	 * @param idNc
	 *            Valor de la propiedad idNc a setear
	 */
	public void setIdNc( final Long idNc ) {
		this.idNc = idNc;
	}

}
