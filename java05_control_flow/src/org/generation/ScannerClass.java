package org.generation;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	
    	System.out.println("ingresa tu nombre");
    	/*
         * Lee una línea completa de entrada como cadena de texto.
         * Devuelve todo el texto de la línea, excluyendo el
         * carácter de salto de línea(\n).
         * 
         * Buffer: Memoria temporal donde se almacenan los datos
         * de entrada antes de ser procesados.
         */
    	String name = sc.nextLine();
    	System.out.println("tu nombre es: "+name);
    	
    	System.out.println("ingresa tu numero de la suerte del 1 al 10");
    	if( sc.hasNextInt() ) {
			 int myNumber = sc.nextInt();
			 System.out.println("Genial, tú número de la suerte es: " + myNumber);			 
		 } else {
			 System.out.println("Eres un mal usuario, no entregaste un número");
		 }
    	
    	sc.nextLine();
    	
    	System.out.println("¿Cuál es tu personaje favorito de Shrek?");
    	String character = sc.nextLine();
    	System.out.println("tu personaje fav es: "+character);
    	
    	
    	System.out.println("ingresa tu rol");
    	String Rol = sc.nextLine();
    	
		switch( Rol ) {
		case "ADMIN":
			System.out.println("Acceso al panel administrador");
			break;
			
		case "EDITOR":
			System.out.println("Acceso a la edicion de contenido");
			break;
			
		 case "VIEWER":
			 System.out.println("Acceso a solo vista");
			break;
			
		 case "CUSTOMER":
			 	System.out.println("Acceso a la vista pública");
			 	break;
		default:
			System.out.println("Rol desconocido, acceso denegado");
		}
		
		 /*
		  * Cerrar el scanner y liberar los recursos del sistema
		  */
		 sc.close();
    }
}



