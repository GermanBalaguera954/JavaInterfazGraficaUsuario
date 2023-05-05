package ventana;

import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {
    private DefaultComboBoxModel<Persona> modelo = new DefaultComboBoxModel<Persona> ();
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    

    public Ventana() {        
        llenarModeloComboBox();
        agregarModeloTabla();
        initComponents();
        setTitle("Lista de Personas");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void agregarModeloTabla(){
    modeloTabla.addColumn("Nombres");
    modeloTabla.addColumn("Apellidos");
    modeloTabla.addColumn("Email");
    modeloTabla.addColumn("Celular");
    modeloTabla.addColumn("Direccion");
    }
    
    private void llenarModeloComboBox(){
    modelo.addElement(new Persona("Germán","Balaguera","german123@coreo.com","1234567891","cra 12 # 12-07"));
    modelo.addElement(new Persona("Juan","Perez","juan123@coreo.com","1234567891","cra 11 # 12-07"));
    modelo.addElement(new Persona("Pedro","Martinez","pedro123@coreo.com","1234567891","cra 8 # 12-07"));
    modelo.addElement(new Persona("Andres","Aguilar","andres123@coreo.com","1234567891","cra 10 # 12-07"));
    modelo.addElement(new Persona("Lucas","Noguera","lucas123@coreo.com","1234567891","cra 4 # 12-07"));
    modelo.addElement(new Persona("Daniel","Cifuentes","daniel123@coreo.com","1234567891","cra 3 # 12-07"));
    modelo.addElement(new Persona("Ana","Tabares","ana123@coreo.com","1234567891","cra 15 # 15-07"));
    modelo.addElement(new Persona("Geral","Peña","geral123@coreo.com","1234567891","cra 22 # 12-07"));
    modelo.addElement(new Persona("Sofia","Ramos","sofia123@coreo.com","1234567891","cra 2 # 12-07"));
            
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaPersona = new javax.swing.JLabel();
        comboPersonas = new javax.swing.JComboBox<>();
        botonInsertar = new javax.swing.JButton();
        scrollTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        separador = new javax.swing.JSeparator();
        etiquetaDatos = new javax.swing.JLabel();
        etiqueteNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaApellido = new javax.swing.JLabel();
        cajaApellido = new javax.swing.JTextField();
        etiquetaEmail = new javax.swing.JLabel();
        cajaEmail = new javax.swing.JTextField();
        etiquetaCelular = new javax.swing.JLabel();
        cajaCelular = new javax.swing.JTextField();
        etiquetaDireccion = new javax.swing.JLabel();
        cajaDireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaPersona.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaPersona.setText("Persona");

        comboPersonas.setModel(modelo);

        botonInsertar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonInsertar.setText("Insetar Persona");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        tabla.setModel(modeloTabla);
        ListSelectionListener oyenteSelecion = new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(e.getValueIsAdjusting()){

                    int filaSelecionada = tabla.getSelectedRow();

                    String nombres = (String) modeloTabla.getValueAt(filaSelecionada, 0);
                    String apellidos = (String) modeloTabla.getValueAt(filaSelecionada, 1);
                    String email = (String) modeloTabla.getValueAt(filaSelecionada, 2);
                    String celular = (String) modeloTabla.getValueAt(filaSelecionada, 3);
                    String direccion = (String) modeloTabla.getValueAt(filaSelecionada, 4);

                    cajaNombre.setText(nombres);
                    cajaApellido.setText(apellidos);
                    cajaEmail.setText(email);
                    cajaCelular.setText(celular);
                    cajaDireccion.setText(direccion);
                }
            }
        };
        tabla.getSelectionModel().addListSelectionListener(oyenteSelecion);
        scrollTabla.setViewportView(tabla);

        etiquetaDatos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        etiquetaDatos.setText("Datos de la Persona");

        etiqueteNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueteNombre.setText("Nombres");

        etiquetaApellido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaApellido.setText("Apellidos");

        etiquetaEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaEmail.setText("Email");

        etiquetaCelular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaCelular.setText("Celular");

        etiquetaDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaDireccion.setText("Dirección");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cajaDireccion)
                    .addComponent(separador)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(comboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cajaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(etiquetaEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etiquetaDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etiquetaPersona, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etiquetaDatos, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cajaEmail)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(etiquetaPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaDatos)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(etiqueteNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaEmail))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(etiquetaApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaCelular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etiquetaDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Persona p = (Persona)comboPersonas.getSelectedItem();//retorna el objeto persona seleccionado
        
        String nombres = p.getNombres();
        String apellidos = p.getApellidos();
        String email = p.getEmail();
        String celular = p.getCelular();
        String direccion = p.getDireccion();
        
        String [] persona = {nombres, apellidos,email,celular,direccion};//inserta los datos a la tabla
        
        modeloTabla.addRow(persona);
    }//GEN-LAST:event_botonInsertarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
        
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.synth.SynthLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInsertar;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JTextField cajaCelular;
    private javax.swing.JTextField cajaDireccion;
    private javax.swing.JTextField cajaEmail;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JComboBox<Persona> comboPersonas;
    private javax.swing.JLabel etiquetaApellido;
    private javax.swing.JLabel etiquetaCelular;
    private javax.swing.JLabel etiquetaDatos;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaEmail;
    private javax.swing.JLabel etiquetaPersona;
    private javax.swing.JLabel etiqueteNombre;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JSeparator separador;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
