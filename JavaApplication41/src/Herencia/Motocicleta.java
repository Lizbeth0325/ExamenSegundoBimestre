/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author L.S
 */
public class Motocicleta extends Vehiculo {
    
    //Atributos
    public boolean tieneCasco;
    
    //Metodos, getters and Setters
    public  Motocicleta(boolean tieneCasco, int numRuedas, int velocidadMaxima) {
        super(numRuedas, velocidadMaxima);
        this.tieneCasco=tieneCasco;
    }
   public boolean isTieneCasco() {
        return tieneCasco;
    }

    public void setTieneCasco(boolean tieneCasco) {
        
    }
    public void acelerar() {
	System.out.println("El conductor: "+tieneCasco+"la motocilceta tiene solo: "+numRuedas+" "+"Ruedas "+"y su velocidad Maxima es:"+velocidadMaxima+" "+"K/h");
    }
}
