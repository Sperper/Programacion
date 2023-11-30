package com.programacion.Unidad_4.funciones.Actividades.proyectoPersona;

import com.programacion.Unidad_4.funciones.Actividades.proyectoPersona.Clases.Direccion;
import com.programacion.Unidad_4.funciones.Actividades.proyectoPersona.Clases.Persona;

public class Main {

    public static void main(String[] args) {

        Direccion direccionDeManuel = new Direccion("Calle falsa", 123, "14638", "Mojacar", "Almeria");
        Persona manuel = new Persona("Manuel", "12345678A", "Gutierrez Chacon", 20, direccionDeManuel);

        Direccion direccionDePaco = new Direccion("Calle falsa 2", 456, "11660", "Prado del rey", "Cadiz");
        Persona paco = new Persona("Julio", "32165487B", "Mateos Chacon", 23, direccionDePaco);

        Direccion direccionDeLuis = new Direccion("Calle false 3", 789, "29640", "Fuengirola", "Malaga");
        Persona luis = new Persona("Luis", "54323456C", "Perez Hernandez", 36, direccionDeLuis);

        manuel.colorPelo = "Negro";
        manuel.colorPiel = "Blanco";
        manuel.altura = 1.67;
        manuel.estaTrabajando = false;

        manuel.presentarse();
        System.out.println(" ");
        paco.presentarse();
        System.out.println(" ");
        luis.presentarse();

        manuel.cumplirAnios(manuel.edad);
        manuel.cambiarColorPelo(manuel.colorPelo);
        manuel.mayorDeEdad();
        manuel.personasIguales(paco);
        manuel.cambiarEstadoTrabajo();



    }

    @Override
    public String toString() {
        return super.toString();
    }
}
