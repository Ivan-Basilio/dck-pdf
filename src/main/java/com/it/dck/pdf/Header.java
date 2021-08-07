/**
 * @autor Ivan Basilio Ramirez
 */
package com.it.dck.pdf;

import java.io.IOException;
import java.io.InputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;

import com.it.dck.pdf.model.AlturaHeader;
import com.it.dck.pdf.model.Posicion;
import com.it.dck.pdf.util.IUtilPDF;
import com.it.dck.pdf.util.UtilPDF;

/**
 * @author Ivan Basilio Ramirez
 * @version 0.0.1
 * @since 06/08/2021
 */
public class Header {
	
	/**
	 * 
	 * Metodo capaz de crear header con una imagen y posicionarlo en a la derecha, izquierda o en medio
	 * del documento
	 * 
	 * @param document documento donde se agregara el header
	 * @param imagen imagen del header
	 * @param posicion posicion de la imagen, izquierda = 1, en medio = 2 , derecha = 3
	 * @param h altura
	 */
	public void createHeader(PDDocument document, InputStream imagen, Posicion posicion, AlturaHeader h) {
		PDPageContentStream contentStream = null;
		try {
			IUtilPDF util = new UtilPDF();
			PDPage page = new PDPage(PDRectangle.A4);
			contentStream = new PDPageContentStream(document, page);
			document.addPage(page);
			float x;
			//Tamaño de la imagen se divide
			float anchoImagen  = page.getMediaBox().getWidth() / Posicion.TRES.getValor();
			
			float altoImagen = util.altura(h);
			
			float y = page.getMediaBox().getHeight() - altoImagen;
			
			if(posicion.getValor() == Posicion.UNO.getValor()) {
				x = 0;
			} else if(posicion.getValor() == Posicion.DOS.getValor()) {
				x = page.getMediaBox().getWidth() / Posicion.TRES.getValor();
			} else {
				x = page.getMediaBox().getWidth() - anchoImagen;
			}
			
			
			util.agregarImagen(document, contentStream, imagen, 
					x, y, anchoImagen,  altoImagen);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(contentStream != null)
					contentStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	
	
	/**
	 * 
	 * Metodo capaz de crear header con dos imagenes y posicionarlas en la izquierda o derecha 
	 * del documento, dejando un espacio equivalente al ancho de la imagen
	 * 
	 * @param document documento donde se agregara el header
	 * @param imagen1 imagen del header
	 * @param imagen2 imagen del header
	 * @param altura de la imagen y header
	 */
	public void createHeader(PDDocument document, InputStream imagen1, InputStream imagen2, AlturaHeader altura) {
		PDPageContentStream contentStream = null;
		try {
			PDPage page = new PDPage(PDRectangle.A4);
			contentStream = new PDPageContentStream(document, page);
			document.addPage(page);
			
			float x1;
			float y;
			float anchoImagen;
			float altoImagen = new UtilPDF().altura(altura);
			
			float x2;
			
			//Tamaño de la imagen se divide
			anchoImagen = page.getMediaBox().getWidth() / Posicion.TRES.getValor();
			x1 = page.getMediaBox().getWidth() - anchoImagen;
			y = page.getMediaBox().getHeight() - altoImagen;
			x2 = 0;
			
			IUtilPDF util = new UtilPDF();
			
			util.agregarImagen(document, contentStream, imagen1, 
					x1, y, anchoImagen,  altoImagen);
			
			util.agregarImagen(document, contentStream, imagen2, 
					x2, y, anchoImagen, altoImagen);

			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(contentStream != null)
					contentStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
