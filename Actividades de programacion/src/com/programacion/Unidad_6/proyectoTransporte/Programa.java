package com.programacion.Unidad_6.proyectoTransporte;

import com.programacion.Unidad_6.proyectoTransporte.clases.impl.*;

import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {

        VTerrestre coche = new VTerrestre("1234BCD", "Mustan GT", 4);
        Coches mustang = new Coches(coche.getMatricula(), coche.getModelo(), coche.getNumRuedas(), true);
        VAereo helicoptero = new VAereo("1234ABCDEF", "Sokol W3A/AS - Sokol", 12);
        Helicopteros sokol = new Helicopteros(helicoptero.getMatricula(), helicoptero.getModelo(), helicoptero.getnAsientos(), 4);
        VAcuatico barco = new VAcuatico("ABCDEF", "Motovelero");
        Barcos motovelero = new Barcos(barco.getMatricula(), barco.getModelo(), true);

        ArrayList<Vehiculo> garaje = new ArrayList<>();
        garaje.add(coche);
        garaje.add(mustang);
        garaje.add(helicoptero);
        garaje.add(sokol);
        garaje.add(barco);
        garaje.add(motovelero);

        for (int i=0; i < garaje.size(); i++) {
            garaje.get(i).imprimir();
        }

    }

}
