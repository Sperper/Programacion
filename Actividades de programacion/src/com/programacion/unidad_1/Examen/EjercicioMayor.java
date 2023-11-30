package com.programacion.unidad_1.Examen;

import java.util.Scanner;

//Clase
public class EjercicioMayor {
    //main
    public static void main(String[] args) {

        /*
        NOMBRE: Samuel
        APELLIDOS: Pérez Pérez
        NOMBRE ACTIVIDAD: EjercicioMayor
         */

        //Creamos el objeto Scanner
        Scanner scan = new Scanner(System.in);
        //Declaramos la variable real núm1
        double num1;
        //Declaramos la variable real num2
        double num2;
        //Realizamos el sout para pedir el primer número
        System.out.println("Introduzca el primer número: ");
        //Realizamos el scan para que lea el teclado
        num1 = scan.nextDouble();
        //Realizamos el sout para pedir el segundo número
        System.out.println("Introduzca el segundo número: ");
        //Realizamos el scan para que lea el teclado
        num2 = scan.nextDouble();
        //Realizamos el primer if
        if (num1 == num2){
            System.out.println("Los dos números son iguales");
        } else if (num1 > num2) { //Realizamos else if para que nos diga cual es mayor
            System.out.println("El número "+num1+" es el mayor");
        } else { //Solo hacemos un else porque solo queda un caso y es que el segundo número sea mayor
            System.out.println("El número "+num2+" es el mayor");
        }

    }

}
