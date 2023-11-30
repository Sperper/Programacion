package com.programacion.unidad_2.Actividad_2;

import java.util.Scanner;

public class UsuarioNumeroNegativo {

    public static void main(String[] args) {

        /*
        2. Realiza un programa que pida números
        por teclado al usuario de forma indefinida hasta que el usuario9

         introduzca un número negativo.
         */

        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Introduzca un número: ");
        num = scan.nextInt();

        while (num >= 0){
            System.out.println("Has fallado");
            System.out.println("Introduzca otro número: ");
            num = scan.nextInt();
        }

        System.out.println("Has acertado.");
    }

}
