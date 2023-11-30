package com.programacion.Unidad_3.ActividadClase;

public class NombreLargoCorto {

    public static void main(String[] args) {

        String[] alumnos = {"Raquel", "Pablo", "Oscar", "Rafael", "David", "Sebastian", "Jose"};
        String nombreLargo = "";
        String nombreCorto = "";
        for (int i = 0; i <= alumnos.length - 1; i++){
            if (nombreLargo.length() < alumnos[i].length()){
                nombreLargo = alumnos[i];
            }
            if (nombreCorto.length() > alumnos[i].length()){
                nombreCorto = alumnos[i];
            }
        }

    }

}
