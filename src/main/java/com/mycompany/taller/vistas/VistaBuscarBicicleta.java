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
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ailen
 */
public class VistaBuscarBicicleta extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaBicicleta
     */
    Connection conexiondb = Conexion.getConexion();
    BicicletaData bData = new BicicletaData(conexiondb);
    ClienteData cData = new ClienteData(conexiondb);
    List<Cliente> listaClientes;
    ArrayList<Bicicleta> listaBicicletas;
    private DefaultTableModel modeloTablaBicis;

    //private ClienteData cData;

    public VistaBuscarBicicleta() {
        initComponents();
        CargarClientes();
       modeloTablaBicis = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
       armarTablas();
      //  cargarTablas();
        JBactualizar.setEnabled(false);
    }

    //Validaciones  !!VER LA VALIDACION DE CLIENTE

public boolean validarCombo(){
    
    int index=JCBclientes.getSelectedIndex();
    if (index==-1){
        return false;
    }
    return true;
}
    //||JCBclientes.getSelectedItem().toString().equals("")
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

    /* public boolean validarCamposVaciosActualizar() {
        if (JTFnroSerie.getText().equals("") || JTFmarca.getText().equals("") || JTFtipo.getText().equals("") || JTFcolor.getText().equals("")) {
            return false;
        }
        return true;
    }

   public boolean validarCamposVaciosBuscarCliente() {
        if (JCBclientes.getSelectedItem()) {
            return false;
        }
        return true;
    }*/

  
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
        JLcolor = new javax.swing.JLabel();
        JLcliente = new javax.swing.JLabel();
        JTFnroSerie = new javax.swing.JTextField();
        JTFmarca = new javax.swing.JTextField();
        JTFtipo = new javax.swing.JTextField();
        JLtipo = new javax.swing.JLabel();
        JTFcolor = new javax.swing.JTextField();
        JCBclientes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        JLclienteActual = new javax.swing.JLabel();
        JTFclienteActual = new javax.swing.JTextField();
        JLmarca = new javax.swing.JLabel();
        JTFid = new javax.swing.JTextField();
        JLid = new javax.swing.JLabel();
        JBactualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTbicis = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        JTFnroSeriBuscar = new javax.swing.JTextField();
        JTFdni = new javax.swing.JTextField();
        JBbuscarNroSerie = new javax.swing.JButton();
        JBbuscarDni = new javax.swing.JButton();
        JBlimpiarTabla = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Buscar Bicicletas");

        JLnroSerie.setText("N° de Serie");

        JLcolor.setText("Color");

        JLcliente.setText("Lista Clientes");

        JTFnroSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFnroSerieActionPerformed(evt);
            }
        });

        JLtipo.setText("Tipo");

        JCBclientes.setToolTipText("");
        JCBclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBclientesActionPerformed(evt);
            }
        });

        jLabel4.setText("Actualizar Datos de Bicicleta");

        JLclienteActual.setText("Cliente Actual");

        JTFclienteActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFclienteActualActionPerformed(evt);
            }
        });

        JLmarca.setText("Marca");

        JTFid.setEditable(false);
        JTFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFidActionPerformed(evt);
            }
        });

        JLid.setText("N° de Bicicleta");

        JBactualizar.setText("Actualizar");
        JBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLclienteActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JLcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLtipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLcolor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLnroSerie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(JLmarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLid, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCBclientes, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTFmarca)
                            .addComponent(JTFtipo)
                            .addComponent(JTFcolor)
                            .addComponent(JTFnroSerie, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JTFclienteActual))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(JBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFnroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLnroSerie))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLmarca))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLcolor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFclienteActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLclienteActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(JBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        jLabel1.setText("Nro de Serie");

        jLabel2.setText("DNI Cliente");

        JTbicis.setModel(new javax.swing.table.DefaultTableModel(
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
        JTbicis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTbicisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTbicis);

        jLabel3.setText("Buscar Bicicleta/s por:");

        JTFnroSeriBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFnroSeriBuscarActionPerformed(evt);
            }
        });

        JBbuscarNroSerie.setText("Buscar");
        JBbuscarNroSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarNroSerieActionPerformed(evt);
            }
        });

        JBbuscarDni.setText("Buscar");
        JBbuscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarDniActionPerformed(evt);
            }
        });

        JBlimpiarTabla.setText("Limpiar tabla");
        JBlimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlimpiarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFdni, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(JTFnroSeriBuscar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBbuscarNroSerie, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JBbuscarDni, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(49, 49, 49))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(JBlimpiarTabla)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFnroSeriBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBbuscarNroSerie))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBbuscarDni))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBlimpiarTabla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFnroSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFnroSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnroSerieActionPerformed

    private void JCBclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBclientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBclientesActionPerformed

    private void JTFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFidActionPerformed

    private void JTFnroSeriBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFnroSeriBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnroSeriBuscarActionPerformed

    private void JBbuscarNroSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarNroSerieActionPerformed
        // TODO add your handling code here:
        JBlimpiarTabla.setEnabled(false);
         JBactualizar.setEnabled(true);
        JCBclientes.setEnabled(true);
        try { 
        Bicicleta b = bData.buscarBicicletaPorNroSerie(Integer.parseInt(JTFnroSeriBuscar.getText()));
         JTFid.setText(String.valueOf(b.getId()));
        JTFnroSerie.setText(String.valueOf(b.getNumero_serie()));
        JTFmarca.setText((String)b.getMarca());
        JTFtipo.setText((String)b.getTipo());
        JTFcolor.setText((String)b.getColor());
        JTFclienteActual.setText(String.valueOf(b.getCliente()));
        
        CargarClientes();
         } catch (Exception ex)  {
            JOptionPane.showMessageDialog(this, "No existe el nro de serie ingresado");
        }
        
    }//GEN-LAST:event_JBbuscarNroSerieActionPerformed

    private void JTFclienteActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFclienteActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFclienteActualActionPerformed

    private void JBlimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimpiarTablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBlimpiarTablaActionPerformed

    private void JTbicisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTbicisMouseClicked
        // TODO add your handling code here:
        
        JBactualizar.setEnabled(true);
        JCBclientes.setEnabled(true);
        int filaSeleccionada = JTbicis.getSelectedRow();
        JTFid.setText(String.valueOf(JTbicis.getValueAt(filaSeleccionada, 0)));
        JTFnroSerie.setText(String.valueOf(JTbicis.getValueAt(filaSeleccionada, 1)));
        JTFmarca.setText((String)JTbicis.getValueAt(filaSeleccionada, 2));
        JTFtipo.setText((String)JTbicis.getValueAt(filaSeleccionada, 3));
        JTFcolor.setText((String)JTbicis.getValueAt(filaSeleccionada, 4));
        JTFclienteActual.setText((String)JTbicis.getValueAt(filaSeleccionada, 5));
        
        CargarClientes();
    }//GEN-LAST:event_JTbicisMouseClicked

    private void JBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBactualizarActionPerformed
        // TODO add your handling code here:
        try { 
        Bicicleta b = new Bicicleta();
        int filaSeleccionada = JTbicis.getSelectedRow();
           
        b.setId(Integer.parseInt(JTFid.getText()));
        b.setNumero_serie(Long.parseLong(JTFnroSerie.getText()));
        b.setMarca(JTFmarca.getText());
        b.setTipo(JTFtipo.getText());
        b.setColor(JTFcolor.getText());
        
        if(JCBclientes.getSelectedIndex()== -1){
            
            b.setCliente(bData.BuscarClienteporBicicleta(Long.parseLong(JTFnroSeriBuscar.getText())));
            
            
            
        } else{

        b.setCliente((Cliente)JCBclientes.getSelectedItem());}

        bData.actualizarBicicleta(b);
        limpiarCampos();
        JBactualizar.setEnabled(false);
        
        
        cargarTablas();
        } catch (Exception ex)  {
            JOptionPane.showMessageDialog(this, "Los campos estan mal seteados.");
        }
        

                      
    }//GEN-LAST:event_JBactualizarActionPerformed

    private void JBbuscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarDniActionPerformed
        // TODO add your handling code here:
         try {
        cargarTablas();
        } catch (Exception ex)  {
            JOptionPane.showMessageDialog(this, "No existe un cliente con ese DNI");
        
    }//GEN-LAST:event_JBbuscarDniActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBactualizar;
    private javax.swing.JButton JBbuscarDni;
    private javax.swing.JButton JBbuscarNroSerie;
    private javax.swing.JButton JBlimpiarTabla;
    private javax.swing.JComboBox<Cliente> JCBclientes;
    private javax.swing.JLabel JLcliente;
    private javax.swing.JLabel JLclienteActual;
    private javax.swing.JLabel JLcolor;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLmarca;
    private javax.swing.JLabel JLnroSerie;
    private javax.swing.JLabel JLtipo;
    private javax.swing.JTextField JTFclienteActual;
    private javax.swing.JTextField JTFcolor;
    private javax.swing.JTextField JTFdni;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTextField JTFmarca;
    private javax.swing.JTextField JTFnroSeriBuscar;
    private javax.swing.JTextField JTFnroSerie;
    private javax.swing.JTextField JTFtipo;
    private javax.swing.JTable JTbicis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private void CargarClientes() {

          listaClientes = cData.listarClientes(false);

          for (Cliente aux : listaClientes) {

              JCBclientes.addItem(aux);
          }
          JCBclientes.setSelectedIndex(-1);

      }
   private void armarTablas() {
        ArrayList<Object> columnas = new ArrayList();
        columnas.add("id");
        columnas.add("N serie");
        columnas.add("Marca");
        columnas.add("Tipo");
        columnas.add("Color");
        columnas.add("Cliente");
        for (Object aux : columnas) {
            modeloTablaBicis.addColumn(aux);
            
        }
        JTbicis.setModel(modeloTablaBicis);
        JTbicis.getColumnModel().getColumn(0).setMaxWidth(0);
        JTbicis.getColumnModel().getColumn(0).setMinWidth(0);
        JTbicis.getColumnModel().getColumn(0).setPreferredWidth(0);

       
    }

    /*private void cargarTablas() {
        modeloTablaBicis.setNumRows(0);
        
        
        listaBicicletas = bData.listarBicicletas(false);
        
        
        for (Bicicleta aux : listaBicicletas) {
            modeloTablaBicis.addRow(new Object[] {aux.getId(), aux.getNumero_serie(), aux.getMarca(), aux.getTipo(), aux.getColor(), aux.getCliente().toString()});
                    
        }
        
        
        
    }*/
    private void cargarTablas() {
        modeloTablaBicis.setNumRows(0);
        
        
        
        listaBicicletas = bData.buscarBicicletaPorCliente(Integer.parseInt(JTFdni.getText()));
        
        
        for (Bicicleta aux : listaBicicletas) {
            modeloTablaBicis.addRow(new Object[] {aux.getId(), aux.getNumero_serie(), aux.getMarca(), aux.getTipo(), aux.getColor(), aux.getCliente().toString()});
                    
        }
        
        
        
    }

    private void limpiarCampos() {
        JTFid.setText("");
        JTFnroSerie.setText("");
        JTFmarca.setText("");
        JTFtipo.setText("");
        JTFcolor.setText("");
        JTFclienteActual.setText("");
        JCBclientes.setSelectedIndex(-1);
        JCBclientes.setEnabled(false);

    }
}
