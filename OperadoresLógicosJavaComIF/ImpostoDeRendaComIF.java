
package impostoderendacomif;

import javax.swing.JOptionPane;

public class ImpostoDeRendaComIF {

  
    public static void main(String[] args) {
      double sal,imp = 0;
      JOptionPane.showMessageDialog(null,"Esse programa calcula seu imposto de renda");
      
      
 sal = Double.parseDouble( JOptionPane.showInputDialog(null,"Quanto você recebe por mês?"));
 
 if (sal<=1903.98) {
 
     imp=0;
                       }
 
if (((sal>1903.98) && (sal<=2826.65))) {

imp= sal*0.075 ;


}
      
if (((sal>2826.65) && (sal<=3751.05))) {
    
  imp=  sal*0.15;
    
   }       

if (((sal>3751.05) && (sal<=4664.68))) {
    
    imp= sal* 0.225;
    
    }

if ((sal>4664.68)) {

imp=  sal*0.227 ;

}
 
JOptionPane.showMessageDialog(null,"o desconto na sua folha de pagamento será de R$"+imp);


      
      
      
      
      
      
    }
    
}
