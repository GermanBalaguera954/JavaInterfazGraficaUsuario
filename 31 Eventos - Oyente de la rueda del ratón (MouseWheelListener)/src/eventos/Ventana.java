package eventos;

import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

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

        eventoDeMovimientoRaton();
        eventoRuedaDelRaton();
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
        
       JScrollPane scroll = new JScrollPane(areaTexto);
        scroll.setBounds(20, 20, 300, 200);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(scroll);
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
                } else if (e.isControlDown()) {
                    areaTexto.append("Control\n");
                } else if (e.isShiftDown()) {
                    areaTexto.append("Shift\n");
                } else if (e.isMetaDown()) {
                    areaTexto.append("ClicDerecho\n");
                } else {
                    areaTexto.append("ClickIzquierdo\n");
                }

                if (e.getClickCount() == 2) {
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

    private void eventoDeMovimientoRaton() {
        MouseMotionListener oyenteMovimientoRaton = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                //areaTexto.append("muoseDragged\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                //areaTexto.append("mouseMoved\n");
            }
        };

        panel.addMouseMotionListener(oyenteMovimientoRaton);
    }
    
    private void eventoRuedaDelRaton(){
        
        MouseWheelListener ruedaRaton = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                areaTexto.append("Moviendo Rueda del Raton\n");
            }
        };
    
    panel.addMouseWheelListener(ruedaRaton);
    }
}
