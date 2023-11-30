package com.programacion.unidad_1.Examen;

import java.util.Scanner;

//clase
public class EjercicioTemperatura {
    //main
    public static void main(String[] args) {

        /*
        NOMBRE: Samuel
        APELLIDOS: Pérez Pérez
        NOMBRE ACTIVIDAD: EjercicioTemperatura
         */

            //Creamos el objeto Scanner para introducir la temperatura
        Scanner scan = new Scanner(System.in);
        //Declaramos la variable int temperaturaGradosC
        int temperaturaGradosC;
        //Hacemos sout para que muestre el texto por pantalla
        System.out.println("Introduzca la temperatura en grados centígrados: ");
        //Hacemos el scan para que lea el teclado
        temperaturaGradosC = scan.nextInt();
        //Declaramos el primer if
        if (temperaturaGradosC <= 10){
            System.out.println("Clima frío");//Hacemos sout para que muestre por pantalla
        } else if (temperaturaGradosC > 10 && temperaturaGradosC <= 20) {
            System.out.println("Clima templado");//Repetimos el proceso
        } else if (temperaturaGradosC > 20 && temperaturaGradosC <= 30) {
            System.out.println("Clima caluroso");
        } else { //En este caso solo hacemos un else ya que solo queda una opción posible si no es ninguna de las anteriores.
            System.out.println("Clima tropical");
        }


    }

}
