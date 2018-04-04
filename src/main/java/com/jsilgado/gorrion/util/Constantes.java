package com.jsilgado.gorrion.util;

/**
 * Constantes de la aplicacion
 *
 * @author jsilgado
 */
public final class Constantes {

	private Constantes() {
		super();
	}

	public static class VISTAS {
		public static String V_WELCOME = "welcome.xhtml";
		public static String V_NUEVO_ALUMNO = "Nuevo_Alumno.xhtml";
		public static String V_ERROR = "Error_Page.xhtml";
	}
	
	public static final String FORMATTER_DATE = "dd/MM/yy";

	public static final String FORMATTER_DATE_FENIX = "yyyy-MM-dd";

	public static class PETICION_TIPO {
		public static final String EVOLUTIVO = "MANTENIMIENTO_EVOLUTIVO";
		public static final String CORRECTIVO = "MANTENIMIENTO_CORRECTIVO";
		public static final String SOPORTE = "SOPORTE";
	}

	public static class ACC_ESTADO {
		public static final String ENTREGADA = "ENTREGADA";
		public static final String EN_EJECUCION = "EN_EJECUCION";
		public static final String APLAZADA = "APLAZADA";
		public static final String CERRADA = "CERRADA";
	}

	public static class CAPACIDAD_LEYENDA {
		public static final String AUSENCIA_LEGAL = "A";
		public static final String FIN_DE_SEMANA = "W";
		public static final String VACACIONES = "V";
		public static final String SINDICATO = "S";
		public static final String FESTIVO = "F";
		public static final String COMPENSADO = "C";
		public static final String ENFERMEDAD = "E";
		public static final String FORMACION = "T";
	}

	public static class CAPACIDAD_COLOR {
		public static final String AUSENCIA_LEGAL = "colorGrisOscuro";
		public static final String FIN_DE_SEMANA = "colorGris";
		public static final String VACACIONES = "colorVerde";
		public static final String FESTIVO = "colorRojo";
		public static final String COMPENSADO = "colorNaranja";
		public static final String ENFERMEDAD = "colorAzul";
		public static final String FORMACION = "colorRosa";
	}

	public static class TIPO_TAREA {
		public static final String NO_CARGABLE = "No Cargable";
		public static final String GESTION = "Gestión Petición / OT";
		public static final String ACC = "Actuación Corta";
		public static final String PRUEBAS = "Pruebas cruzadas";
	}

	public static class CONCEPTO_DISPONIBLE {
		public static final String NO_FACTURABLE = "No facturable";
		public static final String SI_FACTURABLE = "Facturable";
	}

	public static class CAPACIDAD_TEXTO_TAREA {
		public static final String AUSENCIA_LEGAL = "Ausencia legal";
		public static final String VACACIONES = "Vacaciones";
		public static final String FESTIVO = "Festivo";
		public static final String COMPENSADOS = "Compensados";
		public static final String ENFERMEDAD = "Enfermedad";
		public static final String FORMACION = "Formaci";
	}

	public static class UNAV_TIPO_SOPORTE {
		public static final String WAR = "#WAR#";
		public static final String MERGE = "#MER#";
		public static final String DESPLIEGUE = "#DES#";
		public static final String MONTAJE = "#MTJ#";
		public static final String DOCUMENTACION = "#DOC#";
		public static final String EVOLUTIVO = "#EVO#";
		public static final String ANALISIS_ALTO_NIVEL = "#ANN#";
		public static final String CONSULTA = "#CON#";
		public static final String GESTION = "#GES#";
	}

	public static class DESVIO {
		public static final Integer PORCENTAJE_DESVIO_OBJETIVO = 5;
	}

	public static class COLOR {
		public static final String VERDE = "colorVerde";
		public static final String AMARILLO = "colorAmarillo";
		public static final String ROJO = "colorRojo";
		public static final String AZUL = "colorAzul";
	}
}
