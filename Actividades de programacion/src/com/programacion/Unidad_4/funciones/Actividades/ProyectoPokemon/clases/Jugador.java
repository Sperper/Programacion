package com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.Clases;

public class Jugador {

    public String usuario;

    public Pokemon[] equipo = new Pokemon[3];

    /**
     * Metodo constructor para definir el usuario del jugador
     * @param usuario usuario que recibe el metodo
     */
    public Jugador (String usuario) {

        this.usuario = usuario;

    }

    /**
     * Metodo para comprobar si el pokemon ya esta elegido
     * @param pokemon pokemon que se va a comprobar
     * @return true --> si el pokemon está elegido --  false --> si el pokemon no está elegido
     */

    public static boolean comprobarPokemonEquipo(Pokemon pokemon, Pokemon[] equipo) {

        boolean pokemonEstaElegido = false;

        for (int i = 0; i <= equipo.length -1; i ++) {

             if (equipo[i] == pokemon) {
                pokemonEstaElegido = true;
                break;
            }
        }


        return pokemonEstaElegido;


    }




}
