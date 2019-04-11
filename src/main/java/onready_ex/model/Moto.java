/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onready_ex.model;

/**
 *
 * @author usuario
 */
public class Moto extends Vehiculo {
    public double cilindrada;
    
    
    public Moto(String marca, String modelo, double precio, double cilindrada){
        super(marca, modelo, precio);
        this.cilindrada= cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public String toString() {
        return  "Marca: "+ this.marca +" " + "//" + " Modelo: "+  this.modelo + " " +  "//"  
                + " Cilindrada: "+ this.cilindrada + "cc." +  "// Precio: " + " $ "+  this.precio + "\n"; 
                
    }
}