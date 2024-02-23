package com.programacion.Unidad_6.proyectoTransporte.impl;

public class Submarinos extends VAcuatico{
    // Atributos
    private Double profundidaMax;

    // Constructor
    public Submarinos(String matricula, String modelo, Double profundidaMax) {
        super(matricula, modelo);
        this.profundidaMax = profundidaMax;
    }

    // Constructores
    public void imprimir(){
        super.imprimir();
        System.out.println("La profundidad máxima es de "+getProfundidaMax()+" metros");
    }

    // Getters and Setters
    public Double getProfundidaMax() {
        return profundidaMax;
    }

    public void setProfundidaMax(Double profundidaMax) {
        this.profundidaMax = profundidaMax;
    }
}
