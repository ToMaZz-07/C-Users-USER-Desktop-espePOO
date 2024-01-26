/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evaluacion;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Evaluacion {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Perro dog1 = new Perro("Rocky", "Vargas", "Bull-Dog");
        Gato cat1 = new Gato("Princesa", "Maldonado","Lanudo");
        
        int opcion = -1;
        boolean opcionValida = false;
        do {
            try {
        System.out.println("***********************MENU PRINCIPAL***************************");
        System.out.println("Escoja el clase de animal a la cual pertenece su mascota:");
        System.out.println("1.- Perro");
        System.out.println("2.- Gato");
        System.out.println("Opcion: ");
        
        opcion = Integer.parseInt(scanner.nextLine());

                if (opcion == 1 || opcion == 2) {
                    opcionValida = true;
                } else {
                    System.out.println("Error\nIngrese una opción válida (1 o 2).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error\nIngrese un número entero.");
            }
        } while (!opcionValida);
        
        switch (opcion) {
            case 1:
                System.out.println("Ha elegido Perro:");
                System.out.println("NOMBRE: ");
                String nombrePerro = scanner.nextLine();
                System.out.println("APELLIDO: ");
                String apellidoPerro = scanner.nextLine();
                while (true) {
                    try {
                        System.out.println("EDAD: ");
                        int edadPerro = Integer.parseInt(scanner.nextLine());
                        if (edadPerro > 0) {
                            break;
                        } else {
                            System.out.println("Error\nIngrese una edad válida (mayor a 0).");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error\nIngrese un número entero para la edad.");
                    }
                }
                System.out.println("RAZA: ");
                String raza = scanner.nextLine();
                dog1.mostrarInformacion();
                dog1.hacerSonido();
                break;
            case 2:
                System.out.println("Ha elegido Gato:");
                System.out.println("NOMBRE: ");
                String nombreGato = scanner.nextLine();
                System.out.println("APELLIDO: ");
                String apellidoGato = scanner.nextLine();
                while (true) {
                    try {
                        System.out.println("EDAD: ");
                        int edadGato = Integer.parseInt(scanner.nextLine());
                        if (edadGato > 0) {
                            break;
                        } else {
                            System.out.println("Error\nIngrese una edad válida (mayor a 0).");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error\nIngrese un número entero para la edad.");
                    }
                }
                System.out.println("PELAJE: ");
                String pelaje = scanner.nextLine();
                cat1.mostrarInformacion();
                cat1.hacerSonido();
                break;
        }
    }
}
