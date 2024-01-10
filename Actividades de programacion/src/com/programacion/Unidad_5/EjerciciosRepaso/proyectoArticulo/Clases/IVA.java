package com.programacion.Unidad_5.EjerciciosRepaso.proyectoArticulo.Clases;

public class IVA {

    private static final double IVAgeneral = 1.21;
    private static final double IVAReducido = 1.10;
    private static final double IVASuperReducido = 1.04;

    /**
     * Metodo que devuelve un tipo de IVA según el tipo de artículo que se
     * le pase por parámetros
     *
     * APLICACION A PEQUEÑA ESCALA DEL PATRON DE DISEÑO FACTORY
     */

    public static double getIVA(String tipoProducto) {
        if (tipoProducto.equalsIgnoreCase("G")) {
            return IVA.IVAgeneral;
        } else if (tipoProducto.equalsIgnoreCase("R")) {
            return IVA.IVAReducido;
        } else if (tipoProducto.equalsIgnoreCase("SR")) {
            return IVA.IVASuperReducido;
        } else {
            System.out.println("No existe ese tipo de producto");
            return 1;
        }
    }

}
