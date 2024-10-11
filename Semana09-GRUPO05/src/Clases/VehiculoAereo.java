package Clases;

import javaapplication60.Vehiculo;

public class VehiculoAereo extends Vehiculo{
    private double envergadura;

    public VehiculoAereo(double envergadura, String marca, String modelo, int año, String tipoCombustible) {
        super(marca, modelo, año, tipoCombustible);
        this.envergadura = envergadura;
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    @Override
    public String toString() {
        return "VehiculoAereo{" + "envergadura=" + envergadura + '}';
    }
    
}
