package com.programacion.Unidad_6.proyectoTransporte.clases.impl;

public class Aviones extends VAereo{

    // Atributos
    private int tiempoVueloMax;

    // Constructores
    public Aviones(String matricula, String modelo, int nAsientos, int tiempoVueloMax) {
        super(matricula, modelo, nAsientos);
        this.tiempoVueloMax = tiempoVueloMax;
    }

    // Metodos
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("El tiempo de vuelo máximo es de "+getTiempoVueloMax()+" horas");
    }

    // Getters and Setters
    public double getTiempoVueloMax() {
        return tiempoVueloMax;
    }

    public void setTiempoVueloMax(int tiempoVueloMax) {
        this.tiempoVueloMax = tiempoVueloMax;
    }
}
