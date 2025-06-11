package com.generation;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         *  El orden de la jerarquía depende del tamaño de bits
         *  y la precisión. El orden de jerarquía de los datos
         *  primitivos de menor a mayor es:
         *  
         *  1.- byte (8 bits)
         *  2.- short (16 bits)
         *  3.- int (32 bits)
         *  4.- long (64 bits)
         *  5.- float (32 bits)
         *  6.- double (64 bits)
         * 
         *  El Java las conversiones de tipo se llaman type casting.
         *  Hay dos tipos principales: implicit casting y explicit casting)
         * 
         */
		// Java convierte automaticamente un tipo mas pequeño 
		byte productStatusCode = 3;
		short statusCode = productStatusCode;
		
		//===========conversion explícita ===========
		/*
		 * Se debe hacer manualmente colocando el tipo de dato entre paréntesis
		 * delante del valor a convertir.
		 * Es necesario cuando se convierte un tipo de dato más grnade a uno
		 * más pequeño.
		 * 
		 * ¡Cuidado! La conversión implícita puede llevar a la pérdida de 
		 * información si el valor del tipo más grande excede la capacidad
		 * del tipo más pequeño.
		 */
		
		short califiacionBuroDeCredito = 131;
		byte califiacion = (byte)califiacionBuroDeCredito;
		System.out.println("valor de calificacion"+ califiacion);
		
		int numChortes = 5;
		byte numTotal = (byte)numChortes;
		System.out.println("Num. total: "+numTotal);
		
	}

}
