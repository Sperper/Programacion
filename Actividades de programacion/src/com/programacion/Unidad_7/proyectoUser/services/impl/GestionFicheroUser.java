package com.programacion.Unidad_7.proyectoUser.services.impl;

import com.programacion.Unidad_7.proyectoUser.model.User;

import java.io.*;
import java.util.ArrayList;

public class GestionFicheroUser {

    public ArrayList<User> leerFicherUser(String ruta){
        ArrayList<User> arrUser = new ArrayList<>();

        File fich = new File(ruta);

        if (fich.exists() && fich.isFile() && fich.canRead()) {
            // Abrimos los flujos
            try {
                FileReader fr = new FileReader(fich);
                BufferedReader br = new BufferedReader(fr);

                // Operamos los con los ficheros
                String linea = br.readLine();
                while (linea != null) {
                    String id_user = "";
                    String isAdmin = "";
                    String name_user = "";
                    String pass_user = "";

                    String[] valores = linea.split(":");

                    id_user = valores[0];
                    name_user = valores[1];
                    pass_user = valores[2];
                    isAdmin = valores[3];

                    boolean isAdmin_b = Boolean.parseBoolean(isAdmin);

                    User u = new User(id_user, name_user, pass_user, isAdmin_b);

                    if (u instanceof User) {
                        arrUser.add(u);
                    }

                }

                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error");
            }

        }

        return arrUser;
    }


    public void modificarFicheroUser (ArrayList<User> user, String ruta) {

        // Abrimos el fichero
        File fichero = new File(ruta);

        if (fichero.isFile() && fichero.exists() && fichero.canWrite()) {
            try {
                FileWriter fw = new FileWriter(fichero);
                BufferedWriter bw = new BufferedWriter(fw);

                // Se opera con el fichero despues de abrir los flujos
                for (int i=0; i<user.size(); i++) {
                    bw.write(user.get(i).getId()+":"+user.get(i).getName()+":"
                            +user.get(i).getPass()+":"+user.get(i).isAdmin());
                }


                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void anadirRegistroFichero(String ruta, User u){
        File fichero = new File(ruta);

        if (fichero.isFile() && fichero.exists() && fichero.canWrite()) {
            try {
                FileWriter fw = new FileWriter(fichero, true);
                BufferedWriter bw = new BufferedWriter(fw);

                // Se opera con el fichero despues de abrir los flujos
                User user = null;
                bw.write(user.getId()+":"+user.getName()+":"
                        +user.getPass()+":"+user.isAdmin());


                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
