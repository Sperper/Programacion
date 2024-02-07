package com.programacion.Unidad_6.proyectoHerencia;

import com.programacion.Unidad_4.funciones.Actividades.proyectoPersona.Clases.Persona;
import com.programacion.Unidad_6.proyectoHerencia.Clases.Cliente;
import com.programacion.Unidad_6.proyectoHerencia.Clases.Empleado;
import com.programacion.Unidad_6.proyectoHerencia.Clases.PersonaH;

public class Main {

    public static void main(String[] args) {

        // Creamos un cliente
        Cliente cl = new Cliente("Diego", "12345678Z", "H", "1", true);
        cl.presentacion();

        // Creamos un empleado
        Empleado em = new Empleado("Pepe", "23456789Z", "H", 1150.0);
        em.presentacion();

        // Creamos una personaH
        PersonaH per = new PersonaH("Manolo", "34567890D", "M");


    }

}
