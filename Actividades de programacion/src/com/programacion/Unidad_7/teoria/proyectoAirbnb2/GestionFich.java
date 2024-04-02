package com.programacion.Unidad_7.teoria.proyectoAirbnb2;

import com.programacion.Unidad_7.teoria.proyectoAirbnb2.Alojamiento;
import com.programacion.Unidad_7.teoria.proyectoAirbnb2.Propietario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestionFich {

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
                    int price = Integer.parseInt(lineaCortada[9]);
                    String licencia = lineaCortada[lineaCortada.length-1];
                    int min_night = Integer.parseInt(lineaCortada[10]);
                    int availability = Integer.parseInt(lineaCortada[16]);
                    int number_reviews = Integer.parseInt(lineaCortada[12]);
                    String last_review = lineaCortada[13];
                    double reviews_months = Double.parseDouble(lineaCortada[14]);
                    double latitud = Double.parseDouble(lineaCortada[7]);
                    double longitud = Double.parseDouble(lineaCortada[8]);
                    String group = lineaCortada[5];
                    String name = lineaCortada[6];
                    String room_type = lineaCortada[9];

                    Propietario p = new Propietario(host_id, host_name);
                    Licencia l = new Licencia(licencia);
                    Reserva r = new Reserva(price, min_night, availability);
                    Review rev = new Review(number_reviews, last_review, reviews_months);
                    Ubicacion u = new Ubicacion(latitud, longitud);
                    Vecindario v = new Vecindario(group, name);
                    Alojamiento a = new Alojamiento(room_type, id, nombre, p, r, v, rev, u, l);

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
