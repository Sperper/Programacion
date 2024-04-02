package com.programacion.Unidad_7.teoria.proyectoAirbnb2;

public class Vecindario {

    private String group;
    private String name;

    // Constructores
    public Vecindario(String group, String name) {
        setGroup(group);
        setName(name);
    }

    // Getters and Setters
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
