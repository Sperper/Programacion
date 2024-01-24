package com.programacion.Unidad_5.expReg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TeoriaExpReg {

    public static void main(String[] args) {

        // Para poder usar las expresiones regulares en java se necesitan dos clases:
        // La clase Pattern: Pattern pattern = Pattern.compile("la expresion rergular");
        Pattern pattern = Pattern.compile("\\d{8}(\\s|-)?[a-zA-Z]"); // Expresion regular para DNI

        // La clase Matcher: Matcher matcher = pattern.matcher(el String que se quierer evaluar);
        String dni = "12345678P";
        Matcher matcher = pattern.matcher(dni);

        // Para ya comprobar en si... osea... un metodo que os diga true o false -> .find()
        if(matcher.find()){
            System.out.println("El DNI es válido");
        } else {
            System.out.println("El DNI no es válido");
        }


        // Hacer una expresion regular para comprobar una IP valida
        // 192.168.189.190

        pattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}\\.\\d{3}$");
        String ip = "123.123.123.123";
        matcher = pattern.matcher(ip);
        if (matcher.find()){
            System.out.println("IP válida");
        } else {
            System.out.println("IP no válida");
        }

        // ^ inicio, $ final.
        // . cualquier caracter


        // Hacer dos exp reg.
        // 1º Para un número de teléfono
        // 950475192 -> válido
        // 950 47 51 92 -> válido

        pattern = Pattern.compile("^\\d{3}(\\s?\\d{2}){3}$");
        String numero = "123 45 67 89";
        matcher = pattern.matcher(numero);

        if (matcher.find()){
            System.out.println("telefono válido");
        } else {
            System.out.println("telefono no válido");
        }

        // 2º Para una dirección de correo electrónico
        // cualquier caracter de cualquier longitud (+) de un @ seguido de gmail o hotmail seguido de . seguido de com o es

        pattern = Pattern.compile("^\\w+@(gmail|hotmail)\\.(com|es)$");
        String correo = "elreshu123@gmail.com";
        matcher = pattern.matcher(numero);

        if (matcher.find()){
            System.out.println("correo válido");
        } else {
            System.out.println("correo no válido");
        }


        pattern = Pattern.compile("^(04|41|14|18|29|21|11|23)\\d{3}$");

        Pattern patternD = Pattern.compile("^((3[0-1])|([0-2][1-9])|([1-2]0))(-|\\/)((1[0-2])|(0[1-9]))(-|\\/)(([0-1]\\d{3}|20[0-2][0-4]))$");




    }

}
