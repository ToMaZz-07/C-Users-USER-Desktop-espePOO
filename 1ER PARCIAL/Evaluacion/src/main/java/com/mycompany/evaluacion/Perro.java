/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion;

/**
 *
 * @author USER
 */
public class Perro extends Animal {
    String raza;
    private int edad;
    
    public Perro(String nombre, String apellido,String raza) {
        super(nombre, apellido);
        this.raza = raza;
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
        System.out.println("Su perro "+ this.nombre + " esta haciendo Guau");
    }
    @Override
    public void mostrarInformacion (){
            System.out.println("*****************INFORMACION DE SU ANIMAL*******************");
            System.out.println("NOMBRE: "+this.nombre);
            System.out.println("APELLIDO: "+this.apellido);
            System.out.println("EDAD: "+ this.edad);
            System.out.println("RAZA: " + this.raza);
    }
}
