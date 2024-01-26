/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservasvuelo;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Aerolinea {
    private ArrayList<Vuelo> vuelos;

    public Aerolinea() {
        this.vuelos = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public void mostrarVuelos() {
        System.out.println("Lista de Vuelos:");
        for (Vuelo vuelo : vuelos) {
            vuelo.mostrarInformacion();
        }
    }
}
