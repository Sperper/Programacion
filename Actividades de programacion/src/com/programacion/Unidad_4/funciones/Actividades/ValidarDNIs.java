package com.programacion.Unidad_4.funciones.Actividades;

import com.programacion.Unidad_4.funciones.DniValidator;

public class ValidarDNIs {

    public static void main(String[] args) {
        /**
         * Declarar un array de String de 10 posiciones
         * Meter en cada posicion 1 DNI diferente
         * LLamar al método checkPartenumerica y contar
         * cuantos dnis son válidos y cuantos inválidos
         */

        // Declarar array

        // Llenar array

        // declarar contador para dnisvalidos y dnisInvalidos

        // recorrer el array

        // cada posicion del array, llamarr a DniValidator.comprobarParteNumerica("")

        // Si true -> contador dnisValidos ++
        // Si false -> contador dnisInvalidos ++

        // Imprimir por pantalla los resultados

        String[] dnis = new String[10];
        int dnisValidos = 0;
        int dnisInvalidos = 0;

        dnis[0] = "12345678A";
        dnis[1] = "36347890B";
        dnis[2] = "1231231H3";
        dnis[3] = "2839D2929";
        dnis[4] = "12849372B";
        dnis[5] = "237484F38";
        dnis[6] = "13836483H";
        dnis[7] = "68136256J";
        dnis[8] = "4595G9585";
        dnis[9] = "5484555G8";

        for (int i = 0; i <= dnis.length - 1; i++ ){
            boolean validar = DniValidator.comprobarParteNumerica(dnis[i]);

            if (validar) {
                dnisValidos ++;
            } else {
                dnisInvalidos++;
            }
        }

        System.out.println("El numeror de dnis validos es: "+dnisValidos);
        System.out.println("El numero de dnis invalidos es: "+dnisInvalidos);



    }

}
