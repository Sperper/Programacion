package com.programacion.Unidad_7.proyectoUser.services.impl;

import com.programacion.Unidad_7.proyectoUser.services.api.BasicLoggerService;

public class LoggerService implements BasicLoggerService {

    private GestionFicheroLogger gestion;

    public LoggerService(){
        this.gestion = new GestionFicheroLogger();
    }

    public LoggerService(GestionFicheroLogger gestion) {
        this.gestion = gestion;
    }

    @Override
    public boolean logAlta(String idUser) {
        return false;
    }

    @Override
    public boolean logLogin(String idUser) {
        return false;
    }

    @Override
    public void anadirFicheroLogger(String mensaje) {

        this.gestion.anadirFicheroLog("", mensaje);

    }
}
