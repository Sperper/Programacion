package com.programacion.Unidad_4.funciones;

import java.sql.SQLOutput;
import java.util.Scanner;
import com.programacion.Unidad_4.funciones.OtraClase;
import com.programacion.Unidad_4.funciones.NuevoPaquete.NuevaClaseII;

public class TeoríaFunciones {

    public static void main(String[] args) {

        /**
         * Hacer un método que imprima por pantalla "hola y el nombre deel usuario
         */
        boolean esValido = NuevaClaseII.checkCaracteres("12A45678A");
        if (esValido){
            System.out.println("El DNI es valido");
        } else {
            System.out.println("El DNI no es valido");
        }



    } // FIN DE MAIN

    /**
     * Método que imprime por pantlla el nombre de usuario
     * @param nombreUsuario Binvre del usuario a imprimir por pantalla
     */

    public static void imprimirNombre(String nombreUsuario) {
        System.out.println("Hola "+nombreUsuario);
    }


} // FIN DE CLASE
