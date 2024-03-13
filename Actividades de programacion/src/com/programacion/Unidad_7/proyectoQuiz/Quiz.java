package com.programacion.Unidad_7.proyectoQuiz;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Vamos a leer un fichero que va a contener preguntas y respuestas, separadas por ':'
        String ls = File.separator;
        File fichero = new File("src"+ls+"resources"+ls+"archivosTema7"+ls+"proyectoQuiz");
        ArrayList<String> preguntas = new ArrayList<>();
        ArrayList<String> respuestas = new ArrayList<>();
        // 1º Comprobar que el fichero existe
        try {

            if (fichero.exists() && fichero.isFile() && fichero.canRead()) {

                // 2º Abrir los flujos de lectura (Vamos a trabajar con un BufferedReader)
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);

                // 3º Operar con el fichero



                String linea = br.readLine();
                while (linea != null) {
                    // System.out.println(linea);
                    String[] lineaSeparada = linea.split(":");
                    String pregunta = lineaSeparada[0];
                    String respuesta = lineaSeparada [1];
                    preguntas.add(pregunta);
                    respuestas.add(respuesta);
                    linea = br.readLine();
                }

                // Recorrer preguntas
                for (int i=0; i<preguntas.size(); i++) {
                    // System.out.println("Pregunta "+i+": "+preguntas.get(i));
                }

                // Recorrer respuestas
                for (int i=0; i< preguntas.size(); i++) {
                    // System.out.println("Respuesta "+i+": "+respuestas.get(i));
                }

                // 4º Cerrar flujos
                br.close();
                fr.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al operar con el fichero");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error general... que te jodan");
        }


        // EMPIEZA EN PROGRAMA
        // Hacer 10 preguntas random
        // Almacenar la puntuación del usuario
        // Escribir el nombre del usuario junto con su puntuación en uun fichero
        ArrayList<String> preguntasParaJuego = new ArrayList<>();
        ArrayList<String> respuestasParaJuego = new ArrayList<>();
        Random r = new Random();
        while (preguntasParaJuego.size() < 10) {
            int nRandom = r.nextInt(preguntas.size()); // Genera un numero Random entre 0 y el número de preguntas que hay
            String pregunta = preguntas.get(nRandom);
            String respuesta  = respuestas.get(nRandom);

            if (preguntasParaJuego.contains(pregunta)) {
                System.out.println("Pregunta duplicada");
            } else {
                preguntasParaJuego.add(pregunta);
                respuestasParaJuego.add(respuestas.get(nRandom));
            }
        }

        // JUEGO NORMAL -> HACER LAS 10 PREGUNTAS (preguntad el nombre del usuario)

        System.out.print("Dime tu usuario: ");
        String usuario = scan.nextLine();
        int puntuacion = 0;
        String respueestaUsuario = "";

        for (int i=0; i<preguntasParaJuego.size(); i++) {
            System.out.println(preguntasParaJuego.get(i));
            respueestaUsuario = scan.nextLine();
            if (respueestaUsuario.equalsIgnoreCase(respuestasParaJuego.get(i))) {
                System.out.println("Respuesta correcta");
                puntuacion++;
            } else {
                System.out.println("Respuesta incorrecta");
            }
        }


        // ESCRIBIRR EN EL FICHERO EL NOMBRE:PUNTUACION (ATENCION A NO SOBREESCRIBIR LOS DATOS)

        // Para conocer la línea separadora hacemos uso de
        String lineaSeparadora = File.separator;

        // ESCRITURA en fichero
        // 0º

        File fichpuntuacion = new File("src" + ls + "resources" + ls + "archivosTema7" + ls + "usuarioPuntuacionQuiz");
        if (fichpuntuacion.exists() && fichpuntuacion.isFile() && fichpuntuacion.canWrite()) {
            // 1º Abrir el flujo de lectura
            FileWriter fw = null;
            try {
                fw = new FileWriter(fichpuntuacion, true);
                // 2º Operar con el fichero
                fw.write(usuario + ":" + puntuacion + "\n");
                // 3º Cerrar el flujo
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
