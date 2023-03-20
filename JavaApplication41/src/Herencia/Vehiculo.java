/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herencia;

/**
 *
 * @author L.S
 */
public class Vehiculo {
    //Atributos
    public int numRuedas;
    public int velocidadMaxima;

    //Metodos, getters and Setters
    public  Vehiculo(int numRuedas, int velocidadMaxima) {
	this.numRuedas=	numRuedas;
        this.velocidadMaxima=velocidadMaxima;
    }
    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public void acelerar() {
	System.out.println("el vehiculo tiene solo: "+numRuedas+" "+"Ruedas "+"y su velocidad Maxima es:"+velocidadMaxima+" "+"K/h");
    }
    
}
