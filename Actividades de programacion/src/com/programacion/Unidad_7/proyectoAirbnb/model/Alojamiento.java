package com.programacion.Unidad_7.proyectoAirbnb.model;

public class Alojamiento implements Comparable<Alojamiento>{

    private String id;
    private String name;
    private Propietario propietario;
    private int precio;


    // Constructor
    public Alojamiento(String id, String name, Propietario propietario, int precio) {
        setId(id);
        setName(name);
        setPrecio(precio);
        setPropietario(propietario);
    }

    // Equals

    @Override
    public boolean equals(Object o) {

        if(o instanceof Alojamiento) {
            Alojamiento a = (Alojamiento) o;
            return a.getId().equalsIgnoreCase(this.getId());
        }
        return false;
    }

    @Override
    public int compareTo(Alojamiento o) {
        if (this.getPrecio() > o.getPrecio()) {
            return 1;
        } else if (this.getPrecio() < o.getPrecio()) {
            return -1;
        } else {
            return 0;
        }
    }

    // toString
    @Override
    public String toString() {
        return "Alojamiento{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", propietario=" + getPropietario().toString() +
                ", precio=" + precio +
                '}';
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
