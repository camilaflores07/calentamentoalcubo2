    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calentamiento_ej2;

import javax.swing.JOptionPane;


public class CALENTAMIENTO_EJ2 {
    
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingresar un numero "));
        
        while(numero != 0){
            if (numero > 0){
                
            JOptionPane.showMessageDialog(null, "El numero" +numero+ "es positivo");
            }
            else{
                    JOptionPane.showMessageDialog(null, "numero es negativo"); 
                }
         
            numero = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingresar otro numero "));   
            
            
        }
    }
        
          
        }
            
    

