package com.programacion.Unidad_5.proyectoLoginSession.Clases;

import java.time.LocalDateTime;
import java.util.UUID;

public class Session {

    private String nSession;
    private User usuario;



    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    private String getnSession() {
        return nSession;
    }

    private void setnSession() {
        this.nSession = UUID.randomUUID().toString();
    }


}
