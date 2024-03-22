package Estructura;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import Objetos.Piloto;
import Objetos.Vehiculo;
import Objetos.ViajesEnRuta;

public class DatosGlobales {

    // VENTANAS
    public static SeleccionarVentana seleccionarVentanaObj = new SeleccionarVentana();
    public static EditarDistancia editarDistanciaObj = new EditarDistancia();
    public static GenerarViaje generarViajeObj = new GenerarViaje();
    public static HistorialViaje historialViajeObj = new HistorialViaje();
    public static Ruta rutasObj = new Ruta();
    public static Viaje viajesObj = new Viaje();

    //PILOTOS LISTADO

    public static ArrayList<Piloto> pilotos = new ArrayList<>();

    //VEHÍCULOS LISTADO

    public static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    //VIAJES LISTADO

    public static ArrayList<ViajesEnRuta> viajesEnRuta = new ArrayList<>();

}
