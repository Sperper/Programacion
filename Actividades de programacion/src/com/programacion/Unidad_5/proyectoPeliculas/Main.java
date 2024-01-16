package com.programacion.Unidad_5.proyectoPeliculas;

import com.programacion.Unidad_5.EjerciciosRepaso.proyectoPersona.Persona;
import com.programacion.Unidad_5.proyectoPeliculas.clases.Pelicula;
import com.programacion.Unidad_5.proyectoPeliculas.utils.JsonReaderUtil;

import java.util.ArrayList;
import java.util.Formattable;

public class Main {

    public static void main(String[] args) {

        String pelisPath = "IMDB-api/Top250Movies.json";
        ArrayList<Pelicula> peliculas = JsonReaderUtil.loadJsonFile(pelisPath);
    /**
        // Buscar las peliculas de antes de los 2000
        // 1º un for para recorrer la lista de pelicula
        for(int i=0; i<peliculas.size(); i++) {
            // Ahora tengo que hacer una condicion para comprobar el anio
            if (Integer.parseInt(peliculas.get(i).getYear()) < 2000) {
                System.out.println("La pelicula "+peliculas.get(i).getFullTitle()+" es de antes de los 2000");
            }
        }

        System.out.println(" ");

        // Buscar las peliculas que tengan de nota menos que 8.5
        for (int i=0; i< peliculas.size(); i++){
            if (Double.parseDouble(peliculas.get(i).getImDbRating()) < 8.5) {
                System.out.println("La pelicula "+peliculas.get(i).getFullTitle()+" tiene menos de 8.5");
            }
        }
        System.out.println(" ");
        // Buscar las pelicula mas antigua de la lista
        // Voy a recorrer la lista de peliculas comparando la fecha


        Pelicula peliMasAntigua = peliculas.get(0);
        for(int i=0; i< peliculas.size(); i++){
            int anioPeli = Integer.parseInt(peliculas.get(i).getYear());
            if(anioPeli < Integer.parseInt(peliMasAntigua.getYear())) {
                peliMasAntigua = peliculas.get(i);
            }
        }
        System.out.println("La pelicula mas antigua es "+peliMasAntigua.getFullTitle());
        System.out.println(" ");


        // Pelicula mas moderna de la lista
        Pelicula peliMasModerna = peliculas.get(0);
        for (int i=0; i< peliculas.size(); i++){
            if (Integer.parseInt(peliculas.get(i).getYear()) > Integer.parseInt(peliMasModerna.getYear())) {
                peliMasModerna = peliculas.get(i);
            }
        }
        System.out.println("La pelicula mas moderna es "+peliMasModerna.getFullTitle());
        System.out.println(" ");

        // Buscar las peliculas protagonizadas por Emma Stone
        ArrayList<Pelicula> peliculasEmma = new ArrayList<Pelicula>();
        for (int i=0; i< peliculas.size(); i++){
            if (peliculas.get(i).getCrew().contains("Emma Stone")) {
                peliculasEmma.add(peliculas.get(i));
            }
        }

        System.out.println("PELICULAS PROTAGONIZADAS POR EMMA STONE");
        for (int i=0; i< peliculas.size(); i++){
            System.out.println("\t- "+peliculasEmma.get(i).getFullTitle());
        }

    */































        /**
            // En este punto, debereiamos tener un ArrayList de 250 peliculas
            for (int i=0; i<peliculas.size(); i++) {
                System.out.println(peliculas.get(i).getTitle());
            }

            // Mostrar las 10 mejores peliculas segun IMDB
            ArrayList<Pelicula> best10Movies = new ArrayList<Pelicula>();

            //
            double mayorNota = 0.0;
            for (int i=0; i< peliculas.size(); i++) {
                if (mayorNota <= Double.parseDouble(peliculas.get(i).getImDbRating())) {
                    mayorNota = Double.parseDouble(peliculas.get(i).getImDbRating());
                }
            }

            System.out.println("La nota mayor de todas las peliculas es: "+mayorNota);

            // Voy a comprobar las peliculas que tengan esa nota para incluirlas en el ArrayList best10Movies
            // Cuando compruebe esa nota, resto 0.1 y vuelvo a comprobar las pelis que tengan esa nota
            // Hasta que la nota sea 0.0 o el ArrayList tenga 10 elementos

            // Lo que hemos hecho es ordenar de menor a mayor la lista de peliculas
            for (int i=0; i<peliculas.size(); i++) {
                for (int j=0; j<peliculas.size()-i-1; j++){
                    if (Double.parseDouble(peliculas.get(j+i).getImDbRating())
                            < Double.parseDouble(peliculas.get(j).getImDbRating())) {
                        Pelicula peli = peliculas.get(j+i);
                        peliculas.set(j+i, peliculas.get(j));
                        peliculas.set(j, peli);
                    }
                }
            }
        */







    }




}
