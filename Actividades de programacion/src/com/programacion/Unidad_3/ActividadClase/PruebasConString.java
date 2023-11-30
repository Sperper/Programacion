package com.programacion.Unidad_3.ActividadClase;

public class PruebasConString {

    public static void main(String[] args) {

        /**
         * Que compare la longitud de dos Strings y nos diga el mayor
         */
        String cadena1 = "wqregh";
        String cadena2 = "pjioefweifiru";

        if (cadena1.length() > cadena2.length()){
            System.out.println(cadena1 +" es mayor");
        } else {
            System.out.println(cadena2 +" es mayor");
        }

        String perro = "perro";
        perro.charAt(3); // Estamos accediendo al carácter en la posición 3

        String abece = "abcdefghijklmnñopqrstuvwxyz";

        //Vamos a hacer una ejercicio donde recorramos el String abece y mostremos cada uno de los valores.
        // tenemos la longitud del String con abece.length()
        // tenemos la posibilidad de acceder a cada uno de los carácteres abece.charAt(index)
        for (int i=0; i<=abece.length()-1; i++){
            System.out.println(abece.charAt(i));
        }

    }

}
