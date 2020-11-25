package co.edu.campusucc;

import java.util.Scanner;

public class Ejer11 {

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
		   System.out.println("+              Ejercicio #11           -");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		   
		   Scanner entrada= new Scanner(System.in);
		   
		   int numero;
		   System.out.print("Ingrese un numero: ");
		   numero= entrada.nextInt();
		   
		   if (numero <0)
		   System.out.print("El numero es: " + numero + " Y su valor absoluto es: " + Math.abs(numero));
		   else
		   System.out.print("El numero es: " + numero);
		   
	}
		   
	
}
