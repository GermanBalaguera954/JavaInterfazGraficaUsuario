/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import javax.swing.ImageIcon;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author My PC
 */
public class Ventana extends javax.swing.JFrame {

    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Raiz");
    DefaultTreeModel modeloTree = new DefaultTreeModel(raiz);

    public Ventana() {

        cargarDatosModeloTree();
        initComponents();
    }

    private void cargarDatosModeloTree() {
        DefaultMutableTreeNode colores = new DefaultMutableTreeNode("Colores");
        DefaultMutableTreeNode colorRojo = new DefaultMutableTreeNode("Rojo");
        DefaultMutableTreeNode colorAzul = new DefaultMutableTreeNode("Azul");

        colores.add(colorRojo);
        colores.add(colorAzul);

        DefaultMutableTreeNode deportes = new DefaultMutableTreeNode("Deportes");
        DefaultMutableTreeNode futbol = new DefaultMutableTreeNode("Futbol");

        DefaultMutableTreeNode futsal = new DefaultMutableTreeNode("Futsal");
        DefaultMutableTreeNode futbolCompleto = new DefaultMutableTreeNode("FutbolCompleto");

        futbol.add(futsal);
        futbol.add(futbolCompleto);

        DefaultMutableTreeNode baloncesto = new DefaultMutableTreeNode("Baloncesto");

        deportes.add(futbol);
        deportes.add(baloncesto);

        raiz.add(colores);
        raiz.add(deportes);
    }
    
    private void eventosNodoSeleccionado(DefaultMutableTreeNode nodoSeleccionado){
        if(nodoSeleccionado.toString().equals("Rojo")){
            etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/rojo.jpg")));
        }
        else if(nodoSeleccionado.toString().equals("Azul")){
            etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/azul.jpg")));
        }
        else if(nodoSeleccionado.toString().equals("Futsal")){
            etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/futsal.jpg")));
        }
        else if(nodoSeleccionado.toString().equals("FutbolCompleto")){
            etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/futbol.jpg")));
        }
        else if(nodoSeleccionado.toString().equals("Baloncesto")){
            etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/baloncesto.jpg")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        etiquetaImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        arbol.setModel(modeloTree);
        TreeSelectionListener oyenteTree = new TreeSelectionListener(){
            @Override
            public void valueChanged(TreeSelectionEvent e){
                DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) arbol.getLastSelectedPathComponent();
                eventosNodoSeleccionado(nodoSeleccionado);
            }
        };
        arbol.getSelectionModel().addTreeSelectionListener(oyenteTree);
        jScrollPane1.setViewportView(arbol);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(etiquetaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JTree arbol;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
