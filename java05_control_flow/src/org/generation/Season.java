package org.generation;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		/*
		 * Usando la clase Scanner, preguntar al usuario
		 * su mes de nacimiento ( 1-12).
		 * 
		 * Mostrar la estación del año de acuerdo al mes de
		 * nacimiento:
		 * 
		 * mes 12, 1, 2: primavera
		 * mes 3, 4, 5: verano
		 * mes 6, 7, 8: otoño
		 * mes 9, 10, 11: invierto
		 * 
		 * En caso de contestar otro número: mes inválido.
		 * 
		 * Resolver la estación del año usando if-else-if
		 */
		
    	 // Pedir el mes de nacimiento
    	 System.out.print("Introduce tu mes de nacimiento (1-12): ");
    	 int mes = sc.nextInt();
//================con if, else if ========================
    	 // Determinar la estación del año
    	 String estacion;
    	 if (mes == 12 || mes == 1 || mes == 2) {
    	   estacion = "Primavera";
    	 } else if (mes == 3 || mes == 4 || mes == 5) {
    	   estacion = "Verano";
    	 } else if (mes == 6 || mes == 7 || mes == 8) {
    	   estacion = "Otoño";
    	 } else if (mes == 9 || mes == 10 || mes == 11) {
    	   estacion = "Invierno";
    	 } else {
    	   estacion = "Mes inválido";
    	 }
    	  // Mostrar el resultado
    	 System.out.println("Naciste en la temporada de: " + estacion);

    	       
    	
    		
//===================Con Switch====================    
		switch( mes ) {
		case 12, 1, 2:
			System.out.println("Naciste en la temporada de primavera");
			break;
			
		case 3, 4, 5:
			System.out.println("Naciste en la temporada de verano");
			break;
			
		case 6, 7, 8:
			System.out.println("Naciste en la temporada de otoño");
			break;
			
		case 9, 10, 11:
			System.out.println("Naciste en la temporada de invierno");
			break;
		default:
			System.out.println("Mes inválido");
		}
		
		 /*
		  * Cerrar el scanner y liberar los recursos del sistema
		  */
		 sc.close();
	}

}
