package com.programacion.unidad_8.teoria2;

import javax.swing.*;
import java.awt.*;

public class FramePrincipal extends JFrame {

    ImageIcon icon = new ImageIcon("src/com/programacion/unidad_8/teoria/nano.jpg");

    public FramePrincipal(){

        this.setVisible(true);
        this.setTitle("ElNano");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(icon.getImage());

        JPanel panelP = new JPanel();
        panelP.setBackground(new Color(0,255,0));
        panelP.setPreferredSize(new Dimension(400,400));


        JLabel fieldUsere = new JLabel("Usuario");
        JLabel fieldPass = new JLabel("Password");

        JTextField textFileUser = new JTextField();
        textFileUser.setPreferredSize(new Dimension(100, 22));

        JPasswordField passwordFieldPass = new JPasswordField();
        passwordFieldPass.setPreferredSize(new Dimension(100, 22));
        passwordFieldPass.setEchoChar('*');

        JButton bottonEnviar = new JButton();
        bottonEnviar.setText("Enviar");

        ImageIcon imageNano = new ImageIcon("src/resources/unidad_8/Images/cyber-security-mail-threats-virus-malware-22951.png");
        bottonEnviar.setIcon(imageNano);
        bottonEnviar.setPreferredSize(new Dimension(22,22));

        JToggleButton botonActivar = new JToggleButton("Activar");
        botonActivar.setPreferredSize(new Dimension(100,20));
        botonActivar.setFont(new Font("Consolas", Font.ITALIC, 12));
        botonActivar.setSelected(true);
        // botonActivar.setBounds(100,100,70,70);

        JCheckBox opciones1 = new JCheckBox();
        opciones1.setText("Prueba");
        JCheckBox opciones2 = new JCheckBox();

        JSeparator separator = new JSeparator();
        separator.setPreferredSize(new Dimension(200,200));

        JRadioButton boton1 = new JRadioButton("Boton1");
        JRadioButton boton2 = new JRadioButton("Boton2");
        JRadioButton boton3  =new JRadioButton("Boton3");
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(boton1);
        btnGroup.add(boton2);
        btnGroup.add(boton3);


        panelP.add(fieldUsere);
        panelP.add(textFileUser);
        panelP.add(fieldPass);
        panelP.add(passwordFieldPass);
        panelP.add(bottonEnviar);
        panelP.add(botonActivar);
        panelP.add(opciones1);
        panelP.add(opciones2);
        panelP.add(boton1);
        panelP.add(boton2);
        panelP.add(boton3);
        panelP.add(separator);

        this.add(panelP);
        this.setVisible(true);
    }

}
