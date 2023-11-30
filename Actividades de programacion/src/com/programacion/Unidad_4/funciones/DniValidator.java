package com.programacion.Unidad_4.funciones;

public class DniValidator {

    public static void main(String[] args) {

    }

    /**
     * Funcion que comprueba que la parte numerica del dni
     * es efectivamente un número
     * @param dni String que contiene el dni
     * @return true - si la parte numerica esta bien, false - si no esta bien
     */
    public static boolean comprobarParteNumerica(String dni) {
        String parteNumerica = ""; // String auxiliar para almacenar la parte numerica

        try {
            // Para obtener la parte numerica, hago un substring de la posicion 0 a la 8
            parteNumerica = dni.substring(0, 8);
            System.out.println("La parte numerica es: "+parteNumerica);

            // Por ultimo, voy a comprobar que EFECTIVAMENTE ES UN NUMERO
            int numero = Integer.parseInt(parteNumerica);
            System.out.println("La parte numerica como numerro es: "+numero);

        } catch (Exception e) {
            // Si lanza una excepcion significa que la parte numerica del DNI
            // ES INCORRECTA
            System.out.println("Error en los datos");
            return false;
        }
        return  true;
    }

}
