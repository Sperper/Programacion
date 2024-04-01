package com.programacion.Unidad_7.proyectoAirbnb;

import com.programacion.Unidad_7.proyectoAirbnb.services.GestionFicheroAirbnb;

public class AppAirbnb {

    public static void main(String[] args) {

        GestionFicheroAirbnb gestion = new GestionFicheroAirbnb();
        String ruta = "src/resources/archivosTema7/airbnb/sevilla.csv";

        gestion.leerFicheroAlojamientos(ruta);

    }

}
