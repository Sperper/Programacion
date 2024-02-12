package com.programacion.Unidad_6.proyectoMascota.clases;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Mascota> mascotas;

    public Inventario() {
        mascotas = new ArrayList<>();
    }

    public void mostrarDatosAnimales(){
        for (int i=0;i< mascotas.size();i++) {
            mascotas.get(i).muestra();
        }
    }

    public void anadirMascota(Mascota m) {
        mascotas.add(m);
    }

}
