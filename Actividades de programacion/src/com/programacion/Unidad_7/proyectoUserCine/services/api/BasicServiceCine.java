package com.programacion.Unidad_7.proyectoUserCine.services.api;

import com.programacion.Unidad_7.proyectoUserCine.model.Butaca;

public interface BasicServiceCine {

    public void mostrarButacas();
    public boolean comprarEntrada();
    public boolean devolverEntrada();

    public boolean checkComprador(String idUser);

    public void leerFicheroEntradas();
    public void anadirFicheroCine(Butaca b);
    public void modificarFicheroCine(Butaca[][] butacas);

}