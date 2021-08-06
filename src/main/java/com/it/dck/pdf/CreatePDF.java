package com.it.dck.pdf;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;

import com.it.dck.pdf.model.Contenido;
import com.it.dck.pdf.model.Portada;
import com.it.dck.pdf.util.IUtilPDF;

/**
 * 
 * Clase para crear un pdf estandar por el JAR
 * @author Ivan Basilio Ramirez
 * @version 0.0.1
 * @since 06/07/2021
 *
 */
public class CreatePDF {

	/**
	 * utilidades
	 */
	private IUtilPDF util;
	/**
	 * Metodo que construye un pdf basico
	 * se pretende que exista identificado de diseños
	 * 
	 * @param portada si viene vacio o nulo se crea un documento sin portada
	 * @param contenido si viene vacio solo se crea la portada
	 * @param nombre nombre del documento
	 * @return File con el pdf 
	 * @throws NullPointerException en caso de que no existan lo suficientes datos para generar un pdf
	 * @throws IOException en caso de que no pueda crear el archivo
	 * 
	 */
	public File createPdf(String nombre, Portada portada, Contenido contenido ) throws NullPointerException , IOException {
		if(util.validateContenido(contenido) && util.validatePortada(portada)) {
			PDDocument documento = new PDDocument();
			File file = new File(nombre+ ".pdf");
			createPortada(documento, portada);
			createContenido(documento, contenido);
			documento.save(file);

			return file;
		} else {
			throw new NullPointerException("No existen elementos suficientes");			
		}
	}
	/**
	 * Metodo para crear contenido del pdf
	 * se pretende que exista identificado de diseños
	 * 
	 * @param documento documento 
	 * @param portada portada
	 * @return PDDocument DPOCUMENTO
	 * @throws IOException NO SE GENERO CORRECTAMENTE EL DOC
	 */
	public PDDocument createPortada(PDDocument documento, Portada portada) throws IOException {
		PDPage page = new PDPage(PDRectangle.A4);
		PDPageContentStream contentStream = new PDPageContentStream(documento, page);
		util.agregarDatosPortada(contentStream, page, portada);
		return documento;
	}
	/**
	 * Metodo para crear contenido del pdf
	 * se pretende que exista identificado de diseños
	 * 
	 * @param documento documento 
	 * @param contenido contenido
	 * @return PDDocument DPOCUMENTO
	 * @throws IOException NO SE GENERO CORRECTAMENTE EL DOC
	 */
	public PDDocument createContenido(PDDocument documento, Contenido contenido) throws IOException {
		PDPage page = new PDPage(PDRectangle.A4);
		PDPageContentStream contentStream = new PDPageContentStream(documento, page);
		util.agregarDatosContenido(contentStream, page, contenido);

		return documento;
	}
}
