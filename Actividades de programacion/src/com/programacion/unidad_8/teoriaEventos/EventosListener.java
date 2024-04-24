package com.programacion.unidad_8.teoriaEventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventosListener  extends JFrame {

    // Atributos de clase
    JTextField campoTexto;
    JButton botonEnviar;

    JLabel resultado;

    // Creamos los eventos
    MouseListener listenerDeBotonEnviar = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Boton pulsado");
            String texto = campoTexto.getText();

            try{
                long numerin = Long.parseLong(texto);
                if (numerin % 2 == 0) {
                    System.out.println("Es par");
                    resultado.setText("Es Par");
                } else {
                    System.out.println("Es impar");
                    resultado.setText("Es Impar");
                }
                campoTexto.setBackground(new Color(0,0,0));
            } catch (NumberFormatException ex) {
                campoTexto.setBackground(new Color(200,0,0));
                resultado.setText("Error!");
            }


        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // System.out.println("Entra el raton");
            // botonEnviar.setBackground(new Color(100,30,100));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // System.out.println("Sale el raton");
            // botonEnviar.setBackground(new Color(200,200,200));
        }
    };

    KeyListener listenerTeclado = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                System.out.println("Intro pulsado");
                String texto = campoTexto.getText();

                try{
                    long numerin = Long.parseLong(texto);
                    if (numerin % 2 == 0) {
                        System.out.println("Es par");
                        resultado.setText("Es Par");
                    } else {
                        System.out.println("Es impar");
                        resultado.setText("Es Impar");
                    }
                    campoTexto.setBackground(new Color(0,0,0));
                } catch (NumberFormatException ex) {
                    campoTexto.setBackground(new Color(200,0,0));
                    resultado.setText("Error!");
                }
            }

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };


    public EventosListener (){

        this.setSize(600,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Primera Ventana");
        ImageIcon image = new ImageIcon("src/com/programacion/unidad_8/teoria/nano.jpg");
        this.setIconImage(image.getImage());

        // JFrame tiene un layout por defecto de BorderLayout (CENTER, NORTH, SOUTH, WEST, EAST)
        JLabel titulo = new JLabel("EVENTOS");
        titulo.setPreferredSize(new Dimension(100,100));
        titulo.setFont(new Font("Consolas", Font.BOLD, 32));
        titulo.setHorizontalAlignment(JLabel.CENTER);

        JPanel panelCentro = new JPanel();

        campoTexto = new JTextField();
        campoTexto.setPreferredSize(new Dimension(100,32));
        campoTexto.setBackground(new Color(0,0,0));
        campoTexto.setForeground(new Color(255,255,255));
        campoTexto.setFont(new Font("Consolas", Font.BOLD, 16));
        campoTexto.addKeyListener(listenerTeclado);

        botonEnviar = new JButton("Enviar");
        botonEnviar.setPreferredSize(new Dimension(100,32));
        // Anadimos el evento al botonEnviar
        botonEnviar.addMouseListener(listenerDeBotonEnviar);

        resultado = new JLabel();
        resultado.setFont(new Font("Consolas", Font.BOLD, 32));

        // Añadimos elementos al JPanel (panelCentro)
        panelCentro.add(campoTexto);
        panelCentro.add(botonEnviar);
        panelCentro.add(resultado);
        // panelCentro.addKeyListener(listenerTeclado);

        // Añadimos elementos al JFrame
        this.add(panelCentro, BorderLayout.CENTER);
        this.add(titulo, BorderLayout.NORTH);
        this.setVisible(true);

    }

}
