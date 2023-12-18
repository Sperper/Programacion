package com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon;


import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.Clases.Ataque;
import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.Clases.Jugador;
import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.Clases.Pokemon;
import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.Clases.Tipo;

import java.util.Scanner;

/**
 * Clase main
 */
public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Objeto escaner para que lea el teclado
        /*
        Se inicializan los tipos
         */
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

        /*
        Se inicializan los pokemons junto con sus ataques
         */
        Pokemon pikachu = new Pokemon("PIKACHU", 200.00, electrico);
        pikachu.lore = "Pikachu almacena una gran cantidad de electricidad en sus mejillas. Estas parecen cargarse eléctricamente" +
                "durante la noche mientras dueme. Las mejillas de Pikachu también pueden ser recargadas mediante una descarga electrica";

        Ataque chispa = new Ataque("Chispa", electrico, 65);
        Ataque amago = new Ataque("Amago", normal, 30);
        Ataque bolaVoltio = new Ataque("Bola Voltio", electrico, 100);
        Ataque ataqueRapido = new Ataque("Ataque Rapido", normal, 40);

        pikachu.ataques[0] = chispa;
        pikachu.ataques[1] = amago;
        pikachu.ataques[2] = bolaVoltio;
        pikachu.ataques[3] = ataqueRapido;


        Pokemon alakazam = new Pokemon("ALAKAZAM", 200.00, psiquico);
        alakazam.lore = "Alakazam es un Pokemon tipo psiquico, que se caracteriza por un gran poder mental. Posee dos cucharas, " +
                "una en cada mano, que aumentan sus poderes psiquico. Curiosamente a diferencia a su preevolución Kadabra, " +
                "Alakazam tiene dos cucharas en vez de una. El cerebro de este Pokemon nunca deja de crecer y el numero de neuronas " +
                "nunca deja de aumentar";

        Ataque confusion = new Ataque("Confusion", psiquico, 50);
        Ataque psicorrayo = new Ataque("Psicorrayo", psiquico, 65);
        Ataque placaje = new Ataque("Placaje", normal, 20);
        Ataque psicocorte = new Ataque("Psicocorte", psiquico, 70);

        alakazam.ataques[0] = confusion;
        alakazam.ataques[1] = psicorrayo;
        alakazam.ataques[2] = placaje;
        alakazam.ataques[3] = psicocorte;


        Pokemon marowak = new Pokemon("MAROWAK", 200.00, tierra);
        marowak.lore = "Tras evolucionar de Cubone, su craneo y la coraza osea que lleva sobre la cabeza se fusionan, formando " +
                "una nueva coraza mucho mas comoda y resistente que la anterior. Es un Pokemon muy solitario, solo se puede ver " +
                "a los Marowak en un grupo durante la temporada de apareamiento. Durante este tiempo se los ve embestirse para chocar " +
                "sus corazas oseas y medir fuerzas";

        Ataque huesoPalo = new Ataque("Hueso Palo", tierra, 65);
        Ataque dobleFilo = new Ataque("Doble Filo", normal, 120);
        Ataque pataleta = new Ataque("Pataleta", tierra, 20);
        Ataque golpe = new Ataque("Golpe", normal, 100);

        marowak.ataques[0] = huesoPalo;
        marowak.ataques[1] = dobleFilo;
        marowak.ataques[2] = pataleta;
        marowak.ataques[3] = golpe;


        Pokemon machamp = new Pokemon("MACHAMP", 200.00, lucha);
        machamp.lore = "Es uno de los Pokemon tipo lucha mas fuertes, dominando cualquier tipo de arte marcial; es capaz de dar 1000 golpes " +
                "en tan solo dos segundos, y si toma al rival por los pies con sus cuatro brazos, lo lanzará lo más lejos posiblle, ganando " +
                "facilmente un combate.";

        Ataque tajoCruzado = new Ataque("Tajo Cruzado", lucha, 100);
        Ataque golpBis = new Ataque("Golpe Bis", dragon, 40);
        Ataque desarme = new Ataque("Desarme", siniestro, 65);
        Ataque punioDinamico = new Ataque("Punio Dinamico", lucha, 100);

        machamp.ataques[0] = tajoCruzado;
        machamp.ataques[1] = golpBis;
        machamp.ataques[2] = desarme;
        machamp.ataques[3] = punioDinamico;


        Pokemon rapidash = new Pokemon("RAPIDASH", 200.00, fuego);
        rapidash.lore = "Este pokemon vive en praderas muy extensas, campos y llanuras y suele ser algo solitario. En cuanto a velocidad se refiere, " +
                "puede ompetir con Dodrio y su  velocidad oscila entre 200 y 400 km/h, ya que es muy agil, aunque no es " +
                "el Pokemon mas rapido";

        Ataque llamarada = new Ataque("Llamarada", fuego, 110);
        Ataque bote = new Ataque("Bote", volador, 85);
        Ataque nitrocarga = new Ataque("Nitrocarga", fuego, 50);
        Ataque megacuerno = new Ataque("Megacuerno", bicho, 100);

        rapidash.ataques[0] = llamarada;
        rapidash.ataques[1] = bote;
        rapidash.ataques[2] = nitrocarga;
        rapidash.ataques[3] = megacuerno;


        Pokemon umbreon = new Pokemon("UMBREON", 200.00, siniestro);
        umbreon.lore = "Cuando el vinculo afectivo entre Eevee y su entrenador sea lo suficientemente alto, y se acostumbra a " +
                "entrenar al atardecer o por la noche a Eevee, estará preparado para evolucionar en Umbreon. Este Pokemon " +
                "tiene todo su pelaje de color negro, exceptuando circunferencias de un color amarillo que puede iluminar a su " +
                "voluntad.";

        Ataque ultimaBaza = new Ataque("Ultima Baza", normal, 100);
        Ataque finta = new Ataque("Finta", siniestro, 60);
        Ataque persecucion = new Ataque("Persecucion", siniestro, 40);

        umbreon.ataques[0] = ultimaBaza;
        umbreon.ataques[1] = finta;
        umbreon.ataques[2] = ataqueRapido;
        umbreon.ataques[3] = persecucion;

        System.out.println("Introduzca el usuario del jugador 1: ");
        String usuario1 = scan.next(); // Lee el usuario por teclado
        Jugador jugador1 = new Jugador(usuario1); // Inicializa jugador 1 y se le asigna el usuario 1

        System.out.println("Introduzca el usuario del jugador 2: ");
        String usuario2 = scan.next(); // Lee el usuario 2 introducido por teclado
        Jugador jugador2 = new Jugador(usuario2); // Inicializa jugador 2 y se le asigna el usuario 2

        int contador1 = 0; // Contador que sirve para asignar los pokemons a un espacio del array del equipo del jugador especifico
        int contador2 = 0; // Contador que sire para asignar los pokemons a un espacio del array del equipo del jugador 2 especifico
        int pokemonsElegidos = 0; // Contador que sirve para que el bucle de un número de vueltas específico

        do { // Bucle para la seleccion de los pokemons


            System.out.println("1. Pikachu");
            System.out.println("2. Alakazam");
            System.out.println("3. Marowak");
            System.out.println("4. Machamp");
            System.out.println("5. Rapidash");
            System.out.println("6. Umbreom");




            if (contador1 <= 2) { // if para que se le añada el pokemon al jugador 1

                System.out.println("Elige " + jugador1.usuario);
                int eleccionJugador1 = scan.nextInt(); // selecciona el pokemon

                if (eleccionJugador1 == 1) {

                    jugador1.equipo[contador1] = pikachu;
                    contador1++;
                    Jugador.comprobarPokemonEquipo(pikachu, jugador2.equipo); // Llama al metido comprobarPokemonEquipo de la clase jugador para comprobar si el pokemon está elegido

                    if (Jugador.comprobarPokemonEquipo(pikachu, jugador2.equipo)) {
                        pokemonsElegidos --;
                        System.out.println("El pokemon ya ha sido elegido por el otro jugador");
                    } else {
                        System.out.println(pikachu.nombre+" se ha unido a tu equipo");
                    }

                } else if (eleccionJugador1 == 2) {

                    jugador1.equipo[contador1] = alakazam;
                    contador1++;
                    Jugador.comprobarPokemonEquipo(alakazam, jugador2.equipo);

                    if (Jugador.comprobarPokemonEquipo(alakazam, jugador2.equipo)) {
                        pokemonsElegidos --;
                        System.out.println("El pokemon ya ha sido elegido por el otro jugador");
                    } else {
                        System.out.println(alakazam.nombre+" se ha unido a tu equipo");
                    }

                } else if (eleccionJugador1 == 3) {

                    jugador1.equipo[contador1] = marowak;
                    contador1++;
                    Jugador.comprobarPokemonEquipo(marowak, jugador2.equipo);

                    if (Jugador.comprobarPokemonEquipo(marowak, jugador2.equipo)) {
                        pokemonsElegidos --;
                        System.out.println("El pokemon ya ha sido elegido por el otro jugador");
                    } else {
                        System.out.println(marowak.nombre+" se ha unido a tu equipo");
                    }

                } else if (eleccionJugador1 == 4) {

                    jugador1.equipo[contador1] = machamp;
                    contador1++;
                    Jugador.comprobarPokemonEquipo(machamp, jugador2.equipo);

                    if (Jugador.comprobarPokemonEquipo(machamp, jugador2.equipo)) {
                        pokemonsElegidos --;
                        System.out.println("El pokemon ya ha sido elegido por el otro jugador");
                    } else {
                        System.out.println(machamp.nombre+" se ha unido a tu equipo");
                    }

                } else if (eleccionJugador1 == 5) {

                    jugador1.equipo[contador1] = rapidash;
                    contador1++;
                    Jugador.comprobarPokemonEquipo(rapidash, jugador2.equipo);

                    if (Jugador.comprobarPokemonEquipo(rapidash, jugador2.equipo)) {
                        pokemonsElegidos --;
                        System.out.println("El pokemon ya ha sido elegido por el otro jugador");
                    } else {
                        System.out.println(rapidash.nombre+" se ha unido a tu equipo");
                    }

                } else if (eleccionJugador1 == 6) {

                    jugador1.equipo[contador1] = umbreon;
                    contador1++;
                    Jugador.comprobarPokemonEquipo(umbreon, jugador2.equipo);

                    if (Jugador.comprobarPokemonEquipo(umbreon, jugador2.equipo)) {
                        pokemonsElegidos --;
                        System.out.println("El pokemon ya ha sido elegido por el otro jugador");
                    } else {
                        System.out.println(umbreon.nombre+" se ha unido a tu equipo");
                    }

                }
                
            }

            if (contador2 <= 2) { // if que asigna el pokemon al jugador 2

                System.out.println("Elige " + jugador2.usuario);
                int eleccionJugador2 = scan.nextInt(); // Elige pokemon dependiendo del numero introducido por teclado


                if (eleccionJugador2 == 1) {

                    jugador2.equipo[contador2] = pikachu;
                    contador2++;
                    Jugador.comprobarPokemonEquipo(pikachu, jugador1.equipo);

                    if (Jugador.comprobarPokemonEquipo(pikachu, jugador1.equipo)) {
                        pokemonsElegidos --;
                        System.out.println("El pokemon ya ha sido elegido por el otro jugador");
                    } else {
                        System.out.println(pikachu.nombre+" se ha unido a tu equipo");
                    }

                } else if (eleccionJugador2 == 2) {

                    jugador2.equipo[contador2] = alakazam;
                    contador2++;
                    Jugador.comprobarPokemonEquipo(alakazam, jugador1.equipo);

                    if (Jugador.comprobarPokemonEquipo(alakazam, jugador1.equipo)) {
                        pokemonsElegidos --;
                        System.out.println("El pokemon ya ha sido elegido por el otro jugador");
                    } else {
                        System.out.println(alakazam.nombre+" se ha unido a tu equipo");
                    }

                } else if (eleccionJugador2 == 3) {

                    jugador2.equipo[contador2] = marowak;
                    contador2++;
                    Jugador.comprobarPokemonEquipo(marowak, jugador1.equipo);

                    if (Jugador.comprobarPokemonEquipo(marowak, jugador1.equipo)) {
                        pokemonsElegidos --;
                        System.out.println("El pokemon ya ha sido elegido por el otro jugador");
                    } else {
                        System.out.println(marowak.nombre+" se ha unido a tu equipo");
                    }

                } else if (eleccionJugador2 == 4) {

                    jugador2.equipo[contador2] = machamp;
                    contador2++;
                    Jugador.comprobarPokemonEquipo(machamp, jugador1.equipo);

                    if (Jugador.comprobarPokemonEquipo(machamp, jugador1.equipo)) {
                        pokemonsElegidos --;
                        System.out.println("El pokemon ya ha sido elegido por el otro jugador");
                    } else {
                        System.out.println(machamp.nombre+" se ha unido a tu equipo");
                    }

                } else if (eleccionJugador2 == 5) {

                    jugador2.equipo[contador2] = rapidash;
                    contador2++;
                    Jugador.comprobarPokemonEquipo(rapidash, jugador1.equipo);

                    if (Jugador.comprobarPokemonEquipo(rapidash, jugador1.equipo)) {
                        pokemonsElegidos --;
                        System.out.println("El pokemon ya ha sido elegido por el otro jugador");
                    } else {
                        System.out.println(rapidash.nombre+" se ha unido a tu equipo");
                    }

                } else if (eleccionJugador2 == 6) {

                    jugador2.equipo[contador2] = umbreon;
                    contador2++;
                    Jugador.comprobarPokemonEquipo(umbreon, jugador1.equipo);

                    if (Jugador.comprobarPokemonEquipo(umbreon, jugador1.equipo)) {
                        pokemonsElegidos --;
                        System.out.println("El pokemon ya ha sido elegido por el otro jugador");
                    } else {
                        System.out.println(umbreon.nombre+" se ha unido a tu equipo");
                    }

                }
            }


            pokemonsElegidos++;


        } while (pokemonsElegidos != 3);

        System.out.println("Comienza el combate");
        int opcAtaque; // opc del ataque que se va a seleccionar
        do { // bucle do-while para realizar el combate
            if (jugador1.equipo[0].vida > 0 || jugador1.equipo[1].vida > 0 || jugador1.equipo[2].vida > 0) { //if para que ataque el jugador 1
                if (jugador1.equipo[0].vida > 0) {
                    System.out.println("Ataca " + jugador1.usuario);
                    jugador1.equipo[0].mostrarAtaques();

                    opcAtaque = scan.nextInt(); // lee la opcion que se ha introducido por el teclado
                    if (jugador2.equipo[0].vida > 0) { // if que revisa que pokemon del jugador 2 tiene que recibir el ataque
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
                    jugador1.equipo[1].mostrarAtaques();
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
                } else if (jugador1.equipo[1].vida <= 0 && jugador1.equipo[2].vida > 0) {
                    System.out.println("Ataca " + jugador1.usuario);
                    jugador1.equipo[2].mostrarAtaques();
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
            if ((jugador1.equipo[0].vida > 0 || jugador1.equipo[1].vida > 0 || jugador1.equipo[2].vida > 0) && (jugador2.equipo[0].vida > 0 || jugador2.equipo[1].vida > 0 || jugador2.equipo[2].vida > 0)) { // if para que ataque el jugador 2
                if (jugador2.equipo[0].vida > 0) {
                    System.out.println("Ataca " + jugador2.usuario);
                    jugador2.equipo[0].mostrarAtaques();
                    opcAtaque = scan.nextInt();

                    if (jugador1.equipo[0].vida > 0) { // if que revisa que pokemon del jugador 1 recibe el ataque
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
                    jugador2.equipo[1].mostrarAtaques();
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
                } else if (jugador2.equipo[1].vida <= 0 && jugador2.equipo[2].vida > 0) {
                    System.out.println("Ataca " + jugador2.usuario);
                    jugador2.equipo[2].mostrarAtaques();
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
            if (jugador1.equipo[0].vida <= 0 && jugador1.equipo[1].vida <= 0 && jugador1.equipo[2].vida <= 0) { // if para que muestre que jugador ha ganado dependiendo del equipo que no tenga vida
                System.out.println("Todos los pokemons de " + jugador1.usuario + " han sido debilitados");
                System.out.println(jugador2 + " ha ganado el combate");
            } else if (jugador2.equipo[0].vida <= 0 && jugador2.equipo[1].vida <= 0 && jugador2.equipo[2].vida <= 0) {
                System.out.println("Todos los pokemons de " + jugador2.usuario + " han sido debilitados");
                System.out.println(jugador1 + " ha ganado el combate");
            }
        } while ((jugador1.equipo[0].vida > 0 || jugador1.equipo[1].vida > 0 || jugador1.equipo[2].vida > 0) && (jugador2.equipo[0].vida > 0 || jugador2.equipo[1].vida > 0 || jugador2.equipo[2].vida > 0)); // fin de do-while
    } // FIN DE MAIN
} // FIN DE CLASE
