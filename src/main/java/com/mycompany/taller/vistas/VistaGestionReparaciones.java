/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.taller.vistas;

import com.mycompany.taller.entidades.Bicicleta;
import com.mycompany.taller.entidades.Item_detalle;
import com.mycompany.taller.entidades.Reparacion;
import com.mycompany.taller.entidades.Servicio;
import com.mycompany.taller.persistencia.Conexion;
import com.mycompany.taller.persistencia.Item_detalleData;
import com.mycompany.taller.persistencia.ReparacionData;
import com.mycompany.taller.persistencia.ServicioData;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author martin
 */
public class VistaGestionReparaciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaGestionReparaciones
     */
    Connection conexiondb = Conexion.getConexion();
    ReparacionData reData = new ReparacionData(conexiondb);
    Item_detalleData idata = new Item_detalleData(conexiondb);
    ServicioData sData = new ServicioData(conexiondb);
    private DefaultTableModel modeloTablaReparacionesTerminadas;
    private DefaultTableModel modeloTablaReparacionesNoTerminadas;
    private DefaultTableModel modeloTablaDetallesReparacion;
    List<Reparacion> listaReparaciones;
    List<Reparacion> listaNoReparaciones;
    List<Item_detalle> listaItem_detalles;

    public VistaGestionReparaciones() {
        initComponents();
        modeloTablaReparacionesTerminadas = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modeloTablaReparacionesNoTerminadas = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modeloTablaDetallesReparacion = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        armarTablas();
        cargarTablaReparadas();
        cargarTablaNoReparadas();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTreparacionesBaja = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTreparacionesAlta = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLServicioAplicado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTdetalleReparacion = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLCostoTotal = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Gestoin de reparaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 18))); // NOI18N

        jTreparacionesBaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTreparacionesBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreparacionesBajaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTreparacionesBaja);

        jTreparacionesAlta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTreparacionesAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreparacionesAltaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTreparacionesAlta);

        jButton1.setText("Mover a terminadas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Reparaciones no terminadas");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Reparaciones terminadas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(90, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Detalles", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 18))); // NOI18N

        jLServicioAplicado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLServicioAplicado.setText("aaaaaaaaaaaaaaaaaaa");
        jLServicioAplicado.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Servicio aplicado");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Repuestos que se usaron");

        jTdetalleReparacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTdetalleReparacion);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Costo total :");

        jLCostoTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLCostoTotal.setText("Costo Tota");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLServicioAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLCostoTotal))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLServicioAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLCostoTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int filaSelecionada = jTreparacionesBaja.getSelectedRow();

        if (filaSelecionada != -1) {
            // System.out.println((Integer) jTreparacionesBaja.getValueAt(filaSelecionada, 0));
            reData.FinalizarReparacion((Integer) jTreparacionesBaja.getValueAt(filaSelecionada, 0));
            cargarTablaReparadas();
            cargarTablaNoReparadas();

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un servicio para dar de baja");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTreparacionesBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreparacionesBajaMouseClicked
       
        jTreparacionesAlta.clearSelection();
        detallesDeLaReparacion();
    }//GEN-LAST:event_jTreparacionesBajaMouseClicked

    private void jTreparacionesAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreparacionesAltaMouseClicked
       jTreparacionesBaja.clearSelection();
        detallesDeLaReparacion();
        
    }//GEN-LAST:event_jTreparacionesAltaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLCostoTotal;
    private javax.swing.JLabel jLServicioAplicado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTdetalleReparacion;
    private javax.swing.JTable jTreparacionesAlta;
    private javax.swing.JTable jTreparacionesBaja;
    // End of variables declaration//GEN-END:variables

    private void armarTablas() {

        ArrayList<Object> columnas = new ArrayList();
        columnas.add("id");
        columnas.add("N serie");
        columnas.add("tipo");
        columnas.add("Apellido Cliente");
        columnas.add("DNI del cliente");
        for (Object aux : columnas) {
            modeloTablaReparacionesTerminadas.addColumn(aux);
            modeloTablaReparacionesNoTerminadas.addColumn(aux);
        }
        jTreparacionesAlta.setModel(modeloTablaReparacionesTerminadas);
        jTreparacionesAlta.getColumnModel().getColumn(0).setMaxWidth(0);
        jTreparacionesAlta.getColumnModel().getColumn(0).setMinWidth(0);
        jTreparacionesAlta.getColumnModel().getColumn(0).setPreferredWidth(0);

        jTreparacionesBaja.setModel(modeloTablaReparacionesNoTerminadas);
        jTreparacionesBaja.getColumnModel().getColumn(0).setMaxWidth(0);
        jTreparacionesBaja.getColumnModel().getColumn(0).setMinWidth(0);
        jTreparacionesBaja.getColumnModel().getColumn(0).setPreferredWidth(0);

        ArrayList<Object> columnasDetalles = new ArrayList();
        columnasDetalles.add("Cantidad");
        columnasDetalles.add("Nombre");
        columnasDetalles.add("Precio");
       
        for (Object aux : columnasDetalles) {
            modeloTablaDetallesReparacion.addColumn(aux);
           
        }
        jTdetalleReparacion.setModel(modeloTablaDetallesReparacion);
    }

    private void cargarTablaReparadas() {

        modeloTablaReparacionesTerminadas.setNumRows(0);

        listaReparaciones = reData.buscarReparacionesPorEstado(true);

        for (Reparacion aux : listaReparaciones) {

            modeloTablaReparacionesTerminadas.addRow(new Object[]{aux.getId(), aux.getBiclicleta().getNumero_serie(), aux.getBiclicleta().getTipo(), aux.getBiclicleta().getCliente().getApellido(), aux.getBiclicleta().getCliente().getDni()});

        }

    }

    private void cargarTablaNoReparadas() {

        modeloTablaReparacionesNoTerminadas.setNumRows(0);

        listaNoReparaciones = reData.buscarReparacionesPorEstado(false);

        for (Reparacion aux : listaNoReparaciones) {

            modeloTablaReparacionesNoTerminadas.addRow(new Object[]{aux.getId(), aux.getBiclicleta().getNumero_serie(), aux.getBiclicleta().getTipo(), aux.getBiclicleta().getCliente().getApellido(), aux.getBiclicleta().getCliente().getDni(), aux.getPrecio_final()});

        }

    }

    private void detallesDeLaReparacion() {

        Reparacion r;
        if(jTreparacionesBaja.getSelectedRow() != -1){
            r = reData.buscarReparacionPorID(((Integer) jTreparacionesBaja.getValueAt(jTreparacionesBaja.getSelectedRow(), 0)));
        }else{
            r = reData.buscarReparacionPorID(((Integer) jTreparacionesAlta.getValueAt(jTreparacionesAlta.getSelectedRow(), 0)));
        }
        Servicio s = sData.buscarServicioPorID(r.getServicio().getId());

        jLServicioAplicado.setText(s.getDescripcion());

        jLCostoTotal.setText(String.valueOf(r.getPrecio_final()));
        
        
        cargarTablaDetalle();
        
        
 
   }
    
        private void cargarTablaDetalle() {

        modeloTablaDetallesReparacion.setNumRows(0);

         if(jTreparacionesBaja.getSelectedRow() != -1){
             listaItem_detalles = idata.listarItem_DetallePorIdReparacion((Integer)jTreparacionesBaja.getValueAt(jTreparacionesBaja.getSelectedRow(), 0));
         }else{
             listaItem_detalles = idata.listarItem_DetallePorIdReparacion((Integer)jTreparacionesAlta.getValueAt(jTreparacionesAlta.getSelectedRow(), 0));
         }
         
        

        for (Item_detalle aux : listaItem_detalles) {

            modeloTablaDetallesReparacion.addRow(new Object[]{aux.getCantidad(),aux.getRepuesto().getNombre(),aux.getSuma_precios()});

        }

    }

}
