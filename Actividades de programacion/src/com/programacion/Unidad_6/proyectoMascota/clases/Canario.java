package com.programacion.Unidad_6.proyectoMascota.clases;

public class Canario extends Ave{

    private String color;
    private boolean canta;

    public Canario(String nombre, String pico, boolean vuela, String color) {
        super(nombre, pico, vuela);
        this.color = color;
        this.canta = true;
    }

    @Override
    public void muestra() {
        super.muestra();

        System.out.println("Soy de color "+this.color);
    }

    @Override
    public void volar() {
        if (this.vuela) {
            System.out.println("Vuelo en mi peuqeña jaula de 20cm cuadrados");
        } else {
            System.out.println("Camino ...");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }
}
