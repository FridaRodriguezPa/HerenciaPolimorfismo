package com.generation;

import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;
import com.generation.uber.UberBlack;
import com.generation.uber.UberDriver;

public class Main {

    public static void main(String[] args) {

        UberDriver conductor = new UberDriver();
        System.out.println("Uber driver");
        conductor.calcularPrecio(1);

        UberBlack conductor2 = new UberBlack();
        System.out.println("Uber black driver");
        conductor2.calcularPrecio(1);


        // herencia
//        Ave ave = new Ave("petirojo");
//        System.out.println(ave.getNombre());
//        ave.comunicacion();
//        ave.hacerNido();
//        ave.comer();
//
//        System.out.println("-------------------");
//
//        Perro lomito = new Perro("pulgas");
//        lomito.jugar();
//        lomito.comer();



//        Animal animal = new Animal();
//        animal.comer();
        //animal.hacerNido(); La herencia es de manera vertical

    }
}
