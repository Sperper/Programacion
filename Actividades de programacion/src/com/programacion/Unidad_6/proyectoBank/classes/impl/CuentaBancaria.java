package com.programacion.Unidad_6.proyectoBank.classes.impl;

import com.programacion.Unidad_6.proyectoBank.classes.api.Cuenta;

public abstract class CuentaBancaria implements Cuenta {

    protected static final double INTERES_ANUAL_BASICO = 0;
    private String iban;
    private double saldo;




    public abstract void calcularInteres();

    public boolean ingresar(double importe){
        return false;
    }

    public boolean retirar(double importe){
        return false;
    }

    private void anadir(double importe) {

    }

    public boolean transferir(CuentaBancaria cuenta, double cantidadTraspaso){
        return false;
    }



    
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
