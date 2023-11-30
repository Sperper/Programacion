package com.programacion.unidad_1.actividad_2;

import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {

        /*
        7. Escribe un programa que lea tres números distintos y nos diga
        cuál es el mayor.
         */

        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Introduzca el primer número: ");
        num1 = scan.nextInt();
        System.out.println("Introduzca el segundo número: ");
        num2 = scan.nextInt();
        System.out.println("Introduzca el tercer número: ");
        num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("El número más grande es: "+num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número más grande es: "+num2);
        } else {
            System.out.println("El número más grande es: "+num3);
        }

    }

}
