package com.programacion.Unidad_6.proyectoTransporte.impl;

public class VAereo extends Vehiculo{

    // Atributos
    protected int nAsientos;

    // Constructor
    public VAereo(String matricula, String modelo, int nAsientos) {
        super(matricula, modelo);
        setnAsientos(nAsientos);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tiene "+getnAsientos()+" asientos");
    }

    // Getters and setters
    public int getnAsientos() {
        return nAsientos;
    }

    public void setnAsientos(int nAsientos) {
        this.nAsientos = nAsientos;
    }
}
