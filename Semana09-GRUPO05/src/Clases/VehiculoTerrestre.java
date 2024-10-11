/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author LAB-USR-CHIMBOTE
 */
public class VehiculoTerrestre extends Vehiculo {  
    private int cantidadRuedas;

    public VehiculoTerrestre() {
    }

    public VehiculoTerrestre(int cantidadRuedas, String marca, String modelo, int año, String tipoCombustible) {
        super(marca, modelo, año, tipoCombustible);
        this.cantidadRuedas = cantidadRuedas;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }
    
    
    @Override
    public String toString() {
        return "vehiculoTerrestre{" + "cantidadRuedas=" + cantidadRuedas + '}';
    }

}
