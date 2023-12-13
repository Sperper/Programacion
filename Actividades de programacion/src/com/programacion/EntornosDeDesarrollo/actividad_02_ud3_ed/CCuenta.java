/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion.EntornosDeDesarrollo.actividad_02_ud3_ed;

/**
 * Constructor de la clase CCuenta
 * @author Samuel
 * @version 1.0
 */
public class CCuenta {


     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;


    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Cuenta del titular de la cuenta
    * @param sal Saldo que tiene la cuenta
    * @param tipo Tipo de interés de la cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
  /**
   * 
   * @param nom Nombre del titutular de la cuenta 
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    /**
     * 
     * @return Nombre del titular 
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     * 
     * @return Saldo de la cuenta  
     */
     public double estado ()
    {
        return saldo;
    }

    /**
     * 
     * @param cantidad cantidad de dinero a ingresar
     * @throws Exception muestra un mensaje de error si el usuario intenta inngresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
    * 
    * @param cantidad cantidad de dinero a retirar
    * @throws Exception muestra un mensaje de error si el usuario desea retirar una cantidad negativa o si desea retirar mas saldo que el que tiene la cuenta
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     * 
     * @return Devuelve la cuenta del usuario
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * 
   * @param cuenta crea la cuenta del usuario
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * 
   * @param saldo indica el saldo del usuario
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * 
  * @return devuelve el tipo de interés 
  */
  public double gettipoInteres() {
    return tipoInteres;
  }

  /**
   * 
   * @param tipoInteres inicializa el tipo de interés
   */
  public void settipoInteres(double tipoInteres) {
    this.tipoInteres = tipoInteres;
  }
}
