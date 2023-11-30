import java.util.Scanner;

public class Actividad_Clase {

    public static void main(String[] args) {

        /*
        Dado un número que el ususario introduce por teclado decir si es positivo
        o negativo
         */

        /*
        ¿Qué necesito?
        Leer 2 números por teclado
        ¿Cómo lo hago?
        Cojo la herramienta para leer por teclado
        Leo el valor 1
        Comparo ese número con 0... si es mayor que 0 -> Positivvo, si es menor -> Negativo
        Muestro por pantalla el mensaje correspondiente
         */

    Scanner scan = new Scanner(System.in);
    int a;
    System.out.println("Oye, dime un número");
    a = scan.nextInt();

    if (a < 0){
        System.out.println("Es negativo");
    } else {
        System.out.println("Es positivo");
    }

    }


}
