package com.programacion.Unidad_7.teoria;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscrituraLectura {

    public static void main(String[] args) {


        // VAMOS A ESCRIBIR EN UN FICHERO COSAS HASTA QUE SE ESCRIBA FIN
        // 0º Obtener la barra separadora
        String ls = File.separator;

        // 1º Abrir el fichero
        File ficheroPrueba = new File("src/resources/archivosTema7/usuario");

        // 2º Comprobar que el fichero existe
        if (ficheroPrueba.exists() && ficheroPrueba.isFile() && ficheroPrueba.canWrite()) {

            // 3º Abrir flujos (en este caso, de escritura) -> Lanza IOException
            FileWriter fw = null;
            try {
                fw = new FileWriter(ficheroPrueba);
                String usuario = "";
                String contrasenia = "";
                // String cadenaAEscribir = "";
                Scanner scan = new Scanner(System.in);
                while (!usuario.equalsIgnoreCase("fin")) {

                    System.out.println("Dime el usuario y la contrasenia");
                    usuario = scan.nextLine();
                    contrasenia = scan.nextLine();

                    if (!usuario.equalsIgnoreCase("fin")) {
                        // 4º Operar con el fichero
                        fw.write(usuario + ":" + contrasenia + "\r\n");
                    }

                }

                // 5º Cerrar los flujos
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al operar con el fichero");
                // Para cerrar el flujo en caso de error
                if (fw != null) {
                    try {
                        fw.close();
                    } catch (Exception ex) {
                        e.printStackTrace();
                    }

                }
            }
        }


        // AHORA LECTURA DE FICHERO
        // 1º Abrir el fichero
        File ficheroParaLeer = new File("src/resources/archivosTema7/fichero_prueba.txt");

        // 2º Comprobar que existe
        if (ficheroParaLeer.exists() && ficheroParaLeer.isFile() && ficheroParaLeer.canRead()) {

            // 3º Abrir flujos de lectura -> Lanza IOException
            FileReader fr = null;
            try {
                fr = new FileReader(ficheroParaLeer);

                // 4º Operar con el fichero
                int caracter = 0;
                while (caracter != -1) { // MIentras caracter sea diferente de -1 ... seguimos leyendo
                    caracter = fr.read(); // fr.read() devuelve un entero ... EL CARACTER EN UNICODE

                    System.out.print((char) caracter); // Aquí... el (char) caracter lo que hace es cambiar el número a caracter
                    // cambiar de número a caracter... obtiene caracter correspondiente del código UNICODE
                }

                // 5º Cerrar los flujos
                fr.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        // 1º Abrir el fichero
        File usuarioLeer = new File("src/resources/archivosTema7/fichero_prueba.txt");

        // 2º Comprobar que existe
        if (usuarioLeer.exists() && usuarioLeer.isFile() && usuarioLeer.canRead()) {

            // 3º Abrir flujos de lectura -> Lanza IOException
            FileReader fr = null;
            try {
                fr = new FileReader(ficheroParaLeer);

                // 4º Operar con el fichero
                int caracter = 0;
                while (caracter != -1) { // MIentras caracter sea diferente de -1 ... seguimos leyendo
                    caracter = fr.read(); // fr.read() devuelve un entero ... EL CARACTER EN UNICODE

                    System.out.print((char) caracter); // Aquí... el (char) caracter lo que hace es cambiar el número a caracter
                    // cambiar de número a caracter... obtiene caracter correspondiente del código UNICODE
                }

                // 5º Cerrar los flujos
                fr.close();

            } catch (IOException e){
                e.printStackTrace();
            }

        }

    }
}


