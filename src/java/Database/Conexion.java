package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;
    String user="root";
    String pass="";
    String url="jdbc:mysql://localhost:3306/kinego?";   
   public Connection conexion(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,user,pass);
           System.out.println("Conexion Exitosa");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("Error en la conexion");
       }
       return con;
   }
    
}