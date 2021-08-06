package com.it.dck.pdf.util;

import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;

import com.it.dck.pdf.model.Contenido;
import com.it.dck.pdf.model.Portada;

/**
 * 
 * Clase con utilidades para crear pdf con tablas pretendiendo sean lo mas dinamicos posibles(en tamaños de celda, letra etc),
 * imagenes (poder tener definidos tamaños estandare en las imagenes y posiciones dentro del cdocumento), 
 * leyendas (Algun texto que se desee incluir o simplemmete archivos pdf con solo texto), 
 * enumeracion de hojas (Desde el inicio a fin, saltando portada)
 * @author Ivan Basilio Ramirez
 * @version 0.0.1
 * @since 06/07/2021
 *
 */
public class UtilPDF implements IUtilPDF {
	
	/**
	 * Method to create table in pdf file
	 * @param font fuente del docuemnto
	 * @param page actual del docuemnto
	 * @param contentStream parametro para sgregar contenido
	 * @param y coordenada en el eje Y, cosiderar solo el primer cuadrante
	 * @param margin margen que rodee la tabla a dibujar
	 * @param content lista de movimientos
	 * @throws IOException NO SE GENERO EL ARCHIVO
	 */
	public void drawTable(PDFont font, PDPage page, PDPageContentStream contentStream, 
            float y, float margin, 
            List<Object> content, int pagina) throws IOException {
		
		int rows;
		if(content != null) {
			rows = content.size() + 1;
		} else {
			rows = 1;
		}
		final int cols = 3;
		final float rowHeight = 20f;
		final float tableWidth = page.getMediaBox().getWidth() - margin - margin;
		final float tableHeight = rowHeight * rows;
		float colWidth = tableWidth/(float)cols;
		final float cellMargin=5f;
		contentStream.setFont(font, 8);

		//draw the rows
		float nexty = y ;
		for (int i = 0; i <= rows; i++) {
		contentStream.drawLine(margin, nexty, margin+tableWidth, nexty);
		nexty-= rowHeight;
		}
		
		//draw the columns
		float nextx = margin;
		for (int i = 0; i <= cols; i++) {
			contentStream.drawLine(nextx, y, nextx, y-tableHeight);
			nextx += colWidth;
		}
				
		float textx = margin+cellMargin;
		float texty = y-15;        
		for(int i = 0; i < rows; i++){
			for(int j = 0 ; j < 3; j++){
				String text = "";
				if(i == 0 && j == 0) {
					text = "Fecha de Movimiento";
				} else if(i == 0 && j == 1) {
					text = "Comercio";
				} else if(i == 0 && j == 2) {
					text = "Monto";
				} else if(j == 0) {
					text = "slgo";
				} else if(j == 1) {
					text = "algo";
				} else {
					text = "algo";
				}
				
				contentStream.beginText();
				contentStream.moveTextPositionByAmount(textx,texty);
				contentStream.drawString(text);
				contentStream.endText();
				textx += colWidth;
			}
			texty-=rowHeight;
			textx = margin+cellMargin;
		}
		
		contentStream.beginText();
		contentStream.setFont(font, 12);
        contentStream.newLineAtOffset( page.getMediaBox().getWidth() / 2, 40);
		contentStream.showText(String.valueOf(pagina));
		contentStream.endText();
	}
	/**
	 * Validacion de datos en portada
	 * @param portada datos de la portadaen el pdf
	 * @return retorna verdadero si estan OK los datos
	 */
	public boolean validatePortada(Portada portada) {
		return false;
	}
	/**
	 * Validacion de datos en contenido
	 * @param contenido datos que puede incluir el pdf
	 * @return retorna verdadero si estan OK los datos
	 */
	public boolean validateContenido(Contenido contenido) {
		return false;
	}
	
	/**
	 * Agregar datos de la portada
	 * @param contentStream contenido
	 * @param page pagina
	 * @param portada datos
	 */
	public void agregarDatosPortada(PDPageContentStream contentStream, PDPage page, Portada portada) {
	}

	/**
	 * @param contentStream contenido 
	 * @param page pagina actual
	 * @param contenido contenido
	 */
	public void agregarDatosContenido(PDPageContentStream contentStream, PDPage page, Contenido contenido) {
		
	}
}
