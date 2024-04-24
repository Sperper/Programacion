package com.programacion.unidad_8.miniCalculadora.ui;

import javax.swing.*;
import java.awt.*;

public class FrameCalculadora1 extends JFrame {

    private static int width = 600;
    private static int height = 600;

    private PanelCalculadora1 panelCalculadora1;

    public FrameCalculadora1(){

        this.setSize(width, height);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Mini Calculadora Mierder I");
        ImageIcon image = new ImageIcon("src/com/programacion/unidad_8/teoria/nano.jpg");
        this.setIconImage(image.getImage());

        // Aqui añadimos el panel
        panelCalculadora1 = new PanelCalculadora1();
        this.add(panelCalculadora1);

        // Modificamos los atributos/valores/aspecto de los elementos
        this.setVisible(true);
    }

}
