package com.programacion.Unidad_7.teoria.proyectoAirbnb2;

public class Alojamiento {

    private String room_type;
    private String id;
    private String nombre;
    private Propietario propietario;
    private Reserva reserva;
    private Vecindario vecindario;
    private Review re;
    private Ubicacion ub;
    private Licencia li;

    // Constructor


    public Alojamiento(String room_type, String id, String nombre, Propietario propietario,
                       Reserva reserva, Vecindario vecindario, Review re, Ubicacion ub, Licencia li) {
        setRoom_type(room_type);
        setId(id);
        setNombre(nombre);
        setPropietario(propietario);
        setReserva(reserva);
        setVecindario(vecindario);
        setRe(re);
        setUb(ub);
        setLi(li);
    }

    // Getters and Setters
    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Vecindario getVecindario() {
        return vecindario;
    }

    public void setVecindario(Vecindario vecindario) {
        this.vecindario = vecindario;
    }

    public Review getRe() {
        return re;
    }

    public void setRe(Review re) {
        this.re = re;
    }

    public Ubicacion getUb() {
        return ub;
    }

    public void setUb(Ubicacion ub) {
        this.ub = ub;
    }

    public Licencia getLi() {
        return li;
    }

    public void setLi(Licencia li) {
        this.li = li;
    }
}
