package com.elglobo;

public class CakeTest {

	public static void main(String[] args) {

 
        Cake pastel01 = new Cake();
        pastel01.sabor = "chocolate matilda";
        pastel01.precio = 270;


        Cake pastel02 = new Cake();
        pastel02.sabor = "tres leches vainilla";
        pastel02.precio = 200;

        Cake.Pasteleria = "El Globo";

        
        System.out.println("Pastel 1:" + pastel01.sabor + ", $" + pastel01.precio + Cake.Pasteleria);
        System.out.println("Pastel 2:" + pastel02.sabor + ", $" + pastel02.precio + Cake.Pasteleria);
    }

		

	}


