import Estructura.DatosGlobales.*;
import Objetos.Piloto;
import Objetos.Vehiculo;
import Objetos.ViajesEnRuta;

import static Estructura.DatosGlobales.*;

public class Main {

    static public void iniciarListaPilotos(){
        pilotos.add(new Piloto("Alberto Martinez", true));
        pilotos.add(new Piloto("Juan Cruz", true));
        pilotos.add(new Piloto("Pablo Navarijo", true));
    }

    static public void iniciarListaVehiculos(){
        vehiculos.add(new Vehiculo("Motocicleta 1", 6, 0.1, 6));
        vehiculos.add(new Vehiculo("Motocicleta 2", 6, 0.1, 6));
        vehiculos.add(new Vehiculo("Motocicleta 3", 6, 0.1, 6));
        vehiculos.add(new Vehiculo("Vehiculo Estandar 1", 10, 0.3, 10));
        vehiculos.add(new Vehiculo("Vehiculo Estandar 2", 10, 0.3, 10));
        vehiculos.add(new Vehiculo("Vehiculo Estandar 3", 10, 0.3, 10));
        vehiculos.add(new Vehiculo("Vehiculo Premium 1", 12, 0.45, 12));
        vehiculos.add(new Vehiculo("Vehiculo Premium 2", 12, 0.45, 12));
        vehiculos.add(new Vehiculo("Vehiculo Premium 3", 12, 0.45, 12));
    }

    public static void main(String[] args){
        if(pilotos.isEmpty()){
            iniciarListaPilotos();
        }else if(pilotos.isEmpty()){
            iniciarListaVehiculos();
        }
        seleccionarVentanaObj.mostrarVentana(true);
    }
}
