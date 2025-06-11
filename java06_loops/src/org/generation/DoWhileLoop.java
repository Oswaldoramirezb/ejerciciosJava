package org.generation;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		/*
		 * Ciclo Do-While
		 * Ejecuta un bloque de código al menos una vez
		 * antes de evaluar la condición.
		 * 
		 * Sintaxis:
		 *     
		 *    do {
		 *    
		 *     Instrucciones;
		 *     
		 *    } while (condición);
		 * 
		 */
		
		
		/*
		* Mostrar en la consola un mensaje de bienvenida
		* 
		* Posteriormente preguntar al usuario si desea
		* seguir activo, si la respuesta es "y"("s") volver a mostrar
		* el mensaje de bienvenida, en caso contrario despedirse
		* y terminar el programa
		*/
		
		Scanner scanner = new Scanner(System.in);
		String decision;

		do {
		System.out.println("Bienvenido!");
		System.out.print("Quieres seguir activo? (y)");
		decision = scanner.nextLine().toLowerCase();
		} while (decision.equals("y") || decision.equals("yes"));

		System.out.println("Adios");
		scanner.close();
		
	}

}
