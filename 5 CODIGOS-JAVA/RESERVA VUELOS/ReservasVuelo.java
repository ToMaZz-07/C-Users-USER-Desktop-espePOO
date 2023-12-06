/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reservasvuelo;

/**
 *
 * @author USER
 */
public class ReservasVuelo {

    public static void main(String[] args) {
        Aerolinea aerolinea = new Aerolinea();

        Vuelo vuelo1 = new Vuelo("V123", "Bogota", "Lima", 100);
        Vuelo vuelo2 = new Vuelo("V456", "Frankfut", "Buenos Aires", 150);

        aerolinea.agregarVuelo(vuelo1);
        aerolinea.agregarVuelo(vuelo2);

        System.out.println("Reservas de asientos:");
        System.out.println("Reserva en vuelo1: " + vuelo1.reservarAsientos(30));
        System.out.println("Reserva en vuelo2: " + vuelo2.reservarAsientos(80));
        aerolinea.mostrarVuelos();
    }
}
