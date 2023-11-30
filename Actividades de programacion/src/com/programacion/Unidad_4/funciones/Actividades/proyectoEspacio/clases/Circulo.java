package com.programacion.Unidad_4.funciones.Actividades.proyectoEspacio.clases;

public class Circulo {

    // Atributos de circulo para poder calcular el area
    // el radio (quien quiera, private)
    // el area (quien quiera, private)
    // el diametro (quien quiera, private)

    // Constructor personalizado al que se le pasa el radio únicamente
    // El constructor calcula el ara y el diametro

    // Método para mostrar la información del circulo. Soy un circulo con area "tal" y
    // diametro "cual"

    public double radio;
    public double area;
    public double diametro;

    public Circulo (double radio) {

        this.radio = radio;
        Diametro();
        Area();

    }

    private void Area() {

       this.area = this.radio * 2 * Math.PI;
        System.out.println("El area del ciculo es: "+this.area);

    }
    private void Diametro() {

        this.diametro = this.radio * 2;
        System.out.println("El diametro del circulo es: "+this.diametro);
    }

    /**
     * Método que compare dos circulos para ver cual es mayor
     */

    public void compararCirculos(Circulo c){

        if (this.radio > c.radio) {
            System.out.println("El círculo de radio "+this.radio+" es el mayor");
        } else {
            System.out.println("El círculo de radio "+c.radio+" es el mayor");
        }

    }

}
