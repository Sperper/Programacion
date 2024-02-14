package com.programacion.Unidad_6.proyectoComida.clases.impl;

import com.programacion.Unidad_5.EjerciciosRepaso.proyectoRectangulo.Clases.Rectangulo;
import com.programacion.Unidad_6.proyectoComida.clases.api.Reganiasion;

public class ShutDownPC implements Reganiasion {


    @Override
    public int reduceEnergia() {
        return -100;
    }
}
