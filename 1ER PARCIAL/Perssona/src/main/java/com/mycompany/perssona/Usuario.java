/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perssona;

/**
 *
 * @author USER
 */
import java.io.PrintWriter;

public class Usuario {
    private static int contador = 0;
    private int id;
    private String nombre;
    private int edad;
    private String direccion;
    private int telefono;

    public Usuario (String nombre, int edad, String direccion) {
        this.id = ++contador;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
}
public void guardar() {
        String nombreArchivo = "usuario_" + id + ".txt";

        try (PrintWriter writer = new PrintWriter(nombreArchivo)) {
            writer.println("ID: " + id);
            writer.println("Nombre: " + nombre);
            writer.println("Edad: " + edad);
            writer.println("Dirección: " + direccion);
            writer.println("Telefono celular: " + telefono);

            System.out.println("Persona guardada en el archivo: " + nombreArchivo);
        } catch (Exception e) {
            System.err.println("Error al guardar la persona en el archivo.");
            e.printStackTrace();
        }
    }
}