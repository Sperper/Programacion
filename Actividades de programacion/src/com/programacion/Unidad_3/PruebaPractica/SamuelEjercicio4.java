package com.programacion.Unidad_3.PruebaPractica;

import java.util.Scanner;

public class SamuelEjercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Para que lea por teclado
        String dni;
        System.out.println("Dime un dni: ");
        dni = scan.next();

        if (dni.length() > 9 || dni.length() < 9){ // Para comprobar que el dni no tenga mas de 9 caracteres

            System.out.println("El dni no es valido");

        } else if (dni.charAt(8) < 65 || dni.charAt(8) > 90){ // Para comprobar que la ultima letra sea una letra

            System.out.println("El dni no es valido");

        } else if (dni.length() == 9 && (dni.charAt(8) >= 65 && dni.charAt(8) <= 90)) { // Si no se cumple ninguna de las dos condiciones anteriores es válido

            System.out.println("El dni es valido");

        }
    } // Fin main

} // Fin clase
