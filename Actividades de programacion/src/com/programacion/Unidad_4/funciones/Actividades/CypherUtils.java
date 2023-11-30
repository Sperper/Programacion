package com.programacion.Unidad_4.funciones.Actividades;

import java.io.CharArrayReader;

public class CypherUtils {

    public static String contraseniaCifrada(String contrasenia){
        String contraseniacifrada = "";
        for (int i = 0; i <= contrasenia.length()-1; i++){

            // Cojo cada uno de los caracteres
            char letraAcifrar = contrasenia.charAt(i);

            // Obtengo el valor numerico del caracter
            int valorNumerico = Character.getNumericValue(letraAcifrar);

            // Sumo 3 a ese valor
            valorNumerico = valorNumerico + 3;

            // Paso de numero a caracter
            char letraCifrada = (char) valorNumerico;

            // Concateno el caracter a la contraseniacifrada:
            contraseniacifrada = contraseniacifrada + Character.toString(letraCifrada);



        }
        return contraseniacifrada;
    }

}
