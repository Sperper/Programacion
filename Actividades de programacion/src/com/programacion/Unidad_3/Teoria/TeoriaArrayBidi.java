package com.programacion.Unidad_3.Teoria;

public class TeoriaArrayBidi {

    public static void main(String[] args) {

        // Filas x Columnas
        // Llenamos la matriz con valores aleatorios
        /*
             [i = 0 {1, 7}
              i = 1
              i = 2
              i = 3
              i = 4
         */
        int [][] matriz = new int[5][2];

        matriz[0][0] = 1;
        matriz[0][1] = 7;
        matriz[1][0] = 2;
        matriz[1][1] = 3;
        matriz[2][0] = 8;
        matriz[2][1] = 10;
        matriz[3][0] = 77;
        matriz[3][1] = 5;
        matriz[4][0] = 2;
        matriz[4][1] = 1;

        // Vamos a recorrer la matriz
        // Primero, recorremos las filas (con i)
        for (int i=0; i <= matriz.length-1; i++){

            //Ahora dentro de cada fila, recorremos las columnas
            for (int j=0; j <= matriz[i].length - 1; j++){

                // Mostramos el elemento de eesa posicion
                // De la posicion [i][j]
                System.out.println(matriz[i][j]+" ");

            }

        }

    }

}
