package com.programacion.unidad_8.proyectoLoginUI.ui;

import javax.swing.*;

public class FrameLogin extends JFrame {

    public FrameLogin() {
        this.setSize(600, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Proyecto UI");
        ImageIcon image = new ImageIcon("src/resources/unidad_8/Images/pikachu.png");
        this.setIconImage(image.getImage());
        this.setResizable(false);

        PanelLogin p = new PanelLogin();
        this.add(p);

        this.setVisible(true);
    }

}
