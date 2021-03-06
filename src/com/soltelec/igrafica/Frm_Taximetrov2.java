/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soltelec.igrafica;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.soltelec.modulopuc.configuracion.modelo.Conexion;
import com.soltelec.modulopuc.utilidades.Mensajes;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author GerenciaDesarrollo
 */
public class Frm_Taximetrov2 extends javax.swing.JDialog {

    private int contadorA = 0;
    private int contadorB = 0;
    private final int alta = 100;
    private final int baja = 1;
    private int defecto;
    private boolean aprobado = false;
    private String cadena = "\n";
    private String cadenaERuido = "";
    private String grupo = "";
    ////////////////////////////////////////////PARA NO PERDER LA REFERENCIA DEL OBJETO///////////
    NoReiniciable nrei;
    private int idVehiculo;
    private int hojaPruebasActual;
    private int idPrueba;
    //---Conexión por JDBC
    private Connection conexion;
    private String usuario;
    private String password;
    private String direccionIP;
    //DIRECCIÓN IP DEL SERVIDOR = 186.112.176.34
    //---

    Frm_Taximetrov2() {
    }

    /**
     * Creates new form Frm_Taximetro
     */
    public Frm_Taximetrov2(java.awt.Frame parent, boolean modal, int idVehiculo,
            int hojaPruebasActual, int idPrueba) {
        super(parent, modal);
        this.idVehiculo = idVehiculo;
        this.hojaPruebasActual = hojaPruebasActual;
        this.idPrueba = idPrueba;
        initComponents();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(d);
        setResizable(false);
    }

    public NoReiniciable getNrei() {
        return nrei;
    }

    public void setNrei(NoReiniciable nrei) {
        this.nrei = nrei;
    }
    //////////////////////////////////////////////PARA NO PERDER LA REFERENCIA DEL OBJETO/////////   

    /**
     * Creates new form Frm_Taximetrov2
     */
    public Frm_Taximetrov2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void doClose(int retStatus) {

        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    /////////////////////////////////MÉTODOS SOBRE LA FUNCIONALIDAD //////////////////////////////
    public void establecerCantidadProblemas(int contadorA, int contadorB) {
        this.contadorA = contadorA;
        this.contadorB = contadorB;
    }

    public int obtenerCantidadProblemasA() {
        return contadorA;
    }

    public int obtenerCantidadProblemasB() {
        return contadorB;
    }

    public void establecerAprobado(int defecto) {
        if (defecto >= 100) {
            aprobado = false;
        }
        //TODO: Mirar si es un camion, una moto, un cuatriciclo, pq cada uno tiene un número máximo de rechazos
        //diferente, para carros normales es 10.
        if (defecto >= 10) {
            aprobado = false;
        }
    }

    public boolean obtenberAprobado() {
        return aprobado;
    }

    public void establecerNombreProblema(String cadenaERuido) {
        this.cadenaERuido += cadenaERuido + "\n";
    }

    public String obtenerNombreProblema() {
        return cadenaERuido;
    }

    public void establecerGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String obtenerGrupo() {
        return grupo;
    }
    /////////////////////////////////////////////////////////////////////////////////////

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Taximetro");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setText("La inexistencia del Taxímetro");

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox4.setText("El taxímetro está ubicado en un sitio donde no es visible para cualquier pasajero");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox1))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox4)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Taximetro", new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/ruler_24.png")), jPanel7); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/solt.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><center>TAXIMETRO</center></html>");

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/save_24.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/taxi.png"))); // NOI18N

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/salir24.png"))); // NOI18N
        cancelar.setText("cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(cancelar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        boolean persistir = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://" + Conexion.getIpServidor() + ":" + Conexion.getPuerto() + "/" + Conexion.getBaseDatos(), Conexion.getUsuario(), Conexion.getContraseña());
        } catch (ClassNotFoundException | SQLException ex) {
            Mensajes.mostrarExcepcion(ex);
        }

        if (jCheckBox1.isSelected()) {
            try {
                conexion.setAutoCommit(false);
                String statement = "INSERT INTO db_cda.defxprueba(id_defecto,id_prueba) VALUES(?,?)";
                //JOptionPane.showMessageDialog(null, "IdPrueba = " +idPrueba);
                PreparedStatement instruccion = (PreparedStatement) conexion.prepareStatement(statement);
                instruccion.setInt(1, 90000);
                instruccion.setInt(2, idPrueba);
                instruccion.executeUpdate();
                instruccion.clearParameters();
                 persistir = true;   
                //System.out.println("Datos enviados");
            } catch (SQLException ex) {
                if (ex.getSQLState().equalsIgnoreCase("23000")) {
                    JOptionPane.showMessageDialog(null, "Disculpe el Defecto 90000 ya se REGISTRO  Para esta Inspeccion VISUAL ...!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    return;
                } else {
                    Mensajes.mostrarExcepcion(ex);
                }

                return;
            }
        }

        if (jCheckBox4.isSelected()) {
            try {
                conexion.setAutoCommit(false);
                String statement = "INSERT INTO db_cda.defxprueba(id_defecto,id_prueba) VALUES(?,?)";
                //JOptionPane.showMessageDialog(null, "IdPrueba = " +idPrueba);
                PreparedStatement instruccion = (PreparedStatement) conexion.prepareStatement(statement);
                instruccion.setInt(1, 90003);
                instruccion.setInt(2, idPrueba);
                //instruccion.setInt(3, hojaPruebasActual);
                //instruccion.setString(4, "A");
                instruccion.executeUpdate();
                instruccion.clearParameters();
                 persistir = true;   
                //System.out.println("Datos enviados");
            } catch (SQLException ex) {
                if (ex.getSQLState().equalsIgnoreCase("23000")) {
                    JOptionPane.showMessageDialog(null, "Disculpe el Defecto 90003 ya se REGISTRO  Para esta Inspeccion VISUAL ...!", "SART 1.7.3", JOptionPane.INFORMATION_MESSAGE);
                    return;
                } else {
                    Mensajes.mostrarExcepcion(ex);
                }

                return;
            }
        }
         if (persistir == true) {
            try {
                conexion.commit();
                conexion.setAutoCommit(true);
                conexion.close();
                 JOptionPane.showMessageDialog(this, "Se ha REGISTRADO los Defectos (Frenos) de una Manera Exitosa ", "SART 1.7.3", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Mensajes.mostrarExcepcion(ex);
            }
        }        
        
        //Frm_Placas verificacion = new Frm_Placas("btn_ivisual ");
        doClose(0);
        nrei.establecer_oprimido(true);

    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        doClose(returnStatus);
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Taximetrov2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Frm_Taximetrov2 dialog = new Frm_Taximetrov2(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cancelar;
    private javax.swing.JButton guardar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    private int returnStatus = 0;
}
