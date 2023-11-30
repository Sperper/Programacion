package com.programacion.unidad_1.actividad_2;

import java.util.Scanner;

public class Edad {

    public static void main(String[] args) {

        /*
        6. Escribe un programa que pida la edad por teclado, y que
        muestre “Eres mayor de edad” o “Eres menor de edad” según si
        la persona tiene menos de 18 años o no.
         */

        Scanner scan = new Scanner(System.in);
        int edad;
        System.out.println("Introduzca su edad: ");
        edad = scan.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

    }

}
