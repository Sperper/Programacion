import java.util.Scanner;

public class Edad_persona {

    /*
    Vamos a hacer un programa que lea por teclado la edad de una persona y, que:
    -> Si tiene mas de 100 años, que diga, "no veas soci@"!!
    -> Si tiene mas de 150 años, que diga, "mentira!"
    -> Si tiene una edad negativa, que diga, "edad incorrecta"
    -> Si tiene una edad normal.... ed decir, de 0 a 100, que le diga "Tienes x años"
     */

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int edad;
        System.out.println("Introduce la edad: ");
        edad = scan.nextInt();

        if (edad > 100){
            System.out.println("No veas soci@!!");
        }
        if (edad > 150){
            System.out.println("Mentira!");
        }
        if (edad < 0){
            System.out.println("Edad incorrecta");
        }
        if (edad >= 0){
            if (edad <= 0){
                System.out.println("Tienes "+edad+" años");
            }
        }

    }

}
