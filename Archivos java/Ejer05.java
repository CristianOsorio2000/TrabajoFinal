package co.edu.campusucc;

import java.util.Scanner;

public class Ejer05 {

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
		   System.out.println("+              Ejercicio #5            -");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

		   Scanner in = new Scanner (System.in);
		   int l1=0;
		   int l2=0;	   
		   int l3=0;
		   
		   
		   System.out.print("Ingresa el precio del producto: ");
	       l1= in.nextInt();
	       System.out.print("Ingresa el dinero que entrego el cliente: ");
	       l2= in.nextInt();
	       
	       l3=l2-l1;
	       System.out.print("El cambio que le debo de dar al cliente es: " + l3);
	
		 }   
}
