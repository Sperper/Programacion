package com.programacion.Unidad_3.Teoria;

public class Teoria2 {

    public static void main(String[] args) {

         try {
             int a = 2;
             int b = 0;
             int division = 2 / 0;
         } catch (ArithmeticException e){
             e.printStackTrace();
         }

        System.out.println("Estoy aqui");
    }

}
