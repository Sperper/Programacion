package com.programacion.Unidad_4.funciones.Actividades.proyectoCoche.Clases;

public class Coche {

    // ATRIBUTOS DE CLASE
    public int nRuedas;
    public int nPuertas;
    public int nLuces;
    public String motor;
    public String nBastidor;
    public String tipoCarrocería;
    public String propietario;

    // MÉTODOS DE CLASE
    public void desplazar(boolean esMarchaAtrás) {

        if (!esMarchaAtrás) {
            System.out.println("Camino hacia delante");
        } else {
            System.out.println("Camino hacia atrás");
        }

    }
   public void frenar(){
       System.out.println("Frenando coche");
   }
   public void arrancar(){
       System.out.println("Arrancando");
   }
   public void acelerar(){
       System.out.println("Acelerando");
   }
   public void imprimirDatosVehículos() {
       System.out.println("Hola, soy el coche de "+this.propietario);
   }

}
