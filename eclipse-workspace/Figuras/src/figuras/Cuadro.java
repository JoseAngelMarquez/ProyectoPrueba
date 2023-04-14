/************************************************
 * Autor: Jose Angel Marquez Espina				*
 * Fecha de creación: 14 abr. 2023				*
 * Fecha de modificación: 15 abr. 2023			*
 * Descripción: Clase cuadrado hereda de 
 * 		Figura2D, sobreescribe métodos de area
 * 		y perimetro.
 ************************************************/

package figuras;

public class Cuadro extends Figura2D{
	public double getArea() {
		return Math.pow(getLado(),2);
	}
	
	public double getPerimetro() {
		return 4 * getLado();
	}
}
