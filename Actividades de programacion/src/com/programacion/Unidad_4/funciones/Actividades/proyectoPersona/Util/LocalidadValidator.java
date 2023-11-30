package com.programacion.Unidad_4.funciones.Actividades.proyectoPersona.Util;

public class LocalidadValidator {

    public String[] proviniciasValidas = {"Cadiz", "Sevilla", "Huelva", "Malaga", "Jaen", "Cordoba", "Granada", "Almeria"};
    public String[] cpValidos = {"11", "21", "41", "29", "18", "23", "04", "14"};

    /**
     * Método para comprobar la validez de un cp y de una provincia
     * @param provincia
     * @param cp (String) en formato XXXXX
     * @return true si es corrercto, false si es incorrecto
     */

    public boolean checkProvinicia(String provincia, String cp) {
        // Primero comprobamos que la provincia existe
        boolean provinciaExiste = false;
        int posicionProvincia = 0;
        for (int i = 0; i<= proviniciasValidas.length - 1; i++) {
            if (provincia.equalsIgnoreCase(proviniciasValidas[i])) {
                provinciaExiste = true;
                posicionProvincia = i;
                break;
            }
        }

        if (provinciaExiste) { // provinciaExiste == true
            String dosPrimerosNumerosCP = cp.substring(0,2);
            if (dosPrimerosNumerosCP.equalsIgnoreCase(cpValidos[posicionProvincia])) {
                return true;
            }
            System.out.println("Dirección correcta");
        } else {
            System.out.println("Dirección incorrecta");
        }

        return false;
    }


}
