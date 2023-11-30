package com.programacion.Unidad_3.ActividadClase;

import javax.naming.PartialResultException;

public class TableroAjedrez {

    /**
     * 1º Cuántas filasXcolumnas tiene un tablero de ajedrez
     * 2º Declarar un array bidimensional de 8X8
     * 3º Llenar el tablero con las posiciones de cada ficha
     * 4º Recoger el tablero Y que salga bien
     */

    public static void main(String[] args) {

        char[][] posicion = new char[8][8];

        posicion[0][0] = 'T';
        posicion[0][1] = 'C';
        posicion[0][2] = 'A';
        posicion[0][3] = 'Q';
        posicion[0][4] = 'K';
        posicion[0][5] = 'A';
        posicion[0][6] = 'C';
        posicion[0][7] = 'T';
        posicion[1][0] = 'P';
        posicion[1][1] = 'P';
        posicion[1][2] = 'P';
        posicion[1][3] = 'P';
        posicion[1][4] = 'P';
        posicion[1][5] = 'P';
        posicion[1][6] = 'P';
        posicion[1][7] = 'P';

        posicion[6][0] = 'P';
        posicion[6][1] = 'P';
        posicion[6][2] = 'P';
        posicion[6][3] = 'P';
        posicion[6][4] = 'P';
        posicion[6][5] = 'P';
        posicion[6][6] = 'P';
        posicion[6][7] = 'P';
        posicion[7][0] = 'T';
        posicion[7][1] = 'C';
        posicion[7][2] = 'A';
        posicion[7][3] = 'Q';
        posicion[7][4] = 'K';
        posicion[7][5] = 'A';
        posicion[7][6] = 'C';
        posicion[7][7] = 'T';

        for (int i = 2; i <= posicion.length - 3; i++){

            for (int j = 0; j <= posicion[i].length - 1; j++){

                System.out.println("");
            }
        }


    }

}
