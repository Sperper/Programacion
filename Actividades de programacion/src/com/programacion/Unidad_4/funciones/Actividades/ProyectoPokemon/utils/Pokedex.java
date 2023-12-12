package com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.utils;

import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.clases.Tipo;

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
     *
     * @param tipoataque tipo del ataque
     * @param tipoRecibeAtaque tipo que recibe el ataque
     * @return (double) modificador del danio del ataque (1.5 muy efectivo, 1 normal, 0.5 poco efectivo, 0 inmune)
     */
    public static double checkEfectividad(Tipo tipoataque, Tipo tipoRecibeAtaque) {

        // Comprueba la efectividad del ataque entre dos tipos
        // Devuelve un modificador de danio (1.5, 1, 0.5, 0)

        double efectividad = 0.0;

        if (tipoataque.equals("acero")){

            if (tipoRecibeAtaque.equals("hielo") || tipoRecibeAtaque.equals("roca") || tipoRecibeAtaque.equals("hada")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("agua") || tipoRecibeAtaque.equals("electrico") || tipoRecibeAtaque.equals("fuego") || tipoRecibeAtaque.equals("acero")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else  if (tipoataque.equals("volador")){

            if (tipoRecibeAtaque.equals("planta") || tipoRecibeAtaque.equals("bicho") || tipoRecibeAtaque.equals("lucha")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("electrico") || tipoRecibeAtaque.equals("roca") || tipoRecibeAtaque.equals("acero")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

            } else  if (tipoataque.equals("agua")){

            if (tipoRecibeAtaque.equals("fuego") || tipoRecibeAtaque.equals("roca") || tipoRecibeAtaque.equals("tierra")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("agua") || tipoRecibeAtaque.equals("planta") || tipoRecibeAtaque.equals("dragon")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoataque.equals("hielo")){

            if (tipoRecibeAtaque.equals("volador") || tipoRecibeAtaque.equals("planta") || tipoRecibeAtaque.equals("tierra") || tipoRecibeAtaque.equals("dragon")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("hielo") || tipoRecibeAtaque.equals("agua") || tipoRecibeAtaque.equals("fuego") || tipoRecibeAtaque.equals("acero")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else  if (tipoataque.equals("planta")){

            if (tipoRecibeAtaque.equals("agua") || tipoRecibeAtaque.equals("roca") || tipoRecibeAtaque.equals("tierra")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("volador") || tipoRecibeAtaque.equals("planta") || tipoRecibeAtaque.equals("bicho") || tipoRecibeAtaque.equals("fuego") || tipoRecibeAtaque.equals("veneno") || tipoRecibeAtaque.equals("dragon") || tipoRecibeAtaque.equals("acero")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else  if (tipoataque.equals("bicho")){

            if (tipoRecibeAtaque.equals("planta") || tipoRecibeAtaque.equals("psiquico") || tipoRecibeAtaque.equals("siniestro")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("volador") || tipoRecibeAtaque.equals("lucha") || tipoRecibeAtaque.equals("fuego") || tipoRecibeAtaque.equals("acero") || tipoRecibeAtaque.equals("hada") || tipoRecibeAtaque.equals("veneno") || tipoRecibeAtaque.equals("fantasma")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else  if (tipoataque.equals("electrico")){

            if (tipoRecibeAtaque.equals("volador") || tipoRecibeAtaque.equals("agua")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("planta") || tipoRecibeAtaque.equals("electrico") || tipoRecibeAtaque.equals("dragon")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.equals("tierra")){

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoataque.equals("normal")) {

            if (tipoRecibeAtaque.equals("roca") || tipoRecibeAtaque.equals("dragon")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.equals("fantasma")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoataque.equals("roca")) {

            if (tipoRecibeAtaque.equals("volador") || tipoRecibeAtaque.equals("hielo") || tipoRecibeAtaque.equals("bicho") || tipoRecibeAtaque.equals("fuego")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("tierra") || tipoRecibeAtaque.equals("lucha") || tipoRecibeAtaque.equals("acero")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoataque.equals("tierra")) {

            if (tipoRecibeAtaque.equals("electrico") || tipoRecibeAtaque.equals("roca") || tipoRecibeAtaque.equals("fuego") || tipoRecibeAtaque.equals("veneno") || tipoRecibeAtaque.equals("acero")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("planta") || tipoRecibeAtaque.equals("bicho")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.equals("volador")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoataque.equals("fuego")) {

            if (tipoRecibeAtaque.equals("hielo") || tipoRecibeAtaque.equals("planta") || tipoRecibeAtaque.equals("bicho") || tipoRecibeAtaque.equals("acero")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("agua") || tipoRecibeAtaque.equals("roca") || tipoRecibeAtaque.equals("fuego") || tipoRecibeAtaque.equals("dragon")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoataque.equals("lucha")) {

            if (tipoRecibeAtaque.equals("roca") || tipoRecibeAtaque.equals("normal") || tipoRecibeAtaque.equals("hielo") || tipoRecibeAtaque.equals("siniestro") || tipoRecibeAtaque.equals("acero")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("volador") || tipoRecibeAtaque.equals("psiquico") || tipoRecibeAtaque.equals("bicho") || tipoRecibeAtaque.equals("hada") || tipoRecibeAtaque.equals("veneno")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.equals("fantasma")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoataque.equals("hada")) {

            if (tipoRecibeAtaque.equals("lucha") || tipoRecibeAtaque.equals("dragon") || tipoRecibeAtaque.equals("siniestro")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("fuego") || tipoRecibeAtaque.equals("veneno") || tipoRecibeAtaque.equals("acero")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.equals("tierra")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoataque.equals("psiquico")) {

            if (tipoRecibeAtaque.equals("lucha") || tipoRecibeAtaque.equals("veneno")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("acero") || tipoRecibeAtaque.equals("psiquico")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.equals("siniestro")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoataque.equals("veneno")) {

            if (tipoRecibeAtaque.equals("planta") || tipoRecibeAtaque.equals("hada")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("roca") || tipoRecibeAtaque.equals("tierra") || tipoRecibeAtaque.equals("veneno") || tipoRecibeAtaque.equals("fantasma")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.equals("acero")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoataque.equals("dragon")) {

            if (tipoRecibeAtaque.equals("dragon")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("acero")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            }else if (tipoRecibeAtaque.equals("hada")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoataque.equals("fantasma")) {

            if (tipoRecibeAtaque.equals("psiquico") || tipoRecibeAtaque.equals("fantasma")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("siniestro")) {

                efectividad = 0.5;
                System.out.println("Es poco efectivo");

            } else if (tipoRecibeAtaque.equals("normal")) {

                efectividad = 0;
                System.out.println("El pokemon enemigo es inmune a este ataque");

            } else {

                efectividad = 1;
                System.out.println("Es efectivo");

            }

        } else if (tipoataque.equals("siniestro")) {

            if (tipoRecibeAtaque.equals("psiquico") || tipoRecibeAtaque.equals("fantasma")) {

                efectividad = 1.5;
                System.out.println("Es muy efectivo");

            } else if (tipoRecibeAtaque.equals("lucha") || tipoRecibeAtaque.equals("hada") || tipoRecibeAtaque.equals("siniestro")) {

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

