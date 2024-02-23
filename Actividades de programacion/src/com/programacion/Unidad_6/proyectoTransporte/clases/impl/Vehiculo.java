package com.programacion.Unidad_6.proyectoTransporte.clases.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehiculo {


    // Atributos
    protected String matricula;
    protected String modelo;

    // Constructor
    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    // Metodos
    public void imprimir(){
        System.out.println("La matricula es: "+getMatricula());
        System.out.println("El modelo es: "+getModelo());
    }

    // Getters and Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        Pattern pattern = Pattern.compile("^(\\d{4}[a-zA-Z]{3})|([a-zA-Z]{3,10})|([a-zA-Z]{4}\\d{6})$");
        Matcher matcher = pattern.matcher(matricula);
        if (matcher.find()) {
            this.matricula = matricula;
        } else {
            System.out.println("Matricula incorrecta");
        }

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}


