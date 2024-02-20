package com.programacion.Unidad_6.proyectoEmpresa;

import java.util.Objects;

public class Proveedor {

    private String idProveedor;
    private String nombre;
    private String apellido;
    private String direccion;
    private String cif;

    // Constructor
    public Proveedor(String id, String nombre, String apellido, String direccion, String cif){
        setApellido(apellido);
        setCif(cif);
        setDireccion(direccion);
        setNombre(nombre);
        setIdProveedor(id);
    }

    // Overrides

    @Override
    public String toString(){

        String cadenaAMostrar = "";

        cadenaAMostrar += "Proveedor con id: "+this.idProveedor+"\n";
        cadenaAMostrar += "Nombre: "+this.nombre+" "+this.apellido + ", cif: "+this.cif+"€\n";
        cadenaAMostrar += "Direccion: "+this.direccion;

        return cadenaAMostrar;

    }

    @Override
    public boolean equals(Object proveedor) {
        if (proveedor instanceof  Proveedor) {
            Proveedor pro = (Proveedor) proveedor;

            if (this.idProveedor.equalsIgnoreCase(((Proveedor) proveedor).idProveedor)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    
    // Getters and Setters


    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
}
