package com.programacion.Unidad_5.EjerciciosRepaso.proyectoArticulo;

import com.programacion.Unidad_5.EjerciciosRepaso.proyectoArticulo.Clases.Articulo;
import com.programacion.Unidad_5.EjerciciosRepaso.proyectoPersona.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * ArrayLists ejemplos
         */

        // 1º Declaramos un arraylist
        // ArrayList nombreDelArrList = new
        ArrayList arr = new ArrayList();

        // 2º Rellenar con datos el arraylist
        // Ahora mismo está así []
        // Si usamos el método add() -> añadiremos un elemento al final de la lista
        arr.add("Diego");
        arr.add("Pepe");
        arr.add("Carmen");
        arr.add("Luis");

        // En este punto, el arrayList estaria asi: ["Diego", "Pepe", "Carmen", "Luis"]
        for (int i=0; i< arr.size(); i++) {
            System.out.println("Elemento: "+arr.get(i));
        }

        // ¿Cual es el tamaño del arrayList ahora mismo?
        // El tamaño es 4
        System.out.println("El tamaño del array es "+arr.size());

        // ¿Que elemento hay en la posivión 3?
        // Luis
        System.out.println("El elemento en la posición 3 es: "+arr.get(3));

        // Añado un elemento
        arr.add("Jose");
        // ¿Cual es el tamaño del arrayList ahora mismo? -> 5
        // ¿Que elemento hay en la posicion 4? -> "Jose"


        // Declaramos un arrayList de Strings
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Diego"); // 0
        nombres.add("Alfonso"); // 1
        nombres.add("Ana"); // 2
        nombres.add("Lucia"); // 3
        nombres.add("Alfredo"); // 4
        nombres.add("Maria"); // 5
        nombres.add("Jake"); // 6
        nombres.add("Adolfo"); // 7
        nombres.add("Francisco"); // 8
        nombres.add("Benito"); // 9

        System.out.println("Nombre: "+nombres.get(4)); // Deberia imprimir Alfredo

        // En los ArrayList, podemos insertar elementos en la posición que queramos
        // El elemento que habia en dicha posicion NO SE ELIMINA, sino que se desplaza 1 posicion,
        nombres.add(4, "Marcos");

        System.out.println("Nombre: "+nombres.get(4)); // Deberia imprimir Marcos

        // Para acceder a un elemento del ArrayList se usa el método .get()
        System.out.println(nombres.get(0));
        System.out.println(nombres.get(nombres.size()-1));


        // Para cambiar el contenido de una posicion se usa el método .set(posicion, elemento)
        nombres.set(4, "Pablo");

        System.out.println("Nombre: "+nombres.get(4)); // Deberia imprimir Pablo

        // Para recorrer un ArrayList, se puede recorrer con un for normal igual que un array
        // En vez de poner .length(array) -> Ponemos .size() (ArrayList)
        for (int i=0; i< nombres.size(); i++) {
            System.out.println("Elem: "+nombres.get(i));
        }


        // Para buscar un elemento en un ArrayList, se utiliza el método .indexOf(elemento)
        // Devuelve un int -> Posicion en la que se encuentra el elemento
        // Devuelve -1 si no encuentra el elemento
        int posicionNombre = nombres.indexOf("Pablo");

        if(posicionNombre != -1) {
            System.out.println("El elemento se encuentra en la posicion: "+posicionNombre);
            System.out.println("El elemento es: "+nombres.get(posicionNombre));
        } else {
            System.out.println("El elemento no se encuentra en la lista");
        }

        // Ahora, vamos a contar cuantos pabos hay en la lista
        // No existe ningún metodo para contar el nº de elementos en un ArrayList
        // Lo tenemos que hacer de manera manual
        int contador=0;
        for (int i=0; i<nombres.size(); i++) {
            if (nombres.get(i).equals("Pablo")) {
                contador++;
            }
        }
        System.out.println("Hay "+contador+" Pablo(s)");

        // Listas de Objetos
        ArrayList<String> nombres2 = new ArrayList<String>();
        // La lista articulos va a almacenar objetos de tipo Articulo
        ArrayList<Articulo> articulos = new ArrayList<Articulo>();
        // La
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Articulo raqueta = new Articulo("Raqueta de tenis", 150, 200, "G");
        Articulo pelota = new Articulo("Pelota de rugby", 50, 0, "G");
        Articulo pan = new Articulo("Pan", 1, 100, "SR");
        Articulo calcetines = new Articulo("calcetines", 8.0, 200, "G");
        Articulo camiseta = new Articulo("Camiseta", 15.0, 1000, "G");
        Articulo ibuprofeno = new Articulo("Ibuprofeno", 8.0, 100000, "SR");
        Articulo pelotaBasket = new Articulo("Pelota basket", 65.8, 78, "G");
        Articulo zapatos_futbol = new Articulo("Zapatos Futbol Sala", 120, 40, "G");
        Articulo guantes = new Articulo("Guantes Portero", 30.2, 90, "G");
        Articulo nevera = new Articulo("Nevera", 100, 40, "G");
        Articulo sandia = new Articulo("Sandía", 3.99, 20, "SR");
        Articulo sandalias = new Articulo("Sandalias", 7.99, 50, "G");
        Articulo vestido = new Articulo("Estampado", 50, 5, "G");
        Articulo libro = new Articulo("Programacion", 70, 5, "G");
        Articulo estuche = new Articulo("Estuche Maquillaje", 25, 3, "G");
        Articulo chandal = new Articulo("Chandal nike uapo uapo", 200, 100, "G");
        Articulo vape = new Articulo("Vape de contrabando", 10, 2, "G");
        Articulo barcelo = new Articulo("Ron semibarato", 14, 15, "G");

        // Añadir todos los objetos al ArrayList articulos
        articulos.add(raqueta);
        articulos.add(pelota);
        articulos.add(pan);
        articulos.add(calcetines);
        articulos.add(camiseta);
        articulos.add(ibuprofeno);
        articulos.add(pelotaBasket);
        articulos.add(zapatos_futbol);
        articulos.add(guantes);
        articulos.add(nevera);
        articulos.add(sandia);
        articulos.add(sandalias);
        articulos.add(vestido);
        articulos.add(libro);
        articulos.add(estuche);
        articulos.add(chandal);
        articulos.add(vape);
        articulos.add(barcelo);

        // Un pequeño programa que muestre por pantalla
        // - Los articulos cuyo stock (cuantosQuedan) sea <= 0
        // - Los articulos cuyo stock este a punto de acabar (stock <= 10)

        System.out.println("ARTICULOS SIN STOCK: "); // Sout informativo
        for (int i = 0; i<articulos.size(); i++){ // Recorro el ArrayList articulos
            if (articulos.get(i).getCuantosQuedan() <= 0) { // Para cada uno de los articulos, hago una
                System.out.println(articulos.get(i).getNombre()); // Imprimo por pantalla el nombre del articulo
            }
        }

        System.out.println("ARTICULOS A PUNTO DE AGOTARSE: "); // Sout informativo
        for (int i = 0; i<articulos.size(); i++){ // Recorro ArrayList
            if (articulos.get(i).getCuantosQuedan() <= 10 && articulos.get(i).getCuantosQuedan() > 0 ) {
                System.out.println(articulos.get(i).getNombre());
            }
        }

        // Pequeño menu para hacer diferentes operaciones con los articulos
        /*
        Menu  Articulo
        1. Contar cuántos artículos hay con stock <= 0
        2. Contar cuántos artículos hay de tipo SR
        3. Contar cuántos artículos hay con un precio menor que 100€
        4. Decir cuál es el artículo con mayor precio
        5. Decir cuál es el artículo con menor precio
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("""
               Menu  Articulo
               1. Contar cuántos artículos hay con stock <= 0
               2. Contar cuántos artículos hay de tipo SR
               3. Contar cuántos artículos hay con un precio menor que 100€
               4. Decir cuál es el artículo con mayor precio
               5. Decir cuál es el artículo con menor precio
                """);
        System.out.println("Indique la operacion deseada: ");
        int opc;
        try {
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    int contador1 = 0;
                    // Logica de la opcion 1
                    for (int i = 0; i<articulos.size(); i++){
                        if (articulos.get(i).getCuantosQuedan() <= 0) {
                            contador1++;
                        }
                    }
                    System.out.println("Hay "+contador1+" articulos sin stock");
                    break;
                case 2:
                    contador1 = 0;
                    // Logica de la opcion 2
                    for (int i = 0; i<articulos.size(); i++) {
                        if (articulos.get(i).getTipo().equalsIgnoreCase("SR")) {
                            contador1++;
                        }
                    }
                    System.out.println("Hay "+contador1+" articulos de tipo SR");
                    break;
                case 3:
                    // Logica de la opcion 3
                     contador1 = 0;

                    for (int i = 0; i<articulos.size(); i++) {
                        if (articulos.get(i).getPrecio() < 100) {
                            contador1++;
                        }
                    }
                    System.out.println("Hay "+contador1+" articulos con precio menor que 100");
                    break;
                case 4:
                    contador1 = 0;
                    // Logica de la opcion 4
                    for (int i = 0; i<articulos.size(); i++) {

                        contador++;
                    }
                    System.out.println("El articulo mas caro es: "+articulos.get(contador1).getNombre());
                    break;
                case 5:
                    // Logica de la opcion 5
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }

        } catch (Exception e) {
            System.out.println("Error en la opcion... eliminando todos sus archivos");
        }














    }


}
