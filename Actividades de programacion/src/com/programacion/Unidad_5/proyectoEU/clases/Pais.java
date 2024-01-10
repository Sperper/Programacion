package com.programacion.Unidad_5.proyectoEU.clases;

public class Pais {

    // VARIABLE ESTATICA (pertenece a la clase Pais)
    public static int numPaisesEU;

    // VARIABLES DE OBJETOS
    private String nombre;

    private int nProvincias, nHabitantes;
    private boolean esMonarquia;

    // CONSTRUCTOR PERSONALIZADO
    public Pais(String nombre, int nProvincias, int nHabitantes, boolean esMonarquia) {

        this.nombre = nombre;
        if (nProvincias > 0) {
            this.nProvincias = nProvincias;
        }

        if (nHabitantes > 0) {
            this.nHabitantes = nHabitantes;
        }
        this.esMonarquia = esMonarquia;

        // Al crearse un pais, el nPaises de la EU ha aumentado en 1.
        Pais.numPaisesEU += 1; // Pais.numPaisesEU++; Pais.numPaisesEU = Pais.numPaises+1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnProvincias() {
        return nProvincias;
    }

    public void setnProvincias(int nProvincias) {
        this.nProvincias = nProvincias;
    }

    public int getnHabitantes() {
        return nHabitantes;
    }

    public void setnHabitantes(int nHabitantes) {
        this.nHabitantes = nHabitantes;
    }

    public boolean isEsMonarquia() {
        return esMonarquia;
    }

    public void setEsMonarquia(boolean esMonarquia) {
        this.esMonarquia = esMonarquia;
    }
}
