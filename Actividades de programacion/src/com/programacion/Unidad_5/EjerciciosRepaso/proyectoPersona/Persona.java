package com.programacion.Unidad_5.EjerciciosRepaso.proyectoPersona;

import com.programacion.Unidad_4.funciones.clasesDNI.clases.VerificadorDNI;

public class Persona {

    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    private static final int mayoriaEdad = 18;

    public Persona(String dni, String nombre, String apellidos, int edad) {

        if (VerificadorDNI.comprobarLetra(dni)
                && VerificadorDNI.comprobarLongitud(dni)
                && VerificadorDNI.comprobarParteNumerica(dni)
                && VerificadorDNI.comprobarLetraCorrecta(dni)) {
            this.dni = dni;
        } else {
            this.dni = " ";
        }

        this.nombre = nombre;
        this.apellidos = apellidos;
        if (edad >= 0) {
            this.edad = edad;
        }

    }

    public void imprime() {
        System.out.print("DNI: "+this.dni+", NOMBRE: "+this.nombre+", APELLIDOS: "+this.apellidos+", EDAD: "+this.edad);
    }

    public boolean esMayorEdad(){
        return this.edad >= Persona.mayoriaEdad;
    }

    public boolean esJubilado(){
        return this.edad >= 65;
    }

    public int diferenciaEdad(Persona p){
        return Math.abs(this.edad - p.edad); // Math.abs -> devuelve el valor absoluto
    }

    static boolean validarDNI(String dni) {
        boolean esValido = false;

        for (int i = 0;i <= dni.length()-2; i++){
            if (dni.charAt(i) >= 48 && dni.charAt(i) <= 57) {
                esValido = true;
            } else {
                esValido = false;
                System.out.println("El dni no es valido");
                break;
            }
        }

        if (esValido == true) {
            if ((dni.charAt(8) >= 97 && dni.charAt(8) <= 122) || (dni.charAt(8) >= 65 && dni.charAt(8) <= 90)){
                System.out.println("El dni es valido");
            } else {
                esValido = false;
                System.out.println("El dni no es valido");
            }

        }

        return  esValido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public static int getMayoriaEdad() {
        return mayoriaEdad;
    }

}
