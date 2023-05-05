package Codigo;

import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        etiquetaImagenPersona = new javax.swing.JLabel();
        etiquetaUsiuario = new javax.swing.JLabel();
        etiqueteConstraseña = new javax.swing.JLabel();
        cajaUsiario = new javax.swing.JTextField();
        cajaContraseña = new javax.swing.JPasswordField();
        botonSesion = new javax.swing.JButton();
        etiquetaImangenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuario");
        setUndecorated(true);
        setResizable(false);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalir.setBackground(new java.awt.Color(0, 102, 102));
        botonSalir.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panel.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        etiquetaImagenPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/persona.png"))); // NOI18N
        panel.add(etiquetaImagenPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 250, 250));

        etiquetaUsiuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaUsiuario.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUsiuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaUsiuario.setText("Usuario:");
        panel.add(etiquetaUsiuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 100, -1));

        etiqueteConstraseña.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiqueteConstraseña.setForeground(new java.awt.Color(255, 255, 255));
        etiqueteConstraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueteConstraseña.setText("Contraseña:");
        panel.add(etiqueteConstraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        cajaUsiario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaUsiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 200, 30));

        cajaContraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 200, 30));

        botonSesion.setBackground(new java.awt.Color(0, 153, 153));
        botonSesion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonSesion.setForeground(new java.awt.Color(255, 255, 255));
        botonSesion.setText("Iniciar Sesion");
        botonSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSesionActionPerformed(evt);
            }
        });
        panel.add(botonSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, -1));

        etiquetaImangenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        panel.add(etiquetaImangenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSesionActionPerformed
        String usuarioCorrecto = "german";
        String contraseñaCorrecta = "programacion";

        if (usuarioCorrecto.equals(cajaUsiario.getText())) {
            String contraseña = "";

            for (int i = 0; i < cajaContraseña.getPassword().length; i++) {
                contraseña += cajaContraseña.getPassword()[i];
            }
            if (contraseñaCorrecta.equals(contraseña)) {
                JOptionPane.showMessageDialog(null, "Ingresante al sistema");
            } else {
                JOptionPane.showMessageDialog(null, "Error, contraseña desconocida");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error, usuario desconocido");
        }
    }//GEN-LAST:event_botonSesionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSesion;
    private javax.swing.JPasswordField cajaContraseña;
    private javax.swing.JTextField cajaUsiario;
    private javax.swing.JLabel etiquetaImagenPersona;
    private javax.swing.JLabel etiquetaImangenFondo;
    private javax.swing.JLabel etiquetaUsiuario;
    private javax.swing.JLabel etiqueteConstraseña;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
