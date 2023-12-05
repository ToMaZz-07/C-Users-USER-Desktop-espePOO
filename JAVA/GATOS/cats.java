/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gatos;

/**
 *
 * @author USER
 */
public class cats {
    String nombre;
    String raza;
    String color;
    int edad;
        
    public cats (String nombre,String raza, String color, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public void maullar(){
        System.out.println(this.nombre + " de raza " + this.raza + " de color " + this.color + " de " + this.edad + " año/s de edad " + " empezo a maullar " );
    }
    public void bostesar(){
        System.out.println(this.nombre + " de raza " + this.raza + " de color " + this.color + " de " + this.edad + " año/s de edad " + " empezo a bostesar ");
    }
    public void dormir(){
        System.out.println(this.nombre + " de raza " + this.raza + " de color " + this.color + " de " + this.edad + " año/s de edad " + " empezo a dormir ");
    }
    public void ronronear(){
        System.out.println(this.nombre + " de raza " + this.raza + " de color " + this.color + " de " + this.edad + " año/s de edad " + " empezo a ronronear ");
    }
}
