package com.programacion.Unidad_5.proyectoAgenda.clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {

    private String nombre;
    private String dni;
    private int edad;
    private String telefono;
    private String email;

    public String getNombre() {

        return nombre;
    }
// 42
    public void setNombre(String nombre) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{0,42}$");
        Matcher matcher = pattern.matcher(nombre);
        if (matcher.find()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre introducido es incorrecto");
        }

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        Pattern pattern = Pattern.compile("\\d{9}[a-zA-Z]");
        Matcher matcher = pattern.matcher(dni);
        if (matcher.find()) {
            this.dni = dni;
        } else {
            System.out.println("El dni introducido es incorrecto");
        }

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        Pattern pattern = Pattern.compile("^((\\d{3}(\\s?\\d{2}){3})|(\\d{3}(\\s?\\d{3}){2}))$");
        Matcher matcher = pattern.matcher(telefono);
        if (matcher.find()) {
            this.telefono = telefono;
        } else {
            System.out.println("El telefono introducido es incorrecto");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Pattern pattern = Pattern.compile("");
        this.email = email;
    }
}
