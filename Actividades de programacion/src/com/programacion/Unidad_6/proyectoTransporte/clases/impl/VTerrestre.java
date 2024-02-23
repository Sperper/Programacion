package com.programacion.Unidad_6.proyectoTransporte.clases.impl;

public class VTerrestre extends Vehiculo{

    protected int numRuedas;

    public VTerrestre(String matricula, String modelo, int numRuedas) {
        super(matricula, modelo);
        this.numRuedas = numRuedas;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tiene "+getNumRuedas()+" ruedas");
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }
}
