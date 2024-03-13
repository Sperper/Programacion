package com.programacion.Unidad_7.proyectoTrivial.model;

import java.util.ArrayList;
import java.util.Objects;

public class Participante {

    // Atributos
    private String nombre;
    private String id;
    private ArrayList<Puntuacion> puntuacionnes;

    // Constructor
    public Participante(String nombre, String id){
        setNombre(nombre);
        setId(id);
        this.puntuacionnes = new ArrayList<>();

    }

    // Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return Objects.equals(id, that.id);
    }

    // String
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", id='" + id + '\'';
    }



    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Puntuacion> getPuntuacionnes() {
        return puntuacionnes;
    }

    public void setPuntuacionnes(ArrayList<Puntuacion> puntuacionnes) {
        this.puntuacionnes = puntuacionnes;
    }
}
