package com.elglobo;

public class Cake {
    
    private String pasteleria;
    private String sabor;
    private double precio;

    public Cake() {
        this("Pastelería El Globo", "Chocolate", 150.0);
    }
    
    public Cake(double precio) {
        this("Pastelería El Globo", "Chocolate", precio);
    }
    
    public Cake(String pasteleria, String sabor, double precio) {
        this.pasteleria = pasteleria;
        this.sabor = sabor;
        this.precio = precio;
    }
    
    public static Cake cakeCumple() {
        return new Cake("Pastelería Toñita", "Tres leches", 350.0);
    }
    
    //-------- 
    
    public void setPasteleria(String pasteleria) {
            this.pasteleria = pasteleria;
    }
    
    public String getPasteleria() {
        return pasteleria;
    }
    
    public void setSabor(String sabor) {
            this.sabor = sabor;
    }
    
    public String getSabor() {
        return sabor;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
        
    }
    
    public double getPrecio() {
        return precio;
    }
    
    
    public String toString() {
        return "Pasteleria: " + this.pasteleria +
               ", Sabor: " + this.sabor +
               ", Precio: $" + this.precio;
    }
}