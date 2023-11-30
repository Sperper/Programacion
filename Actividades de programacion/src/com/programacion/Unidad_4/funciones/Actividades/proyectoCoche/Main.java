package com.programacion.Unidad_4.funciones.Actividades.proyectoCoche;

import com.programacion.Unidad_4.funciones.Actividades.proyectoCoche.Clases.Coche;

public class Main {

    public static void main(String[] args) {

        // ENCENDEMOS LA APLICACIÓN

        // Creacion de objeto suvAlvaro
        Coche suvAlvaro = new Coche();
        // Le damos valores a los atributos de suvAlvaro
        suvAlvaro.nRuedas = 4;
        suvAlvaro.nPuertas = 5;
        suvAlvaro.motor = "diesel";
        suvAlvaro.nBastidor = "UJ4567FU";
        suvAlvaro.propietario = "Alvaro";

        // Creacion de objeto mercedesAngel
        Coche mercedesAngel = new Coche();
        // Le damos valores a los atributos de mercedesAngel
        mercedesAngel.nRuedas = 6;
        mercedesAngel.nPuertas = 5;
        mercedesAngel.motor = "gasolina";
        mercedesAngel.nBastidor =  "SG8595JP";
        mercedesAngel.propietario = "Angel";

        // Llamamos al método imprimirDatosVehículos() DE SUVALVARO
        suvAlvaro.imprimirDatosVehículos();
        // Llamamos al método imprimirDatosVehículos() DE MERCEDESANGEL
        mercedesAngel.imprimirDatosVehículos();

    }

}