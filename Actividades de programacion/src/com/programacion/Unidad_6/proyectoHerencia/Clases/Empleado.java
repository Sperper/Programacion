package com.programacion.Unidad_6.proyectoHerencia.Clases;

import com.programacion.Unidad_6.proyectoHerencia.Clases.PersonaH;

public class Empleado extends PersonaH {

    public Empleado(String nombre, String dni, String sexo, double sueldo){
        super(nombre, dni, sexo);
        this.sueldo = sueldo;
    }
    private double sueldo;

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void presentacion() {
        System.out.println("_____________________");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Dni: "+this.dni);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Sueldo: "+this.sueldo);
        System.out.println("_____________________");
    }
}
