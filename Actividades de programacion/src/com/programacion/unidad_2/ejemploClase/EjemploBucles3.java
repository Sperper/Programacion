package com.programacion.unidad_2.ejemploClase;

public class EjemploBucles3 {

    public static void main(String[] args) {

        /*
        Escribir un programa que muestre los 2000 primeros números enteros positivos
        y los 2000 primeros números negativos
        EL 0 NO ES POSITIVO
         */
         // for (variable de control; condición; incrementador)
        for (int i=1; i<=2000; i++){
            System.out.println("Numero: "+i);

            // i solo eciste dentro del bucle for
        }
        for (int i=-1; i>=-2000; i--){
            System.out.println("Numero: "+i);
        }
        /*
        Hacer un programa que mueste los números del 2000 al 1.
         */

        for (int i=2000; i>=1; i--){
            System.out.println("Número: "+i);
        }
    }

}
