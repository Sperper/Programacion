package com.programacion.unidad_8.teoriaLayouts.layoutFlow;

import javax.swing.*;
import java.awt.*;

public class FrameFlow extends JFrame {

    public FrameFlow() {

        this.setSize(800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("ElNano");
        ImageIcon icon = new ImageIcon("src/com/programacion/unidad_8/teoria/nano.jpg");
        this.setIconImage(icon.getImage());

        JPanel panelTitulo = new JPanel();
        panelTitulo.setPreferredSize(new Dimension(200,100));
        panelTitulo.setBackground(new Color(255,0,0));
        JLabel labelTitulo = new JLabel("UbriWeb");
        labelTitulo.setFont(new Font("Consolas", Font.BOLD, 30));
        panelTitulo.setLayout(new BorderLayout());
        panelTitulo.add(labelTitulo, BorderLayout.CENTER);
        labelTitulo.setHorizontalAlignment(JLabel.CENTER);

        JPanel panelBody = new JPanel();
        panelBody.setBackground(new Color(241,241,241));
        panelBody.setLayout(new GridLayout(2, 4));
        JLabel usuario = new JLabel("Usuario");
        JLabel password = new JLabel("Password");
        JTextField userText = new JTextField();
        JTextField passwordText = new JTextField();
        JLabel espacioEnBlanco = new JLabel();
        JLabel espacioEnBlanco2 = new JLabel();
        JLabel espacioEnBlanco3 = new JLabel();
        JButton boton = new JButton("Boton");

        panelBody.add(usuario);
        panelBody.add(userText);
        panelBody.add(espacioEnBlanco);
        panelBody.add(espacioEnBlanco3);

        panelBody.add(password);
        panelBody.add(passwordText);
        panelBody.add(espacioEnBlanco2);
        panelBody.add(boton);

        this.add(panelBody, BorderLayout.CENTER);
        this.add(panelTitulo, BorderLayout.NORTH);
        this.setVisible(true);
    }

}
