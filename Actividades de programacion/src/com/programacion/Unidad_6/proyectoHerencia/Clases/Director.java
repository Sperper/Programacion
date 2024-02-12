package com.programacion.Unidad_6.proyectoHerencia.Clases;

import com.programacion.Unidad_4.funciones.Actividades.proyectoPersona.Clases.Persona;

public class Director extends Jefe {

    protected String asistente;

    public Director(String nombre, String dni, String sexo, String despacho, String asistente) {
        super(nombre, dni, sexo, despacho);
        this.asistente = asistente;
    }
}
