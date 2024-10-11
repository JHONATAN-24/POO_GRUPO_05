/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author LAB-USR-CHIMBOTE
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String tipoCombustible;

    public Vehiculo() {
    }
    
    public Vehiculo(String marca, String modelo, int año, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipoCombustible = tipoCombustible;
    }
 
    public String getMarca() {
        return marca;
    }
 
    public void setMarca(String marca) {
        this.marca = marca;
    }
 
    public String getModelo() {
        return modelo;
    }
 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public int getAño() {
        return año;
    }
 
    public void setAño(int año) {
        this.año = año;
    }
 
    public String getTipoCombustible() {
        return tipoCombustible;
    }
 
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
 
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", tipoCombustible=" + tipoCombustible + '}';
    }
}
