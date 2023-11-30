package com.programacion.Unidad_4.funciones.Clases;

import java.util.Scanner;

public class Pokemon {

    // Variable global
    static String pikachu = "Pikachu";

    public static void main(String [] args) {
        System.out.println("Introduzca un pokemon");
        Scanner scan = new Scanner(System.in);
        String pokemonDeUsuario = scan.next();

        boolean pokemonEsValido = false;
        pokemonEsValido = esValido (pokemonDeUsuario);

        if (pokemonEsValido) {
            System.out.println("Pika!");
        } else {
            System.out.println("no pika");
        }

    }

    /**
     * Metodo que comprueba si el pokemon es pikachu
     * @param pokemon
     * @return
     */
    public static boolean esValido (String pokemon) {
        if (pokemon.equalsIgnoreCase(pikachu)){
            return true;
        } else {
            return false;
        }
    }

    public static void setRaichu(String nombreRaichu){
        pikachu = nombreRaichu;
    }

}
