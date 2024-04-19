package com.programacion.Unidad_7.proyectoUbriCine.services.impl;

import com.programacion.Unidad_7.proyectoUbriCine.model.Butaca;
import com.programacion.Unidad_7.proyectoUbriCine.services.api.BasicServiceCine;

import java.util.Scanner;

public class ServiceCine implements BasicServiceCine {

    // Atributos
    private String nombreCine;
    private static final int NFILAS = 10;
    private static final int NASIENTOS = 10;
    private GestionFicheroCine gestion;

    private Butaca[][] salaCine;

    Scanner scan = new Scanner(System.in);

    // Constructor
    public ServiceCine(String nombreCine) {

        this.nombreCine = nombreCine;
        this.gestion = new GestionFicheroCine();
        this.salaCine = new Butaca[NFILAS][NASIENTOS]; //aquí vamos a leer el fichero para llenar el array de objetos Butaca

        /*
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
        [null,null,null,null,null,null,null,null,null,null]
         */


    }

    @Override
    public void mostrarButacas() {
        for (int i = 0; i<this.salaCine.length; i++) {
            for (int j=0; j<this.salaCine.length; j++) {
                if (this.salaCine[i][j] == null ) {
                    System.out.print("XX  ");
                    if (j == 9) {
                        System.out.println("\n");
                    }
                } else {
                    System.out.print("__  ");
                    if (j == salaCine.length - 1) {
                        System.out.println("\n");
                    }
                }
            }
        }
    }

    @Override
    public boolean comprarEntrada() {
        System.out.println("Indique la fila");
        int fila = scan.nextInt();
        scan.nextLine();

        System.out.println("Indique el asiento");
        int asiento = scan.nextInt();
        scan.nextLine();

        System.out.println("Indique su usuario");
        String usuario = scan.nextLine();

        salaCine = gestion.leerFicheroCine("src/resources/archivosTema7/UbriCine/cine.txt");

        if (salaCine[fila][asiento] == null) {
            Butaca b = new Butaca(fila, asiento, usuario);
            salaCine[fila][asiento] = b;
            anadirFicheroCine(b);
            return true;
        } else {
            System.out.println("Asiento ocupado");
            return false;
        }
    }

    @Override
    public boolean devolverEntrada() {

        salaCine = gestion.leerFicheroCine("src/resources/archivosTema7/UbriCine/cine.txt");

        System.out.println("Indique la fila");
        int fila = scan.nextInt();
        scan.nextLine();

        System.out.println("Indique el asiento");
        int asiento = scan.nextInt();
        scan.nextLine();

        System.out.println("Indique su usuario");
        String usuario = scan.nextLine();

        if (this.checkComprador(usuario)) {
            salaCine[fila][asiento] = null;
            this.modificarFicheroCine(salaCine);
            return true;
        } else {
            System.out.println("El usuario no es el dueño del asiento");
            return false;
        }
    }

    @Override
    public boolean checkComprador(String idUser) {
        salaCine = gestion.leerFicheroCine("src/resources/archivosTema7/UbriCine/cine.txt");
        boolean esComprador = false;
        for (int i = 0; i<this.salaCine.length; i++) {
            for (int j=0; j<this.salaCine[i].length; j++) {
                if(this.salaCine[i][j] != null && this.salaCine[i][j].getIdUser() != null) {
                    if (this.salaCine[i][j].getIdUser().equalsIgnoreCase(idUser)) {
                        esComprador = true;
                        break;
                    }

                }
            }
        }

        return esComprador;
    }

    @Override
    public void leerFicheroEntradas() {
        gestion.leerFicheroCine("src/resources/archivosTema7/UbriCine/cine.txt");
    }

    @Override
    public void anadirFicheroCine(Butaca b) {
        gestion.anadirFicheroCine(b, "src/resources/archivosTema7/UbriCine/cine.txt");
    }

    @Override
    public void modificarFicheroCine(Butaca[][] butacas) {
        gestion.modificarFicheroCine(butacas, "src/resources/archivosTema7/UbriCine/cine.txt");
    }
}