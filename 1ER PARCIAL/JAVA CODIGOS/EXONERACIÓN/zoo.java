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

class zoo {
    public String nombre;
    public int edad;
    private int numeroRegistro;

    public zoo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        Scanner scanner = new Scanner(System.in);
        
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Ingrese el número de registro: ");
                this.numeroRegistro = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Error!!! Ingresa un número de registro válido.");
                scanner.nextLine(); 
            }
        }
    }

    public void comer() {
        System.out.println("Zoo comiendo");
    }

    public void dormir() {
        System.out.println("Zoo durmiendo");
    }
}

class Leon extends zoo {
    public int numeroVacunas;

    public Leon(String nombre, int edad, int numeroVacunas) {
        super(nombre, edad);
        this.numeroVacunas = numeroVacunas;
    }

    public void rugir() {
        System.out.println("León rugiendo");
    }

    public void cazar() {
        System.out.println("León cazando");
    }
}

class Pinguino extends zoo {
    public Pinguino(String nombre, int edad) {
        super(nombre, edad);
    }

    public void nadar() {
        System.out.println("Pingüino nadando");
    }

    public void pescar() {
        System.out.println("Pingüino pescando");
    }
}
