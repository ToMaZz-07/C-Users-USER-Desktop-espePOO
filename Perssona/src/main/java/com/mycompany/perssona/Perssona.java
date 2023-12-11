/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perssona;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Perssona {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de personas a registrar: ");
        int numPersonas = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 1; i <= numPersonas; i++) {
            System.out.println("Ingrese los datos de la persona " + i + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Dirección (Ciudad): ");
            String direccion = scanner.nextLine();
            System.out.print("Telefono celular: ");
            int telefono = scanner.nextInt();
            scanner.nextLine();

            Usuario user1 = new Usuario(nombre, edad, direccion);
            user1.almacenar();
        }
    }
}
