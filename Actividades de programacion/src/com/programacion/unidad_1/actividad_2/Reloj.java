package com.programacion.unidad_1.actividad_2;

import java.util.Scanner;

public class Reloj {

    public static void main(String[] args) {

        /*
        8. Escribe un programa que recibe como datos de entrada una hora
        expresada en horas, minutos y segundos que nos calcula y
        escribe la hora, minutos y segundos que serán, transcurrido
        un segundo.
         */

        Scanner scan = new Scanner(System.in);
        int hora;
        int minutos;
        int segundos;
        System.out.println("Introduzca la hora");
        System.out.print("Hora: ");
        hora = scan.nextInt();
        System.out.print("Minuto: ");
        minutos = scan.nextInt();
        System.out.print("Segundo: ");
        segundos = scan.nextInt();

        if (segundos < 59 && segundos >= 0){
                segundos = segundos + 1;
                System.out.println("La hora un segundo después es: "+hora+":"+minutos+":"+segundos);
        } else if (segundos == 59) {
            segundos = 0;
            if (minutos < 59 && minutos >= 0){
                minutos = minutos + 1;
                System.out.println("La hora un segundo después es: "+hora+":"+minutos+":"+segundos);
            } else if (minutos == 59) {
                minutos = 0;
                if (hora < 23 && hora >= 0){
                    hora = hora + 1;
                    System.out.println("La hora un segundo después es: "+hora+":"+minutos+":"+segundos);
                } else if (hora == 23){
                    hora = 0;
                    System.out.println("La hora un segundo después es: "+"0"+hora+":"+minutos+":"+segundos);
                }
            }
        }
        if (hora > 23 || minutos > 59 || segundos > 59) {
            System.out.println("Hora incorrecta");
        }

    }

}
/*
CURIOSIDAD:
System.out.format("Son las "+hh+":"+mm+":"+ss)
System.out.format("Son las %02d:%02d:%02d", hh, mm, ss)
 */