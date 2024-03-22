package Estructura;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import static Estructura.DatosGlobales.*;

public class SeleccionarVentana implements ActionListener {


    private JLabel titulo;
    private JLabel generarViajeL;
    private JButton generarViaje;
    private JLabel historialViajeL;
    private JButton historialViaje;
    private JLabel rutaL;
    private JButton ruta;
    private JLabel viajeL;
    private JButton viaje;
    private JFrame ventanaSeleccionar;

    //FUENTES
    public static Font titulos = new Font("Arial", Font.BOLD, 20);
    public static Font labels = new Font("Arial", Font.BOLD, 17);
    public static Font texto = new Font("Arial", Font.PLAIN, 17);
    public SeleccionarVentana(){
        Image img1= new ImageIcon("C:\\Users\\JoséSandoval\\Documents\\IPC1_Practica2_202300710\\IPC1_Practica2_202300710\\src\\main\\java\\Imagenes\\generarViaje.png").getImage();
        Image img2= new ImageIcon("C:\\Users\\JoséSandoval\\Documents\\IPC1_Practica2_202300710\\IPC1_Practica2_202300710\\src\\main\\java\\Imagenes\\historialViajes.png").getImage();
        Image img3= new ImageIcon("C:\\Users\\JoséSandoval\\Documents\\IPC1_Practica2_202300710\\IPC1_Practica2_202300710\\src\\main\\java\\Imagenes\\rutas.png").getImage();
        Image img4= new ImageIcon("C:\\Users\\JoséSandoval\\Documents\\IPC1_Practica2_202300710\\IPC1_Practica2_202300710\\src\\main\\java\\Imagenes\\viajes.png").getImage();

        ImageIcon logoGenerar =new ImageIcon(img1.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        ImageIcon logoHistorial =new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH));
        ImageIcon logoRutas =new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH));
        ImageIcon logoViajes =new ImageIcon(img4.getScaledInstance(125, 125, Image.SCALE_SMOOTH));

        titulo = new JLabel("<html><center>ELIJE UNA VENTANA</center></html>",SwingConstants.CENTER);
        titulo.setFont(titulos);
        titulo.setBounds(175, 30, 300, 40);

        viajeL = new JLabel("<html><center>VIAJES</center></html>", SwingConstants.CENTER);
        viajeL.setBounds(250, 250, 150, 30);
        viajeL.setFont(labels);

        viaje = new JButton();
        viaje.setBounds(250,100,150, 150);
        viaje.setIcon(logoViajes);
        viaje.setFocusable(false);
        viaje.setBorder(new BevelBorder(BevelBorder.RAISED));
        viaje.addActionListener(this);

        generarViajeL = new JLabel("GENERAR VIAJE", SwingConstants.CENTER);
        generarViajeL.setFont(labels);
        generarViajeL.setBounds(100, 450, 150, 30);

        generarViaje = new JButton();
        generarViaje.setIcon(logoGenerar);
        generarViaje.setBorder(new BevelBorder(BevelBorder.RAISED));
        generarViaje.setBounds(100, 300,150,150);
        generarViaje.setFocusable(false);
        generarViaje.addActionListener(this);

        rutaL = new JLabel("RUTAS", SwingConstants.CENTER);
        rutaL.setFont(labels);
        rutaL.setBounds(400, 450, 150, 30);

        ruta = new JButton();
        ruta.setIcon(logoRutas);
        ruta.setBorder(new BevelBorder(BevelBorder.RAISED));
        ruta.setBounds(400, 300,150,150);
        ruta.setFocusable(false);
        ruta.addActionListener(this);

        historialViajeL = new JLabel("HISTORIAL DE VIAJES", SwingConstants.CENTER);
        historialViajeL.setFont(labels);
        historialViajeL.setBounds(225, 650, 200, 30);

        historialViaje = new JButton();
        historialViaje.setIcon(logoHistorial);
        historialViaje.setBorder(new BevelBorder(BevelBorder.RAISED));
        historialViaje.setBounds(250, 500,150,150);
        historialViaje.setFocusable(false);
        historialViaje.addActionListener(this);

        ventanaSeleccionar = new JFrame();
        ventanaSeleccionar.setDefaultCloseOperation(ventanaSeleccionar.EXIT_ON_CLOSE);
        ventanaSeleccionar.setResizable(false);
        ventanaSeleccionar.setTitle("INICIO");
        ventanaSeleccionar.setLayout(null);
        ventanaSeleccionar.setLocationRelativeTo(null);
        ventanaSeleccionar.setSize(650, 780);
        ventanaSeleccionar.add(titulo);
        ventanaSeleccionar.add(viaje);
        ventanaSeleccionar.add(viajeL);
        ventanaSeleccionar.add(generarViajeL);
        ventanaSeleccionar.add(generarViaje);
        ventanaSeleccionar.add(rutaL);
        ventanaSeleccionar.add(ruta);
        ventanaSeleccionar.add(historialViajeL);
        ventanaSeleccionar.add(historialViaje);
    }

    public void mostrarVentana(boolean x){
        this.ventanaSeleccionar.setVisible(x);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == viaje){
            seleccionarVentanaObj.mostrarVentana(false);
            viajesObj.mostrarVentana(true);
        }else if(e.getSource() == generarViaje){
            seleccionarVentanaObj.mostrarVentana(false);
            generarViajeObj.mostrarVentana(true);
        }else if(e.getSource()==ruta){
            seleccionarVentanaObj.mostrarVentana(false);
            rutasObj.mostrarVentana(true);
        }else if(e.getSource()==historialViaje){
            seleccionarVentanaObj.mostrarVentana(false);
            historialViajeObj.mostrarVentana(true);
        }
    }
}
