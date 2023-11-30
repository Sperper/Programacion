package com.programacion.unidad_2.ejemploClase;

import java.util.Scanner;

public class ActividadClaseTienda {

    public static void main(String[] args) {

        /** Inventarse nombre de la tienda y que ponga bienvenido a (nombre del restaurante)
         *
         * Hacer un menú que sea:
         * 1. Iniciar sesión
         * 2. Ver productos
         * 3. Salir
         *
         * Mientras la opción introducida sea distinta a 1,2,3. Repetir menú
         *
         * Si pulsa 1:
         * user o passwd correctas = bienvenido al sistema
         *
         * Si pulsa 2:
         * 1. Café
         * 2. Seguir durmiendo
         * 3. Agua
         * 4. Colacao
         * 0. Salir
         * mientras opción incorrecta
         * no pulse salir
         * desee algo mas
         *
         * mostrar todo lo que ha seleccionado
         *
         * Si pulsa 3 salir
         *
         */

        Scanner scan = new Scanner(System.in);
        String tienda = "Mercadona";
        int opcion;
        String password = "pepe1234567890";
        String intentoPassword;
        String usuario = "pepe12";
        String intentoUsuario;
        System.out.println("Bienvenido a mercadona.");
        do {
            do {

                System.out.println("¿Qué quieres hacer?");
                System.out.println("1. Iniciar sesión");
                System.out.println("2. Ver productos");
                System.out.println("3. Salir");
                System.out.print("Introduzca el número de la opción: ");
                opcion = scan.nextInt();

                if (opcion != 1 && opcion != 2 && opcion != 3) {
                    System.out.println("Opción incorrecta");
                }
            } while (opcion != 1 && opcion != 2 && opcion != 3);

            if (opcion == 1) {
                do {
                    System.out.print("Introduzca su usuario: ");
                    intentoUsuario = scan.next();

                    System.out.print("Introduzca la contraseña: ");
                    intentoPassword = scan.next();

                    if (!intentoUsuario.equals(usuario) || !intentoPassword.equals(password)) {
                        System.out.println("DATOS INCORRECTOS. Inténtalo de nuevo.");
                    } else {
                        System.out.println("Acceso aceptado");
                    }

                } while (!intentoUsuario.equals(usuario) || !intentoPassword.equals(password));

            } else if (opcion == 2) {
                int opcion2;
                String objeto1 = "";
                String objeto2 = "";
                String objeto3 = "";
                String objeto4 = "";
                String objetosComprados = "";
                int opcion3;
                do {
                    System.out.println("Opciones: ");
                    System.out.println("1. Café");
                    System.out.println("2. Seguir durmiendo");
                    System.out.println("3. Agua");
                    System.out.println("4. Colacao");
                    System.out.println("5. Salir");
                    System.out.println("Seleccione su producto: ");
                    opcion2 = scan.nextInt();

                    if (opcion2 == 1) {
                        objeto1 = "café";
                        System.out.println("Has seleccionado " + objeto1);
                    } else if (opcion2 == 2) {
                        objeto2 = "Seguir durmiendo";
                        System.out.println("Has seleccionado " + objeto2);
                    } else if (opcion2 == 3) {
                        objeto3 = "Agua";
                        System.out.println("Has seleccionado " + objeto3);
                    } else if (opcion2 == 4) {
                        objeto4 = "Colacao";
                        System.out.println("Has seleccionado " + objeto4);
                    }
                    System.out.println("¿Desea algo mas?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    opcion3 = scan.nextInt();

                    if (opcion3 == 2){
                        System.out.println("Productos comprados");
                        opcion2 = 5;
                        System.out.println("Saliendo de productos");
                    }

                } while (opcion2 != 5);


            } else {
                System.out.println("Has salido del sistema");
            }
        } while (opcion != 3);
    }

}
