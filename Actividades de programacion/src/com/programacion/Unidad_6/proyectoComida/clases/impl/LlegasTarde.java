package com.programacion.Unidad_6.proyectoComida.clases.impl;

import com.programacion.Unidad_6.proyectoComida.clases.api.Reganiasion;

public class LlegasTarde implements Reganiasion {

    private boolean teQuedasEnLaPuerta;

    public LlegasTarde(boolean teQuedasEnLaPuerta){
        this.teQuedasEnLaPuerta = teQuedasEnLaPuerta;
    }

    @Override
    public int reduceEnergia() {
        return teQuedasEnLaPuerta ? 10 : -20;
    }
}
