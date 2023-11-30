package com.programacion.Unidad_4.funciones.Actividades.proyectoEspacio;

import com.programacion.Unidad_4.funciones.Actividades.proyectoEspacio.clases.Circulo;
import com.programacion.Unidad_4.funciones.Actividades.proyectoEspacio.clases.Cuadrado;
import com.programacion.Unidad_4.funciones.Actividades.proyectoEspacio.clases.Punto;

public class Main {

    public static void main(String[] args) {

        // Ahora, vamos a crear dos objetos de tipo Punto
        Punto punto1 = new Punto(6,0);
        Punto punto2 = new Punto(5,0);

        punto1.nombre = "punto en 0";
        punto2.nombre = "punto otro";

        double distanciaEntrePuntos = punto1.CalcularDistancias(punto2);
        System.out.println("La distancia es "+distanciaEntrePuntos);









        Circulo radio = new Circulo(5.0);



    }

}
