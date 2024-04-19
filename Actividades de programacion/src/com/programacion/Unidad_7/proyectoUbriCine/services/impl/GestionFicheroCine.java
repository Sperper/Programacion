package com.programacion.Unidad_7.proyectoUbriCine.services.impl;

import com.programacion.Unidad_7.proyectoUbriCine.model.Butaca;

import java.io.*;

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

                    line = br.readLine();
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
        // Abrimos el fichero
        File fichcine = new File(ruta);


        // If para comprobar si es un fichero, si existe y si se puede escribir
        if (fichcine.isFile() && fichcine.exists() && fichcine.canWrite()) {
            try {
                FileWriter fw = new FileWriter(fichcine);
                BufferedWriter bw = new BufferedWriter(fw);

                // Se opera con el fichero después de abrir los flujos
                for (int i=0; i<salaDeCine.length; i++) {
                    for (int j=0; j< salaDeCine.length; j++) {
                        if (salaDeCine[i][j] != null) {
                            String cine = salaDeCine[i][j].getFila() + ":" + salaDeCine[i][j].getAsiento()
                                    + ":" + salaDeCine[i][j].getIdUser() + "\n";
                            bw.write(cine);
                        }
                    }
                }
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void anadirFicheroCine(Butaca b, String ruta) {
        // Inicializa el objeto File
        File fichero = new File(ruta);

        // If que comprueba si es un archivo, si existe y si se puede escribir
        if (fichero.isFile() && fichero.exists() && fichero.canWrite()) {
            // try-catch para capturar la IOException
            try {
                FileWriter fw = new FileWriter(fichero, true);
                BufferedWriter bw = new BufferedWriter(fw);

                // Se opera con el fichero después de abrir los flujos

                bw.write(b.getFila() + ":" + b.getAsiento() + ":" + b.getIdUser() + "\n");


                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}