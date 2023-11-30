package com.programacion.unidad_1.ejemplos_clase;

public class EjemploComplejos {

    public static void main(String[] args) {

        int edad = 18;
        boolean ebrio = false;

        // Un programa que sea porter@ de discoteca

        /*
        Esta disco tiene la condición que solo pueden entrar los mayores de edad, y la
        gente que está sobria
         */

        if (edad >= 18 && ebrio == false) { //T && T => T
            System.out.println("Puedes entrar");
        }else {
            System.out.println("No puedes entrar");
        }


        //Club de las personas millonarias
        /*
        En este club sólo se puede entrar si:
        - Tienes 1 millón de euros
        - Tienes un yate
        - Tienes un rolls
        - O eres el bicho
        - O eres Taylor Swift
         */

        int dinero = 10;
        boolean yate = false;
        boolean rolls = false;
        boolean taylor = false;
        boolean bicho = true;

        if (dinero >= 1000000 || yate == true || rolls ==  true || bicho == true || taylor == true){
            //F || F || F || T || F => TRUE
            System.out.println("Pasas");
        } else {
            System.out.println("No puedes entrar");
        }

        int redFlag = 1;

        /*
        Conozco a  un persona si NO hay red flags
         */
        if (!(redFlag > 0)) {
            System.out.println("Te conozco");
        }

    }
}
