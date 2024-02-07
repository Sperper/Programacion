package com.programacion.Unidad_5.proyectoPruebaPractica;

import com.programacion.Unidad_5.proyectoPruebaPractica.services.Instituto;
import com.programacion.Unidad_5.proyectoPruebaPractica.utils.Alumno;
import com.programacion.Unidad_5.proyectoPruebaPractica.utils.Modulo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Instituto remedios = new Instituto("IES Los Remedios");
        Scanner scan = new Scanner(System.in);
        int opc = 0;

        do { // Bucle do-while para que muestre las opciones todas las veces que queira el usuario
            System.out.println("""
                       Bienvenido a IES Los remedios. ¿Que desea hacer?
                       1. Alta alumno
                       2. Buscar alumno
                       3. Baja alumno
                       0. Salir
                       """);

            try { // Try catch para controlar la excepcion a la hora de seleccionar una opcion
                opc = scan.nextInt();
                switch (opc) {

                    case 1:
                        if (remedios.numeroAlumnos() < 100) { // if que se iniciará si el numero de alumnos es menor a 100
                            System.out.println("Introduzca el dni del alumno");
                            String dni = scan.next();
                            System.out.println("Introduzca el nombre del alumno");
                            String nombre = scan.next();
                            System.out.println("Introduzca el email del alumno");
                            String email = scan.next();
                            Alumno alumnoNuevo = new Alumno(dni, nombre, email);
                            remedios.anadirAlumno(alumnoNuevo);
                            int opc2 = 0;
                            do {
                                opc2 = scan.nextInt();
                                System.out.println("Por favor, escriba los modulos a los que se va a matricular el alumno");
                                System.out.println("1. Añadir modulo");
                                System.out.println("0. Salir");
                                switch (opc2) {
                                    case 1:
                                        System.out.println("Introduzca el nombre del modulo");
                                        String nombreModulo = scan.next();
                                        System.out.println("Introduzca el numero de horas del modulo");
                                        int numeroHoras = scan.nextInt();
                                        Modulo modulo = new Modulo(nombreModulo, numeroHoras);
                                        alumnoNuevo.anadirModulo(modulo);
                                        if (alumnoNuevo.getNumeroHoras() >= 20) {
                                            System.out.println("Se ha alcanzado el numero maximo de horas, saliendo del sistema");
                                            opc2 = 0;
                                            System.out.println("¿Desea hacer algo mas?");
                                        }
                                        break;
                                }
                            } while (opc2 != 0);
                            break;
                        } else {
                            System.out.println("Ya se ha alcanzado el numero maximo de alumnos");
                        }

                        break;
                    case 2:
                        System.out.println("Dime el dni del alumno que desea buscar");
                        String dni = scan.next();
                        System.out.println(remedios.buscarAlumno(dni).getNombre() + ":" + remedios.buscarAlumno(dni).getDni());
                        for (int i=0; i<remedios.buscarAlumno(dni).getModulos().size(); i++){
                            int contador = i+1;
                            System.out.println(contador+remedios.buscarAlumno(dni).getModulos().get(i).getNombre());
                        }
                    case 3:
                        System.out.println("Dime el dni del alumno que desea buscar");
                        String dni2 = scan.next();
                        if (remedios.bajaAlumno(dni2)) {
                            System.out.println("Se ha dado de baja al alumno");
                        }
                        break;

                }
            } catch (InputMismatchException e){
                System.out.println("ERROR AL INTRODUCIR LA OPCION");
            }
        } while (opc != 0);

    }

}
