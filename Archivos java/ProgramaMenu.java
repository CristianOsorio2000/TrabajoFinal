package co.edu.campusucc;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
public class ProgramaMenu {

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
		   System.out.println("+             PROGRAMA MENU            -");
		   System.out.println("-                                      +");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
	
		 	   int opcionPrograma;
		 	   char otroValor;
			   String comando = "", ruta="E:\\UCC_prog_II-2020s2\\Java\\Taller_M2_001\\src\\co\\edu\\campusucc\\";
			  
			   Scanner leer = new Scanner(System.in); 
			
		do{	   
			   System.out.println("Digite 1 para el programa Ejer00");
			   System.out.println("Digite 2 para el programa Ejer01");
			   System.out.println("Digite 3 para el programa Ejer02");
			   System.out.println("Digite 4 para el programa Ejer03");
			   System.out.println("Digite 5 para el programa Ejer04");
			   System.out.println("Digite 6 para el programa Ejer05");
			   System.out.println("Digite 7 para el programa Ejer06");
			   System.out.println("Digite 8 para el programa Ejer07");
			   System.out.println("Digite 9 para el programa Ejer08");
			   System.out.println("Digite 10 para el programa Ejer09");
			   System.out.println("Digite 11 para el programa Ejer10");
			   System.out.println("Digite 12 para el programa Ejer11");
			   System.out.println("Digite 13 para el programa Ejer12");
			   System.out.println("Digite 14 para el programa Ejer13");
			   System.out.println("Digite 15 para el programa Ejer14");
			   System.out.print("Ingrese el numero del programa que desea ejecutar: ");
			   opcionPrograma=leer.nextInt();
			    
			   switch (opcionPrograma) {
			   case 1:
				   comando = "Ejer00";
				   break;
			   case 2:
				   comando = "Ejer01";
				   break;
			   case 3:
				   comando = "Ejer02";
				   break;
			   case 4:
				   comando = "Ejer03";
				   break;
			   case 5:
				   comando = "Ejer04";
				   break;
			   case 6:
				   comando = "Ejer05";
				   break;
			   case 7: 
				   comando = "Ejer06";
				   break;
			   case 8:
				   comando = "Ejer07";
				   break;
			   case 9:
				   comando = "Ejer08";
				   break;
			   case 10:
				   comando = "Ejer09";
				   break;
			   case 11:
				   comando = "Ejer10";
				   break;
			   case 12:
				   comando = "Ejer11";
				   break;
			   case 13:
				   comando = "Ejer12";
				   break;
			   case 14:
				   comando = "Ejer13";
				   break;
			   case 15:
				   comando = "Ejer14";
				   break;
			   case 16:
				   comando = "Ejer15";
				   break;
				   
			   }
			   
			   try
			    
			   { 
				  
				   var processBuilder = new ProcessBuilder();
				   processBuilder.command("java","E:\\UCC_prog_II-2020s2\\Java\\Taller_M2_001\\src\\co\\edu\\campusucc\\" +comando+ ".java");
				   var process = processBuilder.inheritIO().start();
				   var ret = process.waitFor();
				   				   
			   }
			   
			   catch (Exception e)
			   {
				   System.out.println(e);
			   }
			   	   System.out.println("QUIERE EJECUTAR EL SIGUIENTE PROGRAMA? 1 para SI 2 para NO ");
			   	   otroValor = leer.next().charAt(0);
		   		} while(otroValor=='1');
	}
}
	

