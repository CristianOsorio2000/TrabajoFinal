package co.edu.campusucc;

import java.util.Scanner;

public class Ejer07 {

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
		   System.out.println("+              Ejercicio #7            -");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
	
		   Scanner in = new Scanner (System.in);
		   int l1=0;
		   int l2=0;	   
		   int paginas=0;
		   int minutos=0;
		   
		   System.out.print("INGRESE LAS HORAs: ");
		   l1= in.nextInt();
		   
		   paginas= 30*2;
		   
		   System.out.print("En  " +l1);
		   System.out.print("horas se escriben  " +paginas);
		   System.out.print(" paginas.");
	  
		   
		   System.out.print(" INGRESE LAS PAGINAS: ");
		   l2= in.nextInt();
		   		  
		   minutos= 30*5;
		   	   
		   System.out.print(" Las  "+l2);
		   System.out.print(" paginas se escriben en  "+minutos);
		   System.out.print(" minutos.");
		    
		   
	}
}