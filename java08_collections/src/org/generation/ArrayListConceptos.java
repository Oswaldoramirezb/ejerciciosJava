package org.generation;

import java.util.ArrayList;

public class ArrayListConceptos {

	public static void main(String[] args) {
		
		/*
		 * Una colección, parte del Java Collections Framework, es 
		 * un objeto que agrupa múltiples elementos en una sola unidad. 
		 * Su principal ventaja es que su tamaño es dinámico, puede 
		 * crecer o reducirse según sea necesario.
		 * 
		 * Existen varios tipos, los más comunes son: 
		 * List: Una secuencia ordenada de elementos. 
		 *       Permite duplicados. (Ej: ArrayList)
		 * Set: Un conjunto de elementos únicos. 
		 *       No permite duplicados. (Ej: HashSet)
		 * Map: Un conjunto de pares clave-valor. 
		 *       Las claves deben ser únicas. (Ej: HashMap)
		 * 
		 * Array List.
		 * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
		 *
		 *	 * 
		 * Una colección List es una colección ... - Es una colección ordenada (respeta
		 * el orden en que se agregan) - Se permite elementos duplicados - Se basa en un
		 * array redimensionable que crece su tamaño, según crece la colección de
		 * elementos. - Esta colección es la mejor rendimiento tiene.
		 * 
		 * Sintaxis: ArrayList<object> varName = new ArrayList<>();
		 * 
		 * 
		 */
		
        // Definir una colección de datos numéricos
        // ArrayList< int > numeros; Se debe indicar una clase(whrapper para los primitivos)
        ArrayList< Integer > numeros;
        numeros = new ArrayList<Integer>();
		
		// Definir una colección para almacenar nombres de marcas de automóviles
		// Asignar el objeto de la colección a una variable
        ArrayList<String> marcasAutos = new ArrayList<>();
        
        //Agregar un elemento con el metodo add()
        
        marcasAutos.add("Toyota");
        
        //Agregar 3 marcas 
        marcasAutos.add("Ford");
        marcasAutos.add("BMW");
        marcasAutos.add("Honda");
        marcasAutos.add("BYD");
        
        //Agregar elemento que ya existia (duplicado)
        marcasAutos.add("Toyota");
        
        //Obtener el tamaño de mi coleccion, size()
        System.out.println("Num de autos; " +marcasAutos.size());
        
        //Devolver un elemento en una posicion especifica, get(int indice)
        System.out.println("A Oswaldo le gusta el " + marcasAutos.get(3));
        
        //Remover un elemento, remove (int indice), remove(object)
        System.out.println("Oswaldo elimina " + marcasAutos.remove("Toyota"));
        System.out.println(marcasAutos);
        
        //Reemplazar un elemento, set(int indice, E elemento)
        System.out.println("Reemplazamos el indice 0" + marcasAutos.set(0, "WV"));
        System.out.println(marcasAutos);
        
        //Verifica si un elemento existe, contains()
        System.out.println("Existe Chevrolet" + marcasAutos.contains("Chrevrolet"));
        System.out.println("Existe BYD" + marcasAutos.contains("BYD"));
        
        
		 // Iterar cada uno de los elementos usando for loop
		 
		 
        
        for (int i = 0; i < marcasAutos.size(); i++) {
            System.out.println(marcasAutos.get(i));
        }
        
        // Iterar cada uno de los elementos usando for enhanced
        for (String marca : marcasAutos) {
            System.out.println(marca);
        }
        
        
        
        
        
        
	}

}
