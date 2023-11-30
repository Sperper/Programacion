package com.programacion.Unidad_4.funciones.Actividades.proyectoPersona.Clases;

import com.programacion.Unidad_4.funciones.Actividades.proyectoPersona.Util.LocalidadValidator;

public class Direccion {

    public String calle;
    public int numero;
    public String cp;
    public int puerta;
    public int piso;
    public String tipoVivienda;

    public String localidad;

    public String provinicia;

    public Direccion (String calle, int numero, String cp, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;

        LocalidadValidator l = new LocalidadValidator();
        boolean cpYProvinciaCorrectos = l.checkProvinicia(provincia, cp);
        if (cpYProvinciaCorrectos) {
            this.cp = cp;
            this.localidad = localidad;
            this.provinicia = provincia;
        }
    }

}
