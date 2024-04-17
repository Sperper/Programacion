package com.programacion.unidad_8.teoriaLayouts.layoutBorder;

import javax.swing.*;
import java.awt.*;

public class FrameBorder extends JFrame{

    public FrameBorder (){

        this.setSize(800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("ElNano");
        ImageIcon icon = new ImageIcon("src/com/programacion/unidad_8/teoria/nano.jpg");
        this.setIconImage(icon.getImage());

        // VAMOS A CREAR 4 JPanels y a añadirlos en diferentes posiciones del BorderLayout
        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(new Color(255,100,100));
        panelCentro.setLayout(new BorderLayout());

        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(new Color(100,0,255));
        panelNorte.setPreferredSize(new Dimension(100,100));

        JPanel panelSur = new JPanel();
        panelSur.setBackground(new Color(255, 242, 0));
        panelSur.setPreferredSize(new Dimension(100,100));

        JPanel panelEste = new JPanel();
        panelEste.setBackground(new Color(47, 255, 0));
        panelEste.setPreferredSize(new Dimension(100,100));

        JPanel panelOeste = new JPanel();
        panelOeste.setBackground(new Color(247, 0, 255));
        panelOeste.setPreferredSize(new Dimension(100,100));

        JPanel panelCentroCentro = new JPanel();
        panelCentroCentro.setBackground(new Color(255, 0, 38));
        panelCentroCentro.setPreferredSize(new Dimension(50,50));

        JPanel panelCentroNorte = new JPanel();
        panelCentroNorte.setBackground(new Color(0, 225, 255));
        panelCentroNorte.setPreferredSize(new Dimension(50,50));

        JPanel panelCentroSur = new JPanel();
        panelCentroSur.setBackground(new Color(255, 77, 0));
        panelCentroSur.setPreferredSize(new Dimension(50,50));

        JPanel panelCentroEste = new JPanel();
        panelCentroEste.setBackground(new Color(150, 109, 253));
        panelCentroEste.setPreferredSize(new Dimension(50,50));

        JPanel panelCentroOeste = new JPanel();
        panelCentroOeste.setBackground(new Color(71, 190, 81));
        panelCentroOeste.setPreferredSize(new Dimension(50,50));

        panelCentro.add(panelCentroCentro, BorderLayout.CENTER);
        panelCentro.add(panelCentroCentro, BorderLayout.NORTH);
        panelCentro.add(panelCentroSur, BorderLayout.SOUTH);
        panelCentro.add(panelCentroEste, BorderLayout.EAST);
        panelCentro.add(panelCentroOeste, BorderLayout.WEST);


        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelSur, BorderLayout.SOUTH);
        this.add(panelEste, BorderLayout.EAST);
        this.add(panelOeste, BorderLayout.WEST);
        this.add(panelCentro, BorderLayout.CENTER);

        this.setVisible(true);

    }

}
