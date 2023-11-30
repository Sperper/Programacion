package com.programacion.unidad_2.ProyectoFinal;

import java.io.OutputStream;
import java.util.Scanner;

public class CafeteríaUbriCoffee {

    public static void main(String[] args) {

        int opcion;
        String producto = "Café";
        String producto1 = "Agua";
        String producto2 = "Tostada";
        int cafe = 0;
        int agua = 0;
        int tostada = 0;

            do {
                Scanner scan = new Scanner(System.in);
                System.out.println("1. Café 1€");
                System.out.println("2. Agua 0,50€");
                System.out.println("3. Tostada 1,20€");
                System.out.println("0. Terminar/Salir");
                System.out.print("Seleccion un producto: ");
                opcion = scan.nextInt();

                if (opcion == 1){
                    cafe++;
                    System.out.println("Has elegido "+cafe+" "+producto);
                } else if (opcion == 2) {
                    agua++;
                    System.out.println("Has elegido "+agua+" "+producto1);
                } else if (opcion == 3) {
                    tostada++;
                    System.out.println("Has elegido "+tostada+" "+producto2);
                }
                System.out.println("¿Desea algo mas?");
                System.out.println("1. Si");
                System.out.println("2. No");
                int opcion2;
                opcion2 = scan.nextInt();

                if (opcion2 == 2){
                    opcion = 0;
                    System.out.println("Has terminado de seleccionar productos");
                }


            } while (opcion != 0);

        if (cafe > 0 && agua > 0 && tostada > 0) {
            if (cafe == 1){
                System.out.println("Has seleccionado "+cafe+" "+producto);
            }
        }







    }

}
