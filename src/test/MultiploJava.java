package test;

import java.util.Scanner;

public class MultiploJava {

	public static void main(String[] args) {
		/**
		 * escribe un programa que tome como entrada un numero entero
		 * e indique que cantidad hay que sumarle para que el resultado
		 * sea múltiplo de 7. Un ejemplo: 
		 * A 2 hay que sumarle 5 para que el resultado (2+5=7) sea múltiplo de 7. 
		 * A 13 hay que sumarle 1 para que el resultado (13+1=14) sea multiplo de 7.
		 * Si proporcionas el numero 2 o 13, la salida de la aplicacion debe ser 
		 * 5 o 1 respectivamente. 
		 * 
		 * Pista: el operador modulo puede ser muy util para solucionar esta actividad. 
		 * 	 
		 * */

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite el número");
		int var= sc.nextInt();
		
		/*
		 * En este ejercicio te está diciendo que vas a trabajar con la tabla del 7. 
		 * Por lo tanto, si el numero que lo guardas en la variable "var" está dentro
		 * de la tabla del 7, te va a dar en la división el resto de "0". 
		 * 
		 */
		int multiplo= var%7;
		
		//si se cumple la condición de que el numero forma parte de la tabla del 7 y da de 
		//resto 0 se imprime el resultado
		if (multiplo==0) {
			System.out.println(var+" es multiplo de 7");
			
		}
		//aqui se imprime la otra condición si el modulo de 7 no es "0"
		else {
			System.out.println(var+" no es multiplo 7");
			
			
			int var3=7-multiplo;
			
			/*
			 * Esa variable que tiene como resultado un número superior a 0
			 * va a realizar una resta de 7 para que la variable "multiplo"
			 * tenga como resultado en el resto 0 
			 */
			
			System.out.println("Para que "+ var + " sea multiplo de 7 hay que sumarle " + var3);
		}
		
		
		
	}

}
