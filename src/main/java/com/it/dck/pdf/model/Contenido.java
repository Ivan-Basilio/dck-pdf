package com.it.dck.pdf.model;

import java.util.List;

/**
 * 
 * @author Ivan Basilio Ramirez
 * @version 0.0.1
 * @since 06/08/2021
 */
public class Contenido extends Header {

	private String titulo;
	private List<String> subtitulos;
	private List<String> textos;
	private boolean enumeracion;
	/**
	 * Contructor por default
	 */
	public Contenido() {
		super();
	}
	/**
	 * contructor pon parametros 
	 * @param titulo TITULO DEL DOCUMENTO
	 * @param subtitulos SUBTITULOS DENTRO DEL DOC
	 * @param textos TEXTOS
	 * @param enumeracion VA O NO VA ENUMERADO EL DOC
	 */
	public Contenido(String titulo, List<String> subtitulos, List<String> textos, boolean enumeracion) {
		super();
		this.titulo = titulo;
		this.subtitulos = subtitulos;
		this.textos = textos;
		this.enumeracion = enumeracion;
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
	 * @return the subtitulos
	 */
	public List<String> getSubtitulos() {
		return subtitulos;
	}
	/**
	 * @param subtitulos the subtitulos to set
	 */
	public void setSubtitulos(List<String> subtitulos) {
		this.subtitulos = subtitulos;
	}
	/**
	 * @return the textos
	 */
	public List<String> getTextos() {
		return textos;
	}
	/**
	 * @param textos the textos to set
	 */
	public void setTextos(List<String> textos) {
		this.textos = textos;
	}
	/**
	 * @return the enumeracion
	 */
	public boolean isEnumeracion() {
		return enumeracion;
	}
	/**
	 * @param enumeracion the enumeracion to set
	 */
	public void setEnumeracion(boolean enumeracion) {
		this.enumeracion = enumeracion;
	}
	
}
