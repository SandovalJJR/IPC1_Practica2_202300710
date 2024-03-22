package Estructura;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class GenerarViaje implements ActionListener{

    private JLabel puntoInicialL;
    private JLabel puntoFinalL;
    private JLabel transporteL;
    private JComboBox puntoInicialCB;
    private JComboBox puntoFinalCB;
    private JComboBox transporteCB;
    private JLabel pilotoL;
    private JComboBox pilotoCB;
    private JButton generarViajeB;
    private JFrame ventanaGenerarViaje;

    //FUENTES
    public static Font titulos = new Font("Arial", Font.BOLD, 20);
    public static Font labels = new Font("Arial", Font.BOLD, 17);
    public static Font texto = new Font("Arial", Font.PLAIN, 17);
    public GenerarViaje(){
        Image img1= new ImageIcon("C:\\Users\\JoséSandoval\\Documents\\IPC1_Practica2_202300710\\IPC1_Practica2_202300710\\src\\main\\java\\Imagenes\\generarViaje.png").getImage();

        puntoInicialL = new JLabel("Seleccionar punto inicial:");
        puntoInicialL.setFont(labels);
        puntoInicialL.setBounds(30, 30, 200, 30);

        puntoInicialCB = new JComboBox();
        puntoInicialCB.setFont(texto);
        puntoInicialCB.setBounds(30, 70, 200, 30);

        puntoFinalL = new JLabel("Seleccionar punto final:");
        puntoFinalL.setFont(labels);
        puntoFinalL.setBounds(30, 130, 200, 30);

        puntoFinalCB = new JComboBox();
        puntoFinalCB.setFont(texto);
        puntoFinalCB.setBounds(30, 170, 200, 30);

        transporteL = new JLabel("Seleccionar tipo de transporte:");
        transporteL.setFont(labels);
        transporteL.setBounds(280, 30, 200, 30);

        transporteCB = new JComboBox();
        transporteCB.setFont(texto);
        transporteCB.setBounds(280, 70, 200, 30);

        pilotoL = new JLabel("Selecciona un piloto:");
        pilotoL.setFont(labels);
        pilotoL.setBounds(280, 130, 200, 30);

        pilotoCB = new JComboBox();
        pilotoCB.setFont(texto);
        pilotoCB.setBounds(280, 170, 200, 30);

        generarViajeB = new JButton("GENERAR VIAJE");
        generarViajeB.setBorder(new BevelBorder(BevelBorder.RAISED));
        generarViajeB.setFont(labels);
        generarViajeB.setBounds(187, 230, 150, 40);
        generarViajeB.setFocusable(false);

        ventanaGenerarViaje = new JFrame();
        ventanaGenerarViaje.setDefaultCloseOperation(ventanaGenerarViaje.EXIT_ON_CLOSE);
        ventanaGenerarViaje.setResizable(false);
        ventanaGenerarViaje.setTitle("GENERAR VIAJE");
        ventanaGenerarViaje.setLayout(null);
        ventanaGenerarViaje.setLocationRelativeTo(null);
        ventanaGenerarViaje.setIconImage(img1);
        ventanaGenerarViaje.setSize(525, 350);
        ventanaGenerarViaje.add(puntoInicialL);
        ventanaGenerarViaje.add(puntoInicialCB);
        ventanaGenerarViaje.add(puntoFinalL);
        ventanaGenerarViaje.add(puntoFinalCB);
        ventanaGenerarViaje.add(transporteL);
        ventanaGenerarViaje.add(transporteCB);
        ventanaGenerarViaje.add(generarViajeB);
        ventanaGenerarViaje.add(pilotoL);
        ventanaGenerarViaje.add(pilotoCB);
    }

    public void mostrarVentana(boolean x){
        this.ventanaGenerarViaje.setVisible(x);
    }

    public void actualizarVentana(){
        this.ventanaGenerarViaje.repaint();
    }

    public void actionPerformed(ActionEvent e){

    }
}
