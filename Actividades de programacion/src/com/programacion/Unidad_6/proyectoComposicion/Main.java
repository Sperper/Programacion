package com.programacion.Unidad_6.proyectoComposicion;

import com.programacion.Unidad_3.ActividadRepaso.ArrayRandoms;
import com.programacion.Unidad_6.proyectoComposicion.clases.Volk;
import com.programacion.Unidad_6.proyectoComposicion.clases.Wagen;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Wagen audi = new Wagen("a4", "audi", null);

        ArrayList<Wagen> cochesDeRaquel = new ArrayList<>();
        cochesDeRaquel.add(audi);

        Volk raquel = new Volk("Raquel", cochesDeRaquel);

        audi.setPropietario(raquel);

        System.out.println("");
    }

}
