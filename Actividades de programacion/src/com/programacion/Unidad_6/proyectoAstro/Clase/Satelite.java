package com.programacion.Unidad_6.proyectoAstro.Clase;

public class Satelite extends Astro {

    protected double distanciaPlaneta;
    protected double orbitaPlaneta;

    public Satelite(double radioEcuatorial, double rotacion, double masa, double temperaturaMedia, String nombre, double distanciaPlaneta, double orbitaPlaneta) {
        super(radioEcuatorial, rotacion, masa, temperaturaMedia, nombre);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlaneta = orbitaPlaneta;
    }

    @Override
    public void muestra(){

    }

}
