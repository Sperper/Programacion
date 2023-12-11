package com.programacion.Unidad_4.funciones.Actividades.ProyectoDAWBank.Clases;

public class DawUtils {

    public static int longitudIban = 24;
    public static String avisoHacienda = "Avisar a Hacienda";
    public static String avisoNumerosRojos = "AVISO: Cuenta en numeros rojos";

    public static boolean verificarIban (String iban) {
        boolean esCorrecto = false;
        do {
            if (iban.length() == longitudIban) {

                if (iban.charAt(0) == 'E' && iban.charAt(1) == 'S') {

                    for (int i = 2; i <= iban.length() - 1; i++) {

                        if (iban.charAt(i) >= 48 && iban.charAt(i) <= 57) {

                            esCorrecto = true;

                        } else {

                            esCorrecto = false;
                            break;

                        }

                    }

                } else {

                    System.out.println("El iban introducido no es válido");
                    esCorrecto = false;
                    break;

                }

            } else {

                esCorrecto = false;
                System.out.println("La longitud del iban es incorrecta");
                break;

            }

        } while ((iban.charAt(0) != 'E' && iban.charAt(1) != 'S') || iban.length() != longitudIban);

        if (esCorrecto) {

            System.out.println("El iban introducido es valido");
            return true;

        } else {

            System.out.println("El iban introducido es invalido");
            return false;

        }

    }

}
