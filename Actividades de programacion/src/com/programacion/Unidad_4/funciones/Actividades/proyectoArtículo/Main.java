package com.programacion.Unidad_4.funciones.Actividades.proyectoArtículo;

import com.programacion.Unidad_4.funciones.Actividades.proyectoArtículo.Clases.Articulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Articulo pantalon = new Articulo("P24", "Pantalon cargo", "TN", 5);
        pantalon.descripcion = "Pantalones que son anchos por arriba y cerrados por abajo";
        pantalon.stock = 100;

        Articulo tenis = new Articulo("T01", "Tenis", "TN", 40);
        tenis.descripcion = "Bambas deportivas, zapatos deportivos, deportes";
        tenis.stock = 300;

        Articulo sudadera = new Articulo("S30", "Sudadera con capucha", "TN", 40);
        sudadera.descripcion = "Sudadera con capucha";
        sudadera.stock = 200;


        pantalon.calcularPrecio();
        sudadera.calcularPrecio();
        tenis.calcularPrecio();

        tenis.imprimirArticulo();
        pantalon.imprimirArticulo();
        sudadera.imprimirArticulo();

       int opc;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Bienvenid@ a gestion de stock");
            System.out.println("1. Anadir stock");
            System.out.println("2. Venta");
            System.out.println("3. Consultar stock");
            System.out.println("0. Salir");
            opc = scan.nextInt();

            if(opc < 0 || opc > 3) {
                System.out.println("Opcion incorrecta");
            }else if(opc == 0) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("1. Pantalon");
                System.out.println("2. Sudadera");
                System.out.println("3. Tenis");
                if(opc == 1) {
                    // Anadir Stock
                    System.out.print("Anadir Stock. Indique el producto: ");
                    int producto = 0;
                    producto = scan.nextInt();

                    System.out.print("Indique la cantidad: ");
                    int cantidad = scan.nextInt();

                    if(producto == 1) {
                        pantalon.añadirStock(cantidad);
                    } else if(producto == 2) {
                        sudadera.añadirStock(cantidad);
                    } else if(producto == 3) {
                        tenis.añadirStock(cantidad);
                    } else {
                        System.out.println("Opcion incorrecta");
                    }
                } else if (opc == 2) {
                    // Venta de producto
                    System.out.print("Venta. Indique el producto:");
                    int producto = 0;
                    producto = scan.nextInt();

                    if(producto == 1) {
                        pantalon.venderArticulo();
                    } else if(producto == 2) {
                        sudadera.venderArticulo();
                    } else if(producto == 3) {
                        tenis.venderArticulo();
                    } else {
                        System.out.println("Opcion incorrecta");
                    }
                } else {
                    // Consultar stock
                    System.out.print("Consulta Stock. Indique el producto:");
                    int producto = 0;
                    producto = scan.nextInt();

                    if(producto == 1) {
                        pantalon.hayStock();
                    } else if(producto == 2) {
                        sudadera.hayStock();
                    } else if(producto == 3) {
                        tenis.hayStock();
                    } else {
                        System.out.println("Opcion incorrecta");
                    }
                }
            }
        } while(opc != 0);



    }

}
