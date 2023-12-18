package com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon;


import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.Clases.Ataque;
import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.Clases.Jugador;
import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.Clases.Pokemon;
import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.Clases.Tipo;

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
        Ataque punioDinamico = new Ataque("Punio Dinamico", lucha, 100);

        machamp.ataques[0] = tajoCruzado;
        machamp.ataques[1] = golpBis;
        machamp.ataques[2] = desarme;
        machamp.ataques[3] = punioDinamico;


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

        int contador1 = 0;
        int contador2 = 0;
        int pokemonsElegidos = 0;

        do {


            System.out.println("1. Pikachu");
            System.out.println("2. Alakazam");
            System.out.println("3. Marowak");
            System.out.println("4. Machamp");
            System.out.println("5. Rapidash");
            System.out.println("6. Umbreom");


            System.out.println("Elige " + jugador1.usuario);
            int eleccionJugador1 = scan.nextInt();

            if (contador1 <= 2) {

                if (eleccionJugador1 == 1) {

                    jugador1.equipo[contador1] = pikachu;
                    contador1++;
                    System.out.println(pikachu.nombre + " aniadido");

                } else if (eleccionJugador1 == 2) {

                    jugador1.equipo[contador1] = alakazam;
                    contador1++;
                    System.out.println(alakazam.nombre + " aniadido");

                } else if (eleccionJugador1 == 3) {

                    jugador1.equipo[contador1] = marowak;
                    contador1++;
                    System.out.println(marowak.nombre + " aniadido");

                } else if (eleccionJugador1 == 4) {

                    jugador1.equipo[contador1] = machamp;
                    contador1++;
                    System.out.println(machamp.nombre + " aniadido");

                } else if (eleccionJugador1 == 5) {

                    jugador1.equipo[contador1] = rapidash;
                    contador1++;
                    System.out.println(rapidash.nombre + " aniadido");

                } else if (eleccionJugador1 == 6) {

                    jugador1.equipo[contador1] = umbreon;
                    contador1++;
                    System.out.println(umbreon.nombre + " aniadido");

                }
            }

            System.out.println("Elige " + jugador2.usuario);
            int eleccionJugador2 = scan.nextInt();
            boolean pokemonEstaElegido = false;

            if (contador2 <= 2) {

                if (eleccionJugador2 == 1) {

                    jugador2.equipo[contador2] = pikachu;
                    contador2++;

                    for (int i = 0; i <= jugador1.equipo.length - 1; i++) {


                        if (jugador1.equipo[i] == pikachu) {

                            pokemonEstaElegido = true;
                            contador2--;
                            pokemonsElegidos--;
                            break;

                        }

                    }

                    if (pokemonEstaElegido) {

                        System.out.println(pikachu.nombre + " ya ha sido elegido por " + jugador1.usuario);

                    } else {

                        System.out.println(pikachu.nombre + " se ha unido a tu equipo");

                    }


                } else if (eleccionJugador2 == 2) {

                    jugador2.equipo[contador2] = alakazam;
                    contador2++;

                    for (int i = 0; i <= jugador1.equipo.length - 1; i++) {

                        if (jugador1.equipo[i] == alakazam) {

                            pokemonEstaElegido = true;
                            contador2--;
                            pokemonsElegidos--;
                            break;

                        }

                    }

                    if (pokemonEstaElegido) {

                        System.out.println(alakazam.nombre + " ya ha sido elegido por " + jugador1.usuario);

                    } else {

                        System.out.println(alakazam.nombre + " se ha unido a tu equipo");

                    }


                } else if (eleccionJugador2 == 3) {

                    jugador2.equipo[contador2] = marowak;
                    contador2++;

                    for (int i = 0; i <= jugador1.equipo.length - 1; i++) {

                        if (jugador1.equipo[i] == marowak) {

                            pokemonEstaElegido = true;
                            pokemonsElegidos--;
                            contador2--;
                            break;

                        }

                    }
                    if (pokemonEstaElegido) {

                        System.out.println(marowak.nombre + " ya ha sido elegido por " + jugador1.usuario);

                    } else {

                        System.out.println(marowak.nombre + " se ha unido a tu equipo");

                    }


                } else if (eleccionJugador2 == 4) {

                    jugador2.equipo[contador2] = machamp;
                    contador2++;

                    for (int i = 0; i <= jugador1.equipo.length - 1; i++) {

                        if (jugador1.equipo[i] == machamp) {

                            pokemonEstaElegido = true;
                            pokemonsElegidos--;
                            contador2--;
                            break;

                        }

                    }
                    if (pokemonEstaElegido) {

                        System.out.println(machamp.nombre + " ya ha sido elegido por " + jugador1.usuario);

                    } else {

                        System.out.println(machamp.nombre + " se ha unido a tu equipo");

                    }


                } else if (eleccionJugador2 == 5) {

                    jugador2.equipo[contador2] = rapidash;
                    contador2++;

                    for (int i = 0; i <= jugador1.equipo.length - 1; i++) {

                        if (jugador1.equipo[i] == rapidash) {

                            pokemonEstaElegido = true;
                            pokemonsElegidos--;
                            contador2--;
                            break;

                        }

                    }
                    if (pokemonEstaElegido) {

                        System.out.println(rapidash.nombre + " ya ha sido elegido por " + jugador1.usuario);

                    } else {

                        System.out.println(rapidash.nombre + " se ha unido a tu equipo");

                    }


                } else if (eleccionJugador2 == 6) {

                    jugador2.equipo[contador2] = umbreon;
                    contador2++;

                    for (int i = 0; i <= jugador1.equipo.length - 1; i++) {

                        if (jugador1.equipo[i] == umbreon) {

                            pokemonEstaElegido = true;
                            pokemonsElegidos--;
                            contador2--;
                            break;

                        }

                    }
                    if (pokemonEstaElegido) {

                        System.out.println(umbreon.nombre + "ya ha sido elegido por " + jugador1.usuario);

                    } else {

                        System.out.println(umbreon.nombre + "se ha unido a tu equipo");

                    }
                }
            }

            pokemonsElegidos++;


        } while (pokemonsElegidos != 3);

        System.out.println("Comienza el combate");
        int opcAtaque;
        do {
            if (jugador1.equipo[0].vida > 0 || jugador1.equipo[1].vida > 0 || jugador1.equipo[2].vida > 0) {
                if (jugador1.equipo[0].vida > 0) {
                    System.out.println("Ataca " + jugador1.usuario);
                    System.out.println("0. " + jugador1.equipo[0].ataques[0].nombre);
                    System.out.println("1. " + jugador1.equipo[0].ataques[1].nombre);
                    System.out.println("2. " + jugador1.equipo[0].ataques[2].nombre);
                    System.out.println("3. " + jugador1.equipo[0].ataques[3].nombre);
                    opcAtaque = scan.nextInt();
                    if (jugador2.equipo[0].vida > 0) {
                        jugador2.equipo[0].RecibirAtaque(jugador1.equipo[0].ataques[opcAtaque]);
                        if (jugador2.equipo[0].vida <= 0) {
                            System.out.println("Pokemon debilitado");
                            System.out.println("Adelante " + jugador2.equipo[1].nombre);
                        }
                    } else if (jugador2.equipo[0].vida <= 0 && jugador2.equipo[1].vida > 0) {
                        jugador2.equipo[1].RecibirAtaque(jugador1.equipo[0].ataques[opcAtaque]);
                        if (jugador2.equipo[1].vida <= 0 && jugador2.equipo[2].vida > 0) {
                            System.out.println("Pokemon debiltiado");
                            System.out.println("Adelante " + jugador2.equipo[2].nombre);
                        }
                    } else if (jugador2.equipo[1].vida <= 0 && jugador2.equipo[2].vida > 0) {
                        jugador2.equipo[2].RecibirAtaque(jugador1.equipo[0].ataques[opcAtaque]);
                        if (jugador2.equipo[2].vida <= 0) {
                            System.out.println("Pokemon debilitado");
                        }
                    }
                } else if (jugador1.equipo[0].vida <= 0 && jugador1.equipo[1].vida > 0) {
                    System.out.println("Ataca " + jugador1.usuario);
                    System.out.println("0. " + jugador1.equipo[1].ataques[0].nombre);
                    System.out.println("1. " + jugador1.equipo[1].ataques[1].nombre);
                    System.out.println("2. " + jugador1.equipo[1].ataques[2].nombre);
                    System.out.println("3. " + jugador1.equipo[1].ataques[3].nombre);
                    opcAtaque = scan.nextInt();
                    if (jugador2.equipo[0].vida > 0) {
                        jugador2.equipo[0].RecibirAtaque(jugador1.equipo[1].ataques[opcAtaque]);
                        if (jugador2.equipo[0].vida <= 0) {
                            System.out.println("Pokemon debilitado");
                            System.out.println("Adelante " + jugador2.equipo[1].nombre);
                        }
                    } else if (jugador2.equipo[0].vida <= 0 && jugador2.equipo[1].vida > 0) {
                        jugador2.equipo[1].RecibirAtaque(jugador1.equipo[1].ataques[opcAtaque]);
                        if (jugador2.equipo[1].vida <= 0 && jugador2.equipo[2].vida > 0) {
                            System.out.println("Pokemon debiltiado");
                            System.out.println("Adelante " + jugador2.equipo[2].nombre);
                        }
                    } else if (jugador2.equipo[1].vida <= 0 && jugador2.equipo[2].vida > 0) {
                        jugador2.equipo[2].RecibirAtaque(jugador1.equipo[1].ataques[opcAtaque]);
                        if (jugador2.equipo[2].vida <= 0) {
                            System.out.println("Pokemon debilitado");
                        }
                    }
                } else if (jugador1.equipo[0].vida <= 0 && jugador1.equipo[2].vida > 0) {
                    System.out.println("Ataca " + jugador1.usuario);
                    System.out.println("0. " + jugador1.equipo[2].ataques[0].nombre);
                    System.out.println("1. " + jugador1.equipo[2].ataques[1].nombre);
                    System.out.println("2. " + jugador1.equipo[2].ataques[2].nombre);
                    System.out.println("3. " + jugador1.equipo[2].ataques[3].nombre);
                    opcAtaque = scan.nextInt();
                    if (jugador2.equipo[0].vida > 0) {
                        jugador2.equipo[0].RecibirAtaque(jugador1.equipo[0].ataques[opcAtaque]);
                        if (jugador2.equipo[0].vida <= 0) {
                            System.out.println("Pokemon debilitado");
                            System.out.println("Adelante " + jugador2.equipo[1].nombre);
                        }
                    } else if (jugador2.equipo[0].vida <= 0 && jugador2.equipo[1].vida > 0) {
                        jugador2.equipo[1].RecibirAtaque(jugador1.equipo[1].ataques[opcAtaque]);
                        if (jugador2.equipo[1].vida <= 0 && jugador2.equipo[2].vida > 0) {
                            System.out.println("Pokemon debiltiado");
                            System.out.println("Adelante " + jugador2.equipo[2].nombre);
                        }
                    } else if (jugador2.equipo[1].vida <= 0 && jugador2.equipo[2].vida > 0) {
                        jugador2.equipo[2].RecibirAtaque(jugador1.equipo[2].ataques[opcAtaque]);
                        if (jugador2.equipo[2].vida <= 0) {
                            System.out.println("Pokemon debilitado");
                        }
                    }
                }
            }
            if ((jugador1.equipo[0].vida > 0 || jugador1.equipo[1].vida > 0 || jugador1.equipo[2].vida > 0) && (jugador2.equipo[0].vida > 0 || jugador2.equipo[1].vida > 0 || jugador2.equipo[2].vida > 0)) {
                if (jugador2.equipo[0].vida > 0) {
                    System.out.println("Ataca " + jugador2.usuario);
                    System.out.println("0. " + jugador2.equipo[0].ataques[0].nombre);
                    System.out.println("1. " + jugador2.equipo[0].ataques[1].nombre);
                    System.out.println("2. " + jugador2.equipo[0].ataques[2].nombre);
                    System.out.println("3. " + jugador2.equipo[0].ataques[3].nombre);
                    opcAtaque = scan.nextInt();
                    if (jugador1.equipo[0].vida > 0) {
                        jugador1.equipo[0].RecibirAtaque(jugador2.equipo[0].ataques[opcAtaque]);
                        if (jugador1.equipo[0].vida <= 0) {
                            System.out.println("Pokemon debilitado");
                            System.out.println("Adelante " + jugador1.equipo[1].nombre);
                        }
                    } else if (jugador1.equipo[0].vida <= 0 && jugador1.equipo[1].vida > 0) {
                        jugador1.equipo[1].RecibirAtaque(jugador2.equipo[0].ataques[opcAtaque]);
                        if (jugador1.equipo[1].vida <= 0 && jugador1.equipo[2].vida > 0) {
                            System.out.println("Pokemon debiltiado");
                            System.out.println("Adelante " + jugador1.equipo[2].nombre);
                        }
                    } else if (jugador1.equipo[1].vida <= 0 && jugador1.equipo[2].vida > 0) {
                        jugador1.equipo[2].RecibirAtaque(jugador2.equipo[0].ataques[opcAtaque]);
                        if (jugador1.equipo[2].vida <= 0) {
                            System.out.println("Pokemon debilitado");
                        }
                    }
                } else if (jugador2.equipo[0].vida <= 0 && jugador2.equipo[1].vida > 0) {
                    System.out.println("Ataca " + jugador2.usuario);
                    System.out.println("0. " + jugador2.equipo[1].ataques[0].nombre);
                    System.out.println("1. " + jugador2.equipo[1].ataques[1].nombre);
                    System.out.println("2. " + jugador2.equipo[1].ataques[2].nombre);
                    System.out.println("3. " + jugador2.equipo[1].ataques[3].nombre);
                    opcAtaque = scan.nextInt();
                    if (jugador1.equipo[0].vida > 0) {
                        jugador1.equipo[0].RecibirAtaque(jugador2.equipo[1].ataques[opcAtaque]);
                        if (jugador1.equipo[0].vida <= 0) {
                            System.out.println("Pokemon debilitado");
                            System.out.println("Adelante " + jugador1.equipo[1].nombre);
                        }
                    } else if (jugador1.equipo[0].vida <= 0 && jugador1.equipo[1].vida > 0) {
                        jugador1.equipo[1].RecibirAtaque(jugador2.equipo[1].ataques[opcAtaque]);
                        if (jugador1.equipo[1].vida <= 0 && jugador1.equipo[2].vida > 0) {
                            System.out.println("Pokemon debiltiado");
                            System.out.println("Adelante " + jugador1.equipo[2].nombre);
                        }
                    } else if (jugador1.equipo[1].vida <= 0 && jugador1.equipo[2].vida > 0) {
                        jugador1.equipo[2].RecibirAtaque(jugador2.equipo[1].ataques[opcAtaque]);
                        if (jugador1.equipo[2].vida <= 0) {
                            System.out.println("Pokemon debilitado");
                        }
                    }
                } else if (jugador2.equipo[0].vida <= 0 && jugador2.equipo[2].vida > 0) {
                    System.out.println("Ataca " + jugador2.usuario);
                    System.out.println("0. " + jugador2.equipo[2].ataques[0].nombre);
                    System.out.println("1. " + jugador2.equipo[2].ataques[1].nombre);
                    System.out.println("2. " + jugador2.equipo[2].ataques[2].nombre);
                    System.out.println("3. " + jugador2.equipo[2].ataques[3].nombre);
                    opcAtaque = scan.nextInt();
                    if (jugador1.equipo[0].vida > 0) {
                        jugador1.equipo[0].RecibirAtaque(jugador2.equipo[2].ataques[opcAtaque]);
                        if (jugador1.equipo[0].vida <= 0) {
                            System.out.println("Pokemon debilitado");
                            System.out.println("Adelante " + jugador1.equipo[1].nombre);
                        }
                    } else if (jugador1.equipo[0].vida <= 0 && jugador1.equipo[1].vida > 0) {
                        jugador1.equipo[1].RecibirAtaque(jugador2.equipo[2].ataques[opcAtaque]);
                        if (jugador1.equipo[1].vida <= 0 && jugador1.equipo[2].vida > 0) {
                            System.out.println("Pokemon debiltiado");
                            System.out.println("Adelante " + jugador1.equipo[2].nombre);
                        }
                    } else if (jugador1.equipo[1].vida <= 0 && jugador1.equipo[2].vida > 0) {
                        jugador1.equipo[2].RecibirAtaque(jugador2.equipo[2].ataques[opcAtaque]);
                        if (jugador1.equipo[2].vida <= 0) {
                            System.out.println("Pokemon debilitado");
                        }
                    }
                }
            }
            if (jugador1.equipo[0].vida <= 0 && jugador1.equipo[1].vida <= 0 && jugador1.equipo[2].vida <= 0) {
                System.out.println("Todos los pokemons de " + jugador1.usuario + " han sido debilitados");
                System.out.println(jugador2 + " ha ganado el combate");
            } else if (jugador2.equipo[0].vida <= 0 && jugador2.equipo[1].vida <= 0 && jugador2.equipo[2].vida <= 0) {
                System.out.println("Todos los pokemons de " + jugador2.usuario + " han sido debilitados");
                System.out.println(jugador1 + " ha ganado el combate");
            }
        } while ((jugador1.equipo[0].vida > 0 || jugador1.equipo[1].vida > 0 || jugador1.equipo[2].vida > 0) && (jugador2.equipo[0].vida > 0 || jugador2.equipo[1].vida > 0 || jugador2.equipo[2].vida > 0));
    }
}
