package com.programacion.Unidad_4.funciones.Actividades.proyectoArtículo.Clases;

public class Articulo {

    /**
     * - id
     * - nombre
     * - cantidad
     * - descripción
     * - precio base
     * - precio IVA
     * - tipo
     *
     * ****** METODOS ******
     * + Vender artículo()
     * + calcularPrecio()
     * + imprimirArticulo()
     * + añadirStock()
     * + hayStock()
     */

    public String id;
    public String nombre;
    public int stock;
    public String descripcion;
    public double precioBase;
    public double precioIVA;
    public String tipo;

    /**
     * Crear constructos personalizado al que se le pase
     * el id, nombre, tipo y precioBase
     *
     * y además, que en base a esos parametros, que calcule el precioconIVA
     */

    public Articulo (String id, String nombre, String tipo, double precioBase) {

        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;

        if (precioBase >= 0) {
            this.precioBase = precioBase;
        } else {
            this.precioBase = 0;
        }

        this.calcularPrecio();
    }

    public void venderArticulo() {

        this.stock --;
        System.out.println(this.nombre + "vendido");

    }
    public void calcularPrecio(){

       if (this.tipo.equalsIgnoreCase("PN")){
           this.precioIVA = this.precioBase * 1.04;
       } else if (this.tipo.equalsIgnoreCase("SN")) {
           this.precioIVA = this.precioBase * 1.10;
       } else if (this.tipo.equalsIgnoreCase("TN")) {
           this.precioIVA = this.precioBase * 1.21;
       }

    }
    public void imprimirArticulo(){

        System.out.println(
                "\nID: "+this.id+
                        "\n\t-Nombre: "+this.nombre+
                        "\n\t-Tipo: "+this.tipo+
                        "\n\t-Descripcion: "+this.descripcion+
                        "\n\t-Cantidad: "+this.stock+
                        "\n\t-Precio Base: "+this.precioBase+
                        "\n\t-Precio con IVA: "+this.precioIVA);

    }

    public void añadirStock(int cantidad){

        this.stock = this.stock + cantidad;
        System.out.println("Se han ananido "+cantidad+" intems a "+this.stock);

    }
    public void hayStock(){
        if (this.stock == 0){
            System.out.println("No hay stock de "+this.nombre);
        } else {
            System.out.println("Hay stock de "+this.nombre);
        }
    }



}
