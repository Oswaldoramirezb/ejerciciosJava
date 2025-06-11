package com.generation;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sesion java03");
		/*
		 * 
		 * Reglas para el nombre de las variables: 
		 * - Se distingue entre minúsculas y mayúsculas 
		 * - La longitud del nombre es ilimitada 
		 * - Puedes utilizar cualquier caracter Unicode 
		 * - La variable puede comenzar: 
		 * > una letra ej. miVariable 
		 * > signo de dolar $miVariable 
		 * > caracter de subrayado _miVariable
		 * 
		 * Java es un lenguaje de programación 
		 * fuertemente tipado, lo que significa que 
		 * todas las variables deben ser declaradas 
		 * con un tipo de dato específico antes 
		 * de ser usadas.
		 * 
		 * [tipo de dato] [nombre de la variable]
		 * String message;
		 * 
		 */
		/**
         *  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
         *  Tipos de datos en Java
         *  - Objetos (no primitivos)
         *  - Datos primitivos
         *      8 datos primitivos
         *   > byte (8 bits)
         *   > short (16 bits)
         *   > int (32 bits)
         *   > long (64 bits)
         *   > float (32 bits)
         *   > double (64 bits)
         *   > boolean
         *   > char (16 bits)
         *      
         */
		 /*
         *  El número de de dígitos que puede contener la varible
         *  2^8 = 256;
         *  
         *  Para Obtener el valor máximo y mínimo del tipo byte
         *  usando su wrapper (clase envolvete) Byte.
         */
		/*
		 *  El número de de dígitos que puede contener la varible
		 *  2^8 = 256;
		 *  2^7 = 128 -> 
		 *        128 valores positivos:  0 ... +127 
		 *        128 valores negativos: -1 ... -128 
		 *    
		 *  Para Obtener el valor máximo y mínimo del tipo byte
		 *  usando su wrapper (clase envolvete) Byte.
		 *  control + alt + flecha abajo
		 */
		
		System.out.println("Max value in byte type: "+Byte.MAX_VALUE);
		System.out.println("Min value in byte type: "+Byte.MIN_VALUE);
		/*
		 *  Tipo de dato short
		 *  Dato de 16 bits, almacena valores enteros
		 *  2^16 = 65536
		 *  Valores positivos:  0... 32767
		 *  Valores Negativos: -1... -32768
		 *  Obtener el MAX_VALUE y MIN_VALUE usando el warapper Short
		 *  
		 *  usos: util para ahorrar memoria cuando los valores numéricos
		 *        son pequeños. Sistemas embebidos con memoria limitada.
		 */
		System.out.println("Max value in short type:  "+Short.MAX_VALUE);
		System.out.println("Min value in short type:  "+Short.MIN_VALUE);
		
		/*
		 * Tipo de dato int
		 * Dato de 32 bits, almacena datos enteros.
		 * El wrapper de int es Integer
		 * 
		 * usos: Adecuado para la mayoría de los números: contadores,
		 *       índices de arreglos, cantidad de productos en inventario.
		 *       
		 * Obtener el rango máximo y mínimo del tipo int:      
		 */
		
		System.out.println("Max value in Int type:  "+Integer.MAX_VALUE);
		System.out.println("Min value in Int type:  "+Integer.MIN_VALUE);
		
		/* Typo de dato long
		 * Dato de 64 bits, almacena datos enteros
		 * El wrapper de long es long
		 * 
		 * usos: IDs de transacciones bancarias, marcas de tiempo precisas,
		 * 		 IDs en grandes bases de datos.
		 */
		System.out.println("Max value in Long type:  "+Long.MAX_VALUE);
		System.out.println("Min value in Long type:  "+Long.MIN_VALUE);
		
		/*
		 * Las literales numéricas enteras en java son de tipo int
		 * ej. 12, -456, 0
		 * Para idicar una literal numética de tipo long
		 * hay que indicar la literal con la letra l o L.
		 * Se recomienda usar la L para no confundir con el 1
		 * 
		 * Se puede utilizar _ para una mayor legibilidad en un
		 * valor numéricos.
		 */
		
	//	long productId = 22_147_4671_456L;
		
		/*
		 * Dato de tipo float
		 * Dato de 32 bits, almacena valos numéricos de punto flotante.
		 * 
		 * El wrapper de float es Float.
		 * 
		 * usos: la precisión no necesita ser extremadamente alta y se busca
		 *       ahorrar memoria.
		 * nota: tanto float como double tiene pérdida de precisión.
		 * Para evitar la pérdida de precisión se puede usar la clase BigDecimal
		 */
		
		System.out.println("Max value in FLoat type:  "+Float.MAX_VALUE );
		System.out.println("Min value in FLoat type:  "+Float.MIN_VALUE );
		
		System.out.println(.1 + .2);
		
		/*
		 * Dato de tipo double
		 * Dato de 64 bits, almacena valos numéricos de punto flotante.
		 * 
		 * El wrapper de double es Double.
		 * 
		 * uso: se elige double para cálculos que requieran alta exactitud como cálculos
		 *     científicos, coordenadas geográficas.
		 * 
		 * nota: Para cálculos financieros críticos, la clase BigDecimal es más
		 *       recomendada.
		 */
		System.out.println("Max value in Double type:  "+Double.MAX_VALUE );
		System.out.println("Min value in Double type:  "+Double.MIN_VALUE );
		
		/*
		 * Dato char
		 * Almacena un solo caracter.
		 * Se debe definir la literal con apóstrofe ej. 'a', 'C', ' '
		 * Solo almacea caracteres de la tabla unicode(16 bits).
		 * puede almacenar del 0 al 65535
		 */
		
		
	//	boolean isActive = true;
		
		 // Tienes que maneja las tallas S, M, L
		 char productSizeCode = 'L';
		 System.out.println("Talla: " + productSizeCode ); // L
		 // Asignarle la letra M usando su valor unicode
		 productSizeCode = '\u004D';
		 System.out.println("Talla: " + productSizeCode ); // M
		 // Asignarle la letra S usando su valor numérico
		 productSizeCode = 83;
		 System.out.println("Talla: " + productSizeCode ); // S
		 
		 //Asignar la letra X usando unicode o su valor numerico
		 
		 productSizeCode = '\u0058';
		 System.out.println("Talla: " + productSizeCode ); // X
		
		//===============Objeto String =====================================
			/*
			 * Tipo de dato String
			 * Es un objeto que se define con comillas dobles.
			 * 
			 * Si deseas imprimir comillas dobles,se usa el 
			 * caracter de escape \
			 *   \b backspace
			 *   \t tab
			 *   \n line feed
			 *   \r carriage return
			 *   \" double quote
			 *   \' single quote
			 *   \\ backslash
			 */
		 
		 String message = "java \"monos\" a comer ";
		 System.out.println(message);
	
	}

}
