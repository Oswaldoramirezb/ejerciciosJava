package org.generation;

import java.util.ArrayList;
public class ArithmeticOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Arithmetic Operators
        
        +   Additive operator (also used for String concatenation)
        -   Subtraction operator
        *   Multiplication operator
        /   Division operator
        %   Remainder operator
     
     Cuando se realizan operaciones entre tipo de datos diferentes
     el resultado es promovido al de mayor jerarquía para evitar
     pérdida de precisión.
     
     Ejemplo:   int * long = long
     
     *  1.- byte (8 bits)
     *  2.- short (16 bits)
     *  3.- int (32 bits)
     *  4.- long (64 bits)
     *  5.- float (32 bits)
     *  6.- double (64 bits)
     
     */
		double value = 5.2;
		int operadorA = (int)value;
		int operadorB = 6;
		int sum =  operadorA + operadorB;
		System.out.println("el resultado es: "+sum);
		
		int difference = operadorA - operadorB;
		System.out.println("Resta: "+difference);
		
		double product = operadorA * 1.2;
		int product2 = operadorA * (int)1.2;
		int product3 = (int)(operadorA * 1.2);
		System.out.println("resulrado 1: "+product);
		System.out.println("resulrado 2: "+product2);
		System.out.println("resulrado 3: "+product3);
		
		/*
		 * Java tiene varios tipos de datos numéricos para 
		 * optimizar el uso de memoria y mejorar el rendimiento, 
		 * ofreciendo flexibilidad para elegir el tipo adecuado 
		 * según el contexto y las necesidades del programa.
		 * 
		 * En ciclos o en bloques de código donde se realizan 
		 * muchas operaciones repetitivas, como iteraciones, 
		 * es recomendable usar tipos como int para evitar 
		 * conversiones innecesarias entre tipos y así 
		 * mejorar el rendimiento.
		 * 
		 */
		byte interes = 1;
		byte resultado;
		for (int i = 0; i < 10; i++) {
			resultado = (byte)(5 * interes);
		}
		
		int interes2 = 1;
		int resultado2;
		for (int i = 0; i < 10; i++) {
			resultado2 = 5 * interes2;
		}
		
		 /*  Palabra reserva "var"
		 *  Se introdujo en la versión de Java 10.
		 * 
		 *  Se utiliza para la inferencia de tipo de variable locales.
		 *  
		 *  Uso principal: simplica la declaración de variables locales,
		 *     especialmente cuando el tipo de dato es largo.
		 *     
		 *  Consideraciones:
		 *   - Solo para variables locales
		 *   - La variable debe ser inicializada en la misma declaración.
		 */
		// int itemCount = 10;
		var itemCount = 20;
		System.out.println(itemCount);//variable tipo int 
		var itemString = "f";
		System.out.println(itemString);//variable tipo string
		var itemChar = 'f';
		System.out.println(itemChar);//variable tipo char
				
			// var userList = new ArrayList<String>();
			ArrayList<String> userList = new ArrayList<>();		
	}

}
