package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingContainer;

public class Ventana extends JFrame {

    public JPanel panel;

    public Ventana() {
        setSize(500, 500);//Establecemos el tamaño de la venta.        
        setTitle("Mi primer titulo");//Establecemos el titulo de la ventana.
        //setLocation(500, 150);//Establecemos la posicion inicial de la ventana.
        //setBounds(500, 150, 500, 500);//Establece el tamaño y la posicion en un solo comando.
        setLocationRelativeTo(null);//Establece la pantalla en el centro de cualquier dispositivo.
        //setResizable(false);//Establece la redimencion de la ventana en true se puede cambiar tamaño y false la bloquea.
        //setMinimumSize(new Dimension(200,200));//Establece el tamaño minimo de la ventana.        
        //this.getContentPane().setBackground(Color.blue);//Establece el color de la ventana.

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {

        colocarPaneles();
        //colocarEtiquetas();
        colocarBotones();
    }

    private void colocarPaneles() {
        panel = new JPanel();//Creacion de un panel
        //panel.setBackground(Color.green);//Establece el color del panel.
        panel.setLayout(null);//Desactiva el diseño por defector del panel
        this.getContentPane().add(panel);//Agregamos el panel a la ventana.
    }

    private void colocarEtiquetas() {
        //Etiqueta 1 - etiqueta tipo texto
        JLabel etiqueta = new JLabel();//Se crea una etiqueta.
        etiqueta.setText("Mundia 2022");//Se establece el texto de la etiqueta.
        etiqueta.setBounds(85, 10, 300, 80);//Establece el tamaño y la posicion de la etiqueta en un solo comando.
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Establece la alineacion horizontal del texto .
        etiqueta.setForeground(Color.black);//Establece el color de la letra.
        //etiqueta.setOpaque(true);//Desctiva el diseño por defecto de la etiqueta y pinta el fondo de la etiqueta
        //etiqueta.setBackground(Color.black);// Cambia el color de fondo de la etiqueta
        etiqueta.setFont(new Font("cooper black", 0, 40));//Establecer la fuente del texto
        panel.add(etiqueta);//Se agrega la etiqueta al panel.

        //Etiqueta 2 - etiqueta tipo imagen
        ImageIcon imagen = new ImageIcon(("BalonMundial.jpg"));//cambiar tamaño de la imagen
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(80, 90, 300, 300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));//cambiar tamaño de la imagen
        panel.add(etiqueta2);
    }

    private void colocarBotones() {
        
        // boton1 boton de texto
        JButton boton1 = new JButton();
        boton1.setText("Click");//Establece el texto del boton
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true);//Establecer el encendido del boton.
        boton1.setMnemonic('a');//Establece alt + a o la letra que decee para dar click en el boton
        boton1.setForeground(Color.blue);//Establece el color de la letra del boton
        boton1.setFont(new Font("cooper black", 1, 20));//Establece la fuente de la letra del boton.
        panel.add(boton1);//Se agrega el boton al panel.
        
        
        // boton2 boton de imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100, 200, 100, 40);
        ImageIcon clickAqui = new ImageIcon("clickAqui.png");
        boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        //boton2.setBackground(Color.blue);//Establece el color de fondo del boton
        panel.add(boton2);
        
        
        // boton3 boton de bordes
        JButton boton3 = new JButton();
        boton3.setBounds(100, 300, 110, 50);
        boton3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 4, true));
        panel.add(boton3);

    }
}
