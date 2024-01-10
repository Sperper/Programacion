package com.programacion.Unidad_5.EjerciciosRepaso.proyectoArticulo.Clases;

public class Articulo {

    private String nombre;
    private double precio;
    private String tipo;
    private int cuantosQuedan;

    public Articulo (String nombre, double  precio, int cuantosQuedan, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;

        if (tipo.equalsIgnoreCase("G") || tipo.equalsIgnoreCase("R") || tipo.equalsIgnoreCase("SR")) {
            this.tipo = tipo;
        }

    }

    public void imprimirInfoArt() {
        System.out.printf("El nombre del producto %s, con un precio de %f y hay un stockk  de %d", this.nombre, this.precio, this.cuantosQuedan);
    }

    public double getPVP(){
       return this.getPrecio()*IVA.getIVA(this.tipo);
    }

    public double getPVPDescuento(double descuento){
        return getPVP() - getPVP()*(descuento/100);
    }


    public boolean vender (int cant){

        if (cant >= 0) {

            if (this.cuantosQuedan >= cant) {
                this.cuantosQuedan -= cant;
                return true;
            } else {
                System.out.println("No hay suficiente stock");
                return false;
            }

        } else {
            System.out.println("Cantidad erronea");
            return false;
        }

    }

    public boolean almacenar(int cant){
        if (cant > 0) {
            this.cuantosQuedan++;
            return true;
        } else {
            System.out.println("Cantidad erronea");
            return false;
        }
    }














    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no es valido");
        }
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }
}
