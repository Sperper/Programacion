package com.programacion.unidad_2.Actividad_2;

import java.util.Scanner;

public class Sumatoria {

    public static void main(String[] args) {

        /*
        1. Realiza un programa que calcule la sumatoria de los números del 0 al N
        (siendo N un número introducido por teclado).
         */

        Scanner scan = new Scanner(System.in);
        int N;
        int sumatoria = 0;
        System.out.println("Introduzca un número entero positivo: ");
        N = scan.nextInt();

        // Tenemos que usar el bucle correcto -> FOR porque sabemos el número de vueltas
        // que vamos a dar.

        for (int i = 0; i<=N; i++){
            sumatoria = sumatoria + i;
            // sumatoria = 0 + 0
            // sumatoria = 0 + 1
            // sumatoria = 1 + 2
            // sumatoria = 3 + 3
        }

        System.out.println("El resultado de la sumatoria es: "+sumatoria);

    }

}
