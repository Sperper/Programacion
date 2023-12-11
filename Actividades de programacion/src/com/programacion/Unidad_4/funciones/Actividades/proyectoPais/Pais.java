package com.programacion.Unidad_4.funciones.Actividades.proyectoPais;

public class Pais {

    public String capital;
    public int nhabitantes;
    public String tipoClima;
    public static int nPaisesUE;
    public Pais  (String capital, String tipoClima) {

        this.tipoClima = tipoClima;
        this.capital = capital;

    }

    public void darAltaPais() {

        nPaisesUE++;

    }
    public void nacimientos () {

        this.nhabitantes++;

    }

}
