/************************************************
 * Autor: Jose Angel Marquez Espina				*
 * Fecha de creación: 14 abr. 2023				*
 * Fecha de modificación: 15 abr. 2023			*
 * Descripción: Clase cubo hereda de 
 * 		Figura3D, sobreescribe métodos de
 * 		volumen.
 ************************************************/

package figuras;

public class Cubo extends Figura3D {
	public double getVolumen() {
		return Math.pow(getLado(),3);
	}
}
