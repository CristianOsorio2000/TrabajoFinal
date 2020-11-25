package co.edu.campusucc;

import java.util.Scanner;

public class Ejer14 {

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
		   
		   System.out.print("La nina, La pinta y la Santa Maria");
		   
		   int totalMillas=0;
		   int medioviajeIDA=600;
		   int medioviajeREGRESO=600;
		   int ninaIDA=8, ninaVUELTA=12;
		   int pintaIDA=9, pintaVUELTA=11;
		   int santamariaIDA=10, santamariaVUELTA=8;
		   int contadorNina=0,contadorPinta=0,contadorSantaMaria=0;
		   int temporalNina=0,temporalPinta=0,temporalSantaMaria=0;
		   
		   while (contadorNina <=1200 || contadorPinta <=1200 || contadorSantaMaria <=1200) {
			   if(contadorNina <= 1200) {
				   temporalNina=8+12;
				   contadorNina=contadorNina+temporalNina;
				   temporalNina=0;
				   if(contadorNina ==1200) {
					   System.out.print(" El barco de Nina es el primero en llegar");
				   }
			   }
			   if (contadorPinta <=1200) {
				   temporalPinta=9+11;
				   contadorPinta=contadorPinta+temporalPinta;
				   temporalPinta=0;
				   if(contadorPinta ==1200) {
					   System.out.print(" El barco de Pinta es el primero en llegar");
				   }
			   }
			   if (contadorSantaMaria <=1200) {
				   temporalSantaMaria=10+8;
				   contadorSantaMaria=contadorSantaMaria+temporalSantaMaria;
				   temporalSantaMaria=0;
				   if(contadorSantaMaria ==1200) {
					   System.out.print(" El barco de Santa Maria es el primero en llegar");
				   }
			   }
		   }
		   System.out.print(" Llega a 1200");
		   
	}  
}
