package com.programacion.Unidad_3.Teoria;

import java.util.Arrays;

public class Teoría {

    public static void main(String[] args) {

        //1º Cómo delcarar un array
        // tipoDeDato [] identificador;
        int[] arr;

        // 2º Inicializar
        // identificador = new tipoDeDato[longitudDelArray];
        arr = new int[5];

        // 3º Asignar valores
        // identificador[indice] =  valore
        arr[0] = 100;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 4;
        arr[4] = 0;

        System.out.println("En la posición 0 está el valor "+arr[0]);

        // ********* //
        // 1º Declarar e inicializar a la vez
        //tipoDeDato[] identificador = { valores separados por coma };
        char[] cArr = {'d', '%', '5', 't', 'x'};

        System.out.println("En la posición 4 está el valor "+cArr[4]);

        //***********//

        // Como acceder a un elemento
        // identificador[index]

        // Para saber la longitud de un array
        // identificador.length

        System.out.println("El tamaño del array cArr es: "+cArr.length+" y el primero elemento del array "+ cArr[0]);

        /**
         * Declarar un array de String de tamaño "el nº de alumnos de esta clase"
         * Inicializar dicho String con los nombres de cada un@.
         */



        int[][] matriz = new int[2][5];
        matriz[1][5] = 2;
        // primer [] -> i -> fila
        // segundo [] -> j -> columna
        int[][] m2 = new int[3][3];


    }


}
