package com.programacion.unidad_2.ejemploClase;

public class EjemploCadena {

    public static void main(String[] args) {


        // Declarar 2 variables de String
        String cadena1 = "Hola";
        String cadena2 = "Adios";

        if (cadena1.equals(cadena2)) {// Si son igugales, mostramos un mensaje que diga "Son iguales"
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }

        if (cadena1.equals("Hola")){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }

    }
}
