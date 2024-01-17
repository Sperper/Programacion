package com.programacion.Unidad_5.proyectoPeliculas;

import com.programacion.Unidad_5.proyectoPeliculas.clases.Pelicula;
import com.programacion.Unidad_5.proyectoPeliculas.utils.JsonReaderUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
        String pelisPath = "IMDB-api/Top250Movies.json";
        ArrayList<Pelicula> peliculas = JsonReaderUtil.loadJsonFile(pelisPath);
        // Hacemos varios souts para imprimir por pantalla las opciones
        System.out.println("¿Que desea hacer?");
        System.out.println("1. Imprimir las peliculas de mayor a menor nota");
        System.out.println("2. Imprimir las peliculas de menor a mayor nota");
        System.out.println("3. Imprimir las peliculas cuyo año de publicacion sea del 2000 hasta la actualidad");
        System.out.println("4. Imprimir las peliculas cuyo año de publicacion sea del 2000 hasta la actualidad " +
                "que tengan una nota por encima de 8.8 (incluído)");
        System.out.println("5. Imprimir las peliculas desde el año 2000 hasta la actualidad con nota a su eleccion");
        System.out.println("6. Imprimir por pantalla una pelicula");
        System.out.println("7. Imprimir por pantalla las peliculas de un director");
        // Objeto Scanner para que se puede introducir un valor por teclado
        Scanner scan = new Scanner(System.in);
        int opc = scan.nextInt(); // Variable opc que permitirá introducir el número de la opcion por teclado
        if (opc == 1) { // si opc=1 imprime las peliculas de mayor a menor nota
            for (int i = 0; i < peliculas.size(); i++) { // Se recorre el ArrayList
                System.out.println(peliculas.get(i).getFullTitle() + " NOTA: " + peliculas.get(i).getImDbRating()); // Se muestra por pantalla todas las peliculas (En este caso la lista está ordenada)
            }
        } else if (opc == 2) { // si opc=2 imprime las peliculas de menor a mayor nota
            for (int i = peliculas.size()-1; i >= 0; i--) {
                System.out.println(peliculas.get(i).getFullTitle() + " NOTA: "+peliculas.get(i).getImDbRating());
            }
        } else if (opc == 3) {
            for (int i=0; i<peliculas.size(); i++) {
                if (Integer.parseInt(peliculas.get(i).getYear()) >= 2000) {
                    System.out.println(peliculas.get(i).getFullTitle());
                }
            }
        } else if (opc == 4) { // si opc=4 imprime las peliculas ocn valoración por encima de 8.8 y del años 2000 hasta la actualidad
            for (int i=0; i<peliculas.size(); i++) {
                if (Integer.parseInt(peliculas.get(i).getYear()) >= 2000 && Double.parseDouble(peliculas.get(i).getImDbRating()) >= 8.8) {
                    System.out.println(peliculas.get(i).getFullTitle());
                }
            }
        } else if (opc == 5) { // si opc=5 imprime las peliculas desde el año 2000 hasta la actualidad con valoración indicada por teclado
            System.out.println("¿Cuanta valoración tiene las peliculas que desea buscar?");
            ArrayList<Pelicula> peliculasConVal = new ArrayList<Pelicula>();
            double valoracionE = scan.nextDouble();
            boolean peliculaExiste = false;
            for (int i=0; i<peliculas.size(); i++) {
                if (Integer.parseInt(peliculas.get(i).getYear()) >= 2000 && Double.parseDouble(peliculas.get(i).getImDbRating()) == valoracionE) {
                    peliculasConVal.add(peliculas.get(i));
                    peliculaExiste = true;
                }
            }
            if (peliculaExiste) {
                for (int i=0; i<peliculasConVal.size(); i++) {
                    System.out.println(peliculasConVal.get(i).getTitle());
                }
            } else {
                System.out.println("No existen peliculas con esa valoración");
            }
        } else if (opc == 6) {
            System.out.println("Indique que pelicula desea ver");
            String nombrePelicula = scan.next();
            boolean peliculaExiste = false;
            for (int i=0; i<peliculas.size(); i++) {
                if (peliculas.get(i).getTitle().contains(nombrePelicula)) {
                    System.out.println("TITULO: "+peliculas.get(i).getFullTitle());
                    System.out.println("NOTA: "+peliculas.get(i).getImDbRating());
                    System.out.println("REPARTO: "+peliculas.get(i).getCrew());
                    System.out.println("POSICION: "+peliculas.get(i).getRank());
                    peliculaExiste=true;
                }
            }
            if (peliculaExiste) {
                System.out.println("La pelicula no existe");
            }
        } else if (opc == 7) {
            System.out.println("Escriba un director");

        }

    }

}

