package com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon;


import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.clases.Ataque;
import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.clases.Jugador;
import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.clases.Pokemon;
import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.clases.Tipo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Tipo dragon = new Tipo("Dragon");
        Tipo veneno = new Tipo("Veneno");
        Tipo agua = new Tipo("Agua");
        Tipo volador = new Tipo("Volador");
        Tipo roca = new Tipo("Roca");
        Tipo fuego = new Tipo("Fuego");
        Tipo electrico = new Tipo("Electrico");
        Tipo acero = new Tipo("Acero");
        Tipo fantasma = new Tipo("Fantasma");
        Tipo hada = new Tipo("Hada");
        Tipo hielo = new Tipo("Hielo");
        Tipo lucha = new Tipo("Lucha");
        Tipo normal = new Tipo("Normal");
        Tipo planta = new Tipo("Planta");
        Tipo psiquico = new Tipo("Psiquico");
        Tipo siniestro = new Tipo("Siniestro");
        Tipo tierra = new Tipo("Tierra");
        Tipo bicho = new Tipo("Bicho");


        Pokemon pikachu = new Pokemon("Pikachu", 200.00, electrico);

        Ataque chispa = new Ataque("Chispa", electrico, 65);
        Ataque amago = new Ataque("Amago", normal, 30);
        Ataque bolaVoltio = new Ataque("Bola Voltio", electrico, 100);
        Ataque ataqueRapido = new Ataque("Ataque Rapido", normal, 40);

        pikachu.ataques[0] = chispa;
        pikachu.ataques[1] = amago;
        pikachu.ataques[2] = bolaVoltio;
        pikachu.ataques[3] = ataqueRapido;


        Pokemon alakazam = new Pokemon("Alakazam", 200.00, psiquico);

        Ataque confusion = new Ataque("Confusion", psiquico, 50);
        Ataque psicorrayo = new Ataque("Psicorrayo", psiquico, 65);
        Ataque placaje = new Ataque("Placaje", normal, 20);
        Ataque psicocorte = new Ataque("Psicocorte", psiquico, 70);

        alakazam.ataques[0] = confusion;
        alakazam.ataques[1] = psicorrayo;
        alakazam.ataques[2] = placaje;
        alakazam.ataques[3] = psicocorte;


        Pokemon marowak = new Pokemon("Marowak", 200.00, tierra);

        Ataque huesoPalo = new Ataque("Hueso Palo", tierra, 65);
        Ataque dobleFilo = new Ataque("Doble Filo", normal, 120);
        Ataque pataleta = new Ataque("Pataleta", tierra, 20);
        Ataque golpe = new Ataque("Golpe", normal, 100);

        marowak.ataques[0] = huesoPalo;
        marowak.ataques[1] = dobleFilo;
        marowak.ataques[2] = pataleta;
        marowak.ataques[3] = golpe;


        Pokemon machamp = new Pokemon("Machamp", 200.00, lucha);

        Ataque tajoCruzado = new Ataque("Tajo Cruzado", lucha, 100);
        Ataque golpBis = new Ataque("Golpe Bis", dragon, 40);
        Ataque desarme = new Ataque("Desarme", siniestro, 65);
        Ataque puñoDinamico = new Ataque("Puño Dinamico", lucha, 100);

        machamp.ataques[0] = tajoCruzado;
        machamp.ataques[1] = golpBis;
        machamp.ataques[2] = desarme;
        machamp.ataques[3] = puñoDinamico;


        Pokemon rapidash = new Pokemon("Rapidash", 200.00, fuego);

        Ataque llamarada = new Ataque("Llamarada", fuego, 110);
        Ataque bote = new Ataque("Bote", volador, 85);
        Ataque nitrocarga = new Ataque("Nitrocarga", fuego, 50);
        Ataque megacuerno = new Ataque("Megacuerno", bicho, 100);

        rapidash.ataques[0] = llamarada;
        rapidash.ataques[1] = bote;
        rapidash.ataques[2] = nitrocarga;
        rapidash.ataques[3] = megacuerno;


        Pokemon umbreon = new Pokemon("Umbreon", 200.00, siniestro);

        Ataque ultimaBaza = new Ataque("Ultima Baza", normal, 100);
        Ataque finta = new Ataque("Finta", siniestro, 60);
        Ataque persecucion = new Ataque("Persecucion", siniestro, 40);

        umbreon.ataques[0] = ultimaBaza;
        umbreon.ataques[1] = finta;
        umbreon.ataques[2] = ataqueRapido;
        umbreon.ataques[3] = persecucion;

        System.out.println("Introduzca el usuario del jugador 1: ");
        String usuario1 = scan.next();
        Jugador jugador1 = new Jugador(usuario1);

        System.out.println("Introduzca el usuario del jugador 2: ");
        String usuario2 = scan.next();
        Jugador jugador2 = new Jugador(usuario2);



















    }

}
