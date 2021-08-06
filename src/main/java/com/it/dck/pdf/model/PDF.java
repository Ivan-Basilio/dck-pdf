/**
 * @autor Ivan Basilio Ramirez
 */
package com.it.dck.pdf.model;

/**
 * Objeto principal 
 * @author Ivan Basilio Ramirez
 * @version 0.0.1
 * @since 06/08/2021
 * 
 */
public class PDF {

	private String nombre;
	private Portada portada;
	private Contenido contenido;
	/**
	 * constructor por default
	 */
	public PDF() {
		super();
	}
	/**
	 * Constructor con parametros del objeto
	 * @param nombre nombre del archivo
	 * @param portada objeto con datos de portada
	 * @param contenido objeto con datos de contenido
	 */
	public PDF(String nombre, Portada portada, Contenido contenido) {
		this.nombre = nombre;
		this.portada = portada;
		this.contenido = contenido;
	}
	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the portada
	 */
	public Portada getPortada() {
		return portada;
	}

	/**
	 * @param portada the portada to set
	 */
	public void setPortada(Portada portada) {
		this.portada = portada;
	}

	/**
	 * @return the contenido
	 */
	public Contenido getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(Contenido contenido) {
		this.contenido = contenido;
	}
	
}
