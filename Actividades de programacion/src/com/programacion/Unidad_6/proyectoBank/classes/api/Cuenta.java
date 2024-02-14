package com.programacion.Unidad_6.proyectoBank.classes.api;

import com.programacion.Unidad_6.proyectoBank.classes.impl.CuentaBancaria;

public interface Cuenta {

    public boolean ingresar(double cantidadIngresar);
    public boolean retirar(double cantidadARetirar);
    public boolean transferir(CuentaBancaria otraCuenta, double cantidadTraspaso);
    public void calcularIntereses();
}
