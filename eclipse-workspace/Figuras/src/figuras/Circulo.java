/************************************************
 * Autor: Jose Angel Marquez Espina				*
 * Fecha de creación: 14 abr. 2023				*
 * Fecha de modificación: 15 abr. 2023			*
 * Descripción: Clase circulo hereda de 
 * 		Figura2D, sobreescribe métodos de area
 * 		y perimetro.
 ************************************************/

package figuras;

public class Circulo extends Figura2D{
	public double getArea(){
		return Math.PI * Math.pow(getRadio(),2);
	}
	public double getPerimetro() {
		return 2 * Math.PI * getRadio();
	}
}
