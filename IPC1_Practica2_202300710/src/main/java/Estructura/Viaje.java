package Estructura;

import javax.swing.*;
import java.awt.*;

public class Viaje {

    private JFrame ventanaViaje;

    public Viaje(){
        Image img4= new ImageIcon("C:\\Users\\JoséSandoval\\Documents\\IPC1_Practica2_202300710\\IPC1_Practica2_202300710\\src\\main\\java\\Imagenes\\viajes.png").getImage();

        ventanaViaje = new JFrame();
        ventanaViaje.setDefaultCloseOperation(ventanaViaje.EXIT_ON_CLOSE);
        ventanaViaje.setResizable(false);
        ventanaViaje.setTitle("VIAJES");
        ventanaViaje.setLayout(null);
        ventanaViaje.setLocationRelativeTo(null);
        ventanaViaje.setIconImage(img4);
        ventanaViaje.setSize(700, 600);

    }

    public void mostrarVentana(boolean x){
        this.ventanaViaje.setVisible(x);
    }


}
