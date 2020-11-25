package co.edu.campusucc;

import java.util.Scanner;

public class Ejer10 {

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
		   System.out.println("+              Ejercicio #10           -");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		   
		   double recargo, salario, salarioFinal1;
		   int l2, l3, l4; 
		   String l1="";
		   Scanner leer = new Scanner (System.in);
		   Scanner in = new Scanner (System.in);
		   
		   System.out.print("Ingrese nombre del empleado: ");
		   l1= leer.nextLine();
		   System.out.print("Ingrese el codigo: ");
		   l2= in.nextInt();
		   System.out.print("Ingrese el valor por horas laborales: $");
		   l3= in.nextInt();
		   System.out.print("Ingrese el numero de horas trabajadas: ");
		   l4= in.nextInt();
		 
		   salario= l3*l4;
		   recargo= salario*0.2;
		   salarioFinal1= salario+recargo;
		  
		   if (l4>48) {
		   	   System.out.print("El salario final de "+l1);
		   	   System.out.print(" registrado con el codigo "+l2);
		   	   System.out.print(" es: $"+salarioFinal1);
		  }else if (l4<48) {
			   System.out.print("El salario final de "+l1);
			   System.out.print(" registrado con el codigo "+l2);
			   System.out.print(" es: $" +salario);	
		  }
		   
		   
			
			   
		   }
		   
	
}
