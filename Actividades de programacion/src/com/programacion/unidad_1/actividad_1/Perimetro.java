import java.util.Scanner;

public class Perimetro {

    public static void main(String[] args) {


        double radio;
        double pi = 3.14;
        double perimetro;

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el radio ");
        radio = scan.nextInt();

        perimetro = radio * pi * 2;
        System.out.println("El perimetro es "+perimetro);

    }
}


