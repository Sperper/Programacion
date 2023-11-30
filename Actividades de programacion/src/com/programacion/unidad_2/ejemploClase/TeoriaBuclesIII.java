package com.programacion.unidad_2.ejemploClase;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TeoriaBuclesIII {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Declaramos una cadena de caracteres que se llame "mensajePresentacion"
        String mensajePresentaacion = "";

        //Pedirle el nombre al usuario
        String nombre = "";
        System.out.println("Introduce un nombre: ");
        nombre = scan.next();

        mensajePresentaacion = "Hola mi nombre es " + nombre + ".";
        System.out.println(mensajePresentaacion);

        //Continuamos con la edad
        int edad;
        System.out.println("Introduce tu edad: ");
        edad = scan.nextInt();

        mensajePresentaacion = mensajePresentaacion + " Y tengo " + edad + " anios, ";
        System.out.println(mensajePresentaacion);

        // Continuamos con la localización
        String localizacion;
        System.out.println("¿De dónde eres?");
        localizacion = scan.next();

        mensajePresentaacion = mensajePresentaacion + "y soy de " + localizacion + ".";
        System.out.println(mensajePresentaacion);

    }
}

