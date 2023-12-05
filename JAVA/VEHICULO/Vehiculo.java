/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiculo;

/**
 *
 * @author USER
 */
public class Vehiculo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        transporte trans = new transporte("Chevrolet Aveo","vino",2012,123456);
        trans.rechinar();
        trans.recalentarse();
        trans.desplazarse(120);
    }
}
