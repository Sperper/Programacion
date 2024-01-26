package com.programacion.Unidad_5.proyectoAgenda.Services;

import com.programacion.Unidad_5.proyectoAgenda.clases.Persona;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AgendaServices {

    private static ArrayList<Persona> agenda = null;

    public boolean addPersona(Persona persona) {

        // Hay que comprobar si la persona en el ArrayList, si está, se elimina
        try {
            if (!this.checkPersona(persona.getDni())) {
                AgendaServices.agenda.add(persona);
                return checkPersona(persona.getDni());
            }
        } catch (NullPointerException e){
            System.out.println("Error en los datos...");
            return false;
        }

        return false;

    }

    public boolean deletePersona(Persona persona) {
        int posicionAEliminar = -1;
        for (int i=0; i<AgendaServices.agenda.size(); i++) {
            if (AgendaServices.agenda.get(i).getDni().equals(persona)) {
                posicionAEliminar = i;
                break;
            }
        }
        if (posicionAEliminar == -1) {

        }

        return false;

    }

    public boolean checkPersona(String dni) {
        // Comprueba si la persona está en el Arraylist o no;
        boolean personaExiste = false;
        for (int i=0; i<AgendaServices.agenda.size(); i++) {
            if (AgendaServices.agenda.get(i).getDni().equals(dni)) {
                personaExiste = true;
                break;
            }
        }

        return false;
    }


}
