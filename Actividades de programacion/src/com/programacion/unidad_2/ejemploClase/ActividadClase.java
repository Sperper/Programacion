package com.programacion.unidad_2.ejemploClase;

import java.util.Scanner;

public class ActividadClase {

    public static void main(String[] args) {

        /**
         * DOS PROGRAMAS. Debéis hacer el uso del bucle correcto.
         * 1. Teneis que hacer un programa que muestre números por pantalla hasta que dee un número negrativo.
         * -> Introduce 5
         * Muestro "Número intrdocido: 5"
         * -> Introduce -1
         * Muestro "Adiosito"
         *
         * 2. Hacer un programa que pida un número (positivo) y muestre los valores pares desde 0 hasta ese número.
         * Si el usuario no introduce un número correcto, el programa debe seguir pidiéndole que introduzca un número correcto.
         *
         * EJEMPLO
         * -> Pide un número
         * -> Usuario introduce -> -5
         * -> Programa muestra -> Error, pruebe de nuevo
         * -> Introduce -> - 10
         * -> Programa muestra -> Error, pruebe de nuevo
         * -> Usuario introduce ->
         */

        // PROGRAMA 1
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Introduzca un número: ");
        num = scan.nextInt();

        while (num >= 0){
            System.out.println("Número introducido: "+num);
            System.out.println("Introduzca otro número: ");
            num = scan.nextInt();
        }

        System.out.println("Adiosito");





    }

}
