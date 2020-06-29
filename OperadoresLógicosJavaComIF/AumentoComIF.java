
package aumentocomif;

import javax.swing.JOptionPane;


public class AumentoComIF {

    
    public static void main(String[] args) {
        
        double salario,aumento = 0;
        
        JOptionPane.showMessageDialog(null,"Esse programa calcula o aumento dos funcionarios baseado nos salários");
 
salario=Double.parseDouble( JOptionPane.showInputDialog(null,"Quanto você recebe por mês?"));
    
 if (salario<=1500){
 
 aumento=salario*1.2;
 }   
 
  if (((salario>1500) && (salario<=3000))){
 
 aumento=salario*1.15;
 }   
  
   if (salario>3000){
 
 aumento=salario*1.1;
 }   
   
   
   JOptionPane.showMessageDialog(null,"o seu sálario após o aumento sera de R$" +aumento);
 
 
    
    
    
    
    
    
    
    }
    
    
}
