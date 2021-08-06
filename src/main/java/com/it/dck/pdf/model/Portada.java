package com.it.dck.pdf.model;
/**
 * Objeto portada para la recepcion de datos y elaboracion de la misma
 * @author Ivan Basilio Ramirez
 * @version 0.0.1
 * @since 06/07/2021
 */
public class Portada {

	private String titulo;
	private String autor;
	private String institucion;
	private String fechaEntrega;
	/**
	 * Constructor por default
	 */
	public Portada() {
		super();
	}
	/**
	 * Constructos con patrametros
	 * @param titulo titulo de la portada
	 * @param autor nombre de quier escribio el documento
	 * @param institucion a quien va dirigido o presentado
	 * @param fechaEntrega fecha de elaboracion o entrega
	 */
	public Portada(String titulo, String autor, String institucion, String fechaEntrega) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.institucion = institucion;
		this.fechaEntrega = fechaEntrega;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the institucion
	 */
	public String getInstitucion() {
		return institucion;
	}
	/**
	 * @param institucion the institucion to set
	 */
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	/**
	 * @return the fechaEntrega
	 */
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	/**
	 * @param fechaEntrega the fechaEntrega to set
	 */
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	
}
