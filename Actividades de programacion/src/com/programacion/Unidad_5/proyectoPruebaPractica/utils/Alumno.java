package com.programacion.Unidad_5.proyectoPruebaPractica.utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno {

    private String dni;
    private String nombre;
    private String email;
    private ArrayList<Modulo> modulos;

    public Alumno (String dni, String nombre, String email) {
        setDni(dni);
        setNombre(nombre);
        setEmail(email);
        modulos = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        Pattern pattern = Pattern.compile("^\\d{8}(\\s|-)?[a-zA-Z]$");
        Matcher matcher = pattern.matcher(dni);
        if (matcher.find()) {
            this.dni = dni;
        } else {
            System.out.println("El dni no es valido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-z]{7}\\d{3,4}@g\\.educaand\\.es$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            this.email = email;
        } else {
            System.out.println("El correo introducido no es válido");
        }
    }

    public void anadirModulo(Modulo mod) {
        boolean moduloExiste = false;
        for (int i=0; i<modulos.size(); i++) {
            if (modulos.get(i).getNombre().equals(mod.getNombre())) {
                System.out.println("ERROR: EL MODULO YA HA SIDO INTRODUCIDO ANTERIORMENTE");
                moduloExiste = true;
                break;
            }
        }
        if (!moduloExiste) {
           for (int i=0; i<modulos.size(); i++){
               modulos.add(i++, mod);
               break;
           }
        }
    }

    public  int getNumeroHoras(){
        int horasTotales = 0;
        for (int i=0; i< modulos.size(); i++) {
            horasTotales += modulos.get(i).getHoras();
        }
        return horasTotales;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }
}
