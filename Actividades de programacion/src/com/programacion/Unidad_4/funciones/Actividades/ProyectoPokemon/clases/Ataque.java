package com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.Clases;

public class Ataque {

    public String nombre;
    public Tipo tipo;
    public double danio;

    public Ataque(String nombre, Tipo tipo, double danio) {

        // Establece el nombre del ataque
        // -> No hay restricciones

        this.nombre = nombre;

        // Establece el tipo del ataque
        // -> No hay que comprobar nada

        this.tipo = tipo;

        // Establece el danio base del ataque
        // -> No existen los danios negativos
        // Si el valor es positivo... ok
        // Si no... se setea a 0

        if (danio > 0) {

            this.danio = danio;

        } else {

            this.danio = 0;

        }


    }

}
