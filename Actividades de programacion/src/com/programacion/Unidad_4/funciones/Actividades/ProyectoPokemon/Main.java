package com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon;


import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.clases.Ataque;
import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.clases.Pokemon;
import com.programacion.Unidad_4.funciones.Actividades.ProyectoPokemon.clases.Tipo;

public class Main {

    public static void main(String[] args) {

        Pokemon haxorus = new Pokemon("Haxorus", 200.00, new Tipo("Dragon"));
        haxorus.ataques = new Ataque[]{
                new Ataque("Cola Dragon", new Tipo("Dragon"), 50.00),
                new Ataque("Garra Dragon", new Tipo("Dragon"), 38.00),
                new Ataque("Terromoto", new Tipo("Tierra"), 40.00),
                new Ataque("Tajo Umbrio", new Tipo("Siniestro"), 20.00)
        };

        Pokemon meowstic = new Pokemon("Meowstic", 150.00, new Tipo("Psiquico"));
        meowstic.ataques = new Ataque[]{
                new Ataque("Bola Sombra", new Tipo("Fantasma"), 60.00),
                new Ataque("Golpe Bajo", new Tipo("Siniestro"), 30.00),
                new Ataque("Energibola", new Tipo("Planta"), 70.00),
                new Ataque("Psiquico", new Tipo("Psiquico"), 45.00)
        };

        Pokemon lycanroc = new Pokemon("Lycanrock", 175.00, new Tipo("Roca"));
        lycanroc.ataques = new Ataque[]{
                new Ataque("Roca Afilada", new Tipo("Roca"), 30.00),
                new Ataque("Triturar", new Tipo("Siniestro"), 60.00),
                new Ataque("Lanzarrocas", new Tipo("Roca"), 55.00),
                new Ataque("Treparrocas", new Tipo("Roca"), 25.00)
        };

        Pokemon pikachu = new Pokemon("Pikachu", 220.00, new Tipo("Electrico"));
        pikachu.ataques = new Ataque[]{
                new Ataque("Chispa", new Tipo("Electrico"), 60.00),
                new Ataque("Bola Voltio", new Tipo("Electrico"), 30.00),
                new Ataque("Atizar", new Tipo("Normal"), 50.00),
                new Ataque("Ataque rapido", new Tipo("Normal"), 45.00)
        };

        Pokemon rapidash = new Pokemon("Rapidash", 180.00, new Tipo("Fuego"));
        rapidash.ataques = new Ataque[]{
                new Ataque("Llamarada", new Tipo("Fuego"), 60.00),
                new Ataque("Bote", new Tipo("Volador"), 45.00),
                new Ataque("Ataque Fueria", new Tipo("Normal"), 30.00),
                new Ataque("Megacuerno", new Tipo("Bicho"), 55.00)
        };

        Pokemon seaking = new Pokemon("Seakingg", 240.00, new Tipo("Agua"));
        seaking.ataques = new Ataque[]{
                new Ataque("Puya Nociva", new Tipo("Veneno"), 45.00),
                new Ataque("Picotazo", new Tipo("Volador"), 20.00),
                new Ataque("Hidropulso", new Tipo("Agua"), 50.00),
                new Ataque("Mega Cuerno", new Tipo("Bicho"), 45.00)
        };



    }

}
