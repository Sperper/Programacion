package com.programacion.Unidad_6.proyectoTransporte.impl;

public class Coches extends VTerrestre{

    // Atributos
    private boolean tieneAire;

    // Constructores
    public Coches(String matricula, String modelo, int numRuedas, boolean tieneAire) {
        super(matricula, modelo, numRuedas);
        this.tieneAire = tieneAire;
    }

    // Metodos
    @Override
    public void imprimir() {
        super.imprimir();
        if (isTieneAire()) {
            System.out.println("Tiene aire acondicionado");
        } else {
            System.out.println("No tiene aire acondicionado");
        }
    }

    // Getters and Setters
    public boolean isTieneAire() {
        return tieneAire;
    }

    public void setTieneAire(boolean tieneAire) {
        this.tieneAire = tieneAire;
    }
}
