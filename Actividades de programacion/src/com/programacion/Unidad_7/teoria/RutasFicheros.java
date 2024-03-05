package com.programacion.Unidad_7.teoria;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RutasFicheros {

    public static void main(String[] args) {
        
        // Para conocer la línea separadora hacemos uso de 
        String lineaSeparadora = File.separator;
        
        // Rutas absolutas vs Rutas relativas
        File fichAbsoluto = new File("C:/Users/sperper2907/Desktop/1 DAW/Programacion/Actividades de programacion/src/resources/archivosTema7/fich");
        System.out.println("¿El fichero existe? "+fichAbsoluto.exists());

        File fichRelativo = new File("src/resources/archivosTema7/fich");
        System.out.println("¿El fichero existe? "+fichRelativo.exists());

        // 0º primero comprobamos que exista el fichero
        if(fichRelativo.exists()) {
            // 1º Abrir el flujo de lectura -> Al lee/escribir en ficheros, se lanzan excepciones
            // esas excepciones son de IOException y FileNotFoundException
            FileReader fl = null;
            try {
                // Aquí abrimos el flujo de lectura en sí, al crear un objeto de tipo FileReader
                fl = new FileReader(fichRelativo);

                // 2º Operar con el fichero... en este caso, leemos la información
                int caracter = fl.read();
                while (caracter != -1) {
                    System.out.print((char) caracter);
                    caracter = fl.read();
                }

                // 3º Cerrar el flujo
                fl.close();

            } catch (IOException e) {
                e.printStackTrace();

            }

            // ESCRITURA en fichero
            // 0º
            if (fichRelativo.exists() && fichRelativo.isFile()) {
                // 1º Abrir el flujo de lectura
                FileWriter fw = null;
                try {
                    fw = new FileWriter(fichRelativo, true);

                    // 2º Operar con el fichero
                    Scanner scan = new Scanner(System.in);
                    String lineAEscribir = scan.nextLine();
                    fw.write(lineAEscribir+"\n");
                    lineAEscribir = scan.nextLine();
                    fw.write(lineAEscribir+"\n");
                    lineAEscribir = scan.nextLine();
                    fw.write(lineAEscribir+"\n");
                    lineAEscribir = scan.nextLine();

                    // 3º Cerrar el flujo
                    fw.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
