package com.programacion.Unidad_7.proyectoUser.services.impl;

import com.programacion.Unidad_7.proyectoUser.model.Butaca;
import com.programacion.Unidad_7.proyectoUser.services.api.BasicServiceCine;

import javax.sound.sampled.Line;
import java.io.*;

public class ServiceCine implements BasicServiceCine {

    // Atributos
    private String nombreCine;
    private static final int NFILAS = 10;
    private static final int NASIENTOS = 10;
    private GestionFicheroCine gestion;

    private Butaca[][] salaCine;

    // Constructor
    public ServiceCine(String nombreCine) {

        this.nombreCine = nombreCine;
        this.gestion = new GestionFicheroCine();
        this.salaCine =
        /*
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
         */

        this.salaCine = null; //aquí vamos a leer el fichero para llenar el array de objetos Butaca

    }

    @Override
    public void mostrarButacas() {

    }

    @Override
    public boolean comprarEntrada() {
        return false;
    }

    @Override
    public boolean devolverEntrada() {
        return false;
    }

    @Override
    public boolean checkComprador(String idUser) {
        return false;
    }

    @Override
    public void leerFicheroEntradas() {

    }

    @Override
    public void anadirFicheroCine(Butaca b) {

    }

    @Override
    public void modificarFicheroCine() {

    }
}
