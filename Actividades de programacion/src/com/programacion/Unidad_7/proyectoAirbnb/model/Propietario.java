package com.programacion.Unidad_7.proyectoAirbnb.model;

import java.util.Objects;

public class Propietario {

    private String host_id;
    private String host_name;

    // Constructor
    public Propietario(String host_id, String host_name) {
        setHost_id(host_id);
        setHost_name(host_name);
    }

    // equals

    @Override
    public boolean equals(Object o) {
        if(o instanceof Propietario) {
            Propietario a = (Propietario) o;
            return a.getHost_id().equalsIgnoreCase(this.getHost_id());
        }
        return false;
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
