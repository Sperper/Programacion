package com.programacion.unidad_2.ejemploClase;

import java.util.Scanner;

public class EjemploBucles {

    public static void main(String[] args) {

        //Estructura del bucle while

        /*
        Mostrar por pantalla los 20 primeros números (de 0 a 20)
         */

        int num = 0; // Declaro una variable de tipo entero con valor 0
        while (num <= 20) { // Mientras num sea menor o igual que 20
            System.out.println(num); // Muestro por pantalla num
            num = num + 1; // Incremento en 1 el valor de num
        } // Fin del while

        /*
        Mostrar por pantalla todos los números  del 0 al -20
         */

        int num2 = 0;
        while (num2 >= -20) {
            System.out.println(num2);
            num2 = num2 - 1;
        }

        /*
        Mostrar por pantalla todos los números PARES positivos del 0 al 100
         */
        int num3 = 0;
        while (num3 <= 100) {
            System.out.println(num3);
            num3 = num3 + 2;
        }
        /*
        Hacer un programa que pida un número por teclado y que muestr
        "Ahahá, no has dicho la palabra correcta"
        mientras el número sea distinto a 0
         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Dime un número: ");
        int num4;
        num4 = scan.nextInt();

        while (num4 != 0) {
            System.out.println("Ahahá no has dicho la palabra mágica");

            System.out.println("Oye, intentalo de nuevo: ");
            num4 = scan.nextInt(); //Parte crítica
        }

    }

}
