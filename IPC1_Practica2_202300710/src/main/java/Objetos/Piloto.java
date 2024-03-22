package Objetos;

public class Piloto {

    private String nombre;
    private boolean disponibilidad;
    public Piloto(String nombre, boolean disponibilidad){
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean getDisponibilidad(){
        return this.disponibilidad;
    }

    public void setNomber(String nbr){
        this.nombre = nbr;
    }

    public void setDisponibilidad(boolean x){
        this.disponibilidad = x;
    }
}
