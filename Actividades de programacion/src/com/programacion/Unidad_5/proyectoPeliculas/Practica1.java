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

        switch (opc) { // switch para que se realize una accion dependiendo de la opcion que se ha elegido

            case 1: // si opc=1 imprime las peliculas de mayor a menor nota
                for (int i=0; i<peliculas.size(); i++) { // Se recorre el ArrayList
                    System.out.println(peliculas.get(i).getFullTitle()+" NOTA: "+peliculas.get(i).getImDbRating()); // Se muestra por pantalla todas las peliculas (En este caso la lista está ordenada)
                }
            case 2: // si opc=2 imprime las peliculas de menor a mayor nota
                for (int i=peliculas.size()-1; i>= 0; i--) { // for un poco modificado para que empiece por el ultimo valor en vez de por el primero
                    System.out.println(peliculas.get(i).getFullTitle()+" NOTA: "+peliculas.get(i).getImDbRating()); // Muestra por pantalla als peliculas junto con su nota
                }
            case 3: // si opc=3 imprime por pantalla las peliculas ccuyo año de publicacion sea del 2000 hasta la actualidad
                for (int i=0; i<peliculas.size(); i++) {
                    if (Integer.parseInt(peliculas.get(i).getYear()) >= 2000) {
                        System.out.println(peliculas.get(i).getFullTitle());
                    }
                }






        }

    }

}
