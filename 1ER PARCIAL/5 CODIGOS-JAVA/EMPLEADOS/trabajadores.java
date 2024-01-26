/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleados;

/**
 *
 * @author USER
 */
public class trabajadores {
    private String nombre;
    private double salario;

    public trabajadores (String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
        System.out.println("$"+ salario);
    }

    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + "\nSalario: $" + salario);
    }
}
