/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentabancaria;

/**
 *
 * @author USER
 */
public class cuenta {
    private String titular;
    private int cedula;
    private double saldo;

    public cuenta (String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito de $" + cantidad + " realizado" + "\nNuevo saldo: $" + saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro de $" + cantidad + " realizado" + "\nNuevo saldo: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }   
     public void mostrarInformacion() {
        System.out.println("Cuenta de " + titular + "\nSaldo $" + saldo);
    }
}

