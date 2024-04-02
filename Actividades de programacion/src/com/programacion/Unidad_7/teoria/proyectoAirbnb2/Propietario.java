package com.programacion.Unidad_7.teoria.proyectoAirbnb2;

public class Propietario {

    private String host_id;
    private String host_name;

    // Constructores
    public Propietario(String host_id, String host_name) {
        setHost_id(host_id);
        setHost_name(host_name);
    }

    // Getters and Setters
    public String getHost_id() {
        return host_id;
    }

    public void setHost_id(String host_id) {
        this.host_id = host_id;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }
}
