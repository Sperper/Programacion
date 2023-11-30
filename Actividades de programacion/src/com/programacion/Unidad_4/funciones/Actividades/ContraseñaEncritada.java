package com.programacion.Unidad_4.funciones.Actividades;

public class ContraseñaEncritada {

    public static void main(String[] args) {

        /**
         * Eescribir un metodo que reciba por parametros un String (la contraseña)
         * y devuelva la misma contraseña ya encriptada, haciendo uso del cifrado
         * cesar
         *
         * Ejemplo:
         * pass = "pass123"
         * pass retornada = "sdvv456"
         *
         * Consejos:
         * - Crear una variable auxiliar para almecenar la nueva password
         * - Recorrer el string y tratar cada uno de los caracteres individualmente
         * - Sumar 3 a cada caracter -> obtenemos un nuevo caracter
         * - Concatenar dicho caracter nuevo a la variable auxiliar
         *
         * Formato del metodo:
         *
         * public static String cifradoPasswd(String password){
         *
         *      String passwordCifrada = "";
         *
         *
         *      return cifrada
         *
         */

        String unaCadenaParaCifrar = "pass1234";
        CypherUtils.contraseniaCifrada(unaCadenaParaCifrar);


    } // FIN DE MAIN



}
