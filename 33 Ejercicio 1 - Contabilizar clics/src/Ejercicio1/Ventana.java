package Ejercicio1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

    private JPanel panel;
    private JLabel etiqueta;
    private JButton boton;
    private int contador = 0;

    public Ventana() {
        setSize(400, 400);//Tamaño de la ventana.
        setTitle("Ejercicio 1");//Titulo de la ventana.
        setLocationRelativeTo(null);//Ventana en el centro de la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Termina la ejecucion al cerra la ventana.

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        inicarPanel();
        iniciarEtiqueta();
        colocarBoton();
    }

    private void inicarPanel() {
        panel = new JPanel();//Se crea el objeto panel en la ventana
        panel.setLayout(null); // permite mover libremente el panel
        this.add(panel);//Se agrega el panel a la ventana.
    }

    private void iniciarEtiqueta() {
        etiqueta = new JLabel(); //Crea el objeto etiqueta
        etiqueta.setBounds(0, 50, 400, 40);// Estable pocision en x, y, ancho, alto.        
        etiqueta.setText("Pulsa el botón");//texto del boton
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Centra la etiqueta
        etiqueta.setFont(new Font("arial", 0, 20));
        panel.add(etiqueta);// se agrega al panel
    }

    private void colocarBoton() {
        boton = new JButton();
        boton.setBounds(90, 250, 200, 50);
        boton.setText("Pulsa aqui");
        boton.setFont(new Font("cooper black", 0, 20));
        panel.add(boton);

        eventoDeAccion();
    }

    private void eventoDeAccion() {
        ActionListener eventoDeAccion = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                if (contador == 1) {
                    etiqueta.setText("Has presionado el boton 1 vez");
                } else {
                    etiqueta.setText("Has presionado el boton " + contador + " veces");
                }
            }
        };
        boton.addActionListener(eventoDeAccion);
    }
    
    /*para crear un ejcutable click derecho sobre el progragama propiedades build packaging marca las tres casillas ok y luego es la
    click en la escoba con martillo para gerar el punto llava en la carpeta del programa se guarda en la carpeta dist para
    compartirlo y que se pueda ejecutar en otra pc se debe comprimir para que no sea reconocido como un virus.*/

}
