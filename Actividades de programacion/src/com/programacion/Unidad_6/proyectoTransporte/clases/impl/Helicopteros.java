package com.programacion.Unidad_6.proyectoTransporte.clases.impl;

public class Helicopteros extends VAereo{

    // Atributos
    private int numHelices;

    // Constructor
    public Helicopteros(String matricula, String modelo, int nAsientos, int numHelices) {
        super(matricula, modelo, nAsientos);
        this.numHelices = numHelices;
    }

    // Metodos
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tiene "+numHelices);
    }

    // Getters and Setters
    public int getNumHelices() {
        return numHelices;
    }

    public void setNumHelices(int numHelices) {
        this.numHelices = numHelices;
    }
}
