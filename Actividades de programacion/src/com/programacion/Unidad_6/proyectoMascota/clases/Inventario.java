package com.programacion.Unidad_6.proyectoMascota.clases;

import java.math.MathContext;
import java.util.ArrayList;

public class Inventario {

    private ArrayList<Mascota> mascotas;

    public Inventario() {
        mascotas = new ArrayList<>();
    }

    public void mostrarDatosAnimales(){
        for (int i=0;i< mascotas.size();i++) {
            mascotas.get(i).muestra();
        }
    }

    public void anadirMascota(Mascota m) {
        mascotas.add(m);
    }

    public boolean eliminarMascota(String nombre){

        boolean mascotaEliminada = false;
        for (int i=0; i<mascotas.size(); i++){

            // Comparamos el nombre de la mascota del arraylist con el nombre que nos
            // viene por parametros
            if (mascotas.get(i).nombre.equals(nombre)) {
                // Si, eso
                mascotas.remove(i);
                mascotaEliminada = true;
                break;
            }

        }
        return mascotaEliminada;

    }

    public void mostrarDatosDeUnAnimal(String nombre){

        // 1. Declarar un objeto de tipo mascota para almacenar la mascota encontrada
        Mascota mas = null;
        // 2. Recorro el arraylist mascotas para buscar el nombre
        for (int i=0; i<mascotas.size(); i++){
            if (mascotas.get(i).nombre.equalsIgnoreCase(nombre)) {
                mas = mascotas.get(i);
                break;
            }
        }

       try {
           mas.muestra();
       } catch (NullPointerException e) {
           System.out.println("Mascota no encontrada ...");
       }


    }

    public void vaciarInventario(){
        mascotas.clear();
    }

    public void mostrarTipoYNombreAnimal(){
        // 1. Recorremos el ArrayList
        for (int i=0; i<mascotas.size(); i++){
            // 2. Objeto temporal de tipo mascota
            Mascota m = mascotas.get(i);

            // 3. Hay que preguntar ... si m es de tipo perro ... o tipo gato ...
            String tipo = "";
            if(m instanceof Perro){
                tipo = "Perro";
            } else if (m instanceof Gato) {
                tipo = "Gato";
            } else if (m instanceof Canario) {
                tipo= "Canario";
            } else if (m instanceof Loro) {
                tipo = "Loro";
            } else {
                tipo = "Mascota";
            }

            System.out.println(m.getNombre()+": "+tipo);
        }
    }


}
