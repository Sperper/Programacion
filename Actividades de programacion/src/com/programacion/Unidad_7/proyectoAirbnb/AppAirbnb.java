package com.programacion.Unidad_7.proyectoAirbnb;

import com.programacion.Unidad_7.proyectoAirbnb.model.Alojamiento;
import com.programacion.Unidad_7.proyectoAirbnb.model.Propietario;
import com.programacion.Unidad_7.proyectoAirbnb.services.GestionFicheroAirbnb;

import java.util.*;

public class AppAirbnb {


    public static void main(String[] args) {

        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        alojamientos = GestionFicheroAirbnb.leerFicheroAlojamientos("src/resources/archivosTema7/airbnb/malaga.csv");

        Scanner scan = new Scanner(System.in);
        int opc = 0;
        do {




            System.out.println("Bienvenido a Airbnb, ¿que desea hacer?");
            System.out.println("""
                    1. Mostrar los 20 alojamientos mas baratos
                    2. Mostrar los 20 alojamientos mas caros
                    3. Escribir el presupuesto máximo por noche
                    4. Modificar precio alojamiento
                    5. Modificar propietario del alojamiento 
                    0. Salir
                    """);
            try {
                opc = scan.nextInt();
                scan.nextLine();
                switch (opc) {
                    case 1:

                        Collections.sort(alojamientos);

                        for (int i=0; i<alojamientos.size(); i++) {
                            if (i < 20) {
                                System.out.println(alojamientos.get(i).toString());
                            }
                        }
                        break;
                    case 2:

                        Collections.sort(alojamientos, Comparator.comparing(Alojamiento::getPrecio).reversed());

                        for (int i=0; i<alojamientos.size(); i++) {
                            if (i < 20) {
                                System.out.println(alojamientos.get(i).toString());
                            }

                        }
                        break;
                    case 3:
                        System.out.println("Dime el presupuesto maximo");
                        int presupuesto = scan.nextInt();
                        scan.nextLine();

                        for (int i=0; i<alojamientos.size(); i++){
                            if (presupuesto > alojamientos.get(i).getPrecio()){
                                System.out.println(alojamientos.get(i).toString());
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Dime el id de un alojamiento");
                        String id = "";
                        id =  scan.nextLine();


                        for (int i=0; i<alojamientos.size(); i++){

                            if (id.equalsIgnoreCase(alojamientos.get(i).getId())){


                                System.out.println(alojamientos.get(i).toString());
                                Alojamiento aloj = alojamientos.get(i);
                                System.out.println("Introduzca el nuevo precio");
                                int precio = scan.nextInt();
                                aloj.setPrecio(precio);
                                alojamientos.remove(alojamientos.get(i));
                                alojamientos.add(aloj);

                                GestionFicheroAirbnb.escribirFichero("src/resources/archivosTema7/airbnb/datos_malaga.csv", alojamientos);


                                break;
                            }
                        }

                        break;
                    case 5:
                        System.out.println("Dime el id de un alojamiento");
                         id = scan.nextLine();


                        for (int i=0; i<alojamientos.size(); i++){

                            if (id.equalsIgnoreCase(alojamientos.get(i).getId())){


                                System.out.println(alojamientos.get(i).toString());
                                Alojamiento aloj = alojamientos.get(i);
                                System.out.println("Introduzca los datos solicitados");
                                System.out.print("Nombre: ");
                                String host_name = scan.nextLine();
                                System.out.print("Id: ");
                                String host_id = scan.nextLine();
                                Propietario propietario = new Propietario(host_id, host_name);
                                aloj.setPropietario(propietario);
                                alojamientos.remove(alojamientos.get(i));
                                alojamientos.add(aloj);

                                GestionFicheroAirbnb.escribirFichero("src/resources/archivosTema7/airbnb/datos_malaga.csv",alojamientos);


                                break;
                            }
                        }



                        break;
                    case 0:
                        System.out.println("Saliendo del sistema");
                        break;

                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Opcion incorrecta");
            }



        } while (opc != 0);

    }

}
