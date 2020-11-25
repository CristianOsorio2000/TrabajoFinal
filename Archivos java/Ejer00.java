package co.edu.campusucc;

import java.util.Scanner;

public class Ejer00 {

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
		   System.out.println("+              Ejercicio #0            -");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		   
		   Scanner in = new Scanner (System.in);
		   int l1=0;
		   int l2=0;
		   int l3=0;
		   
		   System.out.print("¿Cuantos metros de longitud tiene la pieza del paño?:");
		   l1=in.nextInt();
		   System.out.print("¿Cuantos metros corta todos los dias?:");
		   l2=in.nextInt();
		   
		   l3=l1/l2;
		   System.out.print("En " + l3 + "dias habra cortado completamente la pieza del paño");
	} 
				   
}
