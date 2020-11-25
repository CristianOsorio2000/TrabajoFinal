package co.edu.campusucc;

import java.util.Scanner;

public class Ejer08 {
	
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
		   System.out.println("+              Ejercicio #8            -");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

		   double  resultado1, horas, salarioFinal;
		   Scanner leer = new Scanner (System.in);
		   Scanner in = new Scanner (System.in);
		   int l2=0;
		   int l3=0;
		   int l4=0;
		   String l1="";
		  
		   
		   System.out.print("Ingrese el nombre del empleado: ");
		   l1= leer.nextLine();
		   System.out.print("Ingrese los dias que ha trabajado: ");
		   l2= in.nextInt();
		   System.out.print("ingrese el numero de horas que ha trabajado; ");
		   l3= in.nextInt();
		   System.out.print("Ingrese el valor pagado por horas: $");
		   l4= in.nextInt();
		   
		   resultado1= l2*l4;
		   horas= resultado1*0.5;
		   salarioFinal= horas/0.12;
		   
		   System.out.print("El empleado  " +l1);
		   System.out.print(" con  " +l2);
		   System.out.print(" dias de trabajo, con  " +l3);
		   System.out.print(" horas trabajadas, donde el valor pagado por hora es de $ "+l4);
		   System.out.print(" recibe un total de $ "+salarioFinal);
	}
		   
}
