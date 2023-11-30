package com.programacion.unidad_2.Actividad_2;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = 1;
        int num2 = 0;
        int N;
        System.out.println("Introduzca el número de términos a mostrar: ");
        N = scan.nextInt();

        for (int i = 0; i <= N; i++){

           num1 = num2 + num1;
           num2 = num1 - num1;

        }

    }

}
