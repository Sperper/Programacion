package com.programacion.Unidad_4.funciones.Actividades.ProyectoDAWBank;

import com.programacion.Unidad_4.funciones.Actividades.ProyectoDAWBank.Clases.CuentaBancaria;
import com.programacion.Unidad_4.funciones.Actividades.ProyectoDAWBank.Clases.DawUtils;

public class UbriBank {

    public static void main(String[] args) {

        CuentaBancaria s = new CuentaBancaria("ES123123133456789012345678", "asdsd");
        s.ingresar(1000);
        s.mostrarMovimiento();
        DawUtils.verificarIban(s.iban);
        s.mostrarSaldo();

    }

}
