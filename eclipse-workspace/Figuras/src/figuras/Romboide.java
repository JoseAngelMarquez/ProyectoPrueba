/************************************************
 * Autor: Jose Angel Marquez Espina				*
 * Fecha de creación: 14 abr. 2023				*
 * Fecha de modificación: 15 abr. 2023			*
 * Descripción: Clase romboide hereda de 
 * 		Figura2D, sobreescribe métodos de area
 * 		y perimetro.
 ************************************************/

package figuras;

public class Romboide extends Figura2D {
	private double base;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double getArea(){
		return getBase() * getAltura();
	}
	public double getPerimetro() {
		return 2 * (getBase() + getLado());
	}
	
}
