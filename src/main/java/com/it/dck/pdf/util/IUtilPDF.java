/**
 * @autor Ivan Basilio Ramirez
 */
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
public interface IUtilPDF {
	/**
	 * Method to create table in pdf file
	 * @param font fuente del docuemnto
	 * @param page actual del docuemnto
	 * @param contentStream parametro para sgregar contenido
	 * @param y coordenada en el eje Y, cosiderar solo el primer cuadrante
	 * @param margin margen que rodee la tabla a dibujar
	 * @param content lista de movimientos
	 * @param pagina pagina actual numero
	 * @throws IOException nos e genero el docmuento
	 */
	public void drawTable(PDFont font, PDPage page, PDPageContentStream contentStream, 
            float y, float margin, 
            List<Object> content, int pagina) throws IOException;
	/**
	 * Validacion de datos en portada
	 * @param portada datos de la portadaen el pdf
	 * @return retorna verdadero si estan OK los datos
	 */
	abstract boolean validatePortada(Portada portada);
	/**
	 * Validacion de datos en contenido
	 * @param contenido datos que puede incluir el pdf
	 * @return retorna verdadero si estan OK los datos
	 */
	abstract boolean validateContenido(Contenido contenido);
	/**
	 * Agregar datos de la portada
	 * @param contentStream contenido
	 * @param page pagina
	 * @param portada datos
	 */
	abstract void agregarDatosPortada(PDPageContentStream contentStream, PDPage page, Portada portada);
	/**
	 * 
	 *@param contentStream contenido 
	 * @param page pagina actual
	 * @param contenido contenido
	 */
	abstract void agregarDatosContenido(PDPageContentStream contentStream, PDPage page, Contenido contenido);
	
}
