package com.programacion.Unidad_4.funciones.Actividades.proyectoCombate;

import com.programacion.Unidad_4.funciones.Actividades.proyectoCombate.Clases.Pokedex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double fuerzaPokemon1 = 0.0;
        double fuerzaPokemon2;
        String tipo1 = "";
        String tipo2 = "";
        String pokemon1;
        String pokemon2;

        System.out.print("Introduzca el primer pokemon: ");
        pokemon1 = scan.next();
        System.out.print("Introduzca el segundo pokemon: ");
        pokemon2 = scan.next();

        boolean checkPokemon1 = Pokedex.checkPokemon(pokemon1);
        boolean checkPokemon2 = Pokedex.checkPokemon(pokemon2);

        System.out.println("Comprobando si los pokemons son validos");
        if (checkPokemon1 && checkPokemon2) {
            System.out.println("Los pokemons introducidos son validos");
        } else {
            System.out.println("Los pokemons no son validos");
        }

        if (pokemon1.equals("Pikachu")){
            fuerzaPokemon1 = 10;
            tipo1 = "rayo";
        } else if (pokemon1.equals("Charmander")) {
            fuerzaPokemon1 = 10;
            tipo1 = "fuego";
        } else if (pokemon1.equals("Exeggutor")) {
            fuerzaPokemon1 = 10;
            tipo1 = "planta";
        } else if (pokemon1.equals("Sandslash")) {
            fuerzaPokemon1 = 10;
            tipo1 = "tierra";
        } else if (pokemon1.equals("Vaporeon")) {
            fuerzaPokemon1 = 10;
            tipo1 = "agua";
        }

        if (pokemon2.equals("Pikachu")){
            fuerzaPokemon2 = 10;
            tipo2 = "rayo";
        } else if (pokemon2.equals("Charmander")) {
            fuerzaPokemon2 = 10;
            tipo2 = "fuego";
        } else if (pokemon2.equals("Exeggutor")) {
            fuerzaPokemon2 = 10;
            tipo2 = "planta";
        } else if (pokemon2.equals("Sandslash")) {
            fuerzaPokemon2 = 10;
            tipo2 = "tierra";
        } else if (pokemon2.equals("Vaporeon")) {
            fuerzaPokemon2 = 10;
            tipo2 = "agua";
        }

        double efectividad = Pokedex.checkEfectividad(tipo1, tipo2);
        efectividad = efectividad * fuerzaPokemon1;
        System.out.println("El daño que le ha hecho "+pokemon1+ " a"+ pokemon2 + "es: "+ efectividad);

    }

}
