package com.programacion.Unidad_4.funciones.Actividades.proyectoPersona.Clases;

import java.util.Scanner;

public class Persona {

    /**
     * nombre
     * dni
     * apellidos
     * edad
     * colorPiel
     * colorPelo
     *
     * presentarse()
     * CumplirAnios()
     * CambiarColorPelo(String)
     */

    public String nombre;
    public String dni;
    public String apellidos;
    public int edad;
    public double altura;
    public String colorPiel;
    public String colorPelo;
    /**
     * Añadir un atributo publico "estaTrabajando.
     * Atributo de tipo boolean inicializado por defecto a false.
     */
    public boolean estaTrabajando = false;

    public Direccion direccion;



    /**
     * Definir constructor de clase para persona
     * Se le pasa el nombre, dni, apellidos y edad
     */

    public Persona (String nombre, String dni, String apellidos, int edad, Direccion dir){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.apellidos = apellidos;
        this.direccion = dir;
    }

    public void presentarse(){
        System.out.println("Hola soy "+this.nombre+" "+this.apellidos);
        System.out.println("Tengo "+this.edad);
        System.out.println("Mido "+this.altura);
        System.out.println("Vivo en "+ direccion.localidad+", "+" en la calle "+ direccion.calle+", en el numero "+direccion.numero+" piso "+direccion.piso+" en la puerta "+ direccion.puerta);
    }

    public void cumplirAnios(int edad){
        edad++;
        System.out.println("¡Felicidades "+this.nombre+", has cumplido "+edad+" anios"+"!");
    }

    public void cambiarColorPelo(String nuevoPelo){
        Scanner scan = new Scanner(System.in);
        System.out.print("Dime a que color desea cambiar su pelo: ");
        nuevoPelo = scan.next();
        colorPelo = nuevoPelo;
        System.out.println("Has cambiado el color a "+colorPelo);
    }


    /**
     * Método que comprueba si esta persona es mayor de edad
     * El método devuelve un boolean
     */

    public void mayorDeEdad()  {
        boolean esMayor;

        if (this.edad >= 18) {
            esMayor = true;
        } else {
            esMayor = false;
        }

    }

    /**
     * Método que comprueba si dos personas son iguales
     * El método devuelve un boolean
     */

    public void personasIguales(Persona b) {
        boolean sonIguales;

        if (this.dni.equals(b.dni)  && this.nombre.equals(b.nombre)) {
            sonIguales = true;
            System.out.println("Son la misma persona");
        } else {
            sonIguales = false;
            System.out.println("No son la misma persona");
        }

    }

    /**
     * Método que da de alta y de baja a la persona en un trabajo
     * El método se llama cambiarEstadoTrabajo()
     *
     * Si esta trabajando -> Se pone a que ya no está trabajando
     * Si no está trabajando -> se pone a que si está trabajando
     */

    public void cambiarEstadoTrabajo() {

        if (this.estaTrabajando == false) {
            this.estaTrabajando = true;
        } else {
            this.estaTrabajando = false;
        }

    }

}
