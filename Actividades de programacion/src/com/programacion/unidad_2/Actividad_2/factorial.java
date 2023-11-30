package com.programacion.unidad_2.Actividad_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        int factorial = 1;
        System.out.println("Introduzca el número: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            factorial = i * factorial;
            System.out.println(factorial);
        }


    }

}
