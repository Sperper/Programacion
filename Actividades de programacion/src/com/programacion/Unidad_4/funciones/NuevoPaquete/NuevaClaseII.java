package com.programacion.Unidad_4.funciones.NuevoPaquete;

public class NuevaClaseII {

    /**ç
     * Metodo que comprueba la valdez de un DNI
     * @param dni
     * @return true -> DNI valido/ False -> DNI invalido
     */

    public static boolean checkDNI(String dni){

        char letraDNI = dni.charAt(dni.length()-1);
        if (comprobarLength(dni) && checkCaracteres(dni) && comprobarSiEsLetra(letraDNI)) {
            return true;
        } else {
            return false;
        }
    }

    protected static boolean comprobarLength(String dni){

        if (dni.length() == 9) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Metodo que comprueba que la ultima posicion es una letra
     * @param letraDNI caracter del dni
     * @return
     */

    protected static boolean comprobarSiEsLetra(char letraDNI) {

        if ((letraDNI >= 65 && letraDNI <= 90) || (letraDNI >= 97 && letraDNI <= 122)){
            return true;
        } else {
            return false;
        }

    }

    /**
     * Método que compruebe que los caracteres del DNI son validos
     * Comprobar que tiene 8 números y 1 letra
     */

    public static boolean checkCaracteres(String dni) {
        boolean dniEsValido = false;
        for (int i = 0; i<=dni.length()-2; i++) {

            try {

                // Intentar parsear a entero el caracter
                char letraEnI = dni.charAt(i); // Obtenemos el caracter en esa posicion
                String letraEnPosicionI = Character.toString(letraEnI); // Convertir ese caracter a String
                int num = Integer.parseInt(letraEnPosicionI); // Intentamos convertir el String a int

            } catch (ClassCastException e){
                System.out.println("El dni no es valido");
                dniEsValido = false;
                break;
            }
        }
        return dniEsValido;
    }
}
