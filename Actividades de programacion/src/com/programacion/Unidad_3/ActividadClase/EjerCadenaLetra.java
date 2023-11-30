package com.programacion.Unidad_3.ActividadClase;

public class EjerCadenaLetra {

    public static void main(String[] args) {

        /**
         * Vamos a hacer un programa, que dado un String ...
         * cuentee cuántas vocales de cada tipo tiene.
         *
         * Ejemplo:
         * String cadena = "Hola mundo";
         *
         * ... hace las movidas necesarias
         *
         * Tiene 1 a
         * Tiene 0 e
         * Tiene 0 i
         * Tiene 2 o
         * Tiene 1 u
         */

        String palabra = "LIoneLLe";
        int cantA = 0;
        int cantE = 0;
        int cantI = 0;
        int cantO = 0;
        int cantU = 0;

        for (int i = 0; i <= palabra.length()-1; i++){

            if (palabra.charAt(i) == 'u' || palabra.charAt(i) == 'U'){
                cantU++;
            } else if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A'){
                cantA++;
            } else if (palabra.charAt(i) == 'e' || palabra.charAt(i) == 'E'){
                cantE++;
            } else if (palabra.charAt(i) == 'i' || palabra.charAt(i) == 'I') {
                cantI++;
            } else if (palabra.charAt(i) == 'o' || palabra.charAt(i) == 'O') {
                cantO++;
            }

        }
        System.out.println("Tiene "+cantA+" a");
        System.out.println("Tiene "+cantE+" e");
        System.out.println("Tiene "+cantI+" i");
        System.out.println("Tiene "+cantO+" o");
        System.out.println("Tiene "+cantU+" u");



    }

}
