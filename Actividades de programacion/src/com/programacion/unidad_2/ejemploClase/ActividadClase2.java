package com.programacion.unidad_2.ejemploClase;

import java.util.Scanner;

public class ActividadClase2 {

    public static void main(String[] args) {

        //ACTIVIDAD 2
        /*
         Hacer un programa que pida un número (positivo) y muestre los
         * valores pares desde 0 hasta ese número.
         * Si el usuario no introduce un número correcto, el programa debe seguir pidiéndole
         * que introduzca un número correcto.
         *
         * EJEMPLO
         * -> Programa pide un numero
         * -> Usuario introduce -> -5
         * -> Programa muestra -> Error, pruebe de nuevo
         * -> Usuario introduce -> -10
         * -> Programa muestra -> Error, pruebe de nuevo
         * -> Usuario introduce -> 4
         * -> Programa muestra -> 0, 2, 4
         * -> Fin
         *
         */

        Scanner scan = new Scanner(System.in);
        int num;


        do {
            System.out.println("Introduce un número positivo (0 incuido): ");
            num = scan.nextInt();
        } while (num < 0);

        for (int num1 = 0; num1 <= num; num1 = num1 + 2){
            System.out.println("Números parers: "+num1);
        }

    }

}
