/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion;

/**
 *
 * @author USER
 */
public class Gato extends Animal{
    String pelaje;
    private int edad;
    
    public Gato(String nombre, String apellido,String pelaje) {
        super(nombre, apellido);
        this.pelaje = pelaje;
    }
    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public int setEdad() {
        return edad;
    }
    public void hacerSonido(){
        System.out.println("Su gato "+ this.nombre + " esta haciendo Miau");
    }
    @Override
    public void mostrarInformacion (){
            System.out.println("*****************INFORMACION DE SU ANIMAL*******************");
            System.out.println("NOMBRE: "+this.nombre);
            System.out.println("APELLIDO: "+this.apellido);
            System.out.println("EDAD: "+ this.edad);
            System.out.println("PELAJE: " + this.pelaje);
    }
}
