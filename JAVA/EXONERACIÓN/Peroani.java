/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.peroani;

/**
 *
 * @author DELL
 */


import java.util.Scanner;

public class Peroani {
    public static void main(String[] args) {
    
        Visitante visitante = visitantecons();
        visitante.comer();
        visitante.dormir();
        visitante.comprar();

        Cuidador cuidador = cuidadorcon();
        cuidador.comer();
        cuidador.dormir();
        cuidador.alimentarAnimales();

        Leon leon = leoncons();
        leon.comer();
        leon.dormir();
        leon.rugir();
        leon.cazar();

        Pinguino pinguino = pinguinocons();
        pinguino.comer();
        pinguino.dormir();
        pinguino.nadar();
        pinguino.pescar();
    }

    private static Visitante visitantecons() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del visitante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del visitante: ");
        int edad = getIntInput(scanner, "Ingrese una edad válida: ");
        System.out.print("Ingrese el número de carnet del visitante: ");
        int numeroCarnet = getIntInput(scanner, "Ingrese un número de carnet válido: ");
        return new Visitante(nombre, edad, numeroCarnet);
    }

    private static Cuidador cuidadorcon() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cuidador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del cuidador: ");
        int edad = getIntInput(scanner, "Ingrese una edad válida: ");
        System.out.print("Ingrese el número de ID del cuidador: ");
        int numeroId = getIntInput(scanner, "Ingrese un número de ID válido: ");
        return new Cuidador(nombre, edad, numeroId);
    }

    private static Leon leoncons() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del león: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del león: ");
        int edad = getIntInput(scanner, "Ingrese una edad válida: ");
        System.out.print("Ingrese el número de vacunas del león: ");
        int numeroVacunas = getIntInput(scanner, "Ingrese un número de vacunas válido: ");
        return new Leon(nombre, edad, numeroVacunas);
    }

    private static Pinguino pinguinocons() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del pingüino: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del pingüino: ");
        int edad = getIntInput(scanner, "Ingrese una edad válida: ");
        return new Pinguino(nombre, edad);
    }

    private static int getIntInput(Scanner scanner, String errorMessage) {
        int input = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                input = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Error: " + errorMessage);
                scanner.nextLine(); 
            }
        }
        return input;
    }
}
