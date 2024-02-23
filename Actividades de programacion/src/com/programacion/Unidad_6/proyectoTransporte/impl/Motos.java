package com.programacion.Unidad_6.proyectoTransporte.impl;

public class Motos extends VTerrestre{

    // Atributos
    private String color;

    // Constructor
    public Motos(String matricula, String modelo, int numRuedas, String color) {
        super(matricula, modelo, numRuedas);
        this.color = color;
    }

    // Metodos
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("El color es "+getColor());
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
