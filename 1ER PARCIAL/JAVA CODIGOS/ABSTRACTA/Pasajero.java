/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstracta;

/**
 *
 * @author USER
 */
public class Pasajero extends Persona {
    public int numeroID;

    public Pasajero(int numeroID, String nombre, int edad) {
        super(nombre, edad);
        this.numeroID = numeroID;
    }
    
    public void pedir (){
        System.out.println("Pasajero pidiendo taxi");
    }
    
    public void cancelar (){
        System.out.println("Pasajero cancelando taxi");
    }
}
