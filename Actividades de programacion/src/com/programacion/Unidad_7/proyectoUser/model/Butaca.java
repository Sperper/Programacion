package com.programacion.Unidad_7.proyectoUser.model;

import java.util.Objects;

public class Butaca {

    private int fila;
    private int asiento;
    private String idUser;

    public Butaca(int fila, int asiento, String idUser) {

    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Butaca) {
            Butaca b = (Butaca) o;

            return b.getFila() == this.fila && b.getAsiento() == this.asiento;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return fila+":"+asiento+":"+idUser;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
}
