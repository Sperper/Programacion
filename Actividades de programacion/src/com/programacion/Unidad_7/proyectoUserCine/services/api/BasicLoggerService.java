package com.programacion.Unidad_7.proyectoUserCine.services.api;

public interface BasicLoggerService {

    public boolean logAlta(String idUser);
    public boolean logLogin(String idUser);
    public void anadirFicheroLogger(String mensaje);

}
