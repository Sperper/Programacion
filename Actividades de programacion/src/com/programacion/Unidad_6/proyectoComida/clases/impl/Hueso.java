package com.programacion.Unidad_6.proyectoComida.clases.impl;

import com.programacion.Unidad_6.proyectoComida.clases.api.Comida;

public class Hueso implements Comida {

    private int cantEnergia = 5;
    @Override
    public int addNutricion() {
        System.out.println("Te doy 5 de energia");
        return this.cantEnergia;
    }
}
