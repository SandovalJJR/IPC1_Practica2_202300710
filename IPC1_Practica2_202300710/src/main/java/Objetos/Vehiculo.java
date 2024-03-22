package Objetos;


public class Vehiculo {
    private String nombre;
    private int velocidad;
    private double combustible;
    private double gastoCombustible;
    private int capacidadTanque;
    public Vehiculo(String nombre, double combustible, double gastoCombustible, int capacidadTanque){
        this.nombre = nombre;
        this.combustible = combustible;
        this.velocidad = 50;
        this.gastoCombustible = gastoCombustible;
        this.capacidadTanque = capacidadTanque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public double getCombustible() {
        return combustible;
    }

    public double getGastoCombustible() {
        return gastoCombustible;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCombustible(float combustible) {
        this.combustible = combustible;
    }
}
