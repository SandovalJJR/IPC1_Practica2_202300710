package Estructura;

import java.awt.*;
import javax.swing.*;

public class HistorialViaje {

    private JLabel titulo;
    private JScrollPane scrollTabla;
    private JTable historialTabla;
    private JFrame ventanaHistorialViaje;

    // FUENTES
    public static Font titulos = new Font("Arial", Font.BOLD, 20);
    public static Font labels = new Font("Arial", Font.BOLD, 17);
    public static Font texto = new Font("Arial", Font.PLAIN, 17);
    public static Font textoMenor = new Font("Arial", Font.PLAIN, 15);

    public HistorialViaje(){
        titulo = new JLabel("HISTORIAL DE VIAJES", SwingConstants.CENTER);
        titulo.setFont(titulos);
        titulo.setBounds(225, 30, 250, 40);

        scrollTabla = new JScrollPane();
        scrollTabla.setFont(textoMenor);
        scrollTabla.setBounds(40, 95, 600, 330);

        ventanaHistorialViaje = new JFrame();
        ventanaHistorialViaje.setDefaultCloseOperation(ventanaHistorialViaje.EXIT_ON_CLOSE);
        ventanaHistorialViaje.setResizable(false);
        ventanaHistorialViaje.setTitle("Inicio");
        ventanaHistorialViaje.setLayout(null);
        ventanaHistorialViaje.setLocationRelativeTo(null);
        ventanaHistorialViaje.setSize(700,500);
        ventanaHistorialViaje.add(titulo);
        ventanaHistorialViaje.add(scrollTabla);
    }

    public void mostrarVentana(boolean x){
        this.ventanaHistorialViaje.setVisible(x);
    }
}
