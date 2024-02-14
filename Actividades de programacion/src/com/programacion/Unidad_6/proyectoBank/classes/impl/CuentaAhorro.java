package com.programacion.Unidad_6.proyectoBank.classes.impl;
import com.programacion.Unidad_6.proyectoBank.classes.impl.CuentaBancaria;
import com.programacion.Unidad_6.proyectoBank.classes.api.Cuenta;

    public class CuentaAhorro extends CuentaBancaria {

        public static final double SALDO_MINIMO = 2000;


        @Override
        public boolean transferir(CuentaBancaria otraCuenta, double cantidadTraspaso) {
            return false;
        }

        @Override
        public void calcularIntereses() {

            double saldo = this.getSaldo();
            double nuevoInteresAnual = CuentaBancaria.INTERES_ANUAL_BASICO;

            if(saldo < CuentaAhorro.SALDO_MINIMO) {
                nuevoInteresAnual /= 2;
            } else {
                nuevoInteresAnual *= 2;
            }

            double nuevoSaldo = saldo * (nuevoInteresAnual / 100);
            this.setSaldo(nuevoSaldo);
        }

        @Override
        public void calcularInteres() {

        }
    }

