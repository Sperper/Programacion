package com.programacion.Unidad_6.proyectoMascota;

import com.programacion.Unidad_6.proyectoMascota.clases.Gato;
import com.programacion.Unidad_6.proyectoMascota.clases.Inventario;
import com.programacion.Unidad_6.proyectoMascota.clases.Loro;
import com.programacion.Unidad_6.proyectoMascota.clases.Perro;

public class Main {

    public static void main(String[] args) {

        Perro oreo = new Perro("Oreo", "Schnauzer", false);
        Perro goku = new Perro("Goku", "Yorkshire", false);
        Gato pulga = new Gato("Pulga", "Marron", false);
        Loro pirri = new Loro("Pirri", "Granivoro", true, "Sudamerica");

        Inventario inventt = new Inventario();

        inventt.anadirMascota(oreo);
        inventt.anadirMascota(goku);
        inventt.anadirMascota(pulga);
        inventt.anadirMascota(pirri);

        inventt.mostrarDatosAnimales();

        inventt.eliminarMascota("Pulga");

        inventt.mostrarDatosAnimales();

        inventt.mostrarTipoYNombreAnimal();

    }

}
