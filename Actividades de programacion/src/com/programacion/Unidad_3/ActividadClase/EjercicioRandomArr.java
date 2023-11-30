package com.programacion.Unidad_3.ActividadClase;

import java.util.Scanner;

public class EjercicioRandomArr {

    /**
     * Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y
     * utilizando Math.random(), y luego le pida al usuario  un valor real R. Por último,
     * cuantos valores del array son iguales o superiores a R.
     */

    public static void main(String[] args) {


        double[] arrDoub = new double[100];

        for (int i = 0; i <= arrDoub.length -1; i++){
            arrDoub[i] = Math.random();
        }

        for (int i=0; i<= arrDoub.length-1; i++){
            System.out.println(arrDoub[i]);
        }

        // Leer por teclado un num real
        double numReal = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime un número real: ");
        numReal = scan.nextDouble();

        // Declaramos una variable que va a servir para CONTAR cuántos números
        // del array son mayores a numReal
        int cantidad = 0;
        for (int i=0; i <= arrDoub.length - 1; i++){

            if (arrDoub[i]>=numReal) {
                cantidad++;
            }
        }
        System.out.println("El nº de elementos mayores que "+numReal+" es "+cantidad);



    }
}
