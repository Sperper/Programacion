package com.programacion.Unidad_6.proyectoMascota.clases;

public class Ave extends Mascota{


    protected String pico;
    protected boolean vuela;


    public Ave(String nombre, String pico, boolean vuela) {
        super(nombre);
        this.pico = pico;
        this.vuela = vuela;
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public void volar(){
        if (this.vuela){
            System.out.println("Passsso que voy volando ...");
        } else {
            System.out.println("Pa voladora tu aguila calva ...");
        }
    }

}
