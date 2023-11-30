package com.programacion.unidad_2.Actividad_2;

import java.util.Scanner;

public class UsuarioNumeroNegativoSumatoria {

    public static void main(String[] args) {

          /*
    3. Realiza un programa que pida números por teclado al usuario de forma
    indefinida hasta que el usuario introduzca un número negativo y que
    realice la sumatoria de los números introducidos.
     */

        Scanner scan = new Scanner(System.in);
        int suma = 0;
        int numIntroducido = 0;

        while (numIntroducido >= 0){//Es decir, mientras el número introducido sea positivo repetir

            System.out.print("Oye socio, introduce un número para sumar: ");
            numIntroducido = scan.nextInt();

            if (numIntroducido >= 0) { // NO QUIERO SUMAR EL NÚMERO NEGATIVO.
                suma = suma + numIntroducido;
            }
        }

        System.out.println("La suma es: "+suma);


    }

}
