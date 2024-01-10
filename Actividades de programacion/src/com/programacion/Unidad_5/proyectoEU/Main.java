package com.programacion.Unidad_5.proyectoEU;

import com.programacion.Unidad_5.proyectoEU.clases.Pais;
import com.sun.source.tree.NewArrayTree;

public class Main {

    public static void main(String[] args) {

        Pais etiopia = new Pais("Etiopia", 2, 2000, true);
        Pais filipinas = new Pais("Phillipines", 100, 200000, true);
        Pais mojacar = new Pais("Mojacar", 1, 6000, false);

        System.out.println("El numero de paises de la EU es: "+Pais.numPaisesEU);

        etiopia.setNombre("Prado del rey");
        filipinas.setNombre("Corea del norte");
        mojacar.setNombre("Galicia");

        System.out.println(etiopia.getNombre()+", "+filipinas.getNombre()+", "+mojacar.getNombre());

    }

}
