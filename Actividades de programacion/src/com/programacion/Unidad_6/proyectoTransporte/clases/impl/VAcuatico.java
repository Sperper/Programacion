package com.programacion.Unidad_6.proyectoTransporte.clases.impl;

public class VAcuatico extends Vehiculo{

    // Atributos
    protected final boolean tienenEslora = true;

    // Constructor
    public VAcuatico(String matricula, String modelo) {
        super(matricula, modelo);
    }

    // Metodos
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tiene eslora");
    }

}
