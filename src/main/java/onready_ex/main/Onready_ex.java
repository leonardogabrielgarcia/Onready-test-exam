/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onready_ex.main;

import onready_ex.model.Vehiculo;
import onready_ex.model.Auto;
import onready_ex.model.Moto;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Leonardo García <leoooo.garciaaa@gmail.com>
 */
public class Onready_ex{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Vehiculo> listaVehiculos = getVehiculos();
          
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("LISTA DE VEHICULOS:");
        System.out.println("");
        listaVehiculos.stream().forEach(System.out::println);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("");
        
        System.out.println("Vehiculo mas CARO: ");        
        Vehiculo caro = listaVehiculos.stream().max(Comparator.comparingDouble(Vehiculo::getPrecio)).get();
        System.out.println( caro.getMarca() + " " + caro.getModelo());
        System.out.println("--------------------------------------------------------------------------------");
        
        System.out.println("Vehiculo mas BARATO: ");
        Vehiculo barato = listaVehiculos.stream().min(Comparator.comparingDouble(Vehiculo::getPrecio)).get();
        System.out.println( barato.getMarca() + " " + barato.getModelo());
        System.out.println("--------------------------------------------------------------------------------");
        
        System.out.println("Vehiculo que contiene en el modelo la letra 'Y'");
        listaVehiculos.stream().filter(v -> v.getModelo().contains("Y")).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("");
        
        System.out.println("Lista de vehiculos ORDENADOS DE MAYOR A MENOR: ");
        System.out.println("");
        listaVehiculos.stream().sorted((p1, p2)->p2.getPrecio().compareTo(p1.getPrecio())).forEach(System.out::println); 
       
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
    
    private static List<Vehiculo> getVehiculos() {
        List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
        listaVehiculos.add(new Auto("Peugeot", "206", 200000, 4));
        listaVehiculos.add(new Moto("Honda", "Titan", 60000,125.00));
        listaVehiculos.add(new Auto("Peugeot", "208" , 250000,5));
        listaVehiculos.add(new Moto("Yamaha", "YBR", 80500.50, 160.00));
        return listaVehiculos;
    }
 }
