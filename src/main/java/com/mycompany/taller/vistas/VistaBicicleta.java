/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.taller.vistas;

import com.mycompany.taller.entidades.Bicicleta;
import com.mycompany.taller.persistencia.Conexion;
import com.mycompany.taller.persistencia.BicicletaData;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.mycompany.taller.persistencia.ClienteData;
import com.mycompany.taller.entidades.Cliente;

/**
 *
 * @author ailen
 */
public class VistaBicicleta extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaBicicleta
     */
    Connection conexiondb = Conexion.getConexion();
    BicicletaData bData = new BicicletaData(conexiondb);

    private ClienteData cData;

    public VistaBicicleta() {
        initComponents();
        this.cData = new ClienteData(conexiondb);
    }

    //Validaciones  !!VER LA VALIDACION DE CLIENTE
    public boolean validarCamposVaciosBuscarID() {
        if (JTFid.getText().equals("")) {
            return false;
        }
        return true;
    }

    public boolean validarCamposVaciosAgregar() {
        if (JTFnroSerie.getText().equals("") || JTFmarca.getText().equals("") || JTFtipo.getText().equals("") || JTFcolor.getText().equals("")) {
            return false;
        }
        return true;
    }

    public boolean validarCamposVaciosBuscarNroSerie() {
        if (JTFnroSerie.getText().equals("")) {
            return false;
        }
        return true;
    }

    public boolean validarCamposVaciosActualizar() {
        if (JTFnroSerie.getText().equals("") || JTFmarca.getText().equals("") || JTFtipo.getText().equals("") || JTFcolor.getText().equals("")) {
            return false;
        }
        return true;
    }

    public boolean validarCamposVaciosBuscarCliente() {
        if (JTFcliente.getText().equals("")) {
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

        jPanel1 = new javax.swing.JPanel();
        JLnroSerie = new javax.swing.JLabel();
        JLmarca = new javax.swing.JLabel();
        JLcolor = new javax.swing.JLabel();
        JLcliente = new javax.swing.JLabel();
        JTFid = new javax.swing.JTextField();
        JTFnroSerie = new javax.swing.JTextField();
        JTFmarca = new javax.swing.JTextField();
        JTFtipo = new javax.swing.JTextField();
        JLtipo = new javax.swing.JLabel();
        JTFcolor = new javax.swing.JTextField();
        JLid = new javax.swing.JLabel();
        JTFcliente = new javax.swing.JTextField();
        JBagregar = new javax.swing.JButton();
        JBactualizar = new javax.swing.JButton();
        JBlimpiar = new javax.swing.JButton();
        JBbuscarNroSerie = new javax.swing.JButton();
        JBbucarDNI = new javax.swing.JButton();

        setClosable(true);
        setTitle("Gestion de Bicicletas");

        JLnroSerie.setText("N° de Serie");

        JLmarca.setText("Marca");

        JLcolor.setText("Color");

        JLcliente.setText("Cliente");

        JTFid.setEnabled(false);
        JTFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFidActionPerformed(evt);
            }
        });

        JTFnroSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFnroSerieActionPerformed(evt);
            }
        });

        JLtipo.setText("Tipo");

        JLid.setText("N° de Bicicleta");

        JBagregar.setText("Agregar");
        JBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBagregarActionPerformed(evt);
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

        JBbuscarNroSerie.setText("Buscar");
        JBbuscarNroSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarNroSerieActionPerformed(evt);
            }
        });

        JBbucarDNI.setText("Buscar");
        JBbucarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbucarDNIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLtipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLnroSerie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLid, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(JLmarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLcolor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFid)
                            .addComponent(JTFmarca)
                            .addComponent(JTFtipo)
                            .addComponent(JTFcolor)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JTFnroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JBbuscarNroSerie))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JTFcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JBbucarDNI)))
                                .addGap(0, 8, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JBlimpiar)
                        .addGap(65, 65, 65)
                        .addComponent(JBagregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBactualizar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLid)
                    .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFnroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLnroSerie)
                    .addComponent(JBbuscarNroSerie))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLmarca)
                    .addComponent(JTFmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLtipo)
                    .addComponent(JTFtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcolor)
                    .addComponent(JTFcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcliente)
                    .addComponent(JTFcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBbucarDNI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBagregar)
                    .addComponent(JBactualizar)
                    .addComponent(JBlimpiar))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFidActionPerformed

    private void JTFnroSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFnroSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnroSerieActionPerformed

    private void JBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimpiarActionPerformed
        // TODO add your handling code here:
        JTFid.setText("");
        JTFnroSerie.setText("");
        JTFmarca.setText("");
        JTFtipo.setText("");
        JTFcolor.setText("");
        JTFcliente.setText("");
    }//GEN-LAST:event_JBlimpiarActionPerformed

    // BOTON Buscar bicicleta
    private void JBbuscarNroSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarNroSerieActionPerformed

        // TODO add your handling code here:
        try {
            if (validarCamposVaciosBuscarNroSerie()) {
                Bicicleta b = new Bicicleta();

                b = bData.buscarBicicletaPorNroSerie(Long.parseLong(JTFnroSerie.getText()));

                JTFid.setText(String.valueOf(b.getId()));
                JTFmarca.setText(b.getMarca());
                JTFtipo.setText(b.getTipo());
                JTFcolor.setText(b.getColor());
                JTFcliente.setText(String.valueOf(bData.BuscarClienteporBicicleta(Long.parseLong(JTFnroSerie.getText())).getDni()));

            } else {
                JOptionPane.showMessageDialog(null, "Falta ingresar el nro de serie para buscar.");
            }
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "El nro de serie ingresado contiene caracteres o es invalido.");
        }

    }//GEN-LAST:event_JBbuscarNroSerieActionPerformed

//BUSCAR CLIENTE POR DNI
    private void JBbucarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbucarDNIActionPerformed
        // TODO add your handling code here:
        try {
            if (validarCamposVaciosBuscarCliente()) {
                Cliente c = new Cliente();
                c = cData.buscarClientePorDni(Long.parseLong(JTFcliente.getText()));
                
            } else {
                JOptionPane.showMessageDialog(null, "Falta ingresar el dni para buscar.");
            }
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "El dni ingresado contiene caracteres o no es cliente.");
        }

    }//GEN-LAST:event_JBbucarDNIActionPerformed

    private void JBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBagregarActionPerformed
        // TODO add your handling code here:
        
        try {
            if (validarCamposVaciosAgregar()) {
                Bicicleta b = new Bicicleta();
                //Cliente c = new Cliente();
               b.setNumero_serie(Long.parseLong(JTFnroSerie.getText()));
                b.setMarca(JTFmarca.getText());
                b.setTipo(JTFtipo.getText());
                b.setColor(JTFcolor.getText());
                b.setCliente(cData.buscarClientePorDni(Long.parseLong(JTFcliente.getText())));
                bData.guardarBicicleta(b);
            } else {
                JOptionPane.showMessageDialog(null, "Faltan llenar campos");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema revise los datos ingresados.");
        }
       
    }//GEN-LAST:event_JBagregarActionPerformed

    private void JBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBactualizarActionPerformed
        // TODO add your handling code here:
                try {
            if (validarCamposVaciosActualizar()) {
               Bicicleta b = new Bicicleta();
                //Cliente c = new Cliente();
               
                b.setNumero_serie(Long.parseLong(JTFnroSerie.getText()));
                b.setMarca(JTFmarca.getText());
                b.setTipo(JTFtipo.getText());
                b.setColor(JTFcolor.getText());
                b.setCliente(cData.buscarClientePorDni(Long.parseLong(JTFcliente.getText())));
                bData.actualizarBicicleta(b);
               
            } else {
                JOptionPane.showMessageDialog(null, "Faltan llenar campos");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema revise los datos ingresados. " + ex);
        }
        
    }//GEN-LAST:event_JBactualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBactualizar;
    private javax.swing.JButton JBagregar;
    private javax.swing.JButton JBbucarDNI;
    private javax.swing.JButton JBbuscarNroSerie;
    private javax.swing.JButton JBlimpiar;
    private javax.swing.JLabel JLcliente;
    private javax.swing.JLabel JLcolor;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLmarca;
    private javax.swing.JLabel JLnroSerie;
    private javax.swing.JLabel JLtipo;
    private javax.swing.JTextField JTFcliente;
    private javax.swing.JTextField JTFcolor;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTextField JTFmarca;
    private javax.swing.JTextField JTFnroSerie;
    private javax.swing.JTextField JTFtipo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
