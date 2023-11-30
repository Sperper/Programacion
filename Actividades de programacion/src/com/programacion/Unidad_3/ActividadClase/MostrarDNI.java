package com.programacion.Unidad_3.ActividadClase;

public class MostrarDNI {

    public static void main(String[] args) {

        /**
         * Dado eñ dni 12345678A
         * Mostrar solo la parte numérica
         */

        String dni = "12345678A";
        String parteNumérica = "";
        for (int i = 0; i <= dni.length() - 2; i++){
            parteNumérica = parteNumérica + dni.charAt(i);
        }
        System.out.println(parteNumérica);

    }

}
