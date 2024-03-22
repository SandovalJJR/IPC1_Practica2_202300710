package Estructura;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;

public class EditarDistancia implements ActionListener {
    private JFrame ventanaEditarDistancia;
    private JLabel idL;
    private JLabel distanciaL;
    private JTextField idT;
    private JTextField distanciaT;
    private JButton cancelarB;
    private JButton aceptarB;
    public static Font titulos = new Font("Arial", Font.BOLD, 20);
    public static Font labels = new Font("Arial", Font.BOLD, 17);
    public static Font texto = new Font("Arial", Font.PLAIN, 17);

    public EditarDistancia(){

        idL = new JLabel("Ingrese el ID de la ruta:", SwingConstants.CENTER);
        idL.setFont(labels);
        idL.setBounds(75, 30, 200, 30);

        idT = new JTextField();
        idT.setFont(texto);
        idT.setBounds(75, 80, 200, 30);

        distanciaL = new JLabel("Ingrese la nueva distancia:", SwingConstants.CENTER);
        distanciaL.setFont(labels);
        distanciaL.setBounds(75, 150, 200, 30);

        distanciaT = new JTextField();
        distanciaT.setFont(texto);
        distanciaT.setBounds(75, 200, 200, 30);

        cancelarB = new JButton("CANCELAR");
        cancelarB.setFont(labels);
        cancelarB.setBounds(60, 260,100, 40);
        cancelarB.setBorder(new BevelBorder(BevelBorder.RAISED));
        cancelarB.addActionListener(this);
        cancelarB.setFocusable(false);

        aceptarB = new JButton("ACEPTAR");
        aceptarB.setFont(labels);
        aceptarB.setBounds(190, 260,100, 40);
        aceptarB.setBorder(new BevelBorder(BevelBorder.RAISED));
        aceptarB.addActionListener(this);
        aceptarB.setFocusable(false);

        ventanaEditarDistancia = new JFrame();
        ventanaEditarDistancia.setResizable(false);
        ventanaEditarDistancia.setTitle("EDITAR DISTANCIA");
        ventanaEditarDistancia.setLayout(null);
        ventanaEditarDistancia.setLocationRelativeTo(null);
        ventanaEditarDistancia.setSize(350, 390);
        ventanaEditarDistancia.add(idL);
        ventanaEditarDistancia.add(idT);
        ventanaEditarDistancia.add(distanciaL);
        ventanaEditarDistancia.add(distanciaT);
        ventanaEditarDistancia.add(cancelarB);
        ventanaEditarDistancia.add(aceptarB);

    }

    public void mostrarVentana(boolean x){
        this.ventanaEditarDistancia.setVisible(x);
    }

    public void actionPerformed(ActionEvent e){

    }
}
