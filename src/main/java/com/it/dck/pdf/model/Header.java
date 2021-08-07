/**
 * @autor Ivan Basilio Ramirez
 */
package com.it.dck.pdf.model;

import java.io.InputStream;

/**
 * @author Ivan Basilio Ramirez
 * @version 0.0.1
 * @since 06/08/2021
 */
public class Header {
	
	private InputStream imagen1;
	private InputStream imagen2;
	private int posicion;
	private String texto;
	/**
	 * @return the imagen1
	 */
	public InputStream getImagen1() {
		return imagen1;
	}
	/**
	 * imagen principal posicion izquierda
	 * @param imagen1 the imagen1 to set
	 */
	public void setImagen1(InputStream imagen1) {
		this.imagen1 = imagen1;
	}
	/**
	 * en caso de requerir dos imagenes, se queda en posicion derecha
	 * @return the imagen2
	 */
	public InputStream getImagen2() {
		return imagen2;
	}
	/**
	 * @param imagen2 the imagen2 to set
	 */
	public void setImagen2(InputStream imagen2) {
		this.imagen2 = imagen2;
	}
	/**
	 * Posicion de la imagen(una sola) o texto 
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}
	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	/**
	 * @return the texto
	 */
	public String getTexto() {
		return texto;
	}
	/**
	 * en csso de requerir algun texto 
	 * @param texto the texto to set
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

}
