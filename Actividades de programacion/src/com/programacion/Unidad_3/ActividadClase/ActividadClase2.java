package com.programacion.Unidad_3.ActividadClase;

public class ActividadClase2 {

    /**
     * Declarar un array de char tamaño 1000.
     * Llenar TODAS las posiciones con la letra "F".
     */

    public static void main(String[] args) {

        char[] letra = new char[1000];
        System.out.println("El tamaño es " + letra.length);

        for (int i = 0; i <= letra.length - 1; i++) {
            letra[i] = 'F';
        }
    }
}