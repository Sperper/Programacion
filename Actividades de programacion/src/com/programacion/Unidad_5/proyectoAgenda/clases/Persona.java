package com.programacion.Unidad_5.proyectoAgenda.clases;

import com.programacion.Unidad_5.proyectoAgenda.utils.AgendaUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {

    private String nombre;
    private String dni;
    private int edad;
    private String telefono;
    private String email;
    private Direccion direccion;

    public String getNombre() {

        return nombre;
    }
// 42
    public void setNombre(String nombre) {
        if (AgendaUtils.checkNombre(nombre)) {
            this.nombre = nombre;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (AgendaUtils.checkDni(dni)) {
            this.dni = dni;
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
        if (AgendaUtils.checkTlfn(telefono)) {
            this.telefono = telefono;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (AgendaUtils.checkEmail(email)) {
            this.email = email;
        }
    }

    public void presentacion(){
        System.out.printf("Hola me llamo %s, con dni %s y tengo %d anios\n", this.nombre, this.dni, this.edad);
        System.out.printf("Puedes contactarme en %s o en mi teléfono %s\n",this.email, this.telefono);

        System.out.println("Si quieres visitarme, ven a ");
        direccion.presentacion();

    }
}
