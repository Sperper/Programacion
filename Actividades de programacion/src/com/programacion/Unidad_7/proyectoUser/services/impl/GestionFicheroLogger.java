package com.programacion.Unidad_7.proyectoUser.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GestionFicheroLogger {

    public void anadirFicheroLog (String ruta, String mensaje) {

        // Aqui se escribe en el fichero
        File fichLog = new File(ruta);

        if (fichLog.exists() && fichLog.isFile() && fichLog.canRead()) {
            try {
                FileWriter fw = new FileWriter(fichLog, true);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write(mensaje);

                bw.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
