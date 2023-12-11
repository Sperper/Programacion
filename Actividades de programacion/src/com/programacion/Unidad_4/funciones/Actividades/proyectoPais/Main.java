package com.programacion.Unidad_4.funciones.Actividades.proyectoPais;

public class Main {

    public static void main(String[] args) {

        Pais espana = new Pais("Madrid", "Mediterraneo");
        Pais francia = new Pais("Paris", "Mediterraneo");
        Pais ucrania = new Pais("Kiev", "Continental");

        System.out.println(espana.capital);
        System.out.println(francia.capital);

        espana.nhabitantes = 47;
        francia.nhabitantes = 60;
        ucrania.nhabitantes = 43;

        System.out.println(espana.nhabitantes);
        System.out.println(francia.nhabitantes);
        System.out.println(ucrania.nhabitantes);

        System.out.println(espana.nPaisesUE);
        System.out.println(francia.nPaisesUE);
        System.out.println(ucrania.nPaisesUE);


    }

}
