package com.programacion.Unidad_6.proyectoComida.clases.impl;

import com.programacion.Unidad_6.proyectoComida.clases.api.Reganiasion;

public class Parte implements Reganiasion {

    private boolean esGrave;

    public Parte(boolean esGrave){
        this.esGrave = esGrave;
    }

    @Override
    public int reduceEnergia() {
        return esGrave ? 100 : -50;
    }
}
