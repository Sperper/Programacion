package com.programacion.unidad_8.teoria;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Main {

    public static void main(String[] args) {
        JFrame marcoPrincipal = new JFrame();
        /*
        Visibilidad por  defecto es es oculto
        Tamaño por defecto es nulo
        Accion por defecto es cerrar
         */
        marcoPrincipal.setVisible(true);

        marcoPrincipal.setSize(800, 600);

        marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marcoPrincipal.setResizable(false);

        marcoPrincipal.setTitle("Nano");

        ImageIcon icon = new ImageIcon("src/com/programacion/unidad_8/teoria/nano.jpg");
        marcoPrincipal.setIconImage(icon.getImage());



    }

}
