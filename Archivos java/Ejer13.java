package co.edu.campusucc;

import java.util.Scanner;

public class Ejer13 {

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
		   System.out.println("+              Ejercicio #13           -");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		   
		   Scanner Escaner=new Scanner(System.in);{
		   System.out.print("Calvin y Hobbes ");
		   double unidades=0, operacionCalvin=0, operacionSuma=0,operacionDivision=0;
		   System.out.print("Ingrese las unidades producidas: ");
		   unidades= Escaner.nextDouble();
		   operacionSuma=unidades*2;
		   operacionDivision=operacionSuma/3;
		   operacionCalvin=operacionDivision;
		   System.out.print("Si las unidades en total fueron " + unidades + " 2/3 equivalen a " + operacionCalvin + " de Calvin" );
		   
		   
	
	} 
	
	
	}
	
}
