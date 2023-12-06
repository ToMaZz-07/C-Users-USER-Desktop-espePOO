/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservasvuelo;

/**
 *
 * @author USER
 */
import java.util.ArrayList;

public class Vuelo {
    private String numeroVuelo;
    private String origen;
    private String destino;
    private int capacidad;
    private int asientosDisponibles;

    public Vuelo(String numeroVuelo, String origen, String destino, int capacidad) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.capacidad = capacidad;
        this.asientosDisponibles = capacidad;
    }

    public boolean reservarAsientos(int cantidad) {
        if (cantidad > 0 & cantidad <= asientosDisponibles) {
            asientosDisponibles -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Vuelo " + numeroVuelo + " de " + origen + " a " + destino);
        System.out.println("Asientos Disponibles: " + asientosDisponibles + "/" + capacidad);
    }
}


