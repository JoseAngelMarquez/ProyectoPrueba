/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 14 abr. 2023				*
 * Fecha de modificación: 15 abr. 2023			*
 * Descripción: Clase abstracta de una figura
 * 		con atributos pricipales de una figura.
 ************************************************/

package figuras;

public abstract class Figura {
	private double lado;
	private double radio;
	private double altura;
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
