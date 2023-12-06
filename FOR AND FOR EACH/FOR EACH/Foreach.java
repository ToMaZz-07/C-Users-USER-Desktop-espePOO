/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.foreach;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Alice");
        nombres.add("Bob");
        nombres.add("Charlie");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
