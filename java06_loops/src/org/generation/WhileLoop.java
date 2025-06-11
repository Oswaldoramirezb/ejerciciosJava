package org.generation;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {


		/*
         * Bucle While
         * Mientras la condición sea verdadera, se realiza un nuevo ciclo.
         * 
         * Sintaxis:
         *     
         *     while( condicion ) instruccion;
         *     
         *     while( condicion ) {
         *        instrucciones;
         *     }
         * 
         * Es útil cuando no sabes cuántas iteraciones se necesitarán.
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

	        System.out.println("Bienvenido!");
	        System.out.print("Quieres seguir activo? (y) ");
	        decision = scanner.nextLine().toLowerCase();

	        while (decision.equals("y") || decision.equals("yes")) {
	            System.out.println("Bienvenido!");
	            System.out.print("Quieres seguir activo? (y) ");
	            decision = scanner.nextLine().toLowerCase();
	        }

	        System.out.println("Adios");
	        scanner.close();
	        
		

	}

}
