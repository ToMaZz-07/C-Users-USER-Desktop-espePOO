/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gatos;

/**
 *
 * @author USER
 */
public class Gatos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        cats c1 = new cats ("Pelusa","Siamés","Negro",2);
        cats c2 = new cats ("Esmeralda","Persa","Gris",1);
        c1.maullar();
        c1.bostesar();
        c2.dormir();
        c2.ronronear();
        
    }
}
