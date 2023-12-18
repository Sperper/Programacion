package com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.Clases;

import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.utils.Pokedex;

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

    public boolean comprobarPokemonEquipo(Pokemon pokemon, int contador, int contadorElegido) {

        boolean pokemonEstaElegido = false;

        for (int i = 0; i <= this.equipo.length -1; i ++) {

            if (this.equipo[i] == pokemon) {

                pokemonEstaElegido = true;
                contadorElegido --;
                contador --;
                break;

            }

        }

        if (pokemonEstaElegido) {

            System.out.println("Este pokemon ya ha sido seleccionado por el otro jugador");

        } else {

            System.out.println(pokemon.nombre + " se ha unido a tu equipo");

        }

        return pokemonEstaElegido;


    }




}
