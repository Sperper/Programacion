package com.programacion.Unidad_7.proyectoUser.services.impl;

import com.programacion.Unidad_7.proyectoAirbnb.services.GestionFicheroAirbnb;
import com.programacion.Unidad_7.proyectoUser.model.User;
import com.programacion.Unidad_7.proyectoUser.services.api.BasicServiceUser;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class ServiceUser implements BasicServiceUser{

    // ATRIBUTOS
    ArrayList<User> users; // Contiene todos los registros del fichero users.txt
    GestionFicheroUser gestion; // gestion es un objeto para poder llamar a los métodos de GestionFicheroUser


    public ServiceUser(){
        this.users = new ArrayList<>();
        this.users = gestion.leerFicherUser("src/resources/archivosTema7/users/users.txt");
        this.gestion = new GestionFicheroUser();
    }

    @Override
    public boolean altaUsuario() {

        Scanner scan = new Scanner(System.in);
        String usuario = "";
        String passwordUsuario = "";

        System.out.println("Introduzca el nombre de usuario");
        usuario = scan.nextLine();

        // Comprobamos en el fichero si el idUser existe
        if (!userExists(usuario)) {

            System.out.println("Introduzca su password: ");
            passwordUsuario = scan.nextLine();

            if (!checkUser(usuario, passwordUsuario)) {
                String id = UUID.randomUUID().toString();
                User u = new User(id, usuario, passwordUsuario, false);
                System.out.println("Bienvenid@ "+usuario);
                gestion.anadirRegistroFichero("src/resources/archivosTema7/users/users.txt", u);

                return true;
            } else {
                System.out.println("El usuario ya existe en el sistema");
                return false;
            }

        } else {
            System.out.println("El usuario ya existe en el sistema");
            return false;
        }
    }

    @Override
    public boolean loginUsuario() {

        Scanner scan = new Scanner(System.in);
        String idUsuario = "";
        String passwordUsuario = "";

        System.out.println("Introduzca su idUsuario");
        idUsuario = scan.nextLine();

        // Comprobamos en el fichero si el idUser existe
        if (userExists(idUsuario)) {

            System.out.println("Introduzca su password: ");
            passwordUsuario = scan.nextLine();

            if (checkUser(idUsuario, passwordUsuario)) {

                System.out.println("Bienvenid@ "+idUsuario);
                return true;
            } else {
                System.out.println("Credenciales incorrectas");
                return false;
            }

        } else {
            System.out.println("El usuario no existe en el sistema");
            return false;
        }
    }

    @Override
    public boolean checkUser(String idUser, String password) {

        // 1º manera de hacerlo
        /*
        for (int i=0; i<this.users.size(); i++) {
            User usuario = this.users.get(i); // usuario es el elemento de la posicion i de users
            if (usuario.getId().equalsIgnoreCase(idUser) && usuario.getPass().equals(password)) {
                return true;
            }
        }
         */

        // 2º manera de hacerlo
        for (User usuario : this.users) {
            if (usuario.getId().equalsIgnoreCase(idUser) && usuario.getPass().equals(password)){
                return true;
            }
        }

        // 3º manera de hacerlo
        /*
        this.users.stream()
                .filter(usuario -> usuario.getId().equalsIgnoreCase(idUser) && usuario.getPass().equals(password))
                .findFirst()
                .isEmpty();
         */


        return false;
    }

    @Override
    public boolean userExists(String idUser) {
        return false;
    }

    @Override
    public void leerFicheroUsers() {
        this.users=gestion.leerFicherUser("src/resources/archivosTema7/users/users.txt");
    }

    @Override
    public void anadirFicheroUsers(User u) {
        gestion.anadirRegistroFichero("src/resources/archivosTema7/users/users.txt", u);
    }

    @Override
    public void modificarFicheroUsers() {
        gestion.modificarFicheroUser(this.users, "src/resources/archivosTema7/users/users.txt");
    }
}
