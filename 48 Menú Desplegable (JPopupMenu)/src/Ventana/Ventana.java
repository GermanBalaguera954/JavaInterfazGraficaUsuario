/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import java.awt.Color;

/**
 *
 * @author My PC
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        grupoBotones.add(radioBoton1);
        grupoBotones.add(radioBoton2);
        grupoBotones.add(radioBoton3);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        menuDesplegable = new javax.swing.JPopupMenu();
        ventanaMax = new javax.swing.JMenuItem();
        ventanaMin = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        cambiarColor = new javax.swing.JMenu();
        colorRojo = new javax.swing.JMenuItem();
        colorAzul = new javax.swing.JMenuItem();
        panel = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menuItemInicio = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        subMenu = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        radioBoton1 = new javax.swing.JRadioButtonMenuItem();
        radioBoton2 = new javax.swing.JRadioButtonMenuItem();
        radioBoton3 = new javax.swing.JRadioButtonMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItemSalir = new javax.swing.JMenuItem();

        ventanaMax.setText("ventana mas grande");
        ventanaMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaMaxActionPerformed(evt);
            }
        });
        menuDesplegable.add(ventanaMax);

        ventanaMin.setText("ventana mas pequeña");
        ventanaMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaMinActionPerformed(evt);
            }
        });
        menuDesplegable.add(ventanaMin);
        menuDesplegable.add(separador);

        cambiarColor.setText("Cambiar color de ventana");

        colorRojo.setText("Rojo");
        colorRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorRojoActionPerformed(evt);
            }
        });
        cambiarColor.add(colorRojo);

        colorAzul.setText("Azul");
        colorAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorAzulActionPerformed(evt);
            }
        });
        cambiarColor.add(colorAzul);

        menuDesplegable.add(cambiarColor);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        menu1.setText("Menú");
        menu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });

        menuItemInicio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItemInicio.setText("Inicio");
        menu1.add(menuItemInicio);
        menu1.add(jSeparator1);

        subMenu.setText("Submenú");
        subMenu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("item1");
        subMenu.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("item2");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        subMenu.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("item3");
        subMenu.add(jCheckBoxMenuItem3);

        radioBoton1.setSelected(true);
        radioBoton1.setText("radio1");
        subMenu.add(radioBoton1);

        radioBoton2.setSelected(true);
        radioBoton2.setText("radio2");
        subMenu.add(radioBoton2);

        radioBoton3.setSelected(true);
        radioBoton3.setText("radio3");
        subMenu.add(radioBoton3);

        menu1.add(subMenu);
        menu1.add(jSeparator2);

        menuItemSalir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menu1.add(menuItemSalir);

        barraMenu.add(menu1);

        setJMenuBar(barraMenu);

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

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        
    }//GEN-LAST:event_menu1ActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void panelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseReleased
        if (evt.isPopupTrigger()) {
            menuDesplegable.show(evt.getComponent(), evt.getX() , evt.getY());
        }
    }//GEN-LAST:event_panelMouseReleased

    private void ventanaMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaMaxActionPerformed
        this.setSize(500, 500);
    }//GEN-LAST:event_ventanaMaxActionPerformed

    private void ventanaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaMinActionPerformed
        this.setSize(300,300);
    }//GEN-LAST:event_ventanaMinActionPerformed

    private void colorRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorRojoActionPerformed
        panel.setBackground(Color.red);
    }//GEN-LAST:event_colorRojoActionPerformed

    private void colorAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorAzulActionPerformed
        panel.setBackground(Color.blue);
    }//GEN-LAST:event_colorAzulActionPerformed

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
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu cambiarColor;
    private javax.swing.JMenuItem colorAzul;
    private javax.swing.JMenuItem colorRojo;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menu1;
    private javax.swing.JPopupMenu menuDesplegable;
    private javax.swing.JMenuItem menuItemInicio;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButtonMenuItem radioBoton1;
    private javax.swing.JRadioButtonMenuItem radioBoton2;
    private javax.swing.JRadioButtonMenuItem radioBoton3;
    private javax.swing.JPopupMenu.Separator separador;
    private javax.swing.JMenu subMenu;
    private javax.swing.JMenuItem ventanaMax;
    private javax.swing.JMenuItem ventanaMin;
    // End of variables declaration//GEN-END:variables
}
