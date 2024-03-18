package com.programacion.Unidad_7.proyectoTrivial.services;

import com.programacion.Unidad_7.proyectoTrivial.model.Participante;
import com.programacion.Unidad_7.proyectoTrivial.model.Pregunta;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionFichero {

    /*

    Va a tener 2 métodos
    1º Va a serr para leer un fichero y volcar la información en el ArrayList de pregunta

    2º Va a ser para escribir en un fichero LA INFORMACIÓN  que viene el arrayList de participantes

     */

    public ArrayList<Pregunta> leerFicheroPreguntas() {
        // 0º Crear e inicializar el ArrayList que al final pasaremos a la clase Trivial
        ArrayList<Pregunta> arrDePreguntasTemporal = new ArrayList<>();

        // 1º Abrir el file (la ruta es la misma que en el ejercicio anterior)
        File concur = new File("src/resources/archivosTema7/proyectoQuiz");
        // 2º Comprobar si el file existe, tiene modo lectura, etc.
        try {
            if (concur.exists() && concur.isFile() && concur.canRead()) {
                // 3º Abrir flujos de lectura (QUEREMOS TRABAJAR CON BUFFEREDREADER)
                FileReader fr = new FileReader(concur);
                BufferedReader br = new BufferedReader(fr);

                // 4º Operar con el fichero
                // Lo que hay que hacer es:
                // a) Separar la línea en pregunta y respuesta (con el .split)

                String linea = br.readLine();
                    while (linea != null) {
                        String[] lineaSeparada = linea.split(linea);
                        String pregunta = lineaSeparada[0];
                        String respuesta = lineaSeparada[1];

                        // b) Crear un objeto de tipo Pregunta

                        Pregunta p1 = new Pregunta(pregunta, respuesta);


                        // c) Si el objeto se ha creado correctamente, añadirlo al arrayList arrDePreguntasTemporal
                        if (!arrDePreguntasTemporal.contains(p1)) {
                            arrDePreguntasTemporal.add(p1);
                        }
                        linea = br.readLine();
                    }

                // 5º Cerrar los flujos
                fr.close();
                br.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 6º Devolver el arrDepreguntasTemporal

        return arrDePreguntasTemporal;

    }

    public void escribirFicheroPuntuaciones(ArrayList<Participante> arrPar) {

        // 1º Abrir el File
        File participantes = new File("src/resources/archivosTema7/Participantes.txt");

        // 2º Comprobar que existe y está modo escritura
        try {
            if (participantes.canWrite() && participantes.exists() && participantes.isFile()) {
                // 3º Abrir los flujos de Escritura (con BufferedWriter)
                FileWriter fw = new FileWriter(participantes);
                BufferedWriter bw = new BufferedWriter(fw);

                // 4º Operar con el fichero
                    // a) Recorrer el ArrayList arrPar
                    // b) Escribir todos los registros de arrPar en el fichero
                    // El formato para escribir va a ser:
                    // id:[fecha, puntuacion;fecha,puntuacion]

                for (int i=0; i< arrPar.size(); i++) {
                    String id = arrPar.get(i).getId();
                    bw.write(id+":[");

                    for (int j=0; j< arrPar.get(i).getPuntuacionnes().size(); j++) {
                        bw.write(arrPar.get(i).getPuntuacionnes().get(j).getFecha()+","+arrPar.get(i).getPuntuacionnes().get(j).getPuntuacion()+";");
                    }
                    bw.write("]"+"\n");
                }

                // 5º Cerrar los flujos de escritura
                fw.close();
                bw.close();


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Metodo leerFicheroPuntuacion() y devuelve un ArrayList de participante

    public ArrayList<Participante> leerFicheroPuntuacion(){

        File fichPuntuacion = new File("src/resources/archivosTema7/Participantes.txt");
        ArrayList<Participante> arrParticipante = new ArrayList<>();

        if (fichPuntuacion.exists() && fichPuntuacion.isFile() && fichPuntuacion.canRead()) {
            try {

                FileReader fr = new FileReader(fichPuntuacion);
                BufferedReader br = new BufferedReader(fr);

                String linea = br.readLine();
                while (linea != null) {
                    String[] lineaSeparada = linea.split(linea);
                    String id = lineaSeparada[0];

                    Participante p1 = new Participante(null, id);

                    if (!arrParticipante.contains(p1)) {
                        arrParticipante.add(p1);
                    }
                    linea = br.readLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return arrParticipante;
    }

    // Metodo escribirFicheroPreguntas(arrPreg : ArrayList<Pregunta>)
    public void escribirFicheroPreguntas(ArrayList<Pregunta> arrPreg) {
        // Abrir File
        File fichPreguntas = new File("src/resources/archivosTema7/proyectoQuiz");

        if (fichPreguntas.exists() && fichPreguntas.isFile() && fichPreguntas.canWrite()) {
            try {

                FileWriter fw = new FileWriter(fichPreguntas);
                BufferedWriter bw = new BufferedWriter(fw);

                Scanner scan = new Scanner(System.in);

                System.out.println("Escriba su pregunta");
                String pregunta = scan.nextLine();

                System.out.println("Escriba la respuesta");
                String respuesta = scan.nextLine();

                bw.write(pregunta+":"+respuesta);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
