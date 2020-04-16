package Modelo;

import Database.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class TrabajadorDAO  {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;

    public trabajador validar(String nombre, String Dni) {
        trabajador tr = new trabajador();
        String sql = "select * from trabajador  where nombre=? and Dni=?"; 
        try {
            con=cn.conexion();
            pstm=con.prepareStatement(sql);
            pstm.setString(1, nombre);
            pstm.setString(2, Dni);
            rs=pstm.executeQuery();
            while (rs.next()) {                
                tr.setId_trabajador(rs.getInt("id_trabajador"));
                tr.setNombre(rs.getString("nombre"));
                tr.setDni(rs.getString("Dni"));
            }
        } catch (Exception e) {
            
        }
        return tr;
    }
}
