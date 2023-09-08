
package modelo;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;


/**
 *
 * @author Cristian
 */
public class Conexion {
    
   Connection cn;
    
    public Connection conectar(){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            cn=(Connection)DriverManager.getConnection("jdbc:mariadb://localhost/universidadulp","root","");
            System.out.println("CONECTADO");
            
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR DE DRIVER "+ e);
            
        }catch(SQLException x){
            System.out.println("ERROR al conectar" + x);
        }
        return cn;
    }
            
       

}
