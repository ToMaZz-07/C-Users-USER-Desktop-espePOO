/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peroani;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

class persona {
    public String nombre;
    public int edad;
    private String cedula;

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Ingrese la cedula: ");
                this.cedula = scanner.nextLine();
                
                validInput = true;
            } catch (Exception e) {
                System.out.println("Error!!! Ingresa una cedula válida.");
                scanner.nextLine(); 
            }
        }
    }

    public void comer() {
        System.out.println("Persona comiendo");
    }

    public void dormir() {
        System.out.println("Persona durmiendo");
    }
}

class Visitante extends persona {
    public int numeroCarnet;

    public Visitante(String nombre, int edad, int numeroCarnet) {
        super(nombre, edad);
        this.numeroCarnet = numeroCarnet;
    }

    public void comprar() {
        System.out.println("Visitante comprando");
    }
}

class Cuidador extends persona {
    public int numeroId;

    public Cuidador(String nombre, int edad, int numeroId) {
        super(nombre, edad);
        this.numeroId = numeroId;
    }

    public void alimentarAnimales() {
        System.out.println("Cuidador alimentando animales");
    }
}
