package ventana;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

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
        JPanel panel = new JPanel();//Creacion de un panel
        //panel.setBackground(Color.green);//Establece el color del panel.
        panel.setLayout(null);//Desactiva el diseño por defector del panel
        this.getContentPane().add(panel);//Agregamos el panel a la ventana.

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
        JLabel etiqueta2 = new JLabel(new ImageIcon("BalonMundial.jpg"));//Establecer la etiqueta de imagen
        etiqueta2.setBounds(10, 80, 600, 600);
        panel.add(etiqueta2);
    }
}
