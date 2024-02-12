package com.programacion.Unidad_6.proyectoMascota.clases;

public class Loro extends Ave{

    private String origen;
    private boolean habla;

    public Loro(String nombre, String pico, boolean vuela, String origen) {
        super(nombre, pico, vuela);
        this.origen = origen;
        this.habla = true;
    }



    @Override
    public void muestra(){
        super.muestra();

        System.out.println("Soy de "+this.origen);
    }


    @Override
    public void volar(){

        if (this.vuela) {
            System.out.println("Vuela vuelaaaa");
        } else {
            System.out.println("Camino...");
        }

    }


    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }
}
