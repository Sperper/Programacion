package com.programacion.Unidad_3.ActividadRepaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tablero {

    public static void main(String[] args) {

        String[][] tablero = new String[10][10];
        for (int i = 0; i <= tablero.length -1; i++){
            for (int j = 0; j <= tablero[i].length - 1; j++){
                tablero[i][j] = "A";
            }
        }

        Scanner scan = new Scanner(System.in);
        int posX = 0;
        int posY = 0;
        int nLanchasColocadas = 0;

        do {
            try {
                System.out.println("Dime fila");
                posX = scan.nextInt();
                System.out.println("Dime col");
                posY = scan.nextInt();
                if (tablero[posX][posY].equals("A")) {

                    tablero[posX][posY] = "L";
                    System.out.println("Lancha colocada");
                    nLanchasColocadas++;

                } else {
                    System.out.println("Ya hay una lancha en esa poscion");
                    System.out.println("Intentalo de nuevo");
                }
            }catch (IndexOutOfBoundsException e) {
                System.out.println("Dato no válido");
            }catch (InputMismatchException e){
                System.out.println("Dato no válido");
            }


        }while (nLanchasColocadas < 4);

    }

}
