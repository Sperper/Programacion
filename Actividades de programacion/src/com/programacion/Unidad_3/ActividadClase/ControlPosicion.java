package com.programacion.Unidad_3.ActividadClase;

import java.util.Scanner;

public class ControlPosicion {

    public static void main(String[] args) {

        /**
         * Construye un programa que le pida al usuario una cadena de texto.
         * Acto seguido, solicita la posicion de un caracter de la cadena de texto
         * y lo imprime por pantalla. Controla las posibles excepciones producidas al
         * acceder a posiciones invalidas de la cadena.
         */

        Scanner scan = new Scanner(System.in);
        String cad;
        System.out.print("Dime una palabra: ");
        cad = scan.next();
        int i = 0;
        int salir = 0;
        do {
            try {
                System.out.print("Dime en que posicion esta letra que quieres que te diga de la palabra: ");
                i = scan.nextInt();
                System.out.println("La letra en esa posicion es: " + cad.charAt(i));
                System.out.println("¿Quieres que te diga otra letra? ");
                System.out.println("1. Si");
                System.out.println("2. No");
                salir = scan.nextInt();
                if (salir == 2) {
                    System.out.println("Has salido");
                }

            } catch (IndexOutOfBoundsException e) {
                e.getStackTrace();
                System.out.println("Esa no existe, payaso");
            }

        } while (i > cad.length() || salir == 1);
    }
}
