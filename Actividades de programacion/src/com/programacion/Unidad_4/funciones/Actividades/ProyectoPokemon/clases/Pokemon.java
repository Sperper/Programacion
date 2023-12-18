package com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.Clases;


import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.utils.Pokedex;


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
     * Metodo constructor para inicializar los pokemons
     * @param nombre nombre del pokemon
     * @param vida vida del pokemon
     * @param tipo tipo del pokemon
     */
    public Pokemon(String nombre, double vida, Tipo tipo) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;


    }

    /**
     * Metodo para que el pokemon reciba el ataque
     * @param ataque que realiza el pokemon que rival
     */
    public void RecibirAtaque(Ataque ataque){

        this.vida = this.vida - (ataque.danio * Pokedex.checkEfectividad(ataque.tipo, this.tipo));
        System.out.println("Vida restante de "+this.nombre+": "+this.vida);


    }

    public void mostrarAtaques(){

        System.out.println("0. "+this.ataques[0].nombre);
        System.out.println("1. "+this.ataques[1].nombre);
        System.out.println("2. "+this.ataques[2].nombre);
        System.out.println("3. "+this.ataques[3].nombre);

    }



}
