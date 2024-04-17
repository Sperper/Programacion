package com.programacion.unidad_8.teoriaLayouts.layoutFlow;

import javax.swing.*;

public class AppFlow {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrameFlow f = new FrameFlow();
            }
        });



    }

}
