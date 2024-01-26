package com.mycompany.project1;

/**
 *
 * @author USER
 */
public class personas{
    String nombre;
    //atributo
    //atributo

    // constructor
    public personas(String nombre, int edad){
        this.nombre=nombre;
    }
    //metodo
    public void saltar(){
        System.out.println(this.nombre +" Empezo a saltar");
    }
    public void comer(){
        System.out.println(this.nombre +" Empezo a comer");
    }
    public void escribir(){
        System.out.println(this.nombre +"Empezo a escribir");
    }
    public static void main(String[] args) {
        personas p1 =new personas("Anthony",19);//instancia=dar vida
        p1.comer();
        p1.saltar();
    }

    }