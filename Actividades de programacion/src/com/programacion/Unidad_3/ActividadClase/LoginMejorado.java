package com.programacion.Unidad_3.ActividadClase;

import java.util.Scanner;
import java.util.InputMismatchException;
// clase
public class LoginMejorado {
    // main
    public static void main(String[] args) {

        // Llamamos al objeto Scanner para que lea el usuario y la contrasenia que introduciremos por teclado
        Scanner scan = new Scanner(System.in);
        // Declaramos 3 variabbles enteras
        int opcion = 0; // Para elegir una opcion
        int indexU = 5; // Para que cuando se introduzca un usuario nuevo se coloque en la posicion 5
        int indexC = 5; // Para que cuando se introduzca una contraseña nueva se coloque en la posicion 5

        String[] usuario = new String[10]; // Declaramos un array de String para colocar los usuarios y luego los inicializamos hasta la posicion numero 4.
        String intentoUsuario = "";


        usuario[0] = "Maradona";
        usuario[1] = "Messi";
        usuario[2] = "Iniesta";
        usuario[3] = "Chicote";
        usuario[4] = "Ronaldo";


        String[] contrasenia = new String[10]; // Declaramos otro array de Strings para colocar las contrasenias
        String intentoContrasenia = "";


        contrasenia[0] = "Maradona1234";
        contrasenia[1] = "Messi1234";
        contrasenia[2] = "Iniesta1234";
        contrasenia[3] = "Chicote1234";
        contrasenia[4] = "Ronaldo1234";

        do { // Ponemos un do-while para que se repita hasta que pulsemos salir.
            System.out.println("Bienvenido. ¿Que desea hacer? ");
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Registrarse");
            System.out.println("3. Darse de baja");
            System.out.println("4. Salir");
            opcion = scan.nextInt();



            if (opcion == 1) { // Usamos un if para que funcione el primer apartado en caso de haber escogido Iniciar Sesion

                System.out.println("Introduzca su usuario: ");
                intentoUsuario = scan.next();

                System.out.println(" ");

                System.out.println("Introduzca su contraseña: ");
                intentoContrasenia = scan.next();

                if (intentoUsuario.equals(usuario[0]) && intentoContrasenia.equals(contrasenia[0])){ //Declaramos un if para cada uno de los Strings del array junto con su contrasenia.

                    System.out.println(" ");
                    System.out.println("Bienvenido "+intentoUsuario);

                }else if (intentoUsuario.equals(usuario[1]) && intentoContrasenia.equals(contrasenia[1])){

                    System.out.println(" ");
                    System.out.println("Bienvenido "+intentoUsuario);

                }else if (intentoUsuario.equals(usuario[2]) && intentoContrasenia.equals(contrasenia[2])){

                    System.out.println(" ");
                    System.out.println("Bienvenido "+intentoUsuario);

                }else if (intentoUsuario.equals(usuario[3]) && intentoContrasenia.equals(contrasenia[3])){

                    System.out.println(" ");
                    System.out.println("Bienvenido "+intentoUsuario);

                }else if (intentoUsuario.equals(usuario[4]) && intentoContrasenia.equals(contrasenia[4])){

                    System.out.println(" ");
                    System.out.println("Bienvenido "+intentoUsuario);

                } else if (intentoUsuario.equals(usuario[5]) && intentoContrasenia.equals(contrasenia[5])){

                    System.out.println(" ");
                    System.out.println("Bienvenido "+intentoUsuario);

                } else if (intentoUsuario.equals(usuario[6]) && intentoContrasenia.equals(contrasenia[6])) {

                    System.out.println(" ");
                    System.out.println("Bienvenido "+intentoUsuario);

                } else if (intentoUsuario.equals(usuario[7]) && intentoContrasenia.equals(contrasenia[7])) {

                    System.out.println(" ");
                    System.out.println("Bienvenido "+intentoUsuario);

                } else if (intentoUsuario.equals(usuario[8]) && intentoContrasenia.equals(contrasenia[8])) {

                    System.out.println(" ");
                    System.out.println("Bienvenido "+intentoUsuario);

                } else if (intentoUsuario.equals(usuario[9]) && intentoContrasenia.equals(contrasenia[9])) {

                    System.out.println(" ");
                    System.out.println("Bienvenido "+intentoUsuario);

                }else {
                    System.out.println(" ");
                    System.out.println("Credenciales incorrectas");
                }


            }
            if (opcion == 2){ // Para que se inicie en el caso de escogerr la opcion Registrarse
                try { // Para que en el caso de que se introduzcan mas usuarios que los que se pueden almacenar en el array salte un mensaje de error.
                    System.out.print("Introduce el usuario: ");
                    usuario[indexU] = scan.next();
                    indexU++; // Sumamos 1 cada vez que se seleccione Registrarse para que se almacenen en las siguientes posiciones del array.

                    System.out.print("Introduce la contrasenia: ");
                    System.out.println(" ");
                    contrasenia[indexC] = scan.next();
                    indexC++; // Sumamos 1 para lo mismo que con los usuarios
                    System.out.println("Usuario registrado con exito");
                } catch (IndexOutOfBoundsException e){
                    System.out.println("Ya no se pueden almacenar mas usuarios");
                }
            }

            if (opcion == 3){ // El ultimo if para cuando el usuario seleccioe Darse de baja
                System.out.print("Por favor, introduzca su usario para darse de baja: ");
                intentoUsuario = scan.next();
                System.out.print("Por su seguridad introduzca su contraseña: ");
                intentoContrasenia = scan.next();

                if (intentoUsuario.equals(usuario[0]) && intentoContrasenia.equals(contrasenia[0])){ // Hacemos lo mismo que con la opcion Iniciar Sesion para que cada usuario esté unido a su contraseña

                    usuario[0] = "";
                    contrasenia[0] = "";
                    System.out.println(" ");
                    System.out.println("Usuario borrado con exito"); // Mostramos por pantalla un mensaje que indique que se borrado el usuario

                }else if (intentoUsuario.equals(usuario[1]) && intentoContrasenia.equals(contrasenia[1])){

                    usuario[1] = "";
                    contrasenia[1] = "";
                    System.out.println(" ");
                    System.out.println("Usuario borrado con exito");


                }else if (intentoUsuario.equals(usuario[2]) && intentoContrasenia.equals(contrasenia[2])){

                    usuario[2] = "";
                    contrasenia[2] = "";
                    System.out.println(" ");
                    System.out.println("Usuario borrado con exito");


                }else if (intentoUsuario.equals(usuario[3]) && intentoContrasenia.equals(contrasenia[3])){

                    usuario[3] = "";
                    contrasenia[3] = "";
                    System.out.println(" ");
                    System.out.println("Usuario borrado con exito");


                }else if (intentoUsuario.equals(usuario[4]) && intentoContrasenia.equals(contrasenia[4])){

                    usuario[4] = "";
                    contrasenia[4] = "";
                    System.out.println(" ");
                    System.out.println("Usuario borrado con exito");


                } else if (intentoUsuario.equals(usuario[5]) && intentoContrasenia.equals(contrasenia[5])){

                    usuario[5] = "";
                    contrasenia[5] = "";
                    System.out.println(" ");
                    System.out.println("Usuario borrado con exito");


                } else if (intentoUsuario.equals(usuario[6]) && intentoContrasenia.equals(contrasenia[6])) {

                    usuario[6] = "";
                    contrasenia[6] = "";
                    System.out.println(" ");
                    System.out.println("Usuario borrado con exito");


                } else if (intentoUsuario.equals(usuario[7]) && intentoContrasenia.equals(contrasenia[7])) {

                    usuario[7] = "";
                    contrasenia[7] = "";
                    System.out.println(" ");
                    System.out.println("Usuario borrado con exito");


                } else if (intentoUsuario.equals(usuario[8]) && intentoContrasenia.equals(contrasenia[8])) {

                    usuario[8] = "";
                    contrasenia[8] = "";
                    System.out.println(" ");
                    System.out.println("Usuario borrado con exito");


                } else if (intentoUsuario.equals(usuario[9]) && intentoContrasenia.equals(contrasenia[9])) {

                    usuario[9] = "";
                    contrasenia[9] = "";
                    System.out.println(" ");
                    System.out.println("Usuario borrado con exito");

                }else {
                    System.out.println(" ");
                    System.out.println("Credenciales incorrectas, borrado cancelado");
                    System.out.println("Volviendo a la pantalla de inicio");
                }


            }

        } while (opcion != 4);
        System.out.println("Has salido del programa");


    }

}
