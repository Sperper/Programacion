package com.programacion.Unidad_7.proyectoAirbnb.services;

import com.programacion.Unidad_7.proyectoAirbnb.model.Alojamiento;
import com.programacion.Unidad_7.proyectoAirbnb.model.Propietario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestionFicheroAirbnb {

    /*
    2 metodos.
    1 para leer el fichero csv y extraer la informacion que queremos
    y otro para escribir esa informacionn en otro fichero aparte
     */

    public ArrayList<Alojamiento> leerFicheroAlojamientos(String ruta) {

        File fichAloj = new File(ruta);
        ArrayList<Alojamiento> arrAloj = new ArrayList<>();
        if (fichAloj.exists() && fichAloj.canRead() && fichAloj.isFile()) {
            try {
                FileReader fr = new FileReader(fichAloj);
                BufferedReader br = new BufferedReader(fr);
                br.readLine();
                String linea = br.readLine();
                while (linea != null) {
                    String[] lineaCortada = linea.split(",");
                    String id = lineaCortada[0];
                    String nombre = lineaCortada[1];
                    String host_name = lineaCortada[2];
                    String host_id = lineaCortada[3];
                    int price = Integer.parseInt(lineaCortada[10]);

                    Propietario p = new Propietario(host_id, host_name);

                    Alojamiento a = new Alojamiento(id, nombre,p, price);

                    if (a instanceof Alojamiento) {
                        arrAloj.add(a);
                    }
                }
                br.close();
                fr.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return arrAloj;
    }



}
