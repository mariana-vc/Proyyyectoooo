
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mariana
 */
public class holiii {
    public static void main(String[] args){
        System.out.print("HOli enriqueee");
        String nombre = JOptionPane.showInputDialog("Cual es tu nombre? ");
        ImprimirNombre(nombre);

        
    }
    
    public static void ImprimirNombre(String nombre){
        System.out.println(nombre);
    }
}
