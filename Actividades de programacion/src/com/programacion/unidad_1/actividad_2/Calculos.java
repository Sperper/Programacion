package com.programacion.unidad_1.actividad_2;

import java.util.Scanner;
public class Calculos {

    /*
    NOMBRE: Samuel Pérez Pérez
    2. Escribe un programa que lea dos números por teclado y que
    calcule y muestre el valor de su suma, resta, producto y
    división.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        double a;
        double b;
        double suma;
        double resta;
        double producto;
        double division;
        System.out.println("Dime el primer número: ");
        a = scan.nextDouble();
        System.out.println("Dime el segundo número: ");
        b = scan.nextDouble();

        suma = a + b;
        System.out.println("El resultado de la suma es: "+suma);

        resta = a - b;
        System.out.println("El resultado de la resta es: "+resta);

        producto = a * b;
        System.out.println("El producto de la multiplicación es: "+producto);

        division = a / b;
        System.out.println("El resultado de la división es; "+division);


    }

}
