/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion;

/**
 *
 * @author USER
 */
public class Animal {
    String nombre;
    String apellido;
    private int edad;
    
    public Animal (String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }

    public int setEdad() {
        return edad;
    }
    
    public void mostrarInformacion (){
            System.out.println("*****************INFORMACION DE SU ANIMAL*******************");
            System.out.println("NOMBRE: "+this.nombre);
            System.out.println("APELLIDO: "+this.apellido);
            System.out.println("EDAD: "+ this.edad);
        }
   }
