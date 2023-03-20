/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

import java.util.ArrayList;

/**
 *
 * @author L.S
 */
public class PruebaVehiculo {
    
    public static ArrayList<Vehiculo> acelerar = new ArrayList<Vehiculo>();
    
    public static void main(String[] args) {
        Vehiculo veh = new Vehiculo(4,200);
        Automovil auto = new Automovil(4,4,600);
        Motocicleta moto = new Motocicleta(true,2,800);
        
        acelerar.add(veh);
        acelerar.add(auto);
        acelerar.add(moto);
        
        veh.acelerar();
        System.out.println("                            ");
        auto.acelerar();
        System.out.println("                            ");
        moto.acelerar();

    }
}
