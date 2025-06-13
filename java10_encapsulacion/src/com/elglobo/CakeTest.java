package com.elglobo;

public class CakeTest {

    public static void main(String[] args) {
        
        Cake pastel01 = new Cake();
        pastel01.setPasteleria("Pastelería La Esperanza");
        pastel01.setSabor("Tres Leches");
        pastel01.setPrecio(175.0);
        
        Cake pastel02 = new Cake("Pastelería Ideal", "Frambuesa", 200.0);
        Cake pastel03 = new Cake();
        Cake pastel04 = new Cake(180.0);
        Cake pastel05 = Cake.cakeCumple();
        
        System.out.println(pastel01);
        System.out.println(pastel02);
        System.out.println(pastel03);
        System.out.println(pastel04);
        System.out.println(pastel05);
    }
}