package com.programacion.Unidad_3.PruebaPractica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SamuelEjercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Llamamos al objeto Scanner para que lea por teclado
        String[][] asientos = new String[10][10]; // Inicializamos un array bidimensional de 10x10
        int opcion = 3; // Declaramos una variable int

        for (int i = 0; i <= asientos.length - 1; i++){ // Usamos los "for" para darle el valor "__" a todas las posiciones del array.

            for (int j = 0; j <= asientos[i].length - 1; j++){
                asientos[i][j] = "__";
            }
        }

        do {

            System.out.println("Que desea hacer");
            System.out.println("1. Comprar Entrada");
            System.out.println("0. Salir");

            try {

                opcion = scan.nextInt();

            } catch (InputMismatchException e){
                System.out.println("Opcion no valida");

            }
            try {
                if (opcion == 1) { // Para que haga una accion si el usuario introduce 1

                    int Numfila;
                    int Numcol;
                    System.out.println("Selecciona la fila y la columna");
                    System.out.print("Fila: ");
                    Numfila = scan.nextInt();
                    System.out.println("Columna: ");
                    Numcol = scan.nextInt();

                    if (asientos[Numfila][Numcol] == "__") {
                        asientos[Numfila][Numcol] = "XX";
                        System.out.println("Asiento reservado con exito");
                    } else {
                        System.out.println("Asiento ocupado");
                    }

                } // Fin de "if"

                if (opcion == 0) {
                    System.out.println("Has salido del sistema");
                }
            } catch (InputMismatchException e){
                System.out.println("Ese asiento no existe");
            } catch (IndexOutOfBoundsException e){
                System.out.println("Ese asiento no existe");
            }

        }while (opcion != 0);


    } // Fin de main

} // Fin de clase
