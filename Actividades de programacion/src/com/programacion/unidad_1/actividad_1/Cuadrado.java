import java.util.Scanner;

public class Cuadrado {

    public static void main(String[] args) {

        double a;
        double b;
        double area;

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el valor del lado a ");
        a = scan.nextInt();

        System.out.println("Introduzca el valor del lado b ");
        b = scan.nextInt();

        area = a * b;
        System.out.println("El area es "+area);
    }
}
