package com.programacion.unidad_8.miniCalculadora;

import com.programacion.unidad_8.miniCalculadora.ui.FrameCalculadora1;

import javax.swing.*;

public class MiniCalculadora1 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrameCalculadora1 fc = new FrameCalculadora1();
            }
        });
    }

}
