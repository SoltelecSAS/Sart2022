/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soltelec.igrafica.labrado.presion;

//import com.soltelec.dfs.modelo.Medidas;
//import com.soltelec.dfs.modelo.Pruebas;
import com.soltelec.model.Vehiculos;
import com.soltelec.modulopuc.persistencia.conexion.DBUtil;
import dao.PruebasDAO;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import modelo.Medidas;


/**
 *
 * @author Luis Berna
 */
public class LabradoPresionMoto extends javax.swing.JDialog {

    final String regExp = "[0-9]+([,.][0-9]{1,2})?";
    private HashMap<String, Component> componentMap;
    private int idVehiculo;
    private int hojaPruebasActual;
    private int idPrueba;
    Vehiculos vehiculo = null;
    java.awt.Frame frame;
    int idUsuario;
    boolean ensenianza;
    boolean aplicTaximetro;
    EntityManager em;
    private PruebasDAO pruebasDAO;

    /**
     * Creates new form LabradoPresionLiviano
     */
    public LabradoPresionMoto(java.awt.Frame frame, boolean modal, int idVehiculo, int hojaPruebasActual, int idPrueba, int idUsuario, Vehiculos vehiculo, EntityManager em) {
        super(frame, modal);
        this.idVehiculo = idVehiculo;
        this.hojaPruebasActual = hojaPruebasActual;
        this.idPrueba = idPrueba;
        initComponents();
        createComponentMap();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(d);
        setResizable(false);
        this.frame = frame;
        this.vehiculo = vehiculo;
        this.idUsuario = idUsuario;
        this.em = em;
        if(vehiculo.getPesoBruto() != null){
            lblPesoBruto.setText(vehiculo.getPesoBruto().toString());
        }else{
            lblPesoBruto.setText("");
        }
        pruebasDAO = new PruebasDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        panelEje1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtEje1Izquierda = new javax.swing.JTextField();
        panelEje2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtEje2Izquierda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtEje1IzquierdaP = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        txtEje2IzquierdaP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPesoBruto = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/rueda.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(833, 800));

        panelEje1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eje 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N
        panelEje1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Llanta 1");
        jLabel8.setOpaque(true);
        panelEje1.add(jLabel8);

        txtEje1Izquierda.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtEje1Izquierda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelEje1.add(txtEje1Izquierda);

        panelEje2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eje 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N
        panelEje2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel30.setBackground(new java.awt.Color(204, 204, 204));
        jLabel30.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Llanta 2");
        jLabel30.setOpaque(true);
        panelEje2.add(jLabel30);

        txtEje2Izquierda.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtEje2Izquierda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelEje2.add(txtEje2Izquierda);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro profundidad de labrado");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelEje1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelEje2, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 236, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panelEje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Labrado", jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(833, 800));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eje 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N
        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Llanta 1");
        jLabel18.setOpaque(true);
        jPanel11.add(jLabel18);

        txtEje1IzquierdaP.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtEje1IzquierdaP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(txtEje1IzquierdaP);

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eje 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N
        jPanel27.setLayout(new java.awt.GridLayout(1, 0));

        jLabel36.setBackground(new java.awt.Color(204, 204, 204));
        jLabel36.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Llanta 2");
        jLabel36.setOpaque(true);
        jPanel27.add(jLabel36);

        txtEje2IzquierdaP.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtEje2IzquierdaP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel27.add(txtEje2IzquierdaP);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registro de presión");
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 236, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Presión", jPanel4);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel3.setText("Peso bruto:");
        jLabel3.setOpaque(true);

        lblPesoBruto.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        lblPesoBruto.setText("900");

        btnSiguiente.setText("SIguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/solt.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/soltelec/Icon/rueda.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Labrado y presión moto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPesoBruto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(lblPesoBruto)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        boolean valido = validarCampos();

        if (!valido) {
            JOptionPane.showMessageDialog(this, "Debe validar las medidas ingresadas", "SART 1.7.2",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String campos = "(" + Medidas.ID_TIPO_MEDIDA + "," + Medidas.VALOR_MEDIDA + "," + Medidas.ID_PRUEBA + ")";
        for (Map.Entry<String, Component> entry : componentMap.entrySet()) {
            String valorMedida = ((JTextField) entry.getValue()).getText();
            if (valorMedida == null || valorMedida.isEmpty()) {
                continue;
            }
            Object tipoMedida = entry.getKey();
            Object val = entry.getValue();
            String valores = "('" + tipoMedida + "','" + valorMedida + "','" + idPrueba + "')";
            try {
                DBUtil.insert(Medidas.TABLA, campos, valores);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al guardar las medidas tomadas", "SART 1.7.2",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblPesoBruto;
    private javax.swing.JPanel panelEje1;
    private javax.swing.JPanel panelEje2;
    private javax.swing.JTextField txtEje1Izquierda;
    private javax.swing.JTextField txtEje1IzquierdaP;
    private javax.swing.JTextField txtEje2Izquierda;
    private javax.swing.JTextField txtEje2IzquierdaP;
    // End of variables declaration//GEN-END:variables

    private void createComponentMap() {
        componentMap = new HashMap<>();

        //Labrado
        componentMap.put("9046", txtEje1Izquierda);
        componentMap.put("9047", txtEje2Izquierda);

        //Presion
        componentMap.put("9048", txtEje1IzquierdaP);
        componentMap.put("9049", txtEje2IzquierdaP);
    }

    public Component getComponentByName(String name) {
        if (componentMap.containsKey(name)) {
            return (Component) componentMap.get(name);
        } else {
            return null;
        }
    }

    private boolean validarCampos() {
        for (Map.Entry<String, Component> entry : componentMap.entrySet()) {
            String valorMedida = ((JTextField) entry.getValue()).getText();
            if (valorMedida != null && !valorMedida.isEmpty()) {
                if (!Pattern.matches(regExp, valorMedida)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
