/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author USER
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        do {
            try {
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número entero.");
                scanner.next(); // consume la entrada no válida
                num1 = Integer.MIN_VALUE; // Establecer un valor predeterminado
            }
        } while (num1 == Integer.MIN_VALUE);

        do {
            try {
                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número entero.");
                scanner.next(); // consume la entrada no válida
                num2 = Integer.MIN_VALUE; // Establecer un valor predeterminado
            }
        } while (num2 == Integer.MIN_VALUE);

        calculator calculadora = new calculator(num1, num2);

        char operacion;

        do {
            try {
                System.out.println("Ingrese la operación que desea realizar (+, -, *, /):");
                operacion = scanner.next().charAt(0);
                if (operacion != '+' && operacion != '-' && operacion != '*' && operacion != '/') {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese una operación válida.");
                scanner.next(); // consume la entrada no válida
                operacion = '\0'; // Establecer un valor predeterminado
            }
        } while (operacion == '\0');

        switch (operacion) {
            case '+' -> System.out.println("Suma: " + calculadora.sumar());
            case '-' -> System.out.println("Resta: " + calculadora.restar());
            case '*' -> System.out.println("Multiplicación: " + calculadora.multiplicar());
            case '/' -> System.out.println("División: " + calculadora.dividir());
            default -> System.out.println("SYNTAX ERROR");
        }
    }
}
