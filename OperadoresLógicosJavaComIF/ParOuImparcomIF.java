

package parouimparcomif;

import javax.swing.JOptionPane;


public class ParOuImparcomIF {

    public static void main(String[] args) {
        
    double num;
    
    JOptionPane.showMessageDialog(null,"Esse programa informa se o número é par ou impar");

    num = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o  número que você deseja saber se é par ou impar"));
   
  if (num % 2==0){
    
    JOptionPane.showMessageDialog(null,"esse n�mero � par");
    
    }else{
  
    JOptionPane.showMessageDialog(null,"esse n�mero � impar");
       
  
  }
  
     
    
    
    
    }
    
    
}
