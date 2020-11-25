package co.edu.campusucc;

import java.util.Scanner;

public class Ejer02 {

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
		   System.out.println("+              Ejercicio #2            -");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
	   
		   int num1=0;
		   int num2=0;
		   try (Scanner Scan = new Scanner (System.in)) {
			System.out.print("Digite el primer numero: ");
			num1=Scan.nextInt();
			System.out.print("Digite el segundo numero: ");
			num2=Scan.nextInt();
		  }
			
			int resultado1=num1+num2;
			int resultado2=num1-num2;
			int resultado3=num1*num2;
			int resultado4=(num1+num2)/2;
			
			System.out.print("La suma es:"+resultado1 );
			
			System.out.print(" La resta es:"+resultado2 );
			
			System.out.print(" El producto es:"+resultado3 );
			
			System.out.print(" El promedio es:"+resultado4 );	
			   
	} 
}