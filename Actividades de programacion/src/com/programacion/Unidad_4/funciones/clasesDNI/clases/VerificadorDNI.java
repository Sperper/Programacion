package com.programacion.Unidad_4.funciones.clasesDNI.clases;

public class VerificadorDNI {

    private static String dni = "";

    private static char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};


    /**
     * Metodo que comprueba que la ultima posicion es una letra
     * @param dni (String) dni a comprobar
     * @return true - es una letra false - no es una letra
     */

    public static boolean comprobarLetra(String dni){

        char letraDNI = dni.charAt(dni.length()-1);
        if ((letraDNI <= 65 && letraDNI <= 90) || (letraDNI >= 97 && letraDNI <= 122)){
            return true;
        } else {
            return false;
        }

    } // FIN comprobarLetra

    /**
     * Metodo que comprueba que la longitud de eun dni dado es de 9
     * @param dni (String) dni a comprobar
     * @return true si longitud es 9 / false si no es 9
     */

    public static boolean comprobarLongitud(String dni){
        return dni.length() == 9;
    } // FIN comprobarLongitud

    /**
     * La letra asociada a un DNI se obtiene dividiendo el DNI entre 23 y el resto es
     * codificado segun su correspondencia.
     * Un método que dado un DNI (con su letra) devuelta true o false si el dni es valido o no.
     * @param dni
     * @return
     */

    public static boolean comprobarLetraCorrecta(String dni) {

        String parteNumerica = dni.substring(0, 8);
        int numeroDni = Integer.parseInt(parteNumerica);
        int resto;
        resto = numeroDni % 23;
        if (letrasDNI[resto] == dni.charAt(dni.length()-1)){
            return true;
        } else {
            return false;
        }


    } // FIN comprobarLetraCorrecta

    /**
     * Comprueba que la parte numerica es efectivamente numereica y
     * no tiene caracteres.
     * @param dni (String) dni a comprobar
     * @return true si la parte numerica es correcta
     */

    public static boolean comprobarParteNumerica(String dni) {
        String parteNumerica;
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


} // FIN CLASE
