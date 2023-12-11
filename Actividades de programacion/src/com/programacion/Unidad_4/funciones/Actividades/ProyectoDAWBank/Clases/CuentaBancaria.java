package com.programacion.Unidad_4.funciones.Actividades.ProyectoDAWBank.Clases;

public class CuentaBancaria {

    public String iban;
    private double saldo;
    public String titular;
    public String[] movimientos;

    public CuentaBancaria(String iban, String titular) {

        this.saldo = 0.0;
        this.movimientos = new String[100];
        this.titular = titular;
        this.iban = iban;

        // FALTA POR SETEAR EL IBAN Y EL TITULAR


    }

    public void ingresar(double cantidadIngreso) {

        if(cantidadIngreso <= 3000.00 && cantidadIngreso > 0) {

            System.out.println("Se ha ingresado "+cantidadIngreso);
            this.saldo = this.saldo + cantidadIngreso;
            for (int i = 0; i <= movimientos.length - 1; i++){
                int contador = 1;
                if (movimientos[i] == null) {

                    movimientos[i] = "E00" + contador;
                    break;

                }
                contador++;
            }


        } else if (cantidadIngreso > 3000.00) {

            System.out.println(DawUtils.avisoHacienda);
            this.saldo = this.saldo + cantidadIngreso;

        } else {
            System.out.println("ERROR: La cantidad a ingresar no es válida");
        }

    }

    public void retirar(double cantidadRetirar) {

        if (cantidadRetirar <= 3000 && cantidadRetirar > 0) {

            System.out.println("Se ha retirado "+cantidadRetirar);
            this.saldo = this.saldo - cantidadRetirar;

            if (this.saldo < 0 && this.saldo > -50) {
                System.out.println(DawUtils.avisoNumerosRojos);
            } else if (this.saldo < -50) {
                System.out.println("ERROR AL RETIRAR");
                this.saldo = this.saldo + cantidadRetirar;
            }


        } else if (cantidadRetirar > 3000) {

            System.out.println(DawUtils.avisoHacienda);
            this.saldo = this.saldo - cantidadRetirar;

            if (this.saldo < 0 && this.saldo > -50) {
                System.out.println(DawUtils.avisoNumerosRojos);
            } else if (this.saldo < -50) {
                System.out.println("ERROR AL RETIRAR");
                this.saldo = this.saldo + cantidadRetirar;
            }

        }


    }

    public void mostrarIban() {

        System.out.println(this.iban);

    }

    public void mostrarSaldo() {

        System.out.println(this.saldo);

    }

    public void mostrarMovimiento (){

        for (int i = 0; i <= movimientos.length - 1; i++){
            if (movimientos[i] != null) {
                System.out.println(movimientos[i]);
            }
        }

    }

}
