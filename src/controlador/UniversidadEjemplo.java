
package controlador;


import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import vista.Alumno;
import vista.Login;
import vista.Principal;

/**
 *
 * @author Cristian
 */
public class UniversidadEjemplo {

   
    public static void main(String[] args) {
//        

        FlatCarbonIJTheme.setup();


        Login log = new Login();
        
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        
        
      
    }

}
