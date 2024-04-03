package com.programacion.Unidad_7.proyectoAirbnb.services;

import com.programacion.Unidad_7.proyectoAirbnb.model.Alojamiento;
import com.programacion.Unidad_7.proyectoAirbnb.model.Propietario;

import java.io.*;
import java.util.ArrayList;

public class GestionFicheroAirbnb {

    /*
    2 metodos.
    1 para leer el fichero csv y extraer la informacion que queremos
    y otro para escribir esa informacionn en otro fichero aparte
     */

    public static ArrayList<Alojamiento> leerFicheroAlojamientos(String ruta) {

        File fichAloj = new File(ruta);
        ArrayList<Alojamiento> arrAloj = new ArrayList<>();
        if (fichAloj.exists() && fichAloj.canRead() && fichAloj.isFile()) {
            try {
                FileReader fr = new FileReader(fichAloj);
                BufferedReader br = new BufferedReader(fr);

                String linea = br.readLine();
                linea = br.readLine();
                while (linea != null) {
                    String[] lineaCortada = linea.split(",");
                    String id = lineaCortada[0];
                    String nombre = lineaCortada[1];
                    String host_name = lineaCortada[2];
                    String host_id = lineaCortada[3];
                    int price = 0;
                    try {

                         price = Integer.parseInt(lineaCortada[9]);


                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    Propietario p = new Propietario(host_id, host_name);

                    Alojamiento a = new Alojamiento(id, nombre,p, price);

                    if (a instanceof Alojamiento) {
                        arrAloj.add(a);
                    }
                    linea = br.readLine();

                }
                br.close();
                fr.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return arrAloj;
    }


    public static void escribirFichero(String ruta, ArrayList<Alojamiento> aloj){

        File datos_malaga = new File(ruta);

        if (datos_malaga.canWrite() && datos_malaga.exists() && datos_malaga.isFile()) {
            try {
                FileWriter fw = new FileWriter(datos_malaga);
                BufferedWriter bw = new BufferedWriter(fw);

                for (int i=0; i<aloj.size(); i++) {
                    bw.write(aloj.get(i).getId()+","+
                    aloj.get(i).getName()+","+aloj.get(i).getPrecio()+","+
                            aloj.get(i).getPropietario().getHost_id()+","+
                            aloj.get(i).getPropietario().getHost_name());
                }

                fw.close();
                bw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }



}
