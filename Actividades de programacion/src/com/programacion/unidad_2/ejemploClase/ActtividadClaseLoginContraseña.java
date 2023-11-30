package com.programacion.unidad_2.ejemploClase;

import java.util.Scanner;

public class ActtividadClaseLoginContraseña {

    public static void main(String[] args) {

        /**
         * Hacer un programa que lea una contraseña dada por el usuario
         * y que la compare con la contraseña en sí.
         *
         * La contraseña es: "1234567890"
         *
         * Si esa contraseña coincide, se acepta acceso
         * Si no coincide, poned un mensaje "Acceso denegado"
         */

        // 1º Deeclarar variables contrasenia y cadena/intento/try

        // 2º Leer por teclado lo que introduce el user

        // 3º Compararlo con la contraseña del sistema

        // 4º Mostrar el mensaje

        Scanner scan = new Scanner(System.in);
        String contrasenia = "pepe1234567890";

        String intento;
        System.out.println("Introduzca la contraseña correcta: ");
        intento = scan.next();

        if (contrasenia.equals(intento)){
            System.out.println("Acceso aceptado");
        } else {
            System.err.println("Borrando todos sus archivos");
        }

    }
}
