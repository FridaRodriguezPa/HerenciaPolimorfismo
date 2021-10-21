package com.generation.animales;

public abstract class Animal {
//la clase abstract sirve para heredar, no se pueden crear objetos
    protected String nombre;
    protected int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Constructor
    public  Animal(String nombre){
    this.nombre = nombre;
        System.out.println("Constructor Padre");
    }
    public  Animal(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Constructor Padre");
    }

    public void comunicacion(){
        System.out.println("Hola");
    }
    public  void comer(){
        System.out.println("Estoy comiendo");
    }
    public abstract void respirar();
}
