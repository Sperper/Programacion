package com.programacion.Unidad_7.proyectoUser;

import com.programacion.Unidad_7.proyectoUser.model.User;
import com.programacion.Unidad_7.proyectoUser.services.impl.GestionFicheroLogger;
import com.programacion.Unidad_7.proyectoUser.services.impl.GestionFicheroUser;
import com.programacion.Unidad_7.proyectoUser.services.impl.ServiceUser;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        GestionFicheroUser gestUser = new GestionFicheroUser();
        ArrayList<User> users = new ArrayList<>();
        users = gestUser.leerFicherUser("src/resources/archivosTema7/users/users.txt")

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
                2. Alta
                0. Salir
                """);
            opc = scan.nextInt();




        } while (opc != 0);

    }

}