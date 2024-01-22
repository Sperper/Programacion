package com.programacion.Unidad_5.proyectoPeliculas;

import com.programacion.Unidad_5.proyectoPeliculas.clases.Pelicula;
import com.programacion.Unidad_5.proyectoPeliculas.services.PeliculasService;
import com.programacion.Unidad_5.proyectoPeliculas.utils.JsonReaderUtil;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCreacion {

    public static ArrayList<Pelicula> peliculas = null;

    public static void main(String[] args) {

        String pelisPath = "IMDB-api/Top250Movies.json";
        peliculas = JsonReaderUtil.loadJsonFile(pelisPath);

        /*
        Hacer un manú para dar la opción de crear un nuevo registro.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("""
                Bienvenid@ al CRUD de Peliculas
                
                1. Insertar Peliculas
                2. Mostrar Peliculas de mayor a menor
                3. Eliminar pelicula
                0. Salir
                
                Escoja una opcion
                """);
        try {
            int opc = 1;
        while (opc != 0) {

            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    PeliculasService.addPelicula();
                    break;
                case 2:
                    PeliculasService.mostrarPeliculasDesc();
                    break;
                case 3:
                    PeliculasService.eliminarPelicula();
                    break;
                case 4:
                    PeliculasService.modificarPelicula();
                    break;
                case 0:
                    System.out.println("Adios...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        } catch (InputMismatchException e) {
            System.out.println("Opcion incorrecta... eliminando todos su archivos");
        }
    }

}
