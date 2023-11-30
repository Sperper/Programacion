package com.programacion.unidad_2.ejemploClase;

import java.util.Scanner;

public class ActividadClaseLoginContraseñaBucle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String usuario = "pepe";
        String contrasenia = "pepe1234";
        String intento;
        String intentoUsuario;

        do {

            System.out.println("Introduzca el usuario: ");
            intentoUsuario = scan.next();

            System.out.println("Introduza la contraseña: ");
            intento = scan.next();

            if(!intentoUsuario.equals(usuario) || !intento.equals(contrasenia)){
                System.err.println("Credenciales incorrectas!! Intentalo de nuevo");
            }

        }while (!intentoUsuario.equals(usuario) || !intento.equals(contrasenia));

        System.out.println("Acceso aceptado");

        //Cuando sale del while, significa que se han introducido las credenciales correctas

    }

}
