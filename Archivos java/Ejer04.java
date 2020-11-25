package co.edu.campusucc;

import java.util.Scanner;

public class Ejer04 {
	
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
		   System.out.println("+              Ejercicio #4            -");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

		   Scanner in = new Scanner (System.in);
		   int l2=0, l3=0, total=0 ;
		   
		   String l1="";
		   
		   System.out.println("Ingrese el nombre del empleado: ");
		   l1= in.nextLine();
		   
		   System.out.println("Ingrese el salario del empleado: $");
		   l2= in.nextInt();
		   
		   System.out.println("Ingrese el descuento del empleado: $");
		   l3= in.nextInt();
		   
		   total= l2-l3;
		   
		   System.out.print("El salario del empleado " +l1);
		   System.out.print(" es de: $" +total);
	    
	}  
		   		   
}
