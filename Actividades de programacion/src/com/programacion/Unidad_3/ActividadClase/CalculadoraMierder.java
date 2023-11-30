package com.programacion.Unidad_3.ActividadClase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraMierder {

    public static void main(String[] args) {

        double num1 = 0.0;
        double num2 = 0.0;
        char op;
        double resultado = 0.0;

        Scanner scan = new Scanner(System.in);

        try {

            System.out.print("Introduzca el primer num: ");
            num1 = scan.nextDouble();

            System.out.print("Introduzca el segundo num: ");
            num2 = scan.nextInt();

            System.out.print("Introduzca el operador: ");
            op = scan.next().charAt(0);

            switch (op){
                case '+': {
                    resultado = sumar(num1, num2);
                    break;
                }
                case '-': {
                    resultado = restar(num1, num2);
                    break;
                }
                case '*': {
                    resultado = multiplicar(num1, num2);
                    break;
                }
                case '/': {
                    resultado = dividir(num1, num2);
                    break;
                }
                case '%': {
                    resultado = resto(num1, num2);
                    break;
                }
                default: {
                    System.out.println("No se ha introducido un operador correcto");
                    break;
                }

            }
            System.out.println("El resultado es: "+resultado);

        }catch (InputMismatchException e){
            System.out.println("Error en los datos... ");
            System.out.println("Por favor, introduzca un dato numérico");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0...");
        }

    }

    public static double dividir(double num1, double num2) throws ArithmeticException {

        double resultadoAux = 0.0; // Declaro una variable de tipo double que se llama resultadoAux

        if (num2 == 0.0){
            throw new ArithmeticException();
        }
        resultadoAux = num1/num2;
        return resultadoAux;

    }
    public static double multiplicar(double num1, double num2){
        double resultadoAux = 0.0;
        resultadoAux = num1 * num2;
        return  resultadoAux;
    }

    public static double sumar(double num1, double num2){
        double resultadoAux = 0.0;
        resultadoAux = num1 + num2;
        return  resultadoAux;
    }

    public static double restar(double num1, double num2){
        double resultadoAux = 0.0;
        resultadoAux = num1 - num2;
        return  resultadoAux;
    }

    public  static  double resto(double num1, double num2){
        double resultadoAux = 0.0;
        resultadoAux = num1 % num2;
        return  resultadoAux;
    }

}
