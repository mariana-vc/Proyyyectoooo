
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
        
        //Este es el arreglo que vas a usar Flagui
        int[] numeros = {4,1,19,30};
        
    }
    
    public static void ImprimirNombre(String nombre){
        System.out.println(nombre);
    }
    
     public static int MetodoSencillo (int[] x){
         
         int mx = x[0];
         
         for (int i=0;  i<x.length; i++){
             if (x[i]>mx){
                 mx = x[i];
             }
         }
         return mx;
     }
}
