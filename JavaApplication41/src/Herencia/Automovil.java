/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author L.S
 */
public class Automovil extends Vehiculo{
    //Atributos
    public int numPuertas;
    //Metodos, getters and Setters
    public Automovil(int numPuertas,int numRuedas, int velocidadMaxima) {
	super(numRuedas, velocidadMaxima);
        this.numPuertas=numPuertas;
    }
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    public void acelerar() {
	System.out.println("El automovil tiene "+numPuertas+" Puertas"+" su numero de ruedas es: "+numRuedas+" "+"Ruedas "+"y su velocidad Maxima es:"+velocidadMaxima+" "+"K/h");	
    
    }
}
