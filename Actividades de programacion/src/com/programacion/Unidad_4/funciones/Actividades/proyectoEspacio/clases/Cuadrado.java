package com.programacion.Unidad_4.funciones.Actividades.proyectoEspacio.clases;

public class Cuadrado {

    public int coorX;
    public int lado;
    public int coorY;

    public double area;

    // Usamos el constructor para darle valor a esos atributos

    public Cuadrado(int coorX, int coorY,int lado) {
        this.coorX = coorX;
        this.coorY = coorY;

        if (lado > 0){
            this.lado = lado;
        } else {
            this.lado = 0;
        }
        this.area = this.lado * this.lado;
    }

    /**
     * Método que compare dos cuadrados y nos diga cuál es mayor
     */

    public void compararCuadrados(Cuadrado c) {

        if(this.lado > c.lado) {
            System.out.println("El cuadrado con lado "+this.lado+" es el mayor");
        } else {
            System.out.println("El cuadrado con lado "+c.lado+" es el mayor");
        }

    }

}
