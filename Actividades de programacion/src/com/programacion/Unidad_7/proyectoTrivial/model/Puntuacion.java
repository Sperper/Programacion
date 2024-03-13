package com.programacion.Unidad_7.proyectoTrivial.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Puntuacion implements Comparable<Puntuacion>{

    private LocalDateTime fecha;
    private int puntuacion;

    // Constructor
    public Puntuacion(int puntuacion){
        this.fecha = LocalDateTime.now();
        setPuntuacion(puntuacion);
    }

    // toString
    @Override
    public String toString() {
        return "fecha=" + fecha +
                ", puntuacion=" + puntuacion;
    }

    // Getters and Setters
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        if (puntuacion > 0) {
            this.puntuacion = puntuacion;
        }
    }

    @Override
    public int compareTo(Puntuacion o) {
        if (this.puntuacion > o.puntuacion) {
            return 1;
        } else if (this.puntuacion < o.puntuacion) {
            return -1;
        } else {
            return 0;
        }
    }
}
