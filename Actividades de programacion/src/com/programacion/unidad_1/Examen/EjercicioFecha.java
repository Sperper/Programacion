package com.programacion.unidad_1.Examen;

import java.util.Scanner;

//Clase
public class EjercicioFecha {
    //Introducimos el main
    public static void main(String[] args) {

        /*
        NOMBRE: Samuel
        APELLIDOS: Pérez Pérez
        NOMBRE ACTIVIDAD: Ejercicio.Fecha
        ACTIVIDAD:
        3. Implemente un programa que pida el día, mes y año de una fecha y
           muestre un mensaje diciendo la fecha que es. Si se introduce un
           número negativo, el programa debe mostrar un mensaje de error.
            Ejemplos:
            • (Introduce) 1, 2 y 2023 -> (Muestra) Es el 1 de
            febrero de 2023
            • (Introduce) 3, 12, 1990 -> (Muestra) Es el 3 de
            diciembre de 1990
            • (Introduce) 30, 2, 2023 -> (Muestra) Error en los
            datos
            • (Introduce) 1, 1, 2000 -> (Muestra) Es el 1 de enero
            de 2000
         */

        //Declaramos el objeto scanner
        Scanner scan = new Scanner(System.in);
        //Declaramos las varibles "dia", "mes" y "año", que se declararán con int puesto que son núeros enteros.
        int dia;
        int mes;
        int año;
        //Introducimos el texto que queremos que nos muestre por pantalla
        System.out.println("Introduzca el día: ");
        //Posteriormente introducimos el scan para que lea el teclado al usuario.
        dia = scan.nextInt();
        //Repetimos este proceso con las otras dos variables
        System.out.println("Introduzca el mes: ");
        mes = scan.nextInt();
        System.out.println("Introduzca el año: ");
        año = scan.nextInt();
        //Tras hacer eso declaramos el if
        if (dia < 0 || mes < 0 || año < 0){
            System.out.println("ERROR, FECHA INCORRECTA");
            /*
            Para hacer esto ponemos primero que no pueda ser negativo ya que de esta mannera
            nos quitamos este problema de encima, además utilizamos los operadores
            lógicos complejos "or" para no usar tantoss ifs.
             */
        } else if (mes == 1){
            System.out.println("Es el "+dia+" de enero "+año);
        } else if (mes == 2){ //Son doce meses y doces número seguimos haciendo else-if hasta que lleguemos a diciembre
            System.out.println("Es el "+dia+" de febrero "+año);//Hacemos sout para que muestre por pantalla después de cada if
        } else if (mes == 3){
            System.out.println("Es el "+dia+" de marzo "+año);
        } else if (mes == 4) {
            System.out.println("Es el "+dia+" de abril "+año);
        } else if (mes == 5) {
            System.out.println("Es el "+dia+" de mayo "+año);
        }else if (mes == 6){
            System.out.println("Es el "+dia+" de junio "+año);
        } else if (mes == 7) {
            System.out.println("Es el "+dia+" de julio "+año);
        } else if (mes == 8){
            System.out.println("Es el "+dia+" de agosto "+año);
        } else if (mes == 9){
            System.out.println("Es el "+dia+" de septiembre "+año);
        } else if (mes == 10) {
            System.out.println("Es el "+dia+" de octubre "+año);
        } else if (mes == 11) {
            System.out.println("Es el "+dia+" de noviembre "+año);
        } else if (mes == 12){
            System.out.println("Es el "+dia+" de diciembre "+año);
        } //Este sería el último if ya que son 12 meses


    }



}
