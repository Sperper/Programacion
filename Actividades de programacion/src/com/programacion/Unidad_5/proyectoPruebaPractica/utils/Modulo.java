package com.programacion.Unidad_5.proyectoPruebaPractica.utils;

public class Modulo {

    private String nombre;
    private int horas;

    /**
     * Metodo constructor del Modulo
     * @param nombre nombre del modulo que se va a introducir
     * @param horas horas de dicho modulo
     */
    public Modulo(String nombre, int horas){
        setNombre(nombre);
        setHoras(horas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas < 0) { // If para que antes de darle un valor a horas compruebe que es positivo
            System.out.println("Las horas introducidas no son correctas");
        } else {
            this.horas = horas;
        }

    }


}
