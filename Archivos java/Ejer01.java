package co.edu.campusucc;

import java.util.Scanner;

public class Ejer01 {
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
		   System.out.println("+              Ejercicio #1            -");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		   
		   String a = "";
		   int n=0;
		   try (Scanner Scan = new Scanner (System.in)) {
			System.out.print("Digite un numero: ");
			   a=Scan.next();
		} 
		   n=Integer.parseInt(a);
		   n=n*n*n;
		   System.out.print("El resultado del numero al cubo es: " +n);
		     
	}
}
