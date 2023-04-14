/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 23 mar. 2023				*
 * Fecha de modificación: 23 mar. 2023			*
 * Descripción: Clase principal que invoca a las
 * 		clases.
 ************************************************/

package figuras;

public class Principal {
	public static void main(String[] args) {
		/*
		 * Figuras 2D
		 * */	
		// Cuadrado
		Cuadro cuadrito = new Cuadro();
		cuadrito.setLado(5);
		
		// Hexagono
		Hexagono hexagono = new  Hexagono();
		hexagono.setApotema(5);
		hexagono.setLado(4);
		
		// Pentagono
		Pentagono pentagono= new Pentagono();
		pentagono.setApotema(6);
		pentagono.setLado(4);
		
		// Circulo
		Circulo circulo = new Circulo();
		circulo.setRadio(15);
		
		// Romboide
		Romboide romboide = new Romboide();
		romboide.setBase(50);
		romboide.setAltura(30);
		romboide.setLado(10);
		
		// Rombo
		Rombo rombo = new Rombo();
		rombo.setDiagonalMayor(30);
		rombo.setDiagonalMenor(20);
		
		/*
		 * Figuras 3D
		 * */
		
		// Cubo
		Cubo cubo = new Cubo();
		cubo.setLado(25);
		
		// Cilindro
		Cilindro cilindro = new Cilindro();
		cilindro.setAltura(16);
		cilindro.setRadio(7);
		
		// Esfera
		Esfera esfera = new Esfera();
		esfera.setRadio(45);;
		
		/*
		 * Imprimiendo los resultados
		 * */
		System.out.println("El area del cuadrado es " +  cuadrito.getArea());
		System.out.println("El perimetro del cuadrado es " + cuadrito.getPerimetro());
		
		System.out.println("El area del hexagono es " + hexagono.getArea());
		System.out.println("El perimetro del hexagono es " + hexagono.getPerimetro());
		
		System.out.println("El area del pentagono es " + pentagono.getArea());
		System.out.println("El perimetro del pentagono es " + pentagono.getPerimetro());
		
		System.out.println("El area del circulo es " + circulo.getArea());
		System.out.println("El perimetro del circulo es " + circulo.getPerimetro());
		
		System.out.println("El area del romboide es " + romboide.getArea());
		System.out.println("El perimetro del romboide es " + romboide.getPerimetro());
		
		System.out.println("El area del rombo es " + rombo.getArea());
		System.out.println("El perimetro del rombo es " + rombo.getPerimetro());
		
		
		System.out.println("El volumen del cubo es " + cubo.getVolumen());
		System.out.println("El volumen del Cilindro es " + cilindro.getVolumen());
		System.out.println("El volumen de la esfera es " + esfera.getVolumen() );
	}
}
