/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.persistencia;

import com.mycompany.taller.entidades.Bicicleta;
import com.mycompany.taller.entidades.Cliente;
//import com.mycompany.taller.entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ailen
 */
public class BicicletaData {
     private Connection conexionData;
     private ClienteData cData;
    
    public BicicletaData (Connection connection){
        this.conexionData = connection;
        this.cData= new ClienteData(connection);
    }
    
    public void guardarBicicleta (Bicicleta bici){
        String query = "INSERT INTO `bicicleta`(numero_serie, marca, tipo, color, id_cliente, borrado) VALUES (?,?,?,?,?,false)";
        
        try {
            PreparedStatement ps = conexionData.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            ps.setLong(1, bici.getNumero_serie());
            ps.setString(2, bici.getMarca());
            ps.setString(3, bici.getTipo());
            ps.setString(4, bici.getColor());
            ps.setInt(5, bici.getCliente().getId());// Corroborar que sea el id lo que corresponde
           // ps.setBoolean(6, bici.getBorrado());
            
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null,"Bicicleta agregada");
            } else {
                JOptionPane.showMessageDialog(null, "Bicicleta no agregada");
            }
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                bici.setId(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener ID de la bicicleta");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error. en agregar bicicleta"+ex);
        }
    }
    
    
        public Bicicleta buscarBicicletaPorID(int id) {
        Bicicleta bici = null;
        String sql = "SELECT * FROM bicicleta WHERE id = ?";
        try {
            PreparedStatement ps = conexionData.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                bici = new Bicicleta();
                bici.setId(rs.getInt("id"));
                bici.setNumero_serie(rs.getLong("numero_serie"));
                bici.setMarca(rs.getString("marca"));
                bici.setTipo(rs.getString("tipo"));
                bici.setColor(rs.getString("color"));
                bici.setCliente(cData.buscarCliente(rs.getInt("id_cliente")));
                bici.setBorrado(rs.getBoolean("borrado"));
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error. en buscar bicicleta por id."+ex);
        }

        return bici;
    }
        // actualizar bicicleta
         public void actualizarBicicleta(Bicicleta bici) {
        String sqlQuery = "UPDATE bicicleta SET numero_serie= ? ,marca = ? ,tipo= ? ,color= ? ,id_cliente= ? WHERE id = ?";
            if (buscarBicicletaPorID(bici.getId()) != null) {
            try {
            PreparedStatement ps = conexionData.prepareStatement(sqlQuery);
            ps.setLong(1, bici.getNumero_serie());
            ps.setString(2, bici.getMarca());
            ps.setString(3, bici.getTipo());
            ps.setString(4, bici.getColor());
            ps.setInt(5, bici.getCliente().getId());
            ps.setInt(6, bici.getId());
           // ps.setBoolean(7, bici.getBorrado()); //  los chicos tienen is? preguntar
           
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se pudo actualizar la bicicleta.");
            } else  {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la bicicleta.");
            }
            
            ps.close();
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error. en actualizar bicicleta"+ex);
        }  
            }
            
        }
        // listar bicicleta
        public ArrayList<Bicicleta> listarBicicletas(boolean estadito) {

        ArrayList<Bicicleta> listaBici = new ArrayList();
       
        String sql = "SELECT * FROM bicicleta WHERE borrado= ?";

        try {
            PreparedStatement ps = conexionData.prepareStatement(sql);
            
            ps.setBoolean(1, estadito); //Estadito igual true me va atraer los que estan borrados y si es igual a false trae los que no estan borrados

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Bicicleta bici = new Bicicleta();

                bici.setId(rs.getInt("id"));
                bici.setMarca(rs.getString("marca"));
                bici.setTipo(rs.getString("tipo"));
                bici.setColor(rs.getString("color"));
                bici.setNumero_serie(rs.getLong("numero_serie"));
                bici.setBorrado(rs.getBoolean("borrado"));
                bici.setCliente(cData.buscarCliente(rs.getInt("id_cliente")));

                listaBici.add(bici);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al obtener la lista de bicicletas " + ex);
        }
        return listaBici;
    }
        
      public void darDeBajaBicicleta (int id){
        String sql="UPDATE bicicleta SET borrado= true WHERE id = ?";
        try {
            PreparedStatement ps=conexionData.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            if (ps.executeUpdate() <= 0) {
                JOptionPane.showMessageDialog(null, "No se pudo dar de baja a la bicicleta");
            } else  {   
                JOptionPane.showMessageDialog(null, "Se dio de baja a la bicicleta correctamente");
            }
         
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de tipo exception " + ex);
        }
    }
    
    public void darDeAltaBicicleta (int id){
        String sql="UPDATE bicicleta SET borrado= false WHERE id = ?";
        try {
            PreparedStatement ps=conexionData.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            if (ps.executeUpdate() <= 0) {
                JOptionPane.showMessageDialog(null, "No se pudo dar de alta a la bicicleta");
            } else  {   
                JOptionPane.showMessageDialog(null, "Se dio de alta a la bicicleta correctamente");
            }
         
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de tipo exception " + ex);
        }
    }
    
    public ArrayList<Bicicleta> buscarBicicletaPorCliente(int id_cliente) {

        ArrayList<Bicicleta> buscarBicicletaPorCliente = new ArrayList();
       
        String sql = "SELECT * FROM bicicleta WHERE id_cliente = ? AND borrado= false";

        try {
            PreparedStatement ps = conexionData.prepareStatement(sql);
            
            ps.setInt(1, id_cliente);
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Bicicleta bici = new Bicicleta();

                bici.setId(rs.getInt("id"));
                bici.setMarca(rs.getString("marca"));
                bici.setTipo(rs.getString("tipo"));
                bici.setColor(rs.getString("color"));
                bici.setNumero_serie(rs.getLong("numero_serie"));
                bici.setBorrado(rs.getBoolean("borrado"));
                bici.setCliente(cData.buscarCliente(rs.getInt("id_cliente")));

                buscarBicicletaPorCliente.add(bici);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al obtener la lista de bicicletas por clientes " + ex);
        }
        return buscarBicicletaPorCliente;
    }
    
    public Bicicleta buscarBicicletaPorNroSerie(long nroSerie) {
        Bicicleta bici = null;
        String sql = "SELECT * FROM bicicleta WHERE numero_serie = ?";
        try {
            PreparedStatement ps = conexionData.prepareStatement(sql);
            ps.setLong(1, nroSerie);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                bici = new Bicicleta();
                bici.setId(rs.getInt("id"));
                bici.setNumero_serie(rs.getLong("numero_serie"));
                bici.setMarca(rs.getString("marca"));
                bici.setTipo(rs.getString("tipo"));
                bici.setColor(rs.getString("color"));
                bici.setCliente(cData.buscarCliente(rs.getInt("id_cliente")));
                bici.setBorrado(rs.getBoolean("borrado"));
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error. en buscar bicicleta por Nro de Serie."+ex);
        }

        return bici;
    }
    
    public Cliente BuscarClienteporBicicleta (Long nroSerie){
        
        Bicicleta bici= buscarBicicletaPorNroSerie(nroSerie);
        
        int id= bici.getCliente().getId(); // este es el id de cliente
        Cliente cliente = null;
        String sql = "SELECT * FROM cliente WHERE id = ?";
        
        try {
            PreparedStatement ps = conexionData.prepareStatement(sql);
            ps.setInt(1, id); // este tambien es el id de cliente
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setDni(rs.getLong("dni"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCelular(rs.getLong("celular"));
                cliente.setBorrado(rs.getBoolean("borrado"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error a ocurrido");
        }
        return cliente;
    }
    
    
   
}
