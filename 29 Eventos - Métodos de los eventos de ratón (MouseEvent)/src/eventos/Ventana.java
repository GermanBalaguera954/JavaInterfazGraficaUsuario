package eventos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;
    private JTextArea areaTexto;

    public Ventana() {
        setBounds(50, 50, 500, 500);
        setTitle("Eventos");
        setLocationRelativeTo(null);

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        //colocarEtiqueta();
        //colocarCajaTexto();
        colocarBoton();
        colocarAreaTexto();

    }

    public void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    public void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("Ingrese su nombre: ");
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setFont(new Font("cooper black", 0, 18));
        panel.add(etiqueta);
    }

    public void colocarCajaTexto() {
        cajaTexto = new JTextField();
        cajaTexto.setBounds(20, 20, 200, 300);
        panel.add(cajaTexto);
    }

    public void colocarAreaTexto() {
        areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 200, 300);
        panel.add(areaTexto);
    }

    public void colocarBoton() {
        boton = new JButton("¡Pulse aqui!");
        boton.setBounds(150, 350, 150, 40);
        boton.setFont(new Font("arial", 0, 15));
        panel.add(boton);

        //eventoOyenteDeAccion();
        eventoOyenteDeRaton();
    }

    private void eventoOyenteDeAccion() {
        //Agregando evento de tipo  ActionListener.
        ActionListener oyenteDeAccion = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                saludo.setText("Hola " + cajaTexto.getText());
            }
        };
        boton.addActionListener(oyenteDeAccion);
    }

    private void eventoOyenteDeRaton() {
        //Agregando oyente de raton MouseListener
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.isAltDown()) {
                    areaTexto.append("Alt\n");
                } 
                else if (e.isControlDown()) {
                    areaTexto.append("Control\n");
                } 
                else if (e.isShiftDown()) {
                    areaTexto.append("Shift\n");
                } 
                else if (e.isMetaDown()) {
                    areaTexto.append("ClicDerecho\n");
                }
                else{
                    areaTexto.append("ClickIzquierdo\n");
                }
                
                if (e.getClickCount()==2) {
                    areaTexto.append("DobleClick\n");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //areaTexto.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //areaTexto.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //areaTexto.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //areaTexto.append("mouseExited\n");
            }
        };
        boton.addMouseListener(oyenteDeRaton);
    }
}
