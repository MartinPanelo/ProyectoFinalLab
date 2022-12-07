/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.taller.vistas;

import com.mycompany.taller.entidades.Bicicleta;
import com.mycompany.taller.entidades.Cliente;
import com.mycompany.taller.entidades.Item_detalle;
import com.mycompany.taller.entidades.Reparacion;
import com.mycompany.taller.entidades.Repuesto;
import com.mycompany.taller.entidades.Servicio;
import com.mycompany.taller.persistencia.BicicletaData;
import com.mycompany.taller.persistencia.ClienteData;
import com.mycompany.taller.persistencia.Conexion;
import com.mycompany.taller.persistencia.Item_detalleData;
import com.mycompany.taller.persistencia.ReparacionData;
import com.mycompany.taller.persistencia.RepuestoData;
import com.mycompany.taller.persistencia.ServicioData;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ezequ
 */
public class VistaReparacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaReparacion
     */
    Connection conexiondb = Conexion.getConexion();
    ReparacionData reData = new ReparacionData(conexiondb);
    ClienteData cData = new ClienteData(conexiondb);
    BicicletaData bData = new BicicletaData(conexiondb);
    ServicioData sData = new ServicioData(conexiondb);
    RepuestoData rData = new RepuestoData(conexiondb);
    Item_detalleData idata = new Item_detalleData(conexiondb);
    List<Cliente> listaClientes;
    List<Bicicleta> listaBicicletas;
    List<Servicio> listaServicios;
    List<Repuesto> listaRepuestos;
    private DefaultTableModel modeloTablaRepuestos;

    public VistaReparacion() {
        initComponents();
        CargarClientes();
        CargarServicios();

        modeloTablaRepuestos = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 1 || column == 2;
            }

            @Override
            public Class getColumnClass(int columnIndex) {
                if (columnIndex == 1) {
                    return Boolean.class;
                }
                return String.class;
            }

        };

        armarTablas();
        cargarServicios();
        JBagregar.setEnabled(false);
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
        JLcliente = new javax.swing.JLabel();
        JLservicio = new javax.swing.JLabel();
        JLpreciofinal = new javax.swing.JLabel();
        JLfechadeentrada = new javax.swing.JLabel();
        JCBservicio = new javax.swing.JComboBox<>();
        JTFpreciofinal = new javax.swing.JTextField();
        JDCfechadeentrada = new com.toedter.calendar.JDateChooser();
        JLbicicleta = new javax.swing.JLabel();
        JCBbicicleta = new javax.swing.JComboBox<>();
        jCBclientes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        JBagregar = new javax.swing.JButton();
        JCBestado = new javax.swing.JCheckBox();
        JLfechadeentrada1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTRepuestos = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jBTNcalcularPrecioFinal = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Gestión de reparación", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Constantia", 0, 16))); // NOI18N

        JLcliente.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        JLcliente.setText("Cliente");

        JLservicio.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        JLservicio.setText("Servicio");

        JLpreciofinal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JLpreciofinal.setText("Precio final");

        JLfechadeentrada.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        JLfechadeentrada.setText("Fecha de entrada");

        JCBservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBservicioActionPerformed(evt);
            }
        });

        JTFpreciofinal.setEditable(false);
        JTFpreciofinal.setEnabled(false);
        JTFpreciofinal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JTFpreciofinalMouseMoved(evt);
            }
        });

        JLbicicleta.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        JLbicicleta.setText("Bicicleta");

        jCBclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBclientesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel4.setText("Estado");

        JBagregar.setText("Agregar");
        JBagregar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JBagregarFocusLost(evt);
            }
        });
        JBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBagregarActionPerformed(evt);
            }
        });

        JLfechadeentrada1.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        JLfechadeentrada1.setText("Repuestos");

        jTRepuestos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTRepuestos);

        jBTNcalcularPrecioFinal.setText("Calcular precio Final");
        jBTNcalcularPrecioFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNcalcularPrecioFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(JBagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLfechadeentrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDCfechadeentrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCBestado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JLpreciofinal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFpreciofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jBTNcalcularPrecioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JLfechadeentrada1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLservicio)
                            .addComponent(JLbicicleta)
                            .addComponent(JLcliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBclientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JCBbicicleta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JCBservicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcliente)
                    .addComponent(jCBclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLbicicleta)
                    .addComponent(JCBbicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLservicio)
                    .addComponent(JCBservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLfechadeentrada, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JDCfechadeentrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JLfechadeentrada1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLpreciofinal)
                    .addComponent(JTFpreciofinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTNcalcularPrecioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(JCBestado))
                .addGap(4, 4, 4)
                .addComponent(JBagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBclientesActionPerformed

        JCBbicicleta.removeAllItems();
        listaBicicletas = bData.buscarBicicletaPorCliente(((Cliente) jCBclientes.getSelectedItem()).getId());

        for (Bicicleta aux : listaBicicletas) {
            JCBbicicleta.addItem(aux);
        }

    }//GEN-LAST:event_jCBclientesActionPerformed

    private void JCBservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBservicioActionPerformed

    }//GEN-LAST:event_JCBservicioActionPerformed

    private void JBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBagregarActionPerformed
        try {
            Reparacion unaReparacion = new Reparacion();

            unaReparacion.setBiclicleta((Bicicleta) JCBbicicleta.getSelectedItem());
            unaReparacion.setServicio((Servicio) JCBservicio.getSelectedItem());
            unaReparacion.setEstado(JCBestado.isSelected());
            unaReparacion.setFecha_entrada(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(JDCfechadeentrada.getDate())));
            unaReparacion.setPrecio_final(precioFinal());
            unaReparacion.setBorrado(false);

            reData.crearReparacion(unaReparacion);
//            System.out.println(unaReparacion.getBiclicleta().toString());
//            System.out.println(unaReparacion.getServicio().toString());
//            
//            System.out.println((reData.buscarReparacionPorBicicletaYServicio(unaReparacion.getBiclicleta(), unaReparacion.getServicio()).toString()));

            CrearItems_Detalles(unaReparacion);

            //      System.out.println(unaReparacion.toString());
        } catch (NullPointerException err) {// lo produce el campo vacio del calendario
            JOptionPane.showMessageDialog(this, "El campo fecha de entrega no se permite vacio");
        }


    }//GEN-LAST:event_JBagregarActionPerformed

    private void JTFpreciofinalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFpreciofinalMouseMoved


    }//GEN-LAST:event_JTFpreciofinalMouseMoved

    private void jBTNcalcularPrecioFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNcalcularPrecioFinalActionPerformed
        try {
            JBagregar.setEnabled(true);
            JTFpreciofinal.setText(String.valueOf(precioFinal()));
            JBagregar.requestFocus();
        } catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(this, "El valor ingresado no es un numero entero");
            JBagregar.setEnabled(false);
        }

    }//GEN-LAST:event_jBTNcalcularPrecioFinalActionPerformed

    private void JBagregarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JBagregarFocusLost
        JBagregar.setEnabled(false);
    }//GEN-LAST:event_JBagregarFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBagregar;
    private javax.swing.JComboBox<Bicicleta> JCBbicicleta;
    private javax.swing.JCheckBox JCBestado;
    private javax.swing.JComboBox<Servicio> JCBservicio;
    private com.toedter.calendar.JDateChooser JDCfechadeentrada;
    private javax.swing.JLabel JLbicicleta;
    private javax.swing.JLabel JLcliente;
    private javax.swing.JLabel JLfechadeentrada;
    private javax.swing.JLabel JLfechadeentrada1;
    private javax.swing.JLabel JLpreciofinal;
    private javax.swing.JLabel JLservicio;
    private javax.swing.JTextField JTFpreciofinal;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jBTNcalcularPrecioFinal;
    private javax.swing.JComboBox<Cliente> jCBclientes;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTRepuestos;
    // End of variables declaration//GEN-END:variables

    private void CargarClientes() {

        listaClientes = cData.listarClientes(false);

        for (Cliente aux : listaClientes) {

            jCBclientes.addItem(aux);
        }

    }

    private void CargarServicios() {

        listaServicios = sData.listarServicios(false);

        for (Servicio aux : listaServicios) {

            JCBservicio.addItem(aux);
        }

    }

    private void armarTablas() {

        ArrayList<Object> columnas = new ArrayList();
        columnas.add("id");
        columnas.add("usar en reparacion");
        columnas.add("cantidad");
        columnas.add("Nombre");
        columnas.add("Descripcion");
        columnas.add("Precio");
        for (Object aux : columnas) {
            modeloTablaRepuestos.addColumn(aux);

        }

        jTRepuestos.setModel(modeloTablaRepuestos);
        jTRepuestos.getColumnModel().getColumn(0).setMaxWidth(0);
        jTRepuestos.getColumnModel().getColumn(0).setMinWidth(0);
        jTRepuestos.getColumnModel().getColumn(0).setPreferredWidth(0);

     //   jTRepuestos.setModel(modeloTablaRepuestos);

    }

    private void cargarServicios() {

        modeloTablaRepuestos.setNumRows(0);

        listaRepuestos = rData.listarRepuestos(false);

        for (Repuesto aux : listaRepuestos) {

            modeloTablaRepuestos.addRow(new Object[]{aux.getId(), false, "0", aux.getNombre(), aux.getDescripcion(), aux.getPrecio()});

        }

    }

    private double precioFinal() {
        double preciofinal = 0;

        preciofinal = ((Servicio) JCBservicio.getSelectedItem()).getCosto();

        for (int i = 0; i < jTRepuestos.getRowCount(); i++) {

            if ((Boolean) (jTRepuestos.getValueAt(i, 1))) {

                if (Double.parseDouble((String) jTRepuestos.getValueAt(i, 2)) == (int) Double.parseDouble((String) jTRepuestos.getValueAt(i, 2))) {
                    preciofinal += ((Double) jTRepuestos.getValueAt(i, 5)) * Double.parseDouble((String) jTRepuestos.getValueAt(i, 2));
                } else {
                    JOptionPane.showMessageDialog(this, "Erorr el la fila : " + i + " La cantidad tiene que ser un valor entero");
                    JBagregar.setEnabled(false);
                }

            }

        }
        preciofinal += preciofinal * 0.15;

        return preciofinal;
    }

    private void CrearItems_Detalles(Reparacion r) {

        for (int i = 0; i < jTRepuestos.getRowCount(); i++) {

            if ((Boolean) (jTRepuestos.getValueAt(i, 1))) {

                Item_detalle item = new Item_detalle();

                item.setReparacion(r);
                item.setRepuesto(rData.buscarRepuestoPorID((Integer)jTRepuestos.getValueAt(i, 0)));
                item.setCantidad(Integer.parseInt((String)jTRepuestos.getValueAt(i, 2)));
                item.setSuma_precios(((Double) jTRepuestos.getValueAt(i, 5)) * Double.parseDouble((String) jTRepuestos.getValueAt(i, 2)) );
                idata.guardarItem_detalle(item);

            }

        }

    }
}
