package com.programacion.Unidad_6.proyectoAstro;

import com.programacion.Unidad_6.proyectoAstro.Clase.Planeta;
import com.programacion.Unidad_6.proyectoAstro.Clase.Satelite;

public class Main {

    public static void main(String[] args) {

        Planeta tierra = new Planeta(
                6738.4, 23.56,
                5975, 17.28,
                "Tierra", 150000000,
                365.04, true);

        Satelite luna = new Satelite(
                3474.8, 23.56,
                7.349, -94, "Luna",
                384400, 27);

        tierra.muestra();
        luna.muestra();

        if (tierra.esMayor(luna)) {
            System.out.println("La tierra es mayor");
        } else {
            System.out.println("La luna es mayor");
        }

        Planeta jupiter = new Planeta(
                69911, 23.56,
                1898, 930,
                "Jupiter", 750000000,
                4330, true);

        Satelite europa = new Satelite(
                1560.8, 23.56,
                4.8, -163,
                "Europa", 671100,
                3);

        if (jupiter.esMayor(europa)) {
            System.out.println("Jupiter es mayor");
        } else {
            System.out.println("Europa es mayor");
        }
    }
}
