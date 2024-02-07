package com.programacion.Unidad_6.proyectoHerencia.Clases;

import com.programacion.Unidad_6.proyectoHerencia.Clases.PersonaH;

public class Cliente extends PersonaH {


    private String idCliente;
    private boolean esMoroso;

    public Cliente(String nombre, String dni, String sexo, String idCliente, boolean esMoroso) {
        super(nombre, dni, sexo);
        this.idCliente = idCliente;
        this.esMoroso = esMoroso;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isEsMoroso() {
        return esMoroso;
    }

    public void setEsMoroso(boolean esMoroso) {
        this.esMoroso = esMoroso;
    }

    public void presentacion(){
        System.out.println("_____________________");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Dni: "+this.dni);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("IdCliente: "+this.idCliente);
        System.out.println("EsMoroso: "+this.esMoroso);
        System.out.println("_____________________");
    }

}


