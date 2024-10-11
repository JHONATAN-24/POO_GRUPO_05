package Clases;

import javaapplication60.Vehiculo;

public class VehiculoAcuatico extends Vehiculo {
    private double calado;

    public VehiculoAcuatico(double calado, String marca, String modelo, int año, String tipoCombustible) {
        super(marca, modelo, año, tipoCombustible);
        this.calado = calado;
    }
    public double getCalado() {
        return calado;
    }

    public void setCalado(double calado) {
        this.calado = calado;
    }
    
    @Override
    public String toString() {
        return "VehiculoAcuatico{" + "calado=" + calado + '}';
    }
    
}
