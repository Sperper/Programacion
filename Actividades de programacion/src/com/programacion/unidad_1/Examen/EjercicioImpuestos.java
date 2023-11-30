package com.programacion.unidad_1.Examen;

import java.util.Scanner;

//clase
public class EjercicioImpuestos {
    //main
    public static void main(String[] args) {

        /*
        NOMBRE: Samuel
        APELLIDOS: Pérez Pérez
        NOMBRE ACTIVIDAD: EjercicioImpuestos
         */

        //Creamos el objeto Scanner
        Scanner scan = new Scanner(System.in);
        //Declaramos las variable real horasTrabajadas
        double horasTrabajadas;
        //Declaramos variable real Tarifa
        double tarifa = 20;
        //Declaramos la variable real SalarioSemanal
        double salarioSemanal;
        //Hacemos sout para pedir las horas trabajadas
        System.out.println("Introduzca las horas trabajadas: ");
        //Hacemos el scan para que lea por teclado las horas trabajadas
        horasTrabajadas = scan.nextDouble();
        //Realizamos el primer if
        if (horasTrabajadas == 35){
            //Realizamos la cuenta para calcular el salario
            salarioSemanal = tarifa * horasTrabajadas;
            //Declaramos otro if dentro de este
            if (salarioSemanal > 500 && salarioSemanal <= 900){

                salarioSemanal = salarioSemanal - 500;
                salarioSemanal = 500 + (salarioSemanal * 0.75);
                System.out.println("El salario semanal es "+salarioSemanal);
            }
        //Realizamos el else-if para las horas trabajadas mayor a 35
        } else if (horasTrabajadas > 35) {
            salarioSemanal = tarifa * horasTrabajadas * 1.5;
            //Declaramos otro if dentro de este
            if (salarioSemanal > 500 && salarioSemanal <= 900){

                salarioSemanal = salarioSemanal - 500;
                salarioSemanal = 500 + (salarioSemanal * 0.75);
                System.out.println("El salario semanal es"+salarioSemanal);
            //Declaramos otro else if para el salario mayor a 900
            } else if (salarioSemanal > 900){

                salarioSemanal = salarioSemanal - 900;
                salarioSemanal = 900 + (salarioSemanal * 0.55);
                salarioSemanal = ((salarioSemanal - 500)*0.75)+500;
                System.out.println("El salario semanal es "+salarioSemanal);


            }
        }


    }

}
