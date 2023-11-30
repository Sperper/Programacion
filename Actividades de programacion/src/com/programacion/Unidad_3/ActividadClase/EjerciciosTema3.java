package com.programacion.Unidad_3.ActividadClase;

import java.util.Scanner;


public class EjerciciosTema3 {

    public static void main(String[] args) {

        /**
         * Act 1. Pedir 10 valores reales, almacenarlos en un array,
         * y mostrar la suma de todos los valores
         */

        double numReal = 0.0;
        double sumatoria = 0;
        Scanner scan = new Scanner(System.in);

        double[] arrDeDoubles = new double[10];

        // Primero un for para rellenar todas las posiciones del array
        for (int i=0; i<= arrDeDoubles.length - 1; i++) {

            System.out.print("Introduzca un valor para el array: ");
            // Introduzco en cada posicion del array lo que me indique el user
            arrDeDoubles[i] = scan.nextDouble();
        }

        // Luego un for para mostrar por pantalla el contenido del array
        System.out.print("[");
        for (int i=0; i<= arrDeDoubles.length - 1; i++) {

            System.out.print(arrDeDoubles[i]+", ");

        }
        System.out.println("]");

        for (int i = 0; i <= arrDeDoubles.length-1; i++){

            sumatoria = sumatoria + arrDeDoubles[i];

        }
        System.out.println("El resultado de la sumatoria es: "+sumatoria);

    }

}
