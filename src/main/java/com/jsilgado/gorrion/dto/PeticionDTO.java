package com.jsilgado.gorrion.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * DTO Peticion
 *
 * @author everis
 */
public class PeticionDTO implements Serializable {
	/**
	 * Serializacion
	 */
	private static final long serialVersionUID = 5432537407773134409L;

	/**
	 * Id
	 */
	private Long id;

	private String nombre;

	private String linea;

	private String tipoPeticion;

	private String estado;

	private String peticionOt;

	private Double horasPeticionario;

	private Double horasAcuerdo;

	private Double incurridoTotal;

	private Double etc;

	private Double etcAutomatico;

	private Double avance;

	private Date centroFechaInicio;

	private Date centroFechaFin;

	private String colorCentroFechaFin;

	private Date fechaRealEntrega;

	private Double desvio;

	private Double porcentajeDesvio;

	private String colorPorcentajeDesvio;

	private String codigoCliente;

	private List<TareaDTO> lstTareas;

	private String incCentroBorrado;

	private String incCentroCurso;

	private String incCentroEntregadas;

	private String incCentroCerradas;

	private String incCentroCanceladas;

	private String incInternasIncurrido;

	private String incInternasPlanificado;

	private String incTotalesInternas;

	private String incFuncBorrado;

	private String incFuncCurso;

	private String incFuncEntregadas;

	private String incFuncCerradas;

	private String incFuncCanceladas;

	private String incFuncIncurrido;

	private String incFuncPlanificado;

	private String incTotalesExternas;

	/**
	 * Constructor de clase
	 */
	public PeticionDTO() {
		super();
	}

	/**
	 * @return Valor de la propiedad avance
	 */
	public Double getAvance() {
		return avance;
	}

	/**
	 * @param avance
	 *            Valor de la propiedad avance a setear
	 */
	public void setAvance( final Double avance ) {
		this.avance = avance;
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
	 * @return Valor de la propiedad tipoPeticion
	 */
	public String getTipoPeticion() {
		return tipoPeticion;
	}

	/**
	 * @param tipoPeticion
	 *            Valor de la propiedad tipoPeticion a setear
	 */
	public void setTipoPeticion( final String tipoPeticion ) {
		this.tipoPeticion = tipoPeticion;
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
	 * @return Valor de la propiedad peticionOt
	 */
	public String getPeticionOt() {
		return peticionOt;
	}

	/**
	 * @param peticionOt
	 *            Valor de la propiedad peticionOt a setear
	 */
	public void setPeticionOt( final String peticionOt ) {
		this.peticionOt = peticionOt;
	}

	/**
	 * @return Valor de la propiedad horasPeticionario
	 */
	public Double getHorasPeticionario() {
		return horasPeticionario;
	}

	/**
	 * @param horasPeticionario
	 *            Valor de la propiedad horasPeticionario a setear
	 */
	public void setHorasPeticionario( final Double horasPeticionario ) {
		this.horasPeticionario = horasPeticionario;
	}

	/**
	 * @return Valor de la propiedad horasAcuerdo
	 */
	public Double getHorasAcuerdo() {
		return horasAcuerdo;
	}

	/**
	 * @param horasAcuerdo
	 *            Valor de la propiedad horasAcuerdo a setear
	 */
	public void setHorasAcuerdo( final Double horasAcuerdo ) {
		this.horasAcuerdo = horasAcuerdo;
	}

	/**
	 * @return Valor de la propiedad incurridoTotal
	 */
	public Double getIncurridoTotal() {
		return incurridoTotal;
	}

	/**
	 * @param incurridoTotal
	 *            Valor de la propiedad incurridoTotal a setear
	 */
	public void setIncurridoTotal( final Double incurridoTotal ) {
		this.incurridoTotal = incurridoTotal;
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
	 * @return Valor de la propiedad centroFechaInicio
	 */
	public Date getCentroFechaInicio() {
		return centroFechaInicio;
	}

	/**
	 * @param centroFechaInicio
	 *            Valor de la propiedad centroFechaInicio a setear
	 */
	public void setCentroFechaInicio( final Date centroFechaInicio ) {
		this.centroFechaInicio = centroFechaInicio;
	}

	/**
	 * @return Valor de la propiedad centroFechaFin
	 */
	public Date getCentroFechaFin() {
		return centroFechaFin;
	}

	/**
	 * @param centroFechaFin
	 *            Valor de la propiedad centroFechaFin a setear
	 */
	public void setCentroFechaFin( final Date centroFechaFin ) {
		this.centroFechaFin = centroFechaFin;
	}

	/**
	 * @return Valor de la propiedad fechaRealEntrega
	 */
	public Date getFechaRealEntrega() {
		return fechaRealEntrega;
	}

	/**
	 * @param fechaRealEntrega
	 *            Valor de la propiedad fechaRealEntrega a setear
	 */
	public void setFechaRealEntrega( final Date fechaRealEntrega ) {
		this.fechaRealEntrega = fechaRealEntrega;
	}

	/**
	 * @return Valor de la propiedad desvio
	 */
	public Double getDesvio() {
		return desvio;
	}

	/**
	 * @param desvio
	 *            Valor de la propiedad desvio a setear
	 */
	public void setDesvio( final Double desvio ) {
		this.desvio = desvio;
	}

	/**
	 * @return Valor de la propiedad lstTareas
	 */
	public List<TareaDTO> getLstTareas() {
		return lstTareas;
	}

	/**
	 * @param lstTareas
	 *            Valor de la propiedad lstTareas a setear
	 */
	public void setLstTareas( final List<TareaDTO> lstTareas ) {
		this.lstTareas = lstTareas;
	}

	/**
	 * @return Valor de la propiedad codigoCliente
	 */
	public String getCodigoCliente() {
		return codigoCliente;
	}

	/**
	 * @param codigoCliente
	 *            Valor de la propiedad codigoCliente a setear
	 */
	public void setCodigoCliente( final String codigoCliente ) {
		this.codigoCliente = codigoCliente;
	}

	/**
	 * @return Valor de la propiedad porcentajeDesvio
	 */
	public Double getPorcentajeDesvio() {
		return porcentajeDesvio;
	}

	/**
	 * @param porcentajeDesvio
	 *            Valor de la propiedad porcentajeDesvio a setear
	 */
	public void setPorcentajeDesvio( final Double porcentajeDesvio ) {
		this.porcentajeDesvio = porcentajeDesvio;
	}

	/**
	 * @return Valor de la propiedad etcAutomatico
	 */
	public Double getEtcAutomatico() {
		return etcAutomatico;
	}

	/**
	 * @param etcAutomatico
	 *            Valor de la propiedad etcAutomatico a setear
	 */
	public void setEtcAutomatico( final Double etcAutomatico ) {
		this.etcAutomatico = etcAutomatico;
	}

	/**
	 * @return Valor de la propiedad incCentroBorrado
	 */
	public String getIncCentroBorrado() {
		return incCentroBorrado;
	}

	/**
	 * @param incCentroBorrado
	 *            Valor de la propiedad incCentroBorrado a setear
	 */
	public void setIncCentroBorrado( final String incCentroBorrado ) {
		this.incCentroBorrado = incCentroBorrado;
	}

	/**
	 * @return Valor de la propiedad incCentroCurso
	 */
	public String getIncCentroCurso() {
		return incCentroCurso;
	}

	/**
	 * @param incCentroCurso
	 *            Valor de la propiedad incCentroCurso a setear
	 */
	public void setIncCentroCurso( final String incCentroCurso ) {
		this.incCentroCurso = incCentroCurso;
	}

	/**
	 * @return Valor de la propiedad incCentroEntregadas
	 */
	public String getIncCentroEntregadas() {
		return incCentroEntregadas;
	}

	/**
	 * @param incCentroEntregadas
	 *            Valor de la propiedad incCentroEntregadas a setear
	 */
	public void setIncCentroEntregadas( final String incCentroEntregadas ) {
		this.incCentroEntregadas = incCentroEntregadas;
	}

	/**
	 * @return Valor de la propiedad incCentroCerradas
	 */
	public String getIncCentroCerradas() {
		return incCentroCerradas;
	}

	/**
	 * @param incCentroCerradas
	 *            Valor de la propiedad incCentroCerradas a setear
	 */
	public void setIncCentroCerradas( final String incCentroCerradas ) {
		this.incCentroCerradas = incCentroCerradas;
	}

	/**
	 * @return Valor de la propiedad incCentroCanceladas
	 */
	public String getIncCentroCanceladas() {
		return incCentroCanceladas;
	}

	/**
	 * @param incCentroCanceladas
	 *            Valor de la propiedad incCentroCanceladas a setear
	 */
	public void setIncCentroCanceladas( final String incCentroCanceladas ) {
		this.incCentroCanceladas = incCentroCanceladas;
	}

	/**
	 * @return Valor de la propiedad incInternasIncurrido
	 */
	public String getIncInternasIncurrido() {
		return incInternasIncurrido;
	}

	/**
	 * @param incInternasIncurrido
	 *            Valor de la propiedad incInternasIncurrido a setear
	 */
	public void setIncInternasIncurrido( final String incInternasIncurrido ) {
		this.incInternasIncurrido = incInternasIncurrido;
	}

	/**
	 * @return Valor de la propiedad incInternasPlanificado
	 */
	public String getIncInternasPlanificado() {
		return incInternasPlanificado;
	}

	/**
	 * @param incInternasPlanificado
	 *            Valor de la propiedad incInternasPlanificado a setear
	 */
	public void setIncInternasPlanificado( final String incInternasPlanificado ) {
		this.incInternasPlanificado = incInternasPlanificado;
	}

	/**
	 * @return Valor de la propiedad incTotalesInternas
	 */
	public String getIncTotalesInternas() {
		return incTotalesInternas;
	}

	/**
	 * @param incTotalesInternas
	 *            Valor de la propiedad incTotalesInternas a setear
	 */
	public void setIncTotalesInternas( final String incTotalesInternas ) {
		this.incTotalesInternas = incTotalesInternas;
	}

	/**
	 * @return Valor de la propiedad incFuncBorrado
	 */
	public String getIncFuncBorrado() {
		return incFuncBorrado;
	}

	/**
	 * @param incFuncBorrado
	 *            Valor de la propiedad incFuncBorrado a setear
	 */
	public void setIncFuncBorrado( final String incFuncBorrado ) {
		this.incFuncBorrado = incFuncBorrado;
	}

	/**
	 * @return Valor de la propiedad incFuncCurso
	 */
	public String getIncFuncCurso() {
		return incFuncCurso;
	}

	/**
	 * @param incFuncCurso
	 *            Valor de la propiedad incFuncCurso a setear
	 */
	public void setIncFuncCurso( final String incFuncCurso ) {
		this.incFuncCurso = incFuncCurso;
	}

	/**
	 * @return Valor de la propiedad incFuncEntregadas
	 */
	public String getIncFuncEntregadas() {
		return incFuncEntregadas;
	}

	/**
	 * @param incFuncEntregadas
	 *            Valor de la propiedad incFuncEntregadas a setear
	 */
	public void setIncFuncEntregadas( final String incFuncEntregadas ) {
		this.incFuncEntregadas = incFuncEntregadas;
	}

	/**
	 * @return Valor de la propiedad incFuncCerradas
	 */
	public String getIncFuncCerradas() {
		return incFuncCerradas;
	}

	/**
	 * @param incFuncCerradas
	 *            Valor de la propiedad incFuncCerradas a setear
	 */
	public void setIncFuncCerradas( final String incFuncCerradas ) {
		this.incFuncCerradas = incFuncCerradas;
	}

	/**
	 * @return Valor de la propiedad incFuncCanceladas
	 */
	public String getIncFuncCanceladas() {
		return incFuncCanceladas;
	}

	/**
	 * @param incFuncCanceladas
	 *            Valor de la propiedad incFuncCanceladas a setear
	 */
	public void setIncFuncCanceladas( final String incFuncCanceladas ) {
		this.incFuncCanceladas = incFuncCanceladas;
	}

	/**
	 * @return Valor de la propiedad incFuncIncurrido
	 */
	public String getIncFuncIncurrido() {
		return incFuncIncurrido;
	}

	/**
	 * @param incFuncIncurrido
	 *            Valor de la propiedad incFuncIncurrido a setear
	 */
	public void setIncFuncIncurrido( final String incFuncIncurrido ) {
		this.incFuncIncurrido = incFuncIncurrido;
	}

	/**
	 * @return Valor de la propiedad incFuncPlanificado
	 */
	public String getIncFuncPlanificado() {
		return incFuncPlanificado;
	}

	/**
	 * @param incFuncPlanificado
	 *            Valor de la propiedad incFuncPlanificado a setear
	 */
	public void setIncFuncPlanificado( final String incFuncPlanificado ) {
		this.incFuncPlanificado = incFuncPlanificado;
	}

	/**
	 * @return Valor de la propiedad incTotalesExternas
	 */
	public String getIncTotalesExternas() {
		return incTotalesExternas;
	}

	/**
	 * @param incTotalesExternas
	 *            Valor de la propiedad incTotalesExternas a setear
	 */
	public void setIncTotalesExternas( final String incTotalesExternas ) {
		this.incTotalesExternas = incTotalesExternas;
	}

	/**
	 * @return Valor de la propiedad colorPorcentajeDesvio
	 */
	public String getColorPorcentajeDesvio() {
		return colorPorcentajeDesvio;
	}

	/**
	 * @param colorPorcentajeDesvio
	 *            Valor de la propiedad colorPorcentajeDesvio a setear
	 */
	public void setColorPorcentajeDesvio( final String colorPorcentajeDesvio ) {
		this.colorPorcentajeDesvio = colorPorcentajeDesvio;
	}

	/**
	 * @return Valor de la propiedad colorCentroFechaFin
	 */
	public String getColorCentroFechaFin() {
		return colorCentroFechaFin;
	}

	/**
	 * @param colorCentroFechaFin
	 *            Valor de la propiedad colorCentroFechaFin a setear
	 */
	public void setColorCentroFechaFin( final String colorCentroFechaFin ) {
		this.colorCentroFechaFin = colorCentroFechaFin;
	}

}
