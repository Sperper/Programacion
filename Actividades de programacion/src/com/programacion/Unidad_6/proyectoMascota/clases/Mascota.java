package com.programacion.Unidad_6.proyectoMascota.clases;

import javax.sound.midi.MidiFileFormat;
import java.time.LocalDate;

public class Mascota {

    protected String nombre;
    protected int edad;
    protected boolean estado;
    protected LocalDate fechaNac;

    public Mascota(String nombre) {
        this.nombre = nombre;

        this.edad = 0;
        this.estado = true;
        this.fechaNac = LocalDate.now();

    }

    public void muestra(){

        if (this.estado) {
            System.out.println("Hola mi nombre es "+this.nombre+" y tengo "+this.edad);

            if (fechaNac.getMonthValue() == LocalDate.now().getMonthValue()
                    && fechaNac.getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
                System.out.println("Y es mi cumpleaños");
            }
        } else {
            System.out.println("Los muertos no hablan...");
        }

    }

    public void compleAnios(){

        if(fechaNac.getMonthValue() == LocalDate.now().getMonthValue() && fechaNac.getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
            this.edad++;
        }

    }

    public void morir(){
        this.estado = !this.estado;
    }

    public boolean habla(){
        return false;
    }

}
