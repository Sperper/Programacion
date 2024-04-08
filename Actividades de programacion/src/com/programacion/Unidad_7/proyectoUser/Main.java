package com.programacion.Unidad_7.proyectoUser;

import com.programacion.Unidad_7.proyectoUser.services.GestionFicheroUser;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        /*
        Menu login:
        1. Login
        2. Dar de alta
        3. Modificar Usuario
        4. Dar de baja
         */

        Scanner scan = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("""
                Bienvenido al sistema que desea hacer:
                1. Login
                2. Dar de alta
                3. Modificar su Usuario
                4. Dar de baja
                """);



        } while (opc != 0);

    }

}