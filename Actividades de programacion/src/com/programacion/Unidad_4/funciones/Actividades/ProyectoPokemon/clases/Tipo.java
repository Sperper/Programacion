package com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.Clases;


import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.utils.Pokedex;


public class Tipo {

    //***************************************************************
    //*********************ATRIBUTOS DE CLASE************************
    //***************************************************************
    public String nombre;

    //***************************************************************
    //*********************CONSTRUCTORES DE CLASE********************
    //***************************************************************

    /**
     * Metodo constructor para los tipos
     * @param nombre del tipo
     */
    public Tipo(String nombre) {

        // Establece el nombre del ataque
        // -> No hay restricciones
        // Si el tipo de ataque existe...


        if (Pokedex.checkTipoExiste(nombre)) { // if que llama al metodo checkTipoExiste de la clase Pokedex para comprobar si existe el tipo

            this.nombre = nombre;

        } else {

            this.nombre = null;

        }

    }

}
