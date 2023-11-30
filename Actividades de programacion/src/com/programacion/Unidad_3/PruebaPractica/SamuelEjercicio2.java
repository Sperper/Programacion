package com.programacion.Unidad_3.PruebaPractica;

import java.util.Scanner;

public class SamuelEjercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int personasMayorMedia = 0;
        int personasMenorMedia = 0;
        double alturaMedia = 0; // Para altura media
        int N; // Numero de alturas para introducir
        System.out.println("Dime el número de alturas para almacenar.");
        N = scan.nextInt();
        double[] alturas = new double[N]; // Array de alturas
        double alturaIntroducida;
        for (int i = 0; i <= alturas.length-1; i++){ // Recorrer y dar valor a el array de alturas

            System.out.println("Dime la altura");
            alturaIntroducida = scan.nextDouble();
            alturas[i] = alturaIntroducida;
            System.out.println("Altura introducida");

        }
        for (int i = 0; i <= alturas.length-1; i++){ // Recorrer array para media


            alturaMedia = (alturas[i] + alturaMedia);

        }
        alturaMedia = alturaMedia / N;
        System.out.println("La altura media es: "+alturaMedia);

        for (int i = 0; i <= alturas.length-1; i++){ // Para recorrer y saber cuales estan por encima de la media

            if (alturas[i] > alturaMedia){
                personasMayorMedia ++;
            } else {
                personasMenorMedia ++;
            }

        }
        System.out.println("El numero de personas mayor que la media es: " + personasMayorMedia);
        System.out.println("El numero de personas menor que la media es: " + personasMenorMedia);








    } // FIN DE MAIN

} // FIN DE CLASE
