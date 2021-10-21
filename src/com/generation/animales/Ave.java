package com.generation.animales;
//Herencia
public class Ave extends Animal {

private  int alas;
private int patas;
private boolean vuela;


public Ave(String nombre){
    super(nombre); //Llama al constructor padre
    System.out.println("Cosntructor hijo");
}

public void hacerNido(){
    System.out.println("Estoy haciendo mi nido");
}
public void  ponerHuevo(){
    System.out.println("Estoy poniendo un huevo");
}

@Override
public void comer(){
    System.out.println("Comiendo alpiste");
}

    @Override
    public void respirar() {

    }
}
