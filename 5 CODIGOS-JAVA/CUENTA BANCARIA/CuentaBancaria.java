/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentabancaria;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class CuentaBancaria {
public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del titular de la cuenta: ");
        String titular = scanner.nextLine();
        
        System.out.println("Ingrese la cedula del titular de la cuenta: ");
        int cedula = scanner.nextInt();
        
        System.out.println("Ingrese el saldo inicial de la cuenta: ");
        double saldoInicial = scanner.nextDouble();

        cuenta cuenta1 = new cuenta (titular, saldoInicial);
        cuenta1.mostrarInformacion();
        
        System.out.println("Ingrese la cantidad a depositar: ");
        double cantidadDeposito = scanner.nextDouble();
        cuenta1.depositar(cantidadDeposito);

        System.out.println("Ingrese la cantidad a retirar: ");
        double cantidadRetiro = scanner.nextDouble();
        cuenta1.retirar(cantidadRetiro);
    }
}
