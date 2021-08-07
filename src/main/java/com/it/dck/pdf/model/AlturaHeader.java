/**
 * @autor Ivan Basilio Ramirez
 */
package com.it.dck.pdf.model;

/**
 * @author Ivan Basilio Ramirez
 * @version 0.0.1
 * @since 07/08/2021
 */
public enum AlturaHeader {
	
	H1(60),
	H2(80),
	H3(100),
	H4(120),
	H5(140),
	H6(160),
	H7(180);
	
	private int altura;
	
	AlturaHeader(int i) {
		altura = i;
	}
	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}
	
}
