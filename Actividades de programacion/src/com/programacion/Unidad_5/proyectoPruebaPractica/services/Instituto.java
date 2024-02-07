package com.programacion.Unidad_5.proyectoPruebaPractica.services;

import com.programacion.Unidad_5.proyectoPruebaPractica.utils.Alumno;

import java.util.ArrayList;

public class Instituto {

    private String nombre;
    private ArrayList<Alumno> alumnos;

    public Instituto(String nombre) {
        setNombre(nombre);
        alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Metodo que añade un alumno que introduce el usuario
     * @param al
     */
    public void anadirAlumno(Alumno al){
        boolean alumnoExiste = false;
        for (int i=0; i<alumnos.size(); i++) {
            if (alumnos.get(i).getDni().equals(al.getDni())) {
                System.out.println("ERROR: EL ALUMNO YA HA SIDO INTRODUCIDO ANTERIORMENTE");
                alumnoExiste = true;
                break;
            }
        }
        if (!alumnoExiste) {
            for (int i=0; i<alumnos.size(); i++){
                alumnos.add(i++, al);
                break;
            }
        }
    }

    /**
     * metodo que busca un alumno introduciendo su dni
     * @param dni dni que introduce el usuario por teclado
     * @return devuelve el alumnoBuscado
     */
    public Alumno buscarAlumno(String dni) {
        Alumno alumnoBuscado = new Alumno("", "", "");
        for (int i=0; i<alumnos.size(); i++) {
            if (alumnos.get(i).getDni().equals(dni)){
                alumnoBuscado = alumnos.get(i);
                break;
            }
        }
        return alumnoBuscado;
    }

    /**
     * metodo que da de baja al alumno cuyo dni sea el mismo que el que introduce el usuario
     * @param dni dni que introduce el usuario por teclado
     * @return true si ha conseguido darle de baja y false si no
     */
    public boolean bajaAlumno(String dni){
        boolean AlumnoExiste = false;
        for (int i=0; i<alumnos.size(); i++){
            if (alumnos.get(i).getDni().equals(dni)){
                alumnos.remove(i);
                AlumnoExiste = true;
                break;
            }
        }

        return AlumnoExiste;
    }

    /**
     * Metodo que dice el numero de alumnos totales
     * @return numero de alumnos 
     */
    public int numeroAlumnos(){
        return alumnos.size()+1;
    }

}
