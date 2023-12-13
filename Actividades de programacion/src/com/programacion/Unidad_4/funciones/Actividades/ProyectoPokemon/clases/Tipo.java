package com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.clases;

import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.utils.Pokedex;

import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.clases.Ataque;


public class Tipo {

    //***************************************************************
    //*********************ATRIBUTOS DE CLASE************************
    //***************************************************************
    public String nombre;

    //***************************************************************
    //*********************CONSTRUCTORES DE CLASE********************
    //***************************************************************
    public Tipo(String nombre) {

        // Establece el nombre del ataque
        // -> No hay restricciones
        // Si el tipo de ataque existe...


        if (Pokedex.checkTipoExiste(nombre)) {

            this.nombre = nombre;

        } else {

            this.nombre = null;

        }

    }
}
