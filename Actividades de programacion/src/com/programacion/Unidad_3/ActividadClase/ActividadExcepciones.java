package com.programacion.Unidad_3.ActividadClase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ActividadExcepciones {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        do {

            try {
                System.out.println("Introduzca el primer número: ");
                num1 = scan.nextInt();
                System.out.println("Introduzca el divisor");
                num2 = scan.nextInt();
                System.out.println("La division es: "+(num1 / num2));



            }catch (ArithmeticException e){
                System.out.println("No se puede, payas@");
            }catch (InputMismatchException e){
                System.out.println("Tipo de dato incorrecto");
            } finally { // Siempre se ejecuta al final
                num1 = 0;
                num2 = 0;

            }

        } while (true);


    }

}
