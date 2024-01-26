/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author USER
 */
public class transporte {
    String modelo;
    String color;
    int año;
    int kilometraje;
    int velocidad = 0;
    
    public transporte(String modelo,String color, int año, int kilometraje){
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.kilometraje = kilometraje;
        
    }
    
    public void desplazarse(int velocidadNew){
        this.velocidad = velocidadNew;
        System.out.print(this.modelo + " color " + this.color + " del año " + this.año + " se mueve a "+ this.velocidad + " km/h");
        
        if(this.velocidad > 50){
            System.out.println("\nUsted tiene una multa por exceso de velocidad.Usted rebaso los 50 km/h");
        }else{
            System.out.println("\nVelocidad permitida");
        }
    }
    
    public void rechinar(){
        System.out.println(this.modelo +" color " + this.color + " del año " + this.año +" empezo a rechinar");
    }
    
    public void recalentarse(){
        System.out.println(this.modelo +" color " + this.color + " del año " + this.año + " con kilometraje "+ this.kilometraje + " km/h " + "empezo a recalentarse");
    }
}
