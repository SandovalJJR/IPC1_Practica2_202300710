package Estructura;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;
public class Ruta implements ActionListener{

    private JButton cargarRutas;
    private JButton editarDistancia;
    private JScrollPane contenedorTabla;
    private JFrame ventanaRuta;

    //FUENTES
    public static Font titulos = new Font("Arial", Font.BOLD, 20);
    public static Font labels = new Font("Arial", Font.BOLD, 17);
    public static Font texto = new Font("Arial", Font.PLAIN, 17);
    public static Font textoMenor = new Font("Arial", Font.PLAIN, 15);

    public Ruta(){
        Image img3= new ImageIcon("C:\\Users\\JoséSandoval\\Documents\\IPC1_Practica2_202300710\\IPC1_Practica2_202300710\\src\\main\\java\\Imagenes\\rutas.png").getImage();

        cargarRutas = new JButton("CARGAR RUTAS (.CSV)");
        cargarRutas.setBounds(30, 30, 250, 35);
        cargarRutas.setFont(labels);
        cargarRutas.addActionListener(this);
        cargarRutas.setBorder(new RoundedBorder(20));
        cargarRutas.setFocusable(false);

        editarDistancia = new JButton("EDITAR DISTANCIA");
        editarDistancia.setBounds(470, 30, 200, 35);
        editarDistancia.setFont(labels);
        editarDistancia.addActionListener(this);
        editarDistancia.setBorder(new RoundedBorder(20));
        editarDistancia.setFocusable(false);

        contenedorTabla = new JScrollPane();
        contenedorTabla.setBounds(20, 100, 640, 340);

        ventanaRuta = new JFrame();
        ventanaRuta.setDefaultCloseOperation(ventanaRuta.EXIT_ON_CLOSE);
        ventanaRuta.setResizable(false);
        ventanaRuta.setTitle("RUTAS");
        ventanaRuta.setLayout(null);
        ventanaRuta.setLocationRelativeTo(null);
        ventanaRuta.setIconImage(img3);
        ventanaRuta.setSize(700, 500);
        ventanaRuta.add(cargarRutas);
        ventanaRuta.add(editarDistancia);
        ventanaRuta.add(contenedorTabla);

    }

    public void mostrarVentana(boolean x){
     this.ventanaRuta.setVisible(x);
    }

    public void actionPerformed(ActionEvent e){

    }
}
