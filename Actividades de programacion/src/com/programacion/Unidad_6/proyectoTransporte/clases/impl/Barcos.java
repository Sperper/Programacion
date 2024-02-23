package com.programacion.Unidad_6.proyectoTransporte.clases.impl;

public class Barcos extends VAcuatico{

    // Atributos
    private boolean tieneMotor;

    // Constructor
    public Barcos(String matricula, String modelo, boolean tieneMotor) {
        super(matricula, modelo);
        this.tieneMotor = tieneMotor;
    }

    // Metodo
    @Override
    public void imprimir(){
        super.imprimir();
        if (isTieneMotor()) {
            System.out.println("Tiene motor");
        } else {
            System.out.println("No tiene motor");
        }
    }

    // Getters and Setters
    public boolean isTieneMotor() {
        return tieneMotor;
    }

    public void setTieneMotor(boolean tieneMotor) {
        this.tieneMotor = tieneMotor;
    }
}


