
package conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mathiasvenegas
 */
public class Conexion {
    
    Connection con;
 
    public Conexion() { // mismo nombre de la clase 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoFinal", "root", "");
            System.out.println("Conexion Exitosa");                                   // cambiar el nombre por 
                                                                                      //el de la base de datos 
        } catch (Exception e) {
            System.out.println("No puedo conectarse al BD");
        }
    }
    public Connection getConnection() {
        return con;
    }
    
}
    
