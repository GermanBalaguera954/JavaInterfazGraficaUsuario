package Codigo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Ventana extends javax.swing.JFrame {
    
    private Timer tiempo;
    private int centesimaSegundo = 0, segundos = 0, minutos = 0, horas = 0;
    
    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            centesimaSegundo++;
            if (centesimaSegundo == 100) {
                segundos++;
                centesimaSegundo = 0;
            }
            if (segundos == 60) {
                minutos++;
                segundos = 0;
            }
            if (minutos == 60) {
                horas++;
                minutos = 0;
            }
            
            actualizarEtiquetaTiempo();
        }
    };
    
    private void actualizarEtiquetaTiempo() {
        String texto = (horas <= 9 ? "0" : "") + horas + ":" + (minutos <= 9 ? "0" : "") + minutos + ":" + (segundos <= 9 ? "0" : "") + segundos + ":" + (centesimaSegundo <= 9 ? "0" : "") + centesimaSegundo;
        etiqueteTiempo.setText(texto);
    }
    
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        tiempo = new Timer(10, acciones);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaImagenCronometro = new javax.swing.JLabel();
        etiquetaCronometro = new javax.swing.JLabel();
        etiqueteTiempo = new javax.swing.JLabel();
        botonIniciar = new javax.swing.JButton();
        botonPausar = new javax.swing.JButton();
        botonDetener = new javax.swing.JButton();
        etiquetaImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronometro");
        setResizable(false);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaImagenCronometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cronometro.png"))); // NOI18N
        panel.add(etiquetaImagenCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 150, 150));

        etiquetaCronometro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 35)); // NOI18N
        etiquetaCronometro.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaCronometro.setText("Cronometro");
        panel.add(etiquetaCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 250, -1));

        etiqueteTiempo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiqueteTiempo.setForeground(new java.awt.Color(255, 255, 255));
        etiqueteTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueteTiempo.setText("00:00:00:00");
        panel.add(etiqueteTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 170, 30));

        botonIniciar.setBackground(new java.awt.Color(0, 204, 204));
        botonIniciar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIniciar.setText("Iniciar");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        panel.add(botonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 100, 22));

        botonPausar.setBackground(new java.awt.Color(0, 204, 204));
        botonPausar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonPausar.setText("Pausar");
        botonPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPausarActionPerformed(evt);
            }
        });
        panel.add(botonPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 100, 22));

        botonDetener.setBackground(new java.awt.Color(0, 204, 204));
        botonDetener.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonDetener.setText("Detener");
        botonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDetenerActionPerformed(evt);
            }
        });
        panel.add(botonDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 100, 22));

        etiquetaImagenFondo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen.jpg"))); // NOI18N
        panel.add(etiquetaImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 200));

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

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        tiempo.start();
        botonIniciar.setEnabled(false);
        botonIniciar.setText("Reanudar");
        botonPausar.setEnabled(true);
        botonDetener.setEnabled(true);
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPausarActionPerformed
        tiempo.stop();
        botonIniciar.setEnabled(true);
        botonPausar.setEnabled(false);
    }//GEN-LAST:event_botonPausarActionPerformed

    private void botonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDetenerActionPerformed
        if (tiempo.isRunning()) {
            tiempo.stop();
            botonIniciar.setEnabled(true);
        }
        botonIniciar.setText("Iniciar");
        botonPausar.setEnabled(false);
        botonDetener.setEnabled(false);
        
        horas = 0;
        minutos = 0;
        segundos = 0;
        centesimaSegundo = 0;
        
        actualizarEtiquetaTiempo();
    }//GEN-LAST:event_botonDetenerActionPerformed
    
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
    private javax.swing.JButton botonDetener;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonPausar;
    private javax.swing.JLabel etiquetaCronometro;
    private javax.swing.JLabel etiquetaImagenCronometro;
    private javax.swing.JLabel etiquetaImagenFondo;
    private javax.swing.JLabel etiqueteTiempo;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
