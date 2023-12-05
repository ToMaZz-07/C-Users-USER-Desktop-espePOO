/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstracta;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Abstracta {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Pasajero pasajero = new Pasajero(12345,"Juan",41);
        Chofer chofer = new Chofer (12,34,"Pablo",42);
        
        System.out.println("1.- Pasajero");
        System.out.println("2.- Chofer ");
        System.out.println("Opcion: ");
        
        switch(scanner.nextInt()){
            case 1: 
                System.out.println("Ha elegido Pasajero:");
                System.out.println("Ingrese el nombre del pasajero: ");
                String nombrePasajero = scanner.next();
                System.out.println("Ingrese la edad del pasajero: ");
                int edadPasajero = scanner.nextInt();
                System.out.println("Ingrese el número de cedula: ");
                int cedulaPasajero = scanner.nextInt();
                System.out.println("Ingrese el numeroID: ");
                int numeroID = scanner.nextInt();
                pasajero.pedir();
                pasajero.cancelar();
                break;
            case 2:
               System.out.println("Ha elegido Chofer:");
               System.out.println("Ingrese el nombre del chofer: ");
                String nombreChofer = scanner.next();
                System.out.println("Ingrese la edad del chofer: ");
                int edadChofer = scanner.nextInt();
                System.out.println("Ingrese el número de cedula: ");
                int cedulaChofer = scanner.nextInt();
                System.out.println("Ingrese el número de Placa: ");
                int numeroPlaca = scanner.nextInt();
                System.out.println("Ingrese el código de Taxi: ");
                int codigoTaxi = scanner.nextInt();
                chofer.aceptar();
                chofer.cancelar();
                break;
        }
    }
}
