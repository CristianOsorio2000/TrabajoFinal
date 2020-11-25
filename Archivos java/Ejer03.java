package co.edu.campusucc;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		   System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		   System.out.println("-Autor: Cristian Andres Osorio Vernaza +");
		   System.out.println("+                                      -");
		   System.out.println("-        INGENIERIA EN SISTEMAS        +");
		   System.out.println("+                                      -");
		   System.out.println("-     HERRAMIENTAS COMPUTACIONALES     +");
		   System.out.println("+                                      -");
		   System.out.println("-      Universidad Cooperativa de      +");
		   System.out.println("+               colombia               -");
		   System.out.println("-                                      +");
		   System.out.println("+              Ejercicio #3            -");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
	   
		  
		   double nota1, nota2, nota3, notaD;
		   Scanner leer = new Scanner (System.in); 
		  
		   System.out.print("Ingrese la primera nota: ");
		   nota1= leer.nextFloat();
		   System.out.print("Ingrese la segunda nota: ");
		   nota2= leer.nextFloat();
		   System.out.print("Ingrese la tercera nota: ");
		   nota3= leer.nextFloat();
		   
		   nota1=nota1*0.3;
		   nota2=nota2*0.3;
		   nota3=nota3*0.4;
		   notaD=nota1+nota2+nota3;
		
		   System.out.print("La nota definitiva es: " +notaD);	   
		   
		    		   
	}		
}
