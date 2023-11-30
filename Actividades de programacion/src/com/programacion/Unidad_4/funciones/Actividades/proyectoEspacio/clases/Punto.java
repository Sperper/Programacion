package com.programacion.Unidad_4.funciones.Actividades.proyectoEspacio.clases;

public class Punto {

    // Atributos de clase
    public double coorX;
    public double coorY;

    public String nombre;

    // Métodos de clase

    // Constructores
    // Los constructores son publicos (el 99.9% de las veces) -> Ese 0.1% es cuando se aplica el patron singleton

    public Punto(int coorX, int coorY) {
        this.coorX = coorX;
        this.coorY = coorY;
    }

    // Métodos
    /**
     * Método que calcule la distancia entre dos puntos
     * El método devuelve un double que es la distancia
     * El  método recibe por parámetros otro punto
     *
     * @return
     */
      public double CalcularDistancias(Punto c) {

          double distanciaX;
          double distanciaY;
          double sumaDistancias;
          double distanciaFinal;

          distanciaX = c.coorX - this.coorX;
          distanciaX = Math.pow(distanciaX, 2.0);

          distanciaY = c.coorY - this.coorY;
          distanciaY = Math.pow(distanciaY, 2.0);

          sumaDistancias = distanciaX + distanciaY;
          distanciaFinal = Math.sqrt(sumaDistancias);

          System.out.println("La distancia entre los dos puntos es: "+distanciaFinal);
          return distanciaFinal;
      }


}
