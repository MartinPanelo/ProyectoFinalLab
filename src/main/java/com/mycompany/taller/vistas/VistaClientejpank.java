/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.taller.vistas;

import com.mycompany.taller.persistencia.Conexion;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.mycompany.taller.entidades.Cliente;
import com.mycompany.taller.persistencia.ClienteData;

/**
 *
 * @author User
 */
public class VistaClientejpank extends javax.swing.JPanel {

    /**
     * Creates new form VistaCliente
     */
    
    Connection conexiondb = Conexion.getConexion();
    ClienteData cData = new ClienteData(conexiondb);
    
    public VistaClientejpank() {
        initComponents();
    }
    
    public boolean validarCamposVaciosAgregar(){
     if (JTFnombre.getText().equals("") || JTFapellido.getText().equals("") || JTFdomicilio.getText().equals("") || JTFid.getText().equals("") || JTFcelular.getText().equals("")) {
        return false;
    }
    return true;
   }
    
    public boolean validarCamposVaciosBuscar(){
        if (JTFdni.getText().equals("")) {
        return false;
    }
    return true;
    }
    
    public boolean validarCamposVaciosActualizar() {
        if (JTFnombre.getText().equals("") || JTFdni.getText().equals("") || JTFapellido.getText().equals("") || JTFid.getText().equals("") || JTFdomicilio.getText().equals("") || JTFcelular.getText().equals("")) {
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        JLnombre = new javax.swing.JLabel();
        JLnombre1 = new javax.swing.JLabel();
        JLnombre2 = new javax.swing.JLabel();
        JLnombre3 = new javax.swing.JLabel();
        JLnombre4 = new javax.swing.JLabel();
        JLnombre5 = new javax.swing.JLabel();
        JTFapellido = new javax.swing.JTextField();
        JTFid = new javax.swing.JTextField();
        JTFdomicilio = new javax.swing.JTextField();
        JTFcelular = new javax.swing.JTextField();
        JTFdni = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jBagregar = new javax.swing.JButton();
        JBactualizar = new javax.swing.JButton();
        JBlimpiar = new javax.swing.JButton();
        JTFnombre = new javax.swing.JTextField();

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Gestor de clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        JLnombre.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        JLnombre.setText("ID");

        JLnombre1.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        JLnombre1.setText("Apellido");

        JLnombre2.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        JLnombre2.setText("Nombre");

        JLnombre3.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        JLnombre3.setText("Domicilio");

        JLnombre4.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        JLnombre4.setText("Celular");

        JLnombre5.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        JLnombre5.setText("DNI");

        JTFid.setEditable(false);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBagregar.setText("Agregar");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });

        JBactualizar.setText("Actualizar");
        JBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBactualizarActionPerformed(evt);
            }
        });

        JBlimpiar.setText("Limpiar");
        JBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLnombre)
                            .addComponent(JLnombre1)
                            .addComponent(JLnombre2)
                            .addComponent(JLnombre3)
                            .addComponent(JLnombre4)
                            .addComponent(JLnombre5))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jBagregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBlimpiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnombre)
                    .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnombre1)
                    .addComponent(JTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnombre2)
                    .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnombre3)
                    .addComponent(JTFdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnombre4)
                    .addComponent(JTFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnombre5)
                    .addComponent(JTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBagregar)
                    .addComponent(JBactualizar)
                    .addComponent(JBlimpiar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(209, 209, 209))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        if (validarCamposVaciosBuscar()) {
        Cliente c = new Cliente();
        c = cData.buscarClientePorDni(Long.parseLong(JTFdni.getText()));
        JTFnombre.setText(c.getNombre());
        JTFapellido.setText((c.getApellido()));
        JTFdomicilio.setText(c.getDomicilio());
        JTFid.setText(String.valueOf(c.getDni()));
        JTFcelular.setText(String.valueOf(c.getCelular()));
        
        } else  {
            JOptionPane.showMessageDialog(null, "Falta ingresar el dni para buscar.");
        }
        } catch (NumberFormatException | NullPointerException ex)  {
            JOptionPane.showMessageDialog(null, "El dni ingresado contiene caracteres o es invalido." );    
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        try {
        if (validarCamposVaciosAgregar()) {
            Cliente c = new Cliente();
            c.setNombre(JTFnombre.getText());
            c.setApellido((JTFapellido.getText()));
            c.setDni(Long.parseLong(JTFid.getText()));
            c.setCelular(Long.parseLong(JTFcelular.getText()));
            c.setDomicilio((JTFdomicilio.getText()));
            cData.guardarCliente(c);
        } else  {
            JOptionPane.showMessageDialog(null, "Faltan llenar campos");
        }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema revise los datos ingresados.");
        }
    }//GEN-LAST:event_jBagregarActionPerformed

    private void JBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBactualizarActionPerformed
        try {
        if (validarCamposVaciosActualizar()) {
        Cliente c = new Cliente();
        c.setNombre(JTFnombre.getText());
        c.setApellido((JTFapellido.getText()));
        c.setDomicilio(JTFdomicilio.getText());
        c.setCelular(Long.parseLong(JTFcelular.getText()));
        c.setDni(Long.parseLong(JTFid.getText()));
        c.setId(Integer.parseInt(JTFdni.getText()));
        cData.actualizarCliente(c);
        } else  {   
            JOptionPane.showMessageDialog(null, "Faltan llenar campos");
        }
        } catch (NumberFormatException ex)  {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema revise los datos ingresados. " + ex);
        }
    }//GEN-LAST:event_JBactualizarActionPerformed

    private void JBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimpiarActionPerformed
        JTFapellido.setText("");
        JTFnombre.setText("");
        JTFid.setText("");
        JTFdni.setText("");
        JTFcelular.setText("");
        JTFdomicilio.setText("");
    }//GEN-LAST:event_JBlimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBactualizar;
    private javax.swing.JButton JBlimpiar;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel JLnombre1;
    private javax.swing.JLabel JLnombre2;
    private javax.swing.JLabel JLnombre3;
    private javax.swing.JLabel JLnombre4;
    private javax.swing.JLabel JLnombre5;
    private javax.swing.JTextField JTFapellido;
    private javax.swing.JTextField JTFcelular;
    private javax.swing.JTextField JTFdni;
    private javax.swing.JTextField JTFdomicilio;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTextField JTFnombre;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
