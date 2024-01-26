/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cafeteria;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Cafeteria {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********LA CAFETERÍA**********");
        System.out.println("CAFÉS:");
        System.out.println("Seleccione un café (1-5):");
        Cafe cafe1 = new Cafe();
        cafe1.setTipo("1---Latte");
        cafe1.setPrecio(3.99);

        Cafe cafe2 = new Cafe();
        cafe2.setTipo("2---Espresso");
        cafe2.setPrecio(2.50);
        
        Cafe cafe3 = new Cafe();
        cafe3.setTipo("3---Capuchino");
        cafe3.setPrecio(3.99);

        Cafe cafe4 = new Cafe();
        cafe4.setTipo("4---Americano");
        cafe4.setPrecio(3.50);
        
        Cafe cafe5 = new Cafe();
        cafe5.setTipo("5---Café negro");
        cafe5.setPrecio(1.50);
        
        cafe1.mostrarInformacion();
        cafe2.mostrarInformacion();
        cafe3.mostrarInformacion();
        cafe4.mostrarInformacion();
        cafe5.mostrarInformacion();
        
        System.out.println("Ingrese el número del café seleccionado o 'no' para cancelar:");
        String seleccion = scanner.next();

        if (seleccion.equalsIgnoreCase("no")) {
            System.out.println("Pedido cancelado. Gracias por visitarnos.");
        } else {
            int numeroSeleccion = Integer.parseInt(seleccion);

            // Mostrar la información del café seleccionado
            switch (numeroSeleccion) {
                case 1:
                    cafe1.mostrarInformacion();
                    break;
                case 2:
                    cafe2.mostrarInformacion();
                    break;
                case 3:
                    cafe3.mostrarInformacion();
                    break;
                case 4:
                    cafe4.mostrarInformacion();
                    break;
                case 5:
                    cafe5.mostrarInformacion();
                    break;
                default:
                    System.out.println("Selección no válida");
            }

            System.out.println("Retire su café. ¡Gracias por preferirnos!");
        }
    }
}

