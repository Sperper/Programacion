package com.programacion.Unidad_7.proyectoUser.services.impl;

import com.programacion.Unidad_7.proyectoUser.model.Butaca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestionFicheroCine {

    public Butaca[][] leerFicheroCine(String ruta) {
        File fichCine = new File(ruta);
        Butaca[][] butacas = new Butaca[10][10];

        if (fichCine.exists() && fichCine.isFile() && fichCine.canRead()) {
            try {
                FileReader fr = new FileReader(fichCine);
                BufferedReader br = new BufferedReader(fr);

                String line = br.readLine();
                while (line != null){
                    String[] lineaCortada = line.split(":");

                    int fila = Integer.parseInt(lineaCortada[0]);
                    int pos = Integer.parseInt(lineaCortada[1]);
                    String idUser = lineaCortada[2];

                    Butaca b = new Butaca(fila, pos, idUser);
                    butacas[fila][pos] = b;

                }

                fr.close();
                br.close();

            } catch (IOException e){
                e.printStackTrace();
            }
        }

        return butacas;
    }

    public void modificarFicheroCine(Butaca[][] salaDeCine,String ruta){

        File fichcine = new File(ruta);

        if (fichcine.exists() && fichcine.isFile() && fichcine.canWrite()) {
            try{



            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void anadirFicheroCine(Butaca b) {

    }
}
