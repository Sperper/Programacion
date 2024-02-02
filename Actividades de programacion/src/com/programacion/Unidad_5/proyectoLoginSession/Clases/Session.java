package com.programacion.Unidad_5.proyectoLoginSession.Clases;

import java.time.LocalDateTime;

public class Session {

    private String Session;
    private LocalDateTime lastLogin;
    private LocalDateTime sessionExpires;
    private User usuario;

    public LocalDateTime getSessionExpires() {
        return sessionExpires;
    }

    public void setSessionExpires(LocalDateTime sessionExpires) {
        this.sessionExpires = sessionExpires;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public String getSession() {
        return Session;
    }

    public void setSession(String session) {
        Session = session;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }
}
