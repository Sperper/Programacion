package com.programacion.unidad_1.actividad_2;

import java.util.Scanner;

public class IVA {
    /*
    Nombre: Samuel Pérez Pérez
    Escribe un programa que, dado el precio de un artículo,
    calcule el precio al aplicarle el IVA del 21%.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double precio;
        double porcentaje = 0.21;
        double porcentajePrecio;
        double precioFinal;
        System.out.println("Introduzca el precio del preducto: ");
        precio = scan.nextInt();

        porcentajePrecio = precio * 0.21;

        precioFinal = precio + porcentajePrecio;

        System.out.println("El precio final es: "+precioFinal);



    }

}
