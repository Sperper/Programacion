package com.programacion.Unidad_7.proyectoUbriCine;

import com.programacion.Unidad_7.proyectoUbriCine.model.Butaca;
import com.programacion.Unidad_7.proyectoUbriCine.model.User;
import com.programacion.Unidad_7.proyectoUbriCine.services.impl.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UbriCine {


    public static void main(String[] args) {
        // Se crea un objeto tipo GestionFicheroUser
        GestionFicheroUser gestUser = new GestionFicheroUser();
        // Se crea un ArrayList de users
        ArrayList<User> users = new ArrayList<>();
        // Se mete el contenido del fichero user.txt en el ArrayList users
        users = gestUser.leerFicherUser("src/resources/archivosTema7/users/users.txt");
        // Se crea un objeto tipo ServiceUser
        ServiceUser servicio = new ServiceUser();
        // Se crea un objeto tipo LoggerService
        LoggerService logger = new LoggerService();
        // Se crea un objeto tipo GestionFicheroCine
        GestionFicheroCine gestCine = new GestionFicheroCine();
        // Se crea un Array bidimensional de Butacas
        Butaca[][] entradasVendidas = new Butaca[10][10];
        // Se mete el contenido del fichero cine.txt en el Array bidimensional creado anteriormente
        entradasVendidas = gestCine.leerFicheroCine("src/resources/archivosTema7/UbriCine/cine.txt");
        ServiceCine serviceCine = new ServiceCine("UbriCine");
        Scanner scan = new Scanner(System.in);

        int opc2 = 0;
        int opc = 0;

        // Bucle do while que mostrará las opciones
        do {
            System.out.println("""
                    Bienvenido al sistema que desea hacer:
                    1. Alta
                    2. Login
                    0. Salir
                    """);
            try {
                // Lee la opcion por teclado
                opc = scan.nextInt();
                // Switch para hacer la opción que ha marcado el usuario
                switch (opc) {
                    case 1:
                        // Se llama al método altaUsuario
                        servicio.altaUsuario();
                        break;
                    case 2:
                        // Se comprueba si el usuario ha logrado iniciar sesion
                        if (servicio.loginUsuario()) {
                            // Bucle do-while
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
                                    // if-else if para que vaya ejecutando lo que el usuario quiere hacer
                                    if (opc2 == 1) {
                                        // Llama al método mostrarButacas
                                        serviceCine.mostrarButacas();
                                    } else if (opc2 == 2) {
                                        // Llama el método comprarEntrada
                                        serviceCine.comprarEntrada();
                                    } else if (opc2 == 3) {
                                        // Llama al método devolverEntrada
                                        serviceCine.devolverEntrada();
                                    } else if (opc2 == 0) {
                                        // Sale del sistema
                                        System.out.println("Saliendo del sistema");
                                    } else {
                                        System.out.println("Opción incorrecta");
                                    }
                                    // Captura la excepcion InputMismatchException
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
                // Captura la excepcion InputMismatchException
            } catch (InputMismatchException e) {
                System.out.println("ERROR EN LA OPCION, INTRODUCE UNA RESPUESTA VALIDA");
            }
        } while (opc != 0);
    }
}