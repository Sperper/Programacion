package com.programacion.Unidad_5.proyectoLoginSession.Services;

import com.programacion.Unidad_5.proyectoLoginSession.Clases.Session;
import com.programacion.Unidad_5.proyectoLoginSession.Clases.User;

import java.util.ArrayList;

public class UserSessionService {

    private static ArrayList<User> usersRegistered = new ArrayList<User>();
    private static ArrayList<Session> aciveSessions = new ArrayList<Session>();

    public static ArrayList<User> getUsersRegistered() {
        return usersRegistered;
    }

    public static void setUsersRegistered(ArrayList<User> usersRegistered) {
        UserSessionService.usersRegistered = usersRegistered;
    }

    public static ArrayList<Session> getAciveSessions() {
        return aciveSessions;
    }

    public static void setAciveSessions(ArrayList<Session> aciveSessions) {
        UserSessionService.aciveSessions = aciveSessions;
    }

    public boolean checkIfUserExists(User user){
        boolean userExists = false;
        for (int i=0; i < usersRegistered.size(); i++) {
            if (user == usersRegistered.get(i)) {
                userExists = true;
            }
        }

        return userExists;
    }

    public boolean checkIfUserIsDuplicate(String user){
        boolean userDuplicate = false;
        for (int i=0; i < usersRegistered.size(); i++) {
            if (user.equals(usersRegistered.get(i).getUser())) {
                userDuplicate = true;
            }
        }
        return userDuplicate;
    }

    public  boolean checkIfSessionIsActive(String user){
        boolean sessionIsActive = false;
        for (int i=0; i < aciveSessions.size(); i++) {
            if (user.equals(aciveSessions.get(i).getUsuario().getUser())) {
                sessionIsActive = true;
            }
        }
        return sessionIsActive;
    }

    public boolean addUser(User user){
        boolean addUser = false;
        if (!checkIfUserExists(user) && !checkIfUserIsDuplicate(user.getUser())) {
            usersRegistered.add(user);
            addUser = true;
        } else {
            System.out.println("ERROR AL AÑADIR EL USUARIO");
        }
        return addUser;
    }
    public boolean addSession(User user) {
        boolean addSession = false;
        if (!checkIfSessionIsActive(user.getUser())) {
            aciveSessions.add()
        }
    }
}
