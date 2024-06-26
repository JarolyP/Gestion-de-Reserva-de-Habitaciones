
package Persistencia;

import Logica.vHabitacion;
import Persistencia.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class fHabitacion {
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos = {"ID", "Número", "Piso", "Descripción", "Caracteristicas", "Estado", "Tipo habitación"};
        
        String [] registro = new String [8];
        
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        
        sSQL="Select * from habitacion where piso like '%"+ buscar + "%'order by idhabitacion";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while (rs.next()) {                
                registro [0]=rs.getString("idhabitacion");
                registro [1]=rs.getString("numero");
                registro [2]=rs.getString("piso");
                registro [3]=rs.getString("descripcion");
                registro [4]=rs.getString("caracteristicas");
                registro [5]=rs.getString("precio_diario");
                registro [6]=rs.getString("estado");
                registro [7]=rs.getString("tipo_habitacion");
                
                totalregistros=totalregistros+1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }   
    }
    
    public DefaultTableModel mostrarVista(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos = {"ID", "Número", "Piso", "Descripción", "Caracteristicas", "Estado", "Tipo habitación"};
        
        String [] registro = new String [8];
        
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        
        sSQL="Select * from habitacion where piso like '%"+ buscar + "%' and estado='Disponible' order by idhabitacion";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while (rs.next()) {                
                registro [0]=rs.getString("idhabitacion");
                registro [1]=rs.getString("numero");
                registro [2]=rs.getString("piso");
                registro [3]=rs.getString("descripcion");
                registro [4]=rs.getString("caracteristicas");
                registro [5]=rs.getString("precio_diario");
                registro [6]=rs.getString("estado");
                registro [7]=rs.getString("tipo_habitacion");
                
                totalregistros=totalregistros+1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }   
    }
    
    public boolean insertar (vHabitacion dts){
        sSQL="insert into habitacion (numero,piso,descripcion,caracteristicas,precio_diario,estado,tipo_habitacion)"+
                "values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPrecio_diario());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipo_habitacion());
            
            int n=pst.executeUpdate();
            
            if(n!=0){
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean editar (vHabitacion dts){
        sSQL="update habitacion set numero=?, piso=?, descripcion=?, caracteristicas=?, precio_diario=?, "
                    + "estado=?, tipo_habitacion=? where idhabitacion=?";
        try {
            
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPrecio_diario());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipo_habitacion());
            pst.setInt(8, dts.getIdhabitacion());
            
            int n=pst.executeUpdate();
            
            if(n!=0){
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }   
    
    public boolean eliminar (vHabitacion dts){
        sSQL="delete from habitacion where idhabitacion=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setInt(1, dts.getIdhabitacion());
            
            int n=pst.executeUpdate();
            
            if(n!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }   
        
}
