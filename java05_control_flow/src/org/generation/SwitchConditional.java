package org.generation;

public class SwitchConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * La sentencia switch en Java es una estructura de 
		 * cotnrol que permite ejecutar diferentes bloques
		 * de código basándose en el valor de una variable
		 * o expresion. Es una alternativa mas limpia a una 
		 * serie de sentencias if-else if
		 * 
		 * Puedes usar switch con los siguientes tiposde datos:
		 * primitivos: int, byte, short, char
		 * String (desde java 7)
		 * enum (tipos enumerado)
		 * 
		 * Sintaxis:
		 * switch (evaluacion){
		 * 		case1:
		 * 			sentencias;
		 * 			break;
		 * case2:
		 * 			sentencias;
		 * 			break;
		 * default:
		 * 
		 * 			sentencias;
		 * }
		 */
		
		String userRole = "ADMIN";
		
		switch( userRole ) {
		case "ADMIN":
			System.out.println("Acceso al panel administrador");
			break;
		case "EDITOR":
			System.out.println("Acceso a la edicion de contenido");
			break;
			 // case "VIEWER", "CUSTOMER":
		 case "VIEWER": 
		 case "CUSTOMER":
			 	System.out.println("Acceso a la vista pública");
			 	break;
		default:
			System.out.println("Rol desconocido, acceso denegado");
		}

	}

}
