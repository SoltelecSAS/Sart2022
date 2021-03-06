/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soltelec.igrafica;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author GerenciaDesarrollo
 */
public class Frm_re_IVisualv2 extends javax.swing.JDialog {

    /**
     * Creates new form Frm_re_IVisualv2
     */
    boolean oprimido = false;
    boolean bloquearRExterior = false;
    boolean bloquearSFrenos = false;
    NoReiniciable nrei = new NoReiniciable();

    public Frm_re_IVisualv2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_re_IVisualv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        initComponents();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(d);
        setResizable(false);
        setTitle("INSPECCIÓN SENSORIAL PARA REMOLQUES");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lab_revicion = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labl_descripcion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lab_sistemFrenos = new javax.swing.JLabel();
        lab_finalizar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lab_revicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/revicionInterior.png"))); // NOI18N
        lab_revicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_revicionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_revicionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_revicionMouseExited(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labl_descripcion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labl_descripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labl_descripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labl_descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("<html><ul><li>Al pasar el mouse sobre las imagenes se activara la opción y se mostrara la descipción en la parte inferior.</li><li>Puede hacer clic sobre la imagen para acceder a la opción</li><li>Tambien puede salir haciendo clic en la imagen de bandera</li></ul></html>");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lab_sistemFrenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/rueda.png"))); // NOI18N
        lab_sistemFrenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_sistemFrenosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_sistemFrenosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_sistemFrenosMouseExited(evt);
            }
        });

        lab_finalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/fin.png"))); // NOI18N
        lab_finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_finalizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_finalizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_finalizarMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/solt.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lab_revicion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lab_sistemFrenos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lab_finalizar)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(154, 154, 154))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab_revicion)
                    .addComponent(lab_sistemFrenos)
                    .addComponent(lab_finalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lab_revicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_revicionMouseClicked

        oprimido = nrei.obtener_oprimido(); //variable para obtener el bool pero no sirve....
        //JOptionPane.showMessageDialog(null, "La variable oprimido es igual a: " +oprimido);

        if (oprimido == false && bloquearRExterior == true) {
            JOptionPane.showMessageDialog(null, "Esta prueba ya se ha realizado..", "ERROR", JOptionPane.ERROR_MESSAGE);
            nrei.reiniciarVariable();//Reiniciar variable de clase para que quede preparada para comprobar otro boton
        }

        if (oprimido == false && bloquearRExterior == false) {

            FrmLogin obj = new FrmLogin();
            Frm_re_RExteriorv2 dlg = new Frm_re_RExteriorv2(obj, true);
            dlg.setNrei(nrei);//Guardar la referencia del objeto.
            dlg.setTitle("Frm_IGCentral");
            dlg.setVisible(true);
        }
        if (nrei.obtener_oprimido() == true) {
            //JOptionPane.showMessageDialog(null, "OBtener oprimido = " +nrei.obtener_oprimido());
            bloquearRExterior = true;
            nrei.reiniciarVariable();//Reiniciar variable de clase para que quede preparada para comprobar otro boton
        }
    }//GEN-LAST:event_lab_revicionMouseClicked

    private void lab_revicionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_revicionMouseEntered
        lab_revicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/revicionInteriorCambio.png")));
        labl_descripcion.setText("<html><font size=5 >REVISIÓN EXTERIOR <br/> ELEMENTOS PARA PRODUCIR RUIDO <br/>ALUMBRADO Y SEÑALIZACIÓN</font></html>");
    }//GEN-LAST:event_lab_revicionMouseEntered

    private void lab_revicionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_revicionMouseExited
        lab_revicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/revicionInterior.png")));
        labl_descripcion.setText(null);
    }//GEN-LAST:event_lab_revicionMouseExited

    private void lab_sistemFrenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_sistemFrenosMouseClicked
        oprimido = nrei.obtener_oprimido(); //variable para obtener el bool pero no sirve....
        //JOptionPane.showMessageDialog(null, "La variable oprimido es igual a: " +oprimido);

        if (oprimido == false && bloquearSFrenos == true) {
            JOptionPane.showMessageDialog(null, "Esta prueba ya se ha realizado..", "ERROR", JOptionPane.ERROR_MESSAGE);
            nrei.reiniciarVariable();//Reiniciar variable de clase para que quede preparada para comprobar otro boton
        }

        if (oprimido == false && bloquearSFrenos == false) {

            FrmLogin obj = new FrmLogin();
            Frm_re_SFrenosv2 dlg = new Frm_re_SFrenosv2(obj, true);
            dlg.setNrei(nrei);//Guardar la referencia del objeto.
            dlg.setTitle("Frm_IGCentral");
            dlg.setVisible(true);
        }
        if (nrei.obtener_oprimido() == true) {
            //JOptionPane.showMessageDialog(null, "OBtener oprimido = " +nrei.obtener_oprimido());
            bloquearSFrenos = true;
            nrei.reiniciarVariable();//Reiniciar variable de clase para que quede preparada para comprobar otro boton
        }
    }//GEN-LAST:event_lab_sistemFrenosMouseClicked

    private void lab_sistemFrenosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_sistemFrenosMouseEntered
        lab_sistemFrenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/ruedaCambia.png")));
        labl_descripcion.setText("<html>SISTEMA DE FRENOS <br/> SUSPENSIÓN <br/> RINES Y LLANTAS</html>");
    }//GEN-LAST:event_lab_sistemFrenosMouseEntered

    private void lab_sistemFrenosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_sistemFrenosMouseExited
        lab_sistemFrenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/rueda.png")));
        labl_descripcion.setText(null);
    }//GEN-LAST:event_lab_sistemFrenosMouseExited

    private void lab_finalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_finalizarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lab_finalizarMouseClicked

    private void lab_finalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_finalizarMouseEntered
        lab_finalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/finCambia.png")));
        labl_descripcion.setText("FINALIZAR PRUEBA");
    }//GEN-LAST:event_lab_finalizarMouseEntered

    private void lab_finalizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_finalizarMouseExited
        lab_finalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/fin.png")));
        labl_descripcion.setText(null);
    }//GEN-LAST:event_lab_finalizarMouseExited
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_re_IVisualv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Frm_re_IVisualv2 dialog = new Frm_re_IVisualv2(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lab_finalizar;
    private javax.swing.JLabel lab_revicion;
    private javax.swing.JLabel lab_sistemFrenos;
    private javax.swing.JLabel labl_descripcion;
    // End of variables declaration//GEN-END:variables
    private int returnStatus = 0;
}
