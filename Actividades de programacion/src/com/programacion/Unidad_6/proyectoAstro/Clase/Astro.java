package com.programacion.Unidad_6.proyectoAstro.Clase;

public class Astro {

    protected double radioEcuatorial;
    protected double rotacion;
    protected double masa;
    protected double temperaturaMedia;
    protected String nombre;

    public Astro(double radioEcuatorial, double rotacion, double masa, double temperaturaMedia, String nombre) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacion = rotacion;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.nombre = nombre;
    }

    public boolean esMayor(Astro astro){
        return this.radioEcuatorial > astro.radioEcuatorial;
    }

    public void muestra(){

        System.out.println("Nombre: "+this.nombre);
        System.out.println("Con un radio de: "+this.radioEcuatorial);
        System.out.println("Y una temperatura de: "+this.temperaturaMedia);

    }

}
