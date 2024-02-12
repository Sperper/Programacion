package com.programacion.Unidad_6.proyectoAstro.Clase;

public class Planeta extends Astro {

    protected double distanciiaSol;
    protected double orbitaSol;
    protected boolean tieneSatelite;

    public Planeta(double radioEcuatorial, double rotacion, double masa, double temperaturaMedia, String nombre, double distanciiaSol, double orbitaSol, boolean tieneSatelite) {
        super(radioEcuatorial, rotacion, masa, temperaturaMedia, nombre);
        this.distanciiaSol = distanciiaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelite = tieneSatelite;
    }

    @Override
    public void muestra (){

        System.out.println("Nombre: "+this.nombre);
        System.out.println("Con un radio de: "+this.radioEcuatorial);
        System.out.println("Una temperatura de: "+this.temperaturaMedia);
        System.out.println("Y tarda en darle la vuelta al sol: "+this.orbitaSol);

    }

}
