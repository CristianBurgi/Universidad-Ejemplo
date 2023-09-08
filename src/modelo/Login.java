package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import vista.Principal;

/**
 *
 * @author Cristian
 */
public class Login {

    public void validarUsuario(JTextField usuario, JPasswordField pass) {

        try {
            ResultSet rs;
            PreparedStatement ps;
            Conexion con = new Conexion();
//            Connection cn = con.conectar();

            String sql = "SELECT  nombre, contraseña FROM login WHERE nombre = ? and contraseña = ? ";
            ps=con.conectar().prepareStatement(sql);
            
            ps.setString(1, usuario.getText());
            ps.setString(2, String.valueOf( pass.getPassword()));
            
            rs=ps.executeQuery();
            
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null, "ingreso exitoso");
                Principal p = new Principal();
                p.setVisible(true);
                p.setLocationRelativeTo(null);
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o pass incorrecto");
            }
            

        } catch (SQLException e) {
            System.out.println("error "+e);
        }

    }

}
