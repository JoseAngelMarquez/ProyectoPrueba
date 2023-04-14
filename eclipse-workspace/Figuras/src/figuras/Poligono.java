/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 14 abr. 2023				*
 * Fecha de modificación: 15 abr. 2023			*
 * Descripción: Clase abstracta de un poligono
 * 		hereda de la clase Figura2D.
 ************************************************/

package figuras;

public abstract class Poligono extends Figura2D{
	private int numLados;
	private double apotema;
	
	public int getNumLados() {
		return numLados;
	}
	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	public double getApotema() {
		return apotema;
	}
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	
	public double getArea(){
		return (getPerimetro() * getApotema()) / 2;
	}
	public double getPerimetro() {
		return getNumLados() * getLado();
	}
}
