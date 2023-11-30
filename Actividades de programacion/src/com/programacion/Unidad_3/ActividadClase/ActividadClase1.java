package com.programacion.Unidad_3.ActividadClase;

public class ActividadClase1 {

    public static void main(String[] args) {

        /**
         * Declarar un array de String de tamaño "el nº de alumnos de esta clase"
         * Inicializar dicho String con los nombres de cada un@.
         */

        String[] estudiantes = new String[19];
        estudiantes[0] = "Angel";
        estudiantes[1] = "Raquel";
        estudiantes[2] = "Sebastian";
        estudiantes[3] = "Alvaro";
        estudiantes[4] = "David";
        estudiantes[5] = "Juan Manuel";
        estudiantes[6] = "Pepe";
        estudiantes[7] = "Pablo";
        estudiantes[8] = "Pablo";
        estudiantes[9] = "Roberto";
        estudiantes[10] = "Marcos";
        estudiantes[11] = "Juan Carlos";
        estudiantes[12] = "Ignacio";
        estudiantes[13] = "David";
        estudiantes[14] = "Victor";
        estudiantes[15] = "Samuel";
        estudiantes[16] = "Roberto";
        estudiantes[17] = "Oscar";
        estudiantes[18] = "Rafael";

        // for (int i = 0; i <= length - 1, i ++)


        // Declarar un array de enteros de tamaño 15

        int[] intArr = {4,7,2,15,12,10};

        System.out.println("El tamaño es "+ intArr.length);

        // Para recorrer el array, conocemos su longitud con intArr.length
        // Entonces, iríamos desde 0... hasta length - 1 (que es el último índice del array)
        // {4, ,7 , 2, 15, 12, 10}
        for(int i = 0; i <= intArr.length - 1; i++) {

            System.out.println("El elemento "+intArr[i]);

        }


    }

}
