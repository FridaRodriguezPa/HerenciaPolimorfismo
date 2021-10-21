package com.generation;

import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;

public class Main {

    public static void main(String[] args) {
	// herencia
        Ave ave = new Ave("petirojo");
        System.out.println(ave.getNombre());
        ave.comunicacion();
        ave.hacerNido();
        ave.comer();

        System.out.println("-------------------");

        Perro lomito = new Perro("pulgas");
        lomito.jugar();
        lomito.comer();



//        Animal animal = new Animal();
//        animal.comer();
        //animal.hacerNido(); La herencia es de manera vertical

    }
}
