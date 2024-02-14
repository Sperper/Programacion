package com.programacion.Unidad_6.proyectoComida.clases.impl;

import com.programacion.Unidad_6.proyectoComida.clases.api.Comida;

public class Lentejas implements Comida {

    private boolean lasQuieres = true;

    public Lentejas (boolean lasQuieres){
        this.lasQuieres = lasQuieres;
    }

    @Override
    public int addNutricion() {
        if (lasQuieres) {
            System.out.println("Te doy +15 de energia y +10 de hierro");
            return 15;
        } else {
            System.out.println("Las dejas");
            return 0;
        }

    }
}
