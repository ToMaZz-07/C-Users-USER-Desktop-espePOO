/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perros;

/**
 *
 * @author USER
 */
public class dogs {
    String nombre;
    String raza;
    String color;
    int edad;
        
    public dogs (String nombre,String raza, String color, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public void saltar(){
        System.out.println(this.nombre + " de raza " + this.raza + " de color " + this.color + " de " + this.edad + " año/s de edad " + " empezo a saltar " );
    }
    public void jugar(){
        System.out.println(this.nombre + " de raza " + this.raza + " de color " + this.color + " de " + this.edad + " año/s de edad " + " empezo a jugar ");
    }
    public void morder(){
        System.out.println(this.nombre + " de raza " + this.raza + " de color " + this.color + " de " + this.edad + " año/s de edad " + " empezo a morder ");
    }
    public void ladrar(){
        System.out.println(this.nombre + " de raza " + this.raza + " de color " + this.color + " de " + this.edad + " año/s de edad " + " empezo a ladrar ");
    }
}
