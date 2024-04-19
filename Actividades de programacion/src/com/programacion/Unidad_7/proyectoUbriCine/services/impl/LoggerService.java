package com.programacion.Unidad_7.proyectoUbriCine.services.impl;

import com.programacion.Unidad_7.proyectoUbriCine.services.api.BasicLoggerService;

import java.time.LocalDateTime;

public class LoggerService implements BasicLoggerService {

    private GestionFicheroLogger gestion;

    public LoggerService(){
        this.gestion = new GestionFicheroLogger();
    }

    @Override
    public boolean logAlta(String idUser) {
        LocalDateTime fechaHora = LocalDateTime.now();
        String tipoMovimiento = "Alta";

        String log = idUser+";"+fechaHora+";"+tipoMovimiento+"\n";
        this.anadirFicheroLogger(log);

        return true;
    }

    @Override
    public boolean logLogin(String idUser) {
        LocalDateTime fechaHora = LocalDateTime.now();
        String timpoMovimiento = "Login";

        String log = idUser+";"+fechaHora+";"+timpoMovimiento+"\n";
        this.anadirFicheroLogger(log);

        return true;
    }

    @Override
    public void anadirFicheroLogger(String mensaje) {

        this.gestion.anadirFicheroLog("src/resources/archivosTema7/logs/logs.txt", mensaje);

    }
}
