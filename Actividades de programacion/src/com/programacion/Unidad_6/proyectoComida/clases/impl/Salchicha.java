package com.programacion.Unidad_6.proyectoComida.clases.impl;

import com.programacion.Unidad_6.proyectoComida.clases.api.Comida;

public class Salchicha implements Comida {


    @Override
    public int addNutricion() {
        System.out.println("Soy una salchica, te ddoy +10 de energia");
        return 10;
    }
}
