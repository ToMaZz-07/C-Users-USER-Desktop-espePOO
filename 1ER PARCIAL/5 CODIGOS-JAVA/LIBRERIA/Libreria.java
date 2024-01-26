/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libreria;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Libreria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el título del primer libro: ");
        String tituloLibro1 = scanner.nextLine();
        System.out.println("Ingrese el autor: ");
        String autorLibro1 = scanner.nextLine();

        System.out.println("Ingrese el título del segundo libro: ");
        String tituloLibro2 = scanner.nextLine();
        System.out.println("Ingrese el autor: ");
        String autorLibro2 = scanner.nextLine();
        
        System.out.println("Ingrese el título del tercer libro: ");
        String tituloLibro3 = scanner.nextLine();
        System.out.println("Ingrese el autor: ");
        String autorLibro3 = scanner.nextLine();
        
        Libro lib1 = new Libro(tituloLibro1, autorLibro1);
        Libro lib2 = new Libro(tituloLibro2, autorLibro2);
        Libro lib3 = new Libro(tituloLibro3,autorLibro3);
        
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(lib1);
        biblioteca.agregarLibro(lib2);
        biblioteca.agregarLibro(lib3);
    }
}