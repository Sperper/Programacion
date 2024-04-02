package com.programacion.Unidad_7.teoria.proyectoAirbnb2;

public class Reserva {

    private double precio;
    private int min_night;
    private int availability;

    // Constructores
    public Reserva(double precio, int min_night, int availability) {
        setPrecio(precio);
        setMin_night(min_night);
        setAvailability(availability);
    }

    // Getters and Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMin_night() {
        return min_night;
    }

    public void setMin_night(int min_night) {
        this.min_night = min_night;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
}
