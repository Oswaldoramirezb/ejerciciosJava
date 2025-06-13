package org.generation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetConceptos {

	public static void main(String[] args) {
		
		/*
		 * Una colección de tipo set es una colección NO ordenada.
		 *  - No se permiten elementos duplicados
		 *  - Cualquier elemento duplicado no se insertará
		 *  
		 *  Sintaxis:
		 *    HashSet<Object> varName = new HashSet<>();
		 *    
		 *   - Crear una blacklist de palabras prohibidas en tu red social 
		 *   - Numeros de la suerte del 1 al 54, sin repetir.
		 */
		
		HashSet<String> luckyNumbers = new HashSet<>();
		//Crea una coleccion de tipo HashSet para almacenar
		//palabras en mi blacklist
		
		
		 HashSet<String> blacklist = new HashSet<>();

	      
	        blacklist.add("Caracoles");
	        blacklist.add("repampanos");
	        blacklist.add("Recorcholis");
	        blacklist.add("Rayos");
	        
	        //Agregar repetido
	        blacklist.add("Repampanos");
	        
	      
	        System.out.println(blacklist);
	        
	        //Obtener el tamaño de la coleccion, size()
	        System.out.println("Num de elementos " + blacklist.size());
	        
	        
	     // Conocer si un elemento existe, contains()
			System.out.println("Existe 'Caracoles':" + blacklist.contains("Caracoles"));
			System.out.println("Existe 'Chispas':" + blacklist.contains("Chispas"));
			
			// Remover un elemento con remove()
			System.out.println("Se elimina 'Repampanos' " + blacklist.remove("Repampanos"));
			System.out.println("Se elimina 'Tonoto' " + blacklist.remove("Tonoto"));
			
			
			// Iterar la colección usando for loop
			List<String> listaPalabras = new ArrayList<>(blacklist);

			for (int i = 0; i < listaPalabras.size(); i++) {
			    System.out.println("Las palabras son: " + listaPalabras.get(i));
			}
			
			// Iterar la colección usando for enhanced
			for (String autos : blacklist) {
				System.out.println("blackList es: " + blacklist);
			}
			
			
			
			
	}

}
