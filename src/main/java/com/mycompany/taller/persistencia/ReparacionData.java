/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.persistencia;

import com.mycompany.taller.entidades.Bicicleta;
import com.mycompany.taller.entidades.Reparacion;
import com.mycompany.taller.entidades.Servicio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ezequ
 */
public class ReparacionData {
    
    
    
    private Connection conexionData;
    private BicicletaData bData;
    private ServicioData sData;
    private ClienteData cData;

    public ReparacionData(Connection connection) {
        this.conexionData = connection;
        this.bData = new BicicletaData(connection);
        this.sData = new ServicioData(connection);
        this.cData = new ClienteData(connection);
    }
    
    public void crearReparacion(Reparacion reparacion) {

        String query = "INSERT INTO reparacion(id_bicicleta, id_servicio, estado, precio_final, fecha_entrada, borrado) VALUES (?, ?, ?, ?, ?, false)";
        try {
            PreparedStatement ps = conexionData.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reparacion.getBiclicleta().getId());
            ps.setInt(2, reparacion.getServicio().getId());
            ps.setBoolean(3, reparacion.isEstado());
            ps.setDouble(4, reparacion.getPrecio_final()); // precio del servicio + precio total de repuestos + 15% sobre el total
            ps.setDate(5, Date.valueOf(reparacion.getFecha_entrada()));
         //   ps.setBoolean(6, reparacion.isBorrado());
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Nueva reparación creada");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear la reparación");
            }
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                reparacion.setId(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener ID");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error tratando de crear la reparación. " + ex);
        }

    }
    
    public Reparacion buscarReparacionPorID(int id) {
        Reparacion r = null;
        String sql = "SELECT * FROM reparacion WHERE id = ?";
        try {
            PreparedStatement ps = conexionData.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                r = new Reparacion();
                r.setId(rs.getInt("id"));
                r.setBiclicleta(bData.buscarBicicletaPorID(rs.getInt("id_bicicleta")));
                r.setServicio(sData.buscarServicioPorID(rs.getInt("id_servicio")));
                r.setEstado(rs.getBoolean("estado"));
                r.setPrecio_final(rs.getDouble("precio_final"));
                r.setFecha_entrada(rs.getDate("fecha_entrada").toLocalDate());
                r.setBorrado(rs.getBoolean("borrado"));

            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error. al buscar una reparacion por id. "+ex);
        }

        return r;
    }
    
    public void actualizarReparacion(Reparacion r) {
        String sqlQuery = "UPDATE reparacion SET id_bicicleta= ? ,id_servicio= ? ,estado= ?, precio_final= ?, fecha_entrada= ? WHERE id = ?";
            if (buscarReparacionPorID(r.getId()) != null) {
            try {
            PreparedStatement ps = conexionData.prepareStatement(sqlQuery);
            ps.setInt(1, r.getBiclicleta().getId());
            ps.setInt(2, r.getServicio().getId());
            ps.setBoolean(3, r.isEstado());
            ps.setDouble(4, r.getPrecio_final()); // precio del servicio + precio total de repuestos + 15% sobre el total
            ps.setDate(5, Date.valueOf(r.getFecha_entrada()));
              
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se pudo actualizar la reparación.");
            } else  {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la reparación.");
            }
            
            ps.close();
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error. tratando de actualizar una reparación" + ex);
        }  
            }
            
    }
    
    public void FinalizarReparacion(int id) {
        String sqlQuery = "UPDATE reparacion SET estado= true WHERE id = ?";
            
            try {
            PreparedStatement ps = conexionData.prepareStatement(sqlQuery);
            ps.setInt(1, id);
           
              
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se pudo finalizar la reparación.");
            } else  {
                JOptionPane.showMessageDialog(null, "No se pudo finalizar la reparación.");
            }
            
            ps.close();
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error. tratando de finalizar una reparación" + ex);
        }  
            
            
    }
    
    
    public HashSet<Reparacion> listarReparaciones() {

        HashSet<Reparacion> listaR = new HashSet();

        String sql = "SELECT * FROM reparacion WHERE borrado= false";

        try {
            PreparedStatement ps = conexionData.prepareStatement(sql);           
     

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Reparacion r = new Reparacion();

                r.setId(rs.getInt("id"));
                r.setBiclicleta(bData.buscarBicicletaPorID(rs.getInt("id_bicicleta")));
                r.setServicio(sData.buscarServicioPorID(rs.getInt("id_servicio")));
                r.setEstado(rs.getBoolean("estado"));
                r.setPrecio_final(rs.getDouble("precio_final"));
                r.setFecha_entrada(rs.getDate("fecha_entrada").toLocalDate());
                r.setBorrado(rs.getBoolean("borrado"));

                listaR.add(r);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al obtener la lista de reparaciónes "+ex);
        }
        return listaR;
    }
    
    public void borrarReparacion (int id){
        String sql="UPDATE reparacion SET borrado= true WHERE id = ?";
        try {
            PreparedStatement ps=conexionData.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            if (ps.executeUpdate() <= 0) {
                JOptionPane.showMessageDialog(null, "No se borro la reparación");
            } else  {   
                JOptionPane.showMessageDialog(null, "Se borro reparación correctamente");
            }
         
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de tipo exception " + ex);
        }
    }
    
    
    public HashSet<Bicicleta> buscarBicicletasPorServicio(int id_servicio) {

        HashSet<Bicicleta> bicicletasPorServicio = new HashSet();

        String sql = "SELECT id_bicicleta FROM reparacion WHERE id_servicio = ?";

        try {
            PreparedStatement ps = conexionData.prepareStatement(sql);
            
            ps.setInt(1, id_servicio); 

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Bicicleta bici = bData.buscarBicicletaPorID(rs.getInt("id_bicicleta"));
                
                bicicletasPorServicio.add(bici);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al obtener la lista de bicicletas por servicio "+ex);
        }
        return bicicletasPorServicio;
    }
    
    public HashSet<Bicicleta> buscarBicicletasPorFecha(LocalDate fecha) {

        HashSet<Bicicleta> bicicletasPorFecha = new HashSet();

        String sql = "SELECT id_bicicleta FROM `reparacion` WHERE fecha_entrada = ?";

        try {
            PreparedStatement ps = conexionData.prepareStatement(sql);
            
            ps.setDate(1, Date.valueOf(fecha)); 

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Bicicleta bici = bData.buscarBicicletaPorID(rs.getInt("id_bicicleta"));
                
                bicicletasPorFecha.add(bici);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al obtener la lista de bicicletas por fecha "+ex);
        }
        return bicicletasPorFecha;
    }
    
    public ArrayList<Bicicleta> buscarBicicletasPorEstado(Boolean estado) {

        ArrayList<Bicicleta> bicicletasPorEstado = new ArrayList();

        String sql = "SELECT id_bicicleta FROM `reparacion` WHERE estado = ?";

        try {
            PreparedStatement ps = conexionData.prepareStatement(sql);
            
            ps.setBoolean(1, estado); 

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Bicicleta bici = bData.buscarBicicletaPorID(rs.getInt("id_bicicleta"));
                
                bicicletasPorEstado.add(bici);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al obtener la lista de bicicletas por estado "+ex);
        }
        return bicicletasPorEstado;
    }
        public ArrayList<Reparacion> buscarReparacionesPorEstado(Boolean estado) {

        ArrayList<Reparacion> reparacionesPorEstado = new ArrayList();

        String sql = "SELECT * FROM `reparacion` WHERE estado = ? AND borrado = false";

        try {
            PreparedStatement ps = conexionData.prepareStatement(sql);
            
            ps.setBoolean(1, estado); 

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                Reparacion r = new Reparacion();

                r.setId(rs.getInt("id"));
                r.setBiclicleta(bData.buscarBicicletaPorID(rs.getInt("id_bicicleta")));
                r.setServicio(sData.buscarServicioPorID(rs.getInt("id_servicio")));
                r.setEstado(rs.getBoolean("estado"));
                r.setPrecio_final(rs.getDouble("precio_final"));
                r.setFecha_entrada(rs.getDate("fecha_entrada").toLocalDate());
                r.setBorrado(rs.getBoolean("borrado"));
                
                reparacionesPorEstado.add(r);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al obtener la lista de reparaciones por estado "+ex);
        }
        return reparacionesPorEstado;
    }
    
    public Reparacion buscarReparacionPorBicicletaYServicio(Bicicleta bici, Servicio servi) {
        Reparacion r = null;
        String sql = "SELECT * FROM reparacion WHERE id_bicicleta = ? AND id_servicio = ?";
        try {
            PreparedStatement ps = conexionData.prepareStatement(sql);
            ps.setObject(1, bici.getId());
            ps.setObject(2, servi.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                r = new Reparacion();
                r.setId(rs.getInt("id"));
                r.setBiclicleta(bData.buscarBicicletaPorID(rs.getInt("id_bicicleta")));
                r.setServicio(sData.buscarServicioPorID(rs.getInt("id_servicio")));
                r.setEstado(rs.getBoolean("estado"));
                r.setPrecio_final(rs.getDouble("precio_final"));
                r.setFecha_entrada(rs.getDate("fecha_entrada").toLocalDate());
                r.setBorrado(rs.getBoolean("borrado"));

            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error. al buscar una reparacion por bicicleta y servicio. "+ex);
        }

        return r;
    }
      
}
