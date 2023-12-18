package com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.utils;

import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.Clases.Tipo;

public class Pokedex {

    private static String[] tiposAceptados = {"Acero", "Agua", "Bicho", "Dragon", "Electrico", "Fantasma",
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
        boolean tipoExiste = false;

        for (int i = 0; i <= tiposAceptados.length - 1; i++) {
            if (nombre.equalsIgnoreCase(tiposAceptados[i])) {

                tipoExiste = true;
                break;

            }


        }

        return tipoExiste;

    }


    /**
     * @param tipoAtaque tipo del ataque
     * @return (double) modificador del danio del ataque (1.5 muy efectivo, 1 normal, 0.5 poco efectivo, 0 inmune)
     */
    public static double checkEfectividad(Tipo tipoAtaque, Tipo tipoRecibeAtaque) {

        // Comprueba la efectividad del ataque entre dos tipos
        // Devuelve un modificador de danio (1.5, 1, 0.5, 0)

        double efectividad = 0.0;

        if (tipoAtaque.nombre.equalsIgnoreCase("acero")){

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("hielo") || tipoRecibeAtaque.nombre.equalsIgnoreCase("roca") || tipoRecibeAtaque.nombre.equalsIgnoreCase("hada")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("agua") || tipoRecibeAtaque.nombre.equalsIgnoreCase("electrico") || tipoRecibeAtaque.nombre.equalsIgnoreCase("fuego") || tipoRecibeAtaque.nombre.equalsIgnoreCase("acero")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else  if (tipoAtaque.nombre.equalsIgnoreCase("volador")){

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("planta") || tipoRecibeAtaque.nombre.equalsIgnoreCase("bicho") || tipoRecibeAtaque.nombre.equalsIgnoreCase("lucha")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("electrico") || tipoRecibeAtaque.nombre.equalsIgnoreCase("roca") || tipoRecibeAtaque.nombre.equalsIgnoreCase("acero")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else  if (tipoAtaque.nombre.equalsIgnoreCase("agua")){

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("fuego") || tipoRecibeAtaque.nombre.equalsIgnoreCase("roca") || tipoRecibeAtaque.nombre.equalsIgnoreCase("tierra")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("agua") || tipoRecibeAtaque.nombre.equalsIgnoreCase("planta") || tipoRecibeAtaque.nombre.equalsIgnoreCase("dragon")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoAtaque.nombre.equalsIgnoreCase("hielo")){

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("volador") || tipoRecibeAtaque.nombre.equalsIgnoreCase("planta") || tipoRecibeAtaque.nombre.equalsIgnoreCase("tierra") || tipoRecibeAtaque.nombre.equalsIgnoreCase("dragon")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("hielo") || tipoRecibeAtaque.nombre.equalsIgnoreCase("agua") || tipoRecibeAtaque.nombre.equalsIgnoreCase("fuego") || tipoRecibeAtaque.nombre.equalsIgnoreCase("acero")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else  if (tipoAtaque.nombre.equalsIgnoreCase("planta")){

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("agua") || tipoRecibeAtaque.nombre.equalsIgnoreCase("roca") || tipoRecibeAtaque.nombre.equalsIgnoreCase("tierra")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("volador") || tipoRecibeAtaque.nombre.equalsIgnoreCase("planta") || tipoRecibeAtaque.nombre.equalsIgnoreCase("bicho") || tipoRecibeAtaque.nombre.equalsIgnoreCase("fuego") || tipoRecibeAtaque.nombre.equalsIgnoreCase("veneno") || tipoRecibeAtaque.nombre.equalsIgnoreCase("dragon") || tipoRecibeAtaque.nombre.equalsIgnoreCase("acero")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else  if (tipoAtaque.nombre.equalsIgnoreCase("bicho")){

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("planta") || tipoRecibeAtaque.nombre.equalsIgnoreCase("psiquico") || tipoRecibeAtaque.nombre.equalsIgnoreCase("siniestro")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("volador") || tipoRecibeAtaque.nombre.equalsIgnoreCase("lucha") || tipoRecibeAtaque.nombre.equalsIgnoreCase("fuego") || tipoRecibeAtaque.nombre.equalsIgnoreCase("acero") || tipoRecibeAtaque.nombre.equalsIgnoreCase("hada") || tipoRecibeAtaque.nombre.equalsIgnoreCase("veneno") || tipoRecibeAtaque.nombre.equalsIgnoreCase("fantasma")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else  if (tipoAtaque.nombre.equalsIgnoreCase("electrico")){

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("volador") || tipoRecibeAtaque.nombre.equalsIgnoreCase("agua")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("planta") || tipoRecibeAtaque.nombre.equalsIgnoreCase("electrico") || tipoRecibeAtaque.nombre.equalsIgnoreCase("dragon")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("tierra")){

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoAtaque.nombre.equalsIgnoreCase("normal")) {

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("roca") || tipoRecibeAtaque.nombre.equalsIgnoreCase("dragon")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("fantasma")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoAtaque.nombre.equalsIgnoreCase("roca")) {

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("volador") || tipoRecibeAtaque.nombre.equalsIgnoreCase("hielo") || tipoRecibeAtaque.nombre.equalsIgnoreCase("bicho") || tipoRecibeAtaque.nombre.equalsIgnoreCase("fuego")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("tierra") || tipoRecibeAtaque.nombre.equalsIgnoreCase("lucha") || tipoRecibeAtaque.nombre.equalsIgnoreCase("acero")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoAtaque.nombre.equalsIgnoreCase("tierra")) {

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("electrico") || tipoRecibeAtaque.nombre.equalsIgnoreCase("roca") || tipoRecibeAtaque.nombre.equalsIgnoreCase("fuego") || tipoRecibeAtaque.nombre.equalsIgnoreCase("veneno") || tipoRecibeAtaque.nombre.equalsIgnoreCase("acero")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("planta") || tipoRecibeAtaque.nombre.equalsIgnoreCase("bicho")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("volador")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoAtaque.nombre.equalsIgnoreCase("fuego")) {

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("hielo") || tipoRecibeAtaque.nombre.equalsIgnoreCase("planta") || tipoRecibeAtaque.nombre.equalsIgnoreCase("bicho") || tipoRecibeAtaque.nombre.equalsIgnoreCase("acero")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("agua") || tipoRecibeAtaque.nombre.equalsIgnoreCase("roca") || tipoRecibeAtaque.nombre.equalsIgnoreCase("fuego") || tipoRecibeAtaque.nombre.equalsIgnoreCase("dragon")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoAtaque.nombre.equalsIgnoreCase("lucha")) {

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("roca") || tipoRecibeAtaque.nombre.equalsIgnoreCase("normal") || tipoRecibeAtaque.nombre.equalsIgnoreCase("hielo") || tipoRecibeAtaque.nombre.equalsIgnoreCase("siniestro") || tipoRecibeAtaque.nombre.equalsIgnoreCase("acero")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("volador") || tipoRecibeAtaque.nombre.equalsIgnoreCase("psiquico") || tipoRecibeAtaque.nombre.equalsIgnoreCase("bicho") || tipoRecibeAtaque.nombre.equalsIgnoreCase("hada") || tipoRecibeAtaque.nombre.equalsIgnoreCase("veneno")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("fantasma")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoAtaque.nombre.equalsIgnoreCase("hada")) {

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("lucha") || tipoRecibeAtaque.nombre.equalsIgnoreCase("dragon") || tipoRecibeAtaque.nombre.equalsIgnoreCase("siniestro")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("fuego") || tipoRecibeAtaque.nombre.equalsIgnoreCase("veneno") || tipoRecibeAtaque.nombre.equalsIgnoreCase("acero")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("tierra")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoAtaque.nombre.equalsIgnoreCase("psiquico")) {

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("lucha") || tipoRecibeAtaque.nombre.equalsIgnoreCase("veneno")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("acero") || tipoRecibeAtaque.nombre.equalsIgnoreCase("psiquico")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("siniestro")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoAtaque.nombre.equalsIgnoreCase("veneno")) {

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("planta") || tipoRecibeAtaque.nombre.equalsIgnoreCase("hada")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("roca") || tipoRecibeAtaque.nombre.equalsIgnoreCase("tierra") || tipoRecibeAtaque.nombre.equalsIgnoreCase("veneno") || tipoRecibeAtaque.nombre.equalsIgnoreCase("fantasma")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("acero")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoAtaque.nombre.equalsIgnoreCase("dragon")) {

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("dragon")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("acero")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            }else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("hada")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoAtaque.nombre.equalsIgnoreCase("fantasma")) {

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("psiquico") || tipoRecibeAtaque.nombre.equalsIgnoreCase("fantasma")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("siniestro")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("normal")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoAtaque.nombre.equalsIgnoreCase("siniestro")) {

            if (tipoRecibeAtaque.nombre.equalsIgnoreCase("psiquico") || tipoRecibeAtaque.nombre.equalsIgnoreCase("fantasma")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.nombre.equalsIgnoreCase("lucha") || tipoRecibeAtaque.nombre.equalsIgnoreCase("hada") || tipoRecibeAtaque.nombre.equalsIgnoreCase("siniestro")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        }

        return efectividad;

    }

}
