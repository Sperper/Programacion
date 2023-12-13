package com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.clases;

public class Pokemon {

    //***************************************************************
    //*********************ATRIBUTOS DE CLASE************************
    //***************************************************************

   public String nombre;
   public String lore;
   public Tipo tipo;
   public double vida;
   public Ataque[] ataques = new Ataque[4];

    //***************************************************************
    //*********************CONSTRUCTORES DE CLASE********************
    //***************************************************************

    /**
     *
     * @param nombre nombre del pokemon
     * @param vida vida del pokemon
     * @param tipo tipo del pokemon
     */
    public Pokemon(String nombre, double vida, Tipo tipo) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;


    }

    public void RecibirAtaque(Ataque ataque){

        this.vida-=ataque.danio;
        System.out.println("Vida restante de "+this.nombre+": "+this.vida);

    }
}
