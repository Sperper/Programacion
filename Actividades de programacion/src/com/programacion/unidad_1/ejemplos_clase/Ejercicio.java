/*
Dada una nota, imprimir poor pantalla uno de los siguientes msg.
 nota 0, 1, 2, 3 -> "Keep trying"
 nota  4 -> "Casi, amig@"
 nota 5 -> "sufi"
 nota 6 > "bien"
 */

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        int nota;

        System.out.println("Dime tu nota");

        Scanner scan = new Scanner(System.in);
        nota = scan.nextInt();

        if (nota <= 3){
            System.out.println("Keep trying");
        }
        if (nota == 4){
            System.out.println("Casi, amig@");
        }
        if (nota == 5){
            System.out.println("sufi");
        }
        if (nota == 6){
            System.out.println("bien");
        }
        if (nota == 7){
            System.out.println("notable");
        }
        if (nota == 8){
            System.out.println("bien hecho");
        }
        if (nota == 9){
            System.out.println("muy bien hecho");
        }
        if (nota == 10){
            System.out.println("Eres un crack");
        }
    }
}
