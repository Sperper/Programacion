package com.programacion.Unidad_6.proyectoComida;

import com.programacion.Unidad_6.proyectoComida.clases.impl.Hueso;
import com.programacion.Unidad_6.proyectoComida.clases.impl.Lentejas;
import com.programacion.Unidad_6.proyectoComida.clases.impl.LlegasTarde;
import com.programacion.Unidad_6.proyectoComida.clases.impl.Salchicha;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Es vuestra energia al ppio del dia
        int energia = 100;
        Random r = new Random();
        int llegasTardeRand = r.nextInt(2);

        Scanner scan = new Scanner(System.in);
        System.out.println("""
                    1. Programacion
                    2. Base de datos
                    3. Sistemas
                    4. EEDD
                    0. Salir
                    
                    5. Hueso
                    6. Lentejas
                    7. Salchicha
                    8. LlegasTardes
                    9. Parte
                    10. ShutDownPC
                    0. Salir
                    """);
        System.out.println("Indique modulo");
        int opc = 1;

        while (opc != 0) {
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    energia = energia - 20;
                    break;
                case 2:
                    energia = energia - 60;
                    break;
                case 3:
                    energia =energia - 60;
                    break;
                case 4:
                    energia =energia - 70;
                    break;
                case 5:
                    Hueso huesoDePollo = new Hueso();
                    energia = energia + huesoDePollo.addNutricion();
                    break;
                case 6:
                    Lentejas platoDeLentejas = new Lentejas(false);
                    energia = energia + platoDeLentejas.addNutricion();
                    break;
                case 7:
                    Salchicha salchichaUP = new Salchicha();
                    energia += salchichaUP.addNutricion();
                    break;
                case 8:
                    llegasTardeRand = r.nextInt(2)+1;
                    LlegasTarde llegasTarde;
                    if (llegasTardeRand == 1) {
                        System.out.println("Te quedas en la puerta");
                        llegasTarde = new LlegasTarde(true);
                    } else {
                        System.out.println("Pasas...");
                        llegasTarde = new LlegasTarde(false);
                    }
                    energia += llegasTarde.reduceEnergia();
                    break;
                case 9:

                    break;
                case 10:break;
                case 0:
                    System.out.println("Saliendo del dia de clase");
                    break;
            }
            System.out.println("Energia restante: "+energia);
            System.out.println("Indique otra opcion");
        }

        if (energia <= 0) {
            System.out.println("Has muerto de cansancio");
        } else {
            System.out.println("Sigues viv@");
        }




    }

}
