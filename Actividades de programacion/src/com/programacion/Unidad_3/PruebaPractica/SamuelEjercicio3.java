package com.programacion.Unidad_3.PruebaPractica;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SamuelEjercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Para que lea por teclado
        int N; // Variable para la cantidad de valores que almacena el array
        int M; // Variable para el valor que almacena en todas las posiciones

        System.out.print("Dime un numero: ");
        N = scan.nextInt(); // Numero que introducimos por teclado
        System.out.print("Dime otro numero: ");
        M = scan.nextInt();
        int[] arr = new int[N];
        System.out.print("(");
        for (int i = 0; i <= arr.length -2; i ++){ // Para recorrer el array

            arr[i] = M; // Para que tenga el valor M en todas las posiciones
            System.out.print(arr[i]+ ", "); // Para que lo muestre por patalla

        }
        arr[arr.length-1] = M;
        System.out.println(arr[arr.length-1] + ")");


    }

}
