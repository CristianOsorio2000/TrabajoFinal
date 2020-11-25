package co.edu.campusucc;


public class Ejer12 {

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
		   System.out.println("+              Ejercicio #12           -");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		  
		   System.out.print("Caracol, Cienpies, Gusano");
		   int acumuladoGusano=0;
		   int acumuladoCaracol=0;
		   int acumuladoCienpies=0;
		   int avanzaGusano=4;
		   int avanzaCaracol=3;
		   int avanzaCienpies=4;
		   int retrocedeGusano=2;
		   int retrocedeCaracol=2;
		   int retrocedeCienpies=3;
		   
		   while (acumuladoGusano <=10||acumuladoCaracol <=10||acumuladoCienpies <=10) {
			if (acumuladoGusano <=10) {
				avanzaGusano=avanzaGusano+4;
				retrocedeGusano=retrocedeGusano-2;
				acumuladoGusano=avanzaGusano-retrocedeGusano;
				System.out.print(" Resultado Gusano: "+ acumuladoGusano);
			}
			if (acumuladoCaracol <=10) {
				avanzaCaracol=avanzaCaracol+3;
				retrocedeCaracol=retrocedeCaracol-2;
				acumuladoCaracol=avanzaCaracol-retrocedeCaracol;
				System.out.print(" Resultado Caracol: "+ acumuladoCaracol);
			}
			if(acumuladoCienpies <=10) {
				avanzaCienpies=avanzaCienpies+4;
				retrocedeCienpies=retrocedeCienpies-3;
				acumuladoCienpies=avanzaCienpies-retrocedeCienpies;
				System.out.print(" Resultado Cienpies: "+ acumuladoCienpies);
			}
			
			if (acumuladoGusano >=10) {
				System.out.print(" El primero en llegar es el gusano");
			}
			if (acumuladoCaracol >=10) {
				System.out.print(" El primero en llegar es el caracol");
			}
			if (acumuladoCienpies >=10) {
				System.out.print(" El primero en llegar es el cienpies");
			}
			
		}
			
	}
}
				   
