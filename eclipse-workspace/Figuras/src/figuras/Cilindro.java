/************************************************
 * Autor: Jose Angel Marquez Espina				*
 * Fecha de creación: 14 abr. 2023				*
 * Fecha de modificación: 15 abr. 2023			*
 * Descripción: Clase cilindro hereda de 
 * 		Figura3D, sobreescribe el método de
 * 		volumen.
 ************************************************/

package figuras;

public class Cilindro extends Figura3D {
	public double getVolumen() {
		return Math.PI * Math.pow(getRadio(), 2) * getAltura();
	}
}
