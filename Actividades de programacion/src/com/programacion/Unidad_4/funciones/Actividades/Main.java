package com.programacion.Unidad_4.funciones.Actividades;

import com.programacion.Unidad_4.funciones.DniValidator;

public class Main {

    public static void main(String[] args) {
        String dniAProbar1 = "12345678A";
        String dniAProbar2 = "123X5678A";

        boolean validez1 = DniValidator.comprobarParteNumerica(dniAProbar1);
        boolean validez2 = DniValidator.comprobarParteNumerica(dniAProbar2);

        if (validez1) { // if(validez1 == true)
            System.out.println("El dni "+dniAProbar1+" es correcto");
        } else {
            System.out.println("El dni "+dniAProbar1+" es incorrecto");
        }

        if (validez2) {
            System.out.println("El dni "+dniAProbar2+" es correcto");
        } else {
            System.out.println("El dni "+dniAProbar2+" es incorrecto");
        }





    }

}
