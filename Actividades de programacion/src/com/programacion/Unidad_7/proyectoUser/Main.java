package com.programacion.Unidad_7.proyectoUser;

import com.programacion.Unidad_7.proyectoUser.model.User;
import com.programacion.Unidad_7.proyectoUser.services.impl.GestionFicheroLogger;
import com.programacion.Unidad_7.proyectoUser.services.impl.GestionFicheroUser;
import com.programacion.Unidad_7.proyectoUser.services.impl.LoggerService;
import com.programacion.Unidad_7.proyectoUser.services.impl.ServiceUser;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        GestionFicheroUser gestUser = new GestionFicheroUser();
        ArrayList<User> users = new ArrayList<>();
        users = gestUser.leerFicherUser("src/resources/archivosTema7/users/users.txt");
        ServiceUser servicio = new ServiceUser();
        LoggerService logger = new LoggerService();


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
                    1. Alta
                    2. Login
                    0. Salir
                    """);
            try {

                opc = scan.nextInt();
                switch (opc) {
                    case 1:
                        servicio.altaUsuario();
                        break;
                    case 2:
                        servicio.loginUsuario();
                        break;
                    case 0:
                        System.out.println("Saliendo del sistema");
                        break;

                }

            } catch (InputMismatchException e) {
                System.out.println("ERROR EN LA OPCION, INTRODUCE UNA RESPUESTA VALIDA");
            }
        } while (opc != 0);
    }
}
