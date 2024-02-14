package com.programacion.Unidad_6.proyectoBank.classes.impl;

import com.programacion.Unidad_6.proyectoBank.classes.api.Cuenta;

public class CuentaCorriente extends CuentaBancaria{



    @Override
    public void calcularInteres() {

    }

    @Override
    public boolean transferir(CuentaBancaria otraCuenta, double cantidadTraspaso) {
        return false;
    }

    @Override
    public void calcularIntereses() {

    }
}
