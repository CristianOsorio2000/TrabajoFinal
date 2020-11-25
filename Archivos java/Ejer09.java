package co.edu.campusucc;

import java.util.Scanner;

public class Ejer09 {

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
		   System.out.println("+              Ejercicio #9            -");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		   
		   
		   Scanner leer=new Scanner(System.in);{
		   int numero=0;
		   int sumD=0;
		   
		   
		   System.out.print("Ingrese los digitos que desea sumar: ");
		   numero=leer.nextInt();
		     
		   int num = numero;
		   
		   while (numero !=0){
		   sumD=sumD+(numero%10);
		   numero= numero/10;
		   }  
		  System.out.print("La suma de los digitos es: "+sumD);
		  
	} 
		   
		   
	}	
}
