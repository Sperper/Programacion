package com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.utils;

import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.clases.Tipo;

public class Pokedex {

    private String[] tiposAceptados = {"Acero", "Agua", "Bicho", "Dragon", "Electrico", "Fantasma",
        "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psiquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador"};

    //**************************************************************************
    //**************************CONSTRUCTORES DE CLASE**************************
    //**************************************************************************

    //**************************************************************************
    //**************************METODOS DE CLASE********************************
    //**************************************************************************

    /**
     * Metodo que comprueba la validez de un tipo
     * @param nombre nombre del tipo que se intenta comprobar
     * @return true si existe y false si no existe
     */
    public static boolean checkTipoExiste(String nombre) {

        // Comprueba si el tipo existe dentro del array de tiposAceptados
        return false;

    }


    /**
     *
     * @param tipoataque tipo del ataque
     * @param tipoRecibeAtaque tipo que recibe el ataque
     * @return (double) modificador del danio del ataque (1.5 muy efectivo, 1 normal, 0.5 poco efectivo, 0 inmune)
     */
    public static double checkEfectividad(Tipo tipoataque, Tipo tipoRecibeAtaque) {

        // Comprueba la efectividad del ataque entre dos tipos
        // Devuelve un modificador de danio (1.5, 1, 0.5, 0)

        return 0.0;

    }


}

