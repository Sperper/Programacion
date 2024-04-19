package com.programacion.Unidad_7.proyectoUbriCine;

import com.programacion.Unidad_7.proyectoUbriCine.model.Butaca;
import com.programacion.Unidad_7.proyectoUbriCine.model.User;
import com.programacion.Unidad_7.proyectoUbriCine.services.impl.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UbriCine {


    public static void main(String[] args) {
        GestionFicheroUser gestUser = new GestionFicheroUser();
        ArrayList<User> users = new ArrayList<>();
        users = gestUser.leerFicherUser("src/resources/archivosTema7/users/users.txt");
        ServiceUser servicio = new ServiceUser();
        LoggerService logger = new LoggerService();
        GestionFicheroCine gestCine = new GestionFicheroCine();
        Butaca[][] entradasVendidas = new Butaca[10][10];
        entradasVendidas = gestCine.leerFicheroCine("src/resources/archivosTema7/UbriCine/cine.txt");
        ServiceCine serviceCine = new ServiceCine("UbriCine");
        Scanner scan = new Scanner(System.in);

        int opc2 = 0;
        int opc = 0;
        do { // Bucle do while que mostrará las opciones
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
                        if (servicio.loginUsuario()) {
                            do {

                                System.out.println("""
                                        Bienvenido a Ubricine que desea hacer: 
                                        1. Mostrar Butacas
                                        2. Comprar entradas
                                        3. Devolver entrada
                                        0. Salir
                                        """);
                                try {
                                    opc2 = scan.nextInt();
                                    scan.nextLine();
                                /*
                                switch (opc2) {

                                    case 1:
                                        serviceCine.mostrarButacas();
                                        break;
                                    case 2:
                                        serviceCine.comprarEntrada();
                                        break;
                                    case 3:
                                        serviceCine.devolverEntrada();
                                        break;
                                    case 0:
                                        System.out.println("Saliendo del sistema");
                                        break;
                                }
                                */
                                    if (opc2 == 1) {
                                        serviceCine.mostrarButacas();
                                    } else if (opc2 == 2) {
                                        serviceCine.comprarEntrada();
                                    } else if (opc2 == 3) {
                                        serviceCine.devolverEntrada();
                                    } else if (opc2 == 0) {
                                        System.out.println("Saliendo del sistema");
                                    } else {
                                        System.out.println("Opción incorrecta");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("ERROR EN LA OPCION");
                                }
                            } while (opc2 != 0);
                        }
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