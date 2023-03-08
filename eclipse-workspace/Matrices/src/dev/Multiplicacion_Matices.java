package dev;
import java.util.Scanner;

public class Multiplicacion_Matices {
    public static void main(String[] args) {

	
	Scanner  datos=new Scanner (System.in);

int Matriz[][]=new int[3][3];
int i,j,fil,col,nf,nc;

System.out.println("Dame la cantidad de filas que deseas generar");
fil=datos.nextInt();

System.out.println("Dame la cantidad de Columnas que deseas generar");
col=datos.nextInt();

for (i=0; i<fil; i++) {
	for(j=0; j<col; j++) {
        System.out.println("Matriz ["+i+"]["+j+"]: ");
	    fil=datos.nextInt();
	}
}

}
}