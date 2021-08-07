/**
 * @autor Ivan Basilio Ramirez
 */
package com.it.dck.pdf.model;

/**
 * @author Ivan Basilio Ramirez
 * @version 0.0.1
 * @since 07/08/2021
 */
public enum Semana {
	
	LUNES("Lunes"),
	MARTES("Martes"),
	MIERCOLES("Miércoles"),
	JUEVES("Jueves"),
	VIERNES("Viernes"),
	SABADO("Sabado"),
	DOMINGO("Domingo");
	
	private String dia;
	
	Semana(String day) {	
		dia = day;
	}
	public String getDia() {
		return dia;
	}
	
}
