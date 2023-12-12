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

            System.out.println("Revisando si el tipo introducido existe...");
            System.out.println("El tipo existe");
            this.nombre = nombre;

        } else {

            System.out.println("Revisando si el tipo introducido existe...");
            System.out.println("No existe");

        }

    }
}
