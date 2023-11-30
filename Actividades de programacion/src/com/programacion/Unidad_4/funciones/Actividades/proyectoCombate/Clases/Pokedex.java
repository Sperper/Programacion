package com.programacion.Unidad_4.funciones.Actividades.proyectoCombate.Clases;

import java.util.Scanner;

public class Pokedex {

    public static void main(String[] args) {

    }

// Atributos de clase

        /**
         * Crear un array de Strings llamado pokemons, que devuelva un boolean.
         * Clase checkPokemon que le des un strinh y devuelva un boolean
         * CheckEfectividad(tipo1 String, tipo2 String), que devuelva un double
         * y multiplicar por 1.5 si es muy efectivo, por 1 si es normal y por 0.5 si es poco efectivo.
         *
         * Otro que se llame Main
         */

    private static String[] pokemons = {"Pikachu", "Charmander", "Exeggutor", "Sandslash", "Vaporeon"};

    // METODOS DE CLASE

    // Metodo checkPokemon

    public static boolean checkPokemon(String pokemon){

        boolean pokemonEncontrado = false;

        for (int i = 0; i<=pokemons.length-1; i++){
            if (pokemon.equals(pokemons[i])) {
                pokemonEncontrado = true;
                break;
            }
        }
        if (pokemonEncontrado) {
            return true;
        } else {
            return false;
        }


    }

    public static double checkEfectividad(String tipoA, String tipoR){

        double Efectividad = 0;

        if (tipoA.equals("fuego")){

            if (tipoR.equals("planta")) {
                Efectividad = 1.5;
            } else if (tipoR.equals("agua")) {
                Efectividad = 0.5;
            } else {
                Efectividad = 1;
            }

        }
        if (tipoA.equals("planta")){

            if (tipoR.equals("agua")){
                Efectividad = 1.5;
            } else if (tipoR.equals("fuego")){
                Efectividad = 0.5;
            } else {
                Efectividad = 1;
            }

        }
        if (tipoA.equals("rayo")){
            if (tipoR.equals("agua")){
                Efectividad = 1.5;
            } else if (tipoR.equals("tierra")){
                Efectividad = 0.5;
            } else {
                Efectividad = 1;
            }
        }
        if (tipoA.equals("agua")){
            if (tipoR.equals("fuego") || tipoR.equals("tierra")) {
                Efectividad = 1.5;
            } else if (tipoR.equals("rayo") || tipoR.equals("planta")){
                Efectividad = 0.5;
            } else {
                Efectividad = 1;
            }
        }
        if (tipoA.equals("tierra")){
            if (tipoR.equals("rayo") || tipoR.equals("fuego")) {
                Efectividad = 1.5;
            } else if (tipoR.equals("agua")) {
                Efectividad = 0.5;
            } else {
                Efectividad = 1;
            }
        }
        return Efectividad;
    }

}
