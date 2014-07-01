
import javax.swing.JOptionPane;

/**
 *
 * @author Enrique
 */
public class holiii {
    public static void main(String[] args){

    	
        System.out.print("HOli enriqueee");
        String nombre = JOptionPane.showInputDialog("Cual es tu nombre? ");
        ImprimirNombre(nombre);
        System.out.println("La señorita mariana");        
    }
    
    public static void ImprimirNombre(String nombre){
        System.out.println(nombre);
    }
}
