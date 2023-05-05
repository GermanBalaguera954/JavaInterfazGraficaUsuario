package ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

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
        //colocarBotones();
        //colocarRadioBotones();
        //colocarBotonesActivacion();
        //colcocarCajaDeTexto();
        //colocarAreaDeTexto();
        //colocarCasillasDeVerificacion();
        //colocarListaDesplegables();
        //colcocarCampoDeContraseña();
        colocarTablas();

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

    private void colocarRadioBotones() {

        JRadioButton radioBoton1 = new JRadioButton("Opcion 1", true);
        radioBoton1.setBounds(50, 100, 200, 50);
        radioBoton1.setEnabled(true);//Oculata la casilla
        radioBoton1.setText("Programacion");
        radioBoton1.setFont(new Font("cooper black", 0, 20));
        panel.add(radioBoton1);

        JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);
        radioBoton2.setBounds(50, 150, 100, 50);
        panel.add(radioBoton2);

        JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);
        radioBoton3.setBounds(50, 200, 100, 50);
        panel.add(radioBoton3);

        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }

    private void colocarBotonesActivacion() {
        JToggleButton botonActivacion1 = new JToggleButton("Opcion 1: ", true);
        botonActivacion1.setBounds(50, 100, 100, 40);
        panel.add(botonActivacion1);

        JToggleButton botonActivacion2 = new JToggleButton("Opcion 2: ", false);
        botonActivacion2.setBounds(50, 150, 100, 40);
        panel.add(botonActivacion2);

        JToggleButton botonActivacion3 = new JToggleButton("Opcion 3: ", false);
        botonActivacion3.setBounds(50, 200, 100, 40);
        panel.add(botonActivacion3);

        ButtonGroup grupoBotonesActivados = new ButtonGroup();
        grupoBotonesActivados.add(botonActivacion1);
        grupoBotonesActivados.add(botonActivacion2);
        grupoBotonesActivados.add(botonActivacion3);

    }

    private void colcocarCajaDeTexto() {
        JTextField cajaTexto1 = new JTextField();
        cajaTexto1.setBounds(50, 50, 100, 30);
        cajaTexto1.setText("Hola....");
        System.out.println("Texto en la caja: " + cajaTexto1.getText());
        panel.add(cajaTexto1);

    }

    private void colocarAreaDeTexto() {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        areaTexto.setText("Escriba el texto aqui....");
        areaTexto.append("\nEscribe por aqui...");//Este metodo añade mas testo al area
        areaTexto.setEditable(true);//Establecer editado del area de texto.

        System.out.println("El texto es: " + areaTexto.getText());
        areaTexto.setBackground(Color.white);
        panel.add(areaTexto);

        //Barra de desplazamiento
        JScrollPane barrasDesplaz = new JScrollPane(areaTexto);
        barrasDesplaz.setBounds(20, 20, 300, 200);
        barrasDesplaz.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        barrasDesplaz.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        panel.add(barrasDesplaz);
    }

    private void colocarCasillasDeVerificacion() {
        JCheckBox casillaVerificacion1 = new JCheckBox("Leche: ");
        casillaVerificacion1.setEnabled(true);
        casillaVerificacion1.setBounds(20, 20, 100, 40);
        panel.add(casillaVerificacion1);

        JCheckBox casillaVerificacion2 = new JCheckBox("Galletas: ");
        casillaVerificacion2.setBounds(20, 50, 100, 40);
        panel.add(casillaVerificacion2);

        JCheckBox casillaVerificacion3 = new JCheckBox("Yogurt: ");
        casillaVerificacion3.setBounds(20, 80, 100, 40);
        panel.add(casillaVerificacion3);

        JCheckBox casillaVerificacion4 = new JCheckBox("Cereal: ");
        casillaVerificacion4.setBounds(20, 110, 100, 40);
        panel.add(casillaVerificacion4);

    }

    private void colocarListaDesplegables() {
        /*String [] paises = {"Peru","Colombia","Paraguay","Ecuador",};        
        JComboBox listaDesplegable = new JComboBox(paises);        
        listaDesplegable.setBounds(20, 20, 100, 30);
        listaDesplegable.addItem("Argentina");//Añadir objetos a la lista desplegable.
        listaDesplegable.setSelectedItem("Paraguay");//Selecciona el primer objeto a ver de la lista desplegable.
        panel.add(listaDesplegable);*/

        Persona persona1 = new Persona("German Balaguera", 32, "Colombiano");
        Persona persona2 = new Persona("Tania Bustamante", 25, "Argentina");

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox listaDesplegable = new JComboBox(modelo);

        modelo.addElement(persona1);
        modelo.addElement(persona2);

        listaDesplegable.setBounds(20, 20, 200, 30);
        panel.add(listaDesplegable);
    }

    private void colcocarCampoDeContraseña() {
        JPasswordField campoContraseña = new JPasswordField();
        campoContraseña.setBounds(20, 20, 150, 30);
        campoContraseña.setText("Programacion");
        panel.add(campoContraseña);

        String contraseña = "";

        for (int i = 0; i < campoContraseña.getPassword().length; i++) {
            contraseña += campoContraseña.getPassword()[i];
        }

        System.out.println("Contraseña: " + contraseña);
    }

    private void colocarTablas() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");
        
        String[] persona1 = {"German","32","Colombiano"};
        String[] persona2 = {"Juan","21","Colombiano"};
        String[] persona3 = {"Maria","25","Argentina"};
        String[] persona4 = {"Pedro","18","Colombiano"};
        String[] persona5 = {"Pablo","30","Colombiano"};
        String[] persona6 = {"Luis","31","Colombiano"};
        String[] persona7 = {"Julian","22","Argentina"};
        String[] persona8 = {"Angie","26","Colombiano"};
        String[] persona9 = {"Natalia","19","Argentina"};
        String[] persona10 = {"Leidy","20","Colombiano"};
        String[] persona11 = {"Geral","29","Argentina"};
        String[] persona12 = {"Jhon","33","Colombiano"};
        String[] persona13 = {"Andres","21","Colombiano"};
        
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);
        modelo.addRow(persona4);
        modelo.addRow(persona5);
        modelo.addRow(persona6);
        modelo.addRow(persona7);
        modelo.addRow(persona8);
        modelo.addRow(persona9);
        modelo.addRow(persona10);
        modelo.addRow(persona11);
        modelo.addRow(persona12);
        modelo.addRow(persona13);
       

        JTable tabla = new JTable(modelo);
        tabla.setBounds(20, 20, 300, 200);
        panel.add(tabla);

        JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 300, 200);
        panel.add(scroll);
    }
}
