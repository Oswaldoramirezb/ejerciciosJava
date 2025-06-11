package org.generation;

public class InmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * En Java, los strings son inmutables, lo que significa 
		 * que una vez que se crea un objeto String, su valor 
		 * no puede ser cambiado. Cualquier operación que parezca 
		 * modificar un String en realidad crea un nuevo objeto 
		 * String en memoria.
		 */
		
		String originalString = "El gato";
		
		String modifiedString = originalString.concat(" con botas");
		
		originalString = "ratones ciegos";
		originalString = "El gato";
		
		String newObjectString = new String("El gato");
		
		/*
		 * El operador de igualdad == en los objetos, compara
		 * la referencia
		 */
		
		if(originalString == "El gato") {
			System.out.println("El texto es el mismo");
		}else {
			System.out.println("El texto es diferente");
		}
		
		if(originalString == newObjectString) {
			System.out.println("El string es el mismo");
		}else {
			System.out.println("El string es diferente");
		}
		/*
		 * El metodo .equals (es un String de Java se utiliza
		 * para omparar si el contenido (la secuencia de caracteres)
		 * de dos strings es exactaente el mismo 
		 */
		if(originalString.equalsIgnoreCase(newObjectString)) {
			System.out.println("El string de las variables es el mismo");
		}else {
			System.out.println("El string de las variables es diferente");
		}
		/*
		 * El Garbage Colletor (GC) o Recolector de Basura es un 
		 * proceso automatico en la Maquina Virtual de Java (JVM)
		 * que se encarga de gestionar la memoria 
		 * 
		 * Su principal objeto es liberar la memoria que ocupan
		 * los objetos que ya no están en uso por la aplicación,
		 * previendo asi fugas de memoria y el agotamiento de 
		 * la misma 
		 * 
		 * No necesitas llamar al Garbage Collector explicitamente.
		 * Es un proceso automatico y altamente optimizado que la 
		 * JVM ejecuta cuando lo considera necesario
		 */
	}
}

