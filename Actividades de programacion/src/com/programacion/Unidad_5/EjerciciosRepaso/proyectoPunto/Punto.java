package com.programacion.Unidad_5.EjerciciosRepaso.proyectoPunto;

import java.util.Random;

public class Punto {

    // ATRIBUTOS DE CLASE
    private int x;
    private int y;

    // CONSTRUCTORES DE CLASE

    public Punto (int x, int y) {
        this.x = x;
        this.y = y;
    }

    // MÉTODOS DE CLASE

    public static Punto crearPuntoAleatorio(){

        int aleatorioX = new Random().nextInt(-100, 100);
        int aleatorioY = new Random().nextInt(-100, 100);

        return new Punto(aleatorioX, aleatorioY);

    }

    /**
     * Mostrar puntos por pantalla
     */

    public void imprime() {
        System.out.println("("+this.x+", "+this.y+")");
    }

    public void setXY(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public void desplaza (int dX, int dY) {
        this.x = this.x + dX;
        this.y = this.y + dY;
    }

    public int ditancia(Punto p) {

        int parte1 = (int) Math.pow(p.x - this.x, 2);
        int parte2 = (int) Math.pow(p.y - this.y, 2);

        int raiz = (int) Math.sqrt(parte1 + parte2);

        return raiz;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


}
