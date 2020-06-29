
package competicaovoleicomif;

import javax.swing.JOptionPane;


public class CompeticaoVoleiComIF {

    public static void main(String[] args)  {
        
   double altura,idade;
   
   
                
   JOptionPane.showMessageDialog(null,"Este prgrama mostra se o candidato está apto a participar da competição");
   
   altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a altura do candidato")); 
       
    if  (altura>1.75) {
  
  JOptionPane.showMessageDialog(null, "o jogador está apto a participar da competição");
  
  

          
          
  }else{
          
          
   JOptionPane.showMessageDialog(null, "o jogador não está apto a participar da competição");   
      
  
          } 
   
   
   
   
   idade = Double.parseDouble(JOptionPane.showInputDialog(null,"qual a idade do candidato"));

   if (idade<18) {
  
  JOptionPane.showMessageDialog(null, "o jogador não está apto a participar da competição");
  

  }else{
          
          
   JOptionPane.showMessageDialog(null, "o jogador está apto a participar da competição");   
          
          } 
 
  
  
  
  
  
  
  
   
   
   
   
 
      
      
      
      
      
      
      
   
   
        


}
    
  
         
    
    }
    
    
    



    

