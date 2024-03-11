package com.programacion.Unidad_7.teoria.ejemplos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ejemplo1 {

    public static void main(String[] args) {

         /*
    Enunciado
    Crear un programa que lea un fichero de texto plano y cuente
    las palabras que hay en él.
    El programa debe mostrar el número de palabras que hay.
    (Opcional) Mostrar las palabras también
    */
    /*
    Consejo: Cread un ArrayList<String> para almacenar las palabras que vayáis identificando
     */

        // Primero abrimos el fichero
        File archiEjemplo = new File("src/resources/archivosTema7/archivosEjemplos/ficheroEjemplo1");

        int palabras = 0;
        String frase = " ";
        ArrayList<String> palabr = new ArrayList<>();


        // Comprobar que el fichero existe, se puede leer y que es un fichero
        if (archiEjemplo.canRead() && archiEjemplo.exists() && archiEjemplo.isFile()) {

            // Abrir el flujo (de lectura) -> Lanza excepción IOException
            FileReader fr = null;
            try {
                fr = new FileReader(archiEjemplo);

                // Empezamos a operar con el fichero
                int caracter = 0;
                while (caracter != -1) {
                    caracter = fr.read();
                    frase = frase + (char)caracter;
                }

                for (int i=0; i<frase.length(); i++) {
                    if (frase.charAt(i) == ' ') {
                        palabras++;
                    }
                }

                System.out.println(palabras);
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        /*
        Otra forma de hacerlo:

        1. Abrir el File -> objeto de tipo File
        2. Abrir flujo de Lectura
        3. Declarar una variable int nPalabras = 0
        4. Declarar una variable int caracter = 0
        5. Leer un caracter con el método .read()
        6. Hacer un while para controlar cuando se ha llegado al final del fichero
        7. si el caracter es un espacio en blanco -> suma 1 a nPalabras
        8. Leer un caracter conn método .read()
        9. Muestra nPalabras por pantalla
         */

    }

}
