package co.edu.campusucc;

import java.util.Scanner;

public class Ejer06 {

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
		   System.out.println("+              Ejercicio #6            -");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		   
		   Scanner in = new Scanner (System.in);
		   String l1="";
		   int l2=0;
		   int l3=0;
		   int salarioFinal=0;
		   
		   System.out.print("Ingrese el nombre del empleado: ");
		   l1= in.nextLine();
		   System.out.print("Ingrese el valor por hora: ");
		   l2= in.nextInt();
		   System.out.print("Ingrese las horas trabajadas: ");
		   l3= in.nextInt();
		   
		   salarioFinal=l2*l3;
		   
		   System.out.print("El salario final del empleado " +l1);
		   System.out.print("es: " +salarioFinal);
	}
	
}
