package com.jsilgado.gorrion.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utiles {

	/**
	 * Devuelve el primer dia el mes actual
	 */
	public static Date primerDiaMesActual() {
		Calendar calendar = new GregorianCalendar();
		calendar.set( Calendar.DAY_OF_MONTH, Calendar.getInstance().getActualMinimum( Calendar.DAY_OF_MONTH ) );
		return calendar.getTime();
	}

	/**
	 * Devuelve el ultimo dia el mes actual
	 */
	public static Date utlimoDiaMesActual() {
		Calendar calendar = new GregorianCalendar();
		calendar.set( Calendar.DAY_OF_MONTH, Calendar.getInstance().getActualMaximum( Calendar.DAY_OF_MONTH ) );
		return calendar.getTime();
	}

}
