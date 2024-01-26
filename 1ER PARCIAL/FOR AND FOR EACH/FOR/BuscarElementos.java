/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscarelementos;

/**
 *
 * @author USER
 */
public class BuscarElementos {

        public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};
        int elementoBuscado = 15;
        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == elementoBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El elemento " + elementoBuscado + " está en el arreglo.");
        } else {
            System.out.println("El elemento " + elementoBuscado + " no está en el arreglo.");
        }
    }
}