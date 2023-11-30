package com.programacion.unidad_2.ejemploClase;

import java.util.Scanner;

public class EjemploBucles2 {

    public static void main(String[] args) {

        /*
        Hacer un menú para seleccionar una opción.

        1. Programación
        2. Entornos
        3. Base de datos
        4. Lenguajes de marcas

        0. Salir
         */

        int opcion;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Hola, en que asignatura quiere matricularte?");
            System.out.println("1. Programación");
            System.out.println("2. Entornos");
            System.out.println("3. Base de datos");
            System.out.println("4. Lenguajes de marcas");
            System.out.println("0. Salir");
            opcion = scan.nextInt();

        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 0);

        if (opcion == 1) {
            System.out.println("Te has matriculado en Programación");
        } else if (opcion == 2) {
            System.out.println("Te has matriculado en Entornos");
        } else if (opcion == 3) {
            System.out.println("Te has matriculado en Base de datos");
        } else if (opcion == 4) {
            System.out.println("Te has matriculado en Lenguaje de marcas");
        } else if (opcion == 0) {
            System.out.println("Has salido del sistema");
        }


        /*
        Hacer
        1. Que muestre la asignatura en la que se ha matriculado
        2. Añadir una opción "0. Salir"
         */

    }
}



