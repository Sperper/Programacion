package com.programacion.unidad_8.miniCalculadora.ui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelCalculadora1 extends JPanel {

    JTextField  fieldValor1;
    JTextField  fieldValor2;
    JButton     botonSuma;
    JButton     botonResta;
    JButton     botonMultiplicacion;
    JButton     botonDivision;
    JLabel      labelResultado;

    // EVENTOS
    MouseListener listenerMouse = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton b =(JButton) e.getSource();
            System.out.println("Boton "+b.getText()+" clickado");
            b.setBackground(new Color(0,100,0));

            if (b.getText().equalsIgnoreCase("+")) {
                // SE REALIZA LA SUMA
                // 1º Obtenemos los valores de los TextFields
                String valorTexto1 = fieldValor1.getText();
                String valorTexto2 = fieldValor2.getText();

                // 2º Para sumar, los valores deben ser enteros (try/catch para evitar errores)
                try {
                    int valorEnteroTexto1 = Integer.parseInt(valorTexto1);
                    int valorEnteroTexto2 = Integer.parseInt(valorTexto2);

                    // 3º Realizamos la suma de los valores
                    int resultadoSuma = valorEnteroTexto1 + valorEnteroTexto2;

                    // 4º Por último, ponemos ese resultado en el JLabel (labelResultado)
                    labelResultado.setText(resultadoSuma+"");

                } catch (NumberFormatException ex) {
                    labelResultado.setText("ERROR");
                }

            } else if(b.getText().equalsIgnoreCase("-")){
                // SE REALIZA LA RESTA
                // 1º Obtenemos los valores de los TextFields
                String valorTexto1 = fieldValor1.getText();
                String valorTexto2 = fieldValor2.getText();

                // 2º Para restar, los valores deben ser enteros (try/catch para evitar errores)
                try {
                    int valorEnteroTexto1 = Integer.parseInt(valorTexto1);
                    int valorEnteroTexto2 = Integer.parseInt(valorTexto2);

                    // 3º Realizamos la suma de los valores
                    int resultadoSuma = valorEnteroTexto1 - valorEnteroTexto2;

                    // 4º Por último, ponemos ese resultado en el JLabel (labelResultado)
                    labelResultado.setText(resultadoSuma+"");

                } catch (NumberFormatException ex) {
                    labelResultado.setText("ERROR");
                }
            } else if(b.getText().equalsIgnoreCase("x")){
                // SE REALIZA LA MULTIPLICACION
                // 1º Obtenemos los valores de los TextFields
                String valorTexto1 = fieldValor1.getText();
                String valorTexto2 = fieldValor2.getText();

                // 2º Para restar, los valores deben ser enteros (try/catch para evitar errores)
                try {
                    int valorEnteroTexto1 = Integer.parseInt(valorTexto1);
                    int valorEnteroTexto2 = Integer.parseInt(valorTexto2);

                    // 3º Realizamos la suma de los valores
                    int resultadoMulti = valorEnteroTexto1 * valorEnteroTexto2;

                    // 4º Por último, ponemos ese resultado en el JLabel (labelResultado)
                    labelResultado.setText(resultadoMulti+"");

                } catch (NumberFormatException ex) {
                    labelResultado.setText("ERROR");
                }
            }else if(b.getText().equalsIgnoreCase("/")){
                // SE REALIZA LA DIVISION
                // 1º Obtenemos los valores de los TextFields
                String valorTexto1 = fieldValor1.getText();
                String valorTexto2 = fieldValor2.getText();

                // 2º Para restar, los valores deben ser enteros (try/catch para evitar errores)
                try {
                    double valorEnteroTexto1 = Double.parseDouble(valorTexto1);
                    double valorEnteroTexto2 = Double.parseDouble(valorTexto2);

                    // 3º Realizamos la suma de los valores
                    double resultadoMulti = valorEnteroTexto1 / valorEnteroTexto2;

                    // 4º Por último, ponemos ese resultado en el JLabel (labelResultado)
                    labelResultado.setText(resultadoMulti+"");

                } catch (NumberFormatException ex) {
                    labelResultado.setText("ERROR");
                }
            }


        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Boton dentro");
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(97, 87, 138));
            b.setBorder(new LineBorder(new Color(0,0,0), 3));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("Boton salido");
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(117, 117, 204));
        }
    };


    public PanelCalculadora1(){

        this.setLayout(new BorderLayout());
        this.setBackground(new Color(200,200,200));

        // Inicializamos eventos
        fieldValor1 = new JTextField("introduzca valor1");
        fieldValor2 = new JTextField("introduzca valor 2");
        botonSuma = new JButton("+");
        botonResta = new JButton("-");
        botonMultiplicacion = new JButton("x");
        botonDivision = new JButton("/");
        labelResultado = new JLabel();

        // Modificamos los atributos/valores/aspecto de los elementos
        fieldValor1.setPreferredSize(new Dimension(300,200));
        fieldValor2.setPreferredSize(new Dimension(300,200));
        botonSuma.setPreferredSize(new Dimension(150,200));
        botonResta.setPreferredSize(new Dimension(150,200));
        botonMultiplicacion.setPreferredSize(new Dimension(150,200));
        botonDivision.setPreferredSize(new Dimension(150,200));
        labelResultado.setPreferredSize(new Dimension(600,200));

        botonSuma.setBackground(new Color(117, 117, 204));
        botonResta.setBackground(new Color(117,117,204));
        botonDivision.setBackground(new Color(117,117,204));
        botonMultiplicacion.setBackground(new Color(117,117,204));

        // Añadimos los eventos
        botonSuma.addMouseListener(listenerMouse);
        botonResta.addMouseListener(listenerMouse);
        botonDivision.addMouseListener(listenerMouse);
        botonMultiplicacion.addMouseListener(listenerMouse);


        JPanel panelNorte = new JPanel(new GridLayout(1,2));
        JPanel panelCentro = new JPanel(new GridLayout(1,4));

        // Añadimos al panel
        panelNorte.add(fieldValor1, BorderLayout.NORTH);
        panelNorte.add(fieldValor2, BorderLayout.NORTH);
        panelCentro.add(botonSuma, BorderLayout.CENTER);
        panelCentro.add(botonResta, BorderLayout.CENTER);
        panelCentro.add(botonMultiplicacion, BorderLayout.CENTER);
        panelCentro.add(botonDivision, BorderLayout.CENTER);
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelCentro, BorderLayout.CENTER);
        this.add(labelResultado, BorderLayout.SOUTH);
    }

}
