package com.programacion.Unidad_7.teoria.proyectoAirbnb2;

public class Ubicacion {

    double latitud;
    double longitud;

    // Constructor
    public Ubicacion(double latitud, double longitud) {
        setLatitud(latitud);
        setLongitud(longitud);
    }

   // Getters and Setters

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
