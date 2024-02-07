package com.programacion.Unidad_6.proyectoComposicion.clases;

import com.programacion.Unidad_6.proyectoComposicion.clases.Volk;

public class Wagen {

    private String modelo;
    private String marca;
    private Volk propietario;

    public Wagen(String modelo, String marca, Volk propietario){
        this.modelo = modelo;
        this.marca = marca;
        this.propietario = propietario;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPropietario(Volk propietario) {
        this.propietario = propietario;
    }
}
