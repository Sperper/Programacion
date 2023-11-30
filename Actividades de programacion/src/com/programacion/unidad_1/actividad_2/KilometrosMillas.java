package com.programacion.unidad_1.actividad_2;

import java.util.Scanner;

public class KilometrosMillas {

    public static void main(String[] args) {

        /*
        NOMBRE: Samuel
        4. Escribe un programa que lea un valor en kms, y que muestre el
        resultado en millas. (Una milla son 1,6 kms)
        a. Identifica con comentarios las variables, el método main,
        la clase y las estructuras de control usadas.
         */

        Scanner scan = new Scanner(System.in);
        double valorKilometro;
        double conversionMilla = 0.6;
        double resultadoFinal;
        System.out.println("Introduzca el valor: ");
        valorKilometro = scan.nextInt();

        resultadoFinal = valorKilometro * conversionMilla;

        System.out.println("El resultado en millas es: "+resultadoFinal);




    }

}
