package com.programacion.Unidad_7.teoria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTeoria {

    public static void main(String[] args) {

        // TEORIA DE BUFFERED READER
        /*
        BufferedReader es una clase en Jave que hereda de Reader.
        Esta clase BufferedReader añade funcionalidades muy útiles como puede ser el método
        .readLine(): String
        Este método .readLine lee una línea entera del fichero y la devuelve en forma de String

        Para construir un objeto de tipo BufferedReader, le pasamos por parámetros otro Reader
         */

        // 0º Abrir el fichero
        String ls = File.separator;
        File fichero = new File("src"+ls+"resources"+ls+"archivosTema7"+ls+"archivosEjemplos"+ls+"buffered_fichero.txt");


        try {
            // Comprobar que existe
            if (fichero.exists() && fichero.isFile() && fichero.canRead()){
                // 2º Abrir flujos de lectura -> Lanza IOException
                // Vamos a operar con un BufferedReader, que admite por param un Reader
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                // En este punto ya tenemos un BUfferedReader apunto y listo para leer

                // 3º Operar con el fichero
                String lineaDelFichero = br.readLine(); // Lee una línea
                while (lineaDelFichero != null) { // Si la línea que se ha leido es diferente de null
                    System.out.println(lineaDelFichero); // Entonces la imprime
                    lineaDelFichero = br.readLine(); // Y acto seguido, lee la siguiente línea
                }

                // Cuando sale del bucle significa que ya no hay más líneas que leer
                // dicho con otras palabras, SE HA ALCANZADO EL FINAL DEL TEXTO/FICHERO/...

                // 4º Cerrar los flujos
                br.close();
                fr.close();

            }



        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Error al operar con ficheros");
        }

    }
}
