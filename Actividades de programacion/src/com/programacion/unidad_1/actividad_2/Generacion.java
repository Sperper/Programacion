import java.util.Scanner;

public class Generacion {

    public static void main(String[] args) {

        /*
        5. Escribe un programa que, dado un año introducido por teclado,
    muestre un mensaje diciendo la generación a la que pertenece
    esa persona. (Ejemplo: Introduzco 1989 -> Muestra “Eres
    Millenial”)
    a. Identifica con comentarios las variables, el método main,
    la clase y las estructuras de control usadas.

         */

        Scanner scan = new Scanner(System.in);
        int año;
        System.out.println("Introduzca el año de nacimiento: ");
        año = scan.nextInt();

        if (año >= 1930 && año <= 1948){
            System.out.println("Usted pertenece a la generación  Niños de la posguerra");
        } else if (año >= 1949 && año <= 1968) {
            System.out.println("Usted pertenece a la generación Baby boom");
        } else if (año >= 1969 && año <= 1980) {
            System.out.println("Usted pertenece a la generación X");
        } else if (año >= 1981 && año <= 1993) {
            System.out.println("Usted pertenece a la generación Millennials");
        } else if (año >= 1994 && año <= 2010) {
            System.out.println("Usted pertenece a la generación Z");
        } else if (año < 1930){
            System.out.println("Error");
        }

    }
}
