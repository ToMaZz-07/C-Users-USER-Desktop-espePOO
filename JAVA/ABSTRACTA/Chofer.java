/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstracta;

/**
 *
 * @author USER
 */
public class Chofer extends Persona {
    public int numeroPlaca;
    public int codigoTaxi;

    public Chofer(int numeroPlaca, int codigoTaxi, String nombre, int edad) {
        super(nombre, edad);
        this.numeroPlaca = numeroPlaca;
        this.codigoTaxi = codigoTaxi;
    }
    
    
    
    public void aceptar (){
        System.out.println("Chofer aceptando carrera");
    }
    
    public void cancelar (){
        System.out.println("Chofer cancelando carrera");
    }
    
    
}
