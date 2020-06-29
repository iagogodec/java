
package imccomif;

import javax.swing.JOptionPane;


public class ImcComIF {

    
    public static void main(String[] args) {
  double peso,altura,imc;
  
  JOptionPane.showMessageDialog(null,"Este programa calcula o IMC");
  
  peso = Double.parseDouble(JOptionPane.showInputDialog(null,"qual é a sua massa em KG?"));
  
  altura = Double.parseDouble(JOptionPane.showInputDialog(null,"qual é a sua altura"));
  
  imc = (peso/(altura*altura));
  
  if ((imc<=18.5)) {
  
  JOptionPane.showMessageDialog(null,"você está abaixo do peso");
  
  }
  
  if ( (imc>18.5) && (imc<=24.9)) {
  
  JOptionPane.showMessageDialog(null,"você está no peso ideal"); 
  
  }
  
  
  if ((imc>=25) && (imc<=29.9)) {
  
  JOptionPane.showMessageDialog(null,"você está com sobrepeso"); 
  
  }
  
  if ((imc>=30) && (imc<=34.9)) {
  
  JOptionPane.showMessageDialog(null,"você está com obesidade grau 1");
  
  }
  
  if ((imc>=35) && (imc<=39.9)) {
    
  JOptionPane.showMessageDialog(null,"você está com obesidade grau 2");
    
    }
  
 if (imc>40) {
 
 JOptionPane.showMessageDialog(null,"você está com obesidade grau 3");
 
 } 
  
  
  
  
  
  
    }
    
}
