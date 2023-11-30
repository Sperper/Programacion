import java.util.Scanner;

public class Calculadorasuma {

    public static void main(String[] args) {

        // ANALISIS
        // ¿Qué nos pide? -> Sumar dos números
        // ¿Qué tenemos? -> Nada
        // ¿Qué necesitamos? -> 2 números para sumar

        //DISEÑO
        // ¿Se ha hecho ya? -> SI, basicamente usas el operador.
        // ¿Cómo lo hacemos?
        /*
        1º Declarar las variables. Una para número a, otra para el número b y otra para la suma.
        2º Las tres variables son de tipo entero
        3ª Pedir el numero a al usuario
        4º Pedir el número b al usuario
        5º Sumar a y b, y asignarle el resultado a "suma"
        6º Mostrar el resultado por pantalla
         */

        int a;
        int b;
        int suma;

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el valor para a ");
        a = scan.nextInt();

        System.out.println("Introduzca el valor para b ");
        b = scan.nextInt();

        suma = a + b;
        System.out.println(suma);

    }

}
