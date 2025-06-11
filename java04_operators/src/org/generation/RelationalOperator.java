package org.generation;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
         *  Operadores de igualdad, relacionales y condicionales
           
           ==      equal to
           !=      not equal to
           >       greater than
           >=      greater than or equal to
           <       less than
           <=      less than or equal to        
         
         */
		int value1 = 1;
	     int value2 = 2;
	        
	     if(value1 == value2 ) // false
	       System.out.println("value1 == value2"); // no se imprime
	     
	     if(value1 != value2) // true
	       System.out.println("value1 != value2"); // Se imrpime
	     
	     if(value1 > value2) // false
	       System.out.println("value1 > value2"); // no se imprime
	     
	     if(value1 < value2) // true
	       System.out.println("value1 < value2"); // se imprime
	     
	     if(value1 <= value2) // true
	       System.out.println("value1 <= value2"); // se imprime
	     
	     //if(value1 <= "10") no se puede realizar esta operacion
	     
	     /*
	      * Convertir un string a un numero
	      * La clase wrapper (o envoltorio) es una clase que 
	      * encapsula un tipo primitivo en un objeto. Esto
	      * permite tratar los tipos primitivos (int, char, boolean, etc.)
	      * como objetos
	      * 
	      * Ventajas de los primitivos
	      *  - mas rapidos en rendimiento 
	      *  - menor consuma de memoria
	      *  
	      * Desventahas en los primitivos
	      *  - No se puede usar en colecciones genericas
	      *  - No poseen metodos ni atributos
	      *  - No puden ser null
	     */
	     String numberString = "10";
	     
	     byte myValueByte = Byte.parseByte(numberString);
	     if (value1 <= myValueByte) System.out.println("my valueByte es mayor");
	     
	     /*
	      * Realizar la comparación de value1
	      * con una nueva variable que sea de tip short
	      * nota: se debe convertir numberString a un tipo short 
	      */
	  
	     short myValueShort = Short.parseShort(numberString);
	     if (value1 <= myValueShort) System.out.println("myValueShort es mayor");
	     
	     /*
	      * Realizar la comparación de value1
	      * con una nueva variable que sea de tip double
	      * nota: se debe convertir numberString a un tipo double  
	      */
	     double myValueDouble = Double.parseDouble(numberString);
	     if (value1 <= myValueDouble) System.out.println(myValueDouble+" es mayor");
	     
	
	}

}
