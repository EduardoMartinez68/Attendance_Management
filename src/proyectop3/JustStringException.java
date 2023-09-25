/* This project, along with all of its elements and content, is protected by copyright and belongs exclusively to its author, 
    Ana Karen Castillo López.*/
package proyectop3;
import javax.swing.JOptionPane;
        
public class JustStringException extends Exception {
    private String nombre, apellidos, ciudad;
    private boolean bandera=false;
    public JustStringException(String nombre, String apellido, String ciudad){
        this.nombre = nombre;
        this.apellidos = apellido;
        this.ciudad = ciudad;
        if(empty()==false){
            JOptionPane.showMessageDialog(null, "El contenido de nombre, apellidos y ciudad no debe tener número y son campos");
        }
    }

    private boolean empty(){
        if(nombre.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "El campo de nombre está vacío");
            bandera=true;
        }
        if(apellidos.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "El campo de apellidos está vacío");
            bandera=true;
        }
        if(ciudad.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "El campo de ciudad está vacío");
            bandera=true;
        }
        return bandera;
    }

}
