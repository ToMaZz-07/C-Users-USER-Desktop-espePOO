/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author USER
 */
public class calculator {
    private int operando1; 
    private int operando2;

    public calculator (){
        
    }
    public calculator ( int operando1,int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }  
    
    public int sumar (){
        int suma = this.operando1 + this.operando2;
        return suma;
    }
    public int restar (){
         int resta =this.operando1 - this.operando2;
         return resta;
     }
    public int multiplicar(){
        int multiplicacion = this.operando1 * this.operando2;
        return multiplicacion;
    }
    public double dividir(){
        if (operando2 != 0) {
            return (double) operando1 / operando2;
        } else {
            System.out.println("SYNTAX ERROR (no existe la division para cero).");
            return Double.NaN;
        }
    }
}    
    
