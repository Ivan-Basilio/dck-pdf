/**
 * @autor Ivan Basilio Ramirez
 */
package com.it.dck.pdf.model;

/**
 * @author Ivan Basilio Ramirez
 * @version 0.0.1
 * @since 07/08/2021
 */
public enum Posicion {

	UNO(1),
	DOS(2),
	TRES(3);
	private int valor;
	Posicion(int numero) {
		valor = numero;
	}
	public int getValor() {
		return valor;
	}
}
