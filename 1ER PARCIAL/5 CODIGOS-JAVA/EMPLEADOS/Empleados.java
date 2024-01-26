/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleados;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Empleados {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Ingrese el nombre del empleado: ");
        String nombreTrabajador = scanner.next();
        
        System.out.println("Ingrese el salario del empleado: ");
        double salarioTrabajador = scanner.nextDouble();
        
        trabajadores trabajador1 = new trabajadores(nombreTrabajador, salarioTrabajador);
        trabajador1.mostrarInformacion();
        
        System.out.println("Salario aumentado en un 14%: ");
        trabajador1.aumentarSalario(15);
    }
}