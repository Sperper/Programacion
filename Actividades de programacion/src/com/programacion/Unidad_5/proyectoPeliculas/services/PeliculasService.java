package com.programacion.Unidad_5.proyectoPeliculas.services;

import com.programacion.Unidad_5.proyectoPeliculas.Main;
import com.programacion.Unidad_5.proyectoPeliculas.MainCreacion;
import com.programacion.Unidad_5.proyectoPeliculas.clases.Pelicula;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

public class PeliculasService {

    public static boolean addPelicula() {
        // Adicion de una pelicula nueva
        Scanner scan = new Scanner(System.in);

        System.out.print("Dime el nombre de la pelicula: ");
        String nombrePeli = scan.nextLine();

        int anio = 0;
        try {
            System.out.print("Dime el anio de publicación de la pelicula: ");
            anio = scan.nextInt();
            scan.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Anio erroneo...");
        }

        System.out.print("Dime el nombre del director/a: ");
        String dir = scan.nextLine();

        System.out.print("Dime el nombre del/a actor/actriz 1: ");
        String act1 = scan.nextLine();

        System.out.print("Dime el nombre del/a actor/actriz 2: ");
        String act2 = scan.nextLine();

        String id = UUID.randomUUID().toString();

        double nota = 0.0;
        try {
            System.out.print("Dime la nota de la pelicula: ");
            nota = scan.nextDouble();
            scan.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Nota erronea...");
        }

        Pelicula peliNueva = new Pelicula(id, nombrePeli, anio+"",
                dir, act1, act2, nota+"");



        boolean peliExiste = false;
        for(int i=0; i<MainCreacion.peliculas.size(); i++) {

            if(MainCreacion.peliculas.get(i).getId().equals(peliNueva.getId())) {
                System.out.println("Pelicula ya existente");
                peliExiste = true;
                break;
            }

        }

        if(!peliExiste){
            // Vamos a comprobar la posición en la que tenemos que meter la peli
            for (int i=0; i<MainCreacion.peliculas.size(); i++) {

                double notaPelinueva = Double.parseDouble(peliNueva.getImDbRating());
                double notaPeliLista = Double.parseDouble(MainCreacion.peliculas.get(i).getImDbRating());

                if (notaPelinueva > notaPeliLista) {
                    // Insertamos la peliNueva en la posición de la pelicula de la lista
                    peliNueva.setRank(MainCreacion.peliculas.get(i).getRank());
                    MainCreacion.peliculas.add(i, peliNueva);

                    for (int j=i+1; j<MainCreacion.peliculas.size();j++) {
                        int rankingAntiguo = Integer.parseInt(MainCreacion.peliculas.get(j).getRank());
                        int rankingNuevo = rankingAntiguo + 1;
                        MainCreacion.peliculas.get(j).setRank(rankingNuevo+"");
                    }

                    break;
                }

            }

            System.out.println("Pelicula correctamente anadida...");
            return true;
        }



        return false;
    }

    public static void mostrarPeliculasDesc(){

        for (int i=0; i<MainCreacion.peliculas.size(); i++){
            System.out.printf("---------%s---------------\n", MainCreacion.peliculas.get(i).getFullTitle());
            System.out.printf("- Titulo (año): %s\n", MainCreacion.peliculas.get(i).getFullTitle());
            System.out.printf("-\t- Nota: %s\n", MainCreacion.peliculas.get(i).getImDbRating());
            System.out.printf("-\t- Reparto: %s\n", MainCreacion.peliculas.get(i).getCrew());

        }

    }

    public static void eliminarPelicula(){

        System.out.println("""
                1. Eliminar pelicula por posicion
                2. Eliminar pelicula por nombre
                """);
        Scanner scan = new Scanner(System.in);

        try {
            int opc = scan.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Dime en que posicion esta la pelicula");
                    try {
                        int posicionUsuario = scan.nextInt();
                        for (int i=0; i<MainCreacion.peliculas.size(); i++) {

                            if (Integer.parseInt(MainCreacion.peliculas.get(i).getRank()) == posicionUsuario) {
                                MainCreacion.peliculas.remove(i);
                                System.out.println("Pelicula borrada con exito");
                                break;
                            }

                        }
                    }catch (InputMismatchException e) {
                        System.out.println("ERROR. DATO NO VALIDO");
                    }
                    break;
                case 2:
                    System.out.println("Dime cual es el nombre de la pelicula");
                    try {
                        String nombrePelicula = scan.nextLine();
                        nombrePelicula = scan.nextLine();
                        for (int i=0; i<MainCreacion.peliculas.size(); i++) {

                            if (MainCreacion.peliculas.get(i).getTitle().contains(nombrePelicula)) {
                                MainCreacion.peliculas.remove(i);
                                System.out.println("Pelicula borrada con exito");
                                break;
                            }

                        }
                    }catch (InputMismatchException e) {
                        System.out.println("ERROR. DATO NO VALIDO");
                    }

                    break;
            }

        }catch (Exception e) {
            System.out.println("Opcion incorrecta");
        }


    }

    public static void modificarPelicula(){
        System.out.println("Dime el nombre de la pelicula que desea modificar");
        Scanner scan = new Scanner(System.in);
        String nombrePelicula = scan.nextLine();
        nombrePelicula = scan.nextLine();
        for (int i=0; i<MainCreacion.peliculas.size(); i++) {
            if (MainCreacion.peliculas.get(i).getTitle().contains(nombrePelicula)) {
                System.out.println(MainCreacion.peliculas.get(i).getTitle());
                System.out.println(MainCreacion.peliculas.get(i).getYear());
                System.out.println(MainCreacion.peliculas.get(i).getImDbRating());
                System.out.println(MainCreacion.peliculas.get(i).getCrew());

                System.out.println("""
                        ¿Que desea modificar?
                        1. Titulo
                        2. Anio
                        3. Nota
                        4. Reparto
                        """);
                int opc = scan.nextInt();
                switch (opc) {
                    case 1:
                        System.out.print("Escriba el nuevo nombre de la pelicula: ");
                        String cambio = scan.nextLine();
                        cambio = scan.nextLine();
                        MainCreacion.peliculas.get(i).setTitle(cambio);
                        break;
                    case 2:
                        System.out.println("Escriba el nuevo anio de crecion de la pelicula");
                        cambio = scan.nextLine();
                        cambio = scan.nextLine();
                        MainCreacion.peliculas.get(i).setYear(cambio);
                        break;
                    case 3:
                        System.out.println("Escriba la nueva nota de la creacion de la pelicula");
                        cambio = scan.nextLine();
                        cambio = scan.nextLine();
                        MainCreacion.peliculas.get(i).setImDbRating(cambio);
                        break;
                    case 4:
                        System.out.println("Escriba el nuevo reparto de la pelicula");
                        System.out.print("Director: ");
                        String director = scan.nextLine();
                        director = scan.nextLine();
                        System.out.print("Actor 1: ");
                        String act1 = scan.nextLine();
                        act1 = scan.nextLine();
                        System.out.print("Actor 2: ");
                        String act2 = scan.nextLine();
                        act2 = scan.nextLine();
                        MainCreacion.peliculas.get(i).setCrew(director, act1, act2);
                        break;
                }


                break;
            }
        }
    }



}
