package com.programacion.Unidad_6.proyectoEmpresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Articulo vaper = new Articulo("1", "Vaper de melocoton",
                new Proveedor("1", "Manolo", "Gomez Perez", "C/ CalleEjemplo 1", "12345678A"), 5, 100);
        Articulo vaper2 = new Articulo("1", "Vaper de melocoton",
                new Proveedor("1", "Manolo", "Gomez Perez", "C/ CalleEjemplo 1", "12345678A"), 5, 100);

        System.out.println(vaper.equals(vaper2));

        Proveedor proveedor = new Proveedor(UUID.randomUUID().toString(), "Manolo", "Gonzalez Gomez",
                "C/ CalleEjemplo2 3", "23456789A");
        Proveedor proveedor2 = new Proveedor(UUID.randomUUID().toString(), "Manolo", "Gonzalez Gomez",
                "C/ CalleEjemplo2 3", "23456789A");

        System.out.println(proveedor);
        System.out.println(proveedor.equals(proveedor2));


        ArrayList<Articulo> articulos = new ArrayList<>();

        articulos.add(vaper);

        // estamos añadiendo un vaper que ya existe
        // Queremos añadir vaper2
        System.out.println(articulos.get(0));
        for (int i=0; i < articulos.size(); i++) {
            if(vaper2.equals(articulos.get(i))) {
                articulos.get(i).setStock(articulos.get(i).getStock()+ vaper2.getStock());
                break;
            }
        }
        System.out.println(articulos.get(0));

        Articulo vaper3 = new Articulo("1", "Vaper melocoton", proveedor, 5, 50);

        if(articulos.contains(vaper3)){
            articulos.get(articulos.indexOf(vaper3));
            vaper.setStock(vaper3.getStock());
        }

        // Crear 5 Articulos más.
        // Los vais a añadir al arrayList.
        // Vais a mostrar la lista de articulos.
        // ¿La lista está ordenada?.
        // ORDENA LA LISTA ... (plot twist: Se puede hacer una sola línea)
        // Muestra la lista de nuevo

        Articulo vaper4 = new Articulo("2", "Vaper sandía", proveedor, 5, 50);
        Articulo vaper5 = new Articulo("3", "Vaper fresa", proveedor, 5, 50);
        Articulo vaper6 = new Articulo("4", "Vaper mango", proveedor, 5, 50);
        Articulo vaper7 = new Articulo("5", "Vaper tabaco", proveedor, 5, 50);
        Articulo vaper8 = new Articulo("6", "Vaper menta", proveedor, 5, 50);

        articulos.add(vaper4);
        articulos.add(vaper5);
        articulos.add(vaper6);
        articulos.add(vaper7);
        articulos.add(vaper8);

        for (int i=0; i< articulos.size();i++) {
            System.out.println(articulos.get(i));
        }


        // Ordena los objetos en una lista
        Collections.sort(articulos);

    }

}
