package com.programacion.Unidad_7.proyectoQuiz;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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


        /*
        Hacer un pequño programa que te pregunte todas las preguntas
        comopruebe si la respuesta es correcta.
        (Opc.1) Que vaya sumando el nº de respuestas correctas y que muestre la puntuación al final
        (Opc.2) Que se elijan preguntas random
         */

        System.out.println("Bienvenido al concursillo");
        Scanner scan = new Scanner(System.in);
        // String respuesta = "";
        int puntuacion = 0;
        int numeroAleatorio = (int)Math.floor(Math.random()*3);

    /*
        for (int i=0; i<preguntas.size(); i++) {
            System.out.println(preguntas.get(numeroAleatorio));
            respuesta = scan.nextLine();
            if (respuesta.equalsIgnoreCase(respuestas.get(numeroAleatorio))) {
                puntuacion ++;
                System.out.println("La respuesta es correcta");
            } else {
                System.out.println("Respuesta incorrecta");
            }
            numeroAleatorio = (int)Math.floor(Math.random()*3);
        }

        System.out.println("Puntuacion: "+puntuacion);
*/

        // MANERA RANDOM
        String respuestaUsuarioR = "";
        String salir = "";
        int nCorrectasR = 0;
        Random r = new Random();

        while (!salir.equalsIgnoreCase("si")) {
            int nRandom = r.nextInt(preguntas.size());
            String pregunta = preguntas.get(nRandom);
            String respuesta = respuestas.get(nRandom);

            System.out.println(pregunta);
            respuestaUsuarioR = scan.nextLine();

            if(respuestaUsuarioR.equalsIgnoreCase(respuesta)) {
                System.out.println("Respuesta correcta");
                nCorrectasR++;
            } else {
                System.out.println("Respuesta incorrecta, la respuesta correcta era..."+respuesta);
            }

            System.out.println("¿Salir? si/no");
            salir = scan.nextLine();
        }

        System.out.println("Has acertado "+nCorrectasR+" preguntas");



    }
}
