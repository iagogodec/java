
package boxecomif;

import javax.swing.JOptionPane;


public class BoxeComIF {

 
    public static void main(String[] args) {
        
    JOptionPane.showMessageDialog(null,"Este rograma fala em qual categoria o candidato lutará");
   double peso;
  peso=Double.parseDouble( JOptionPane.showInputDialog(null,"Qual o peso do candidato"));
  
 
  if (peso<=46.27){ JOptionPane.showMessageDialog(null,"o atleta será inserido no peso palha ligeiro");}

  if ((peso>46.27) && (peso<=47.63)) { JOptionPane.showMessageDialog(null,"o atleta será inserido no peso palha");}

  if ((peso>47.63) && (peso<=48.99)) { JOptionPane.showMessageDialog(null,"o atleta será inserido no peso mosca ligeiro");}

  if ((peso>48.99) && (peso<=50.35)){JOptionPane.showMessageDialog(null,"o atleta será inserido no peso super mosca ");}

  if ((peso>48.99) && (peso<=51.71)){ JOptionPane.showMessageDialog(null,"o atleta será inserido no peso super mosca ");}

  if ((peso>51.71) && (peso<=53.52)){JOptionPane.showMessageDialog(null,"o atleta será inserido no peso galo");}

  if ((peso>53.52) && (peso<=55.34)){JOptionPane.showMessageDialog(null,"o atleta será inserido no peso super galo ");}
  
  if ((peso>55.34) && (peso<=57.15)){JOptionPane.showMessageDialog(null,"o atleta será inserido no peso pena");}

  if ((peso>57.15) && (peso<=58.97)){JOptionPane.showMessageDialog(null,"o atleta será inserido no peso super pena ");}
  
  if ((peso>58.97) && (peso<=61.23)){JOptionPane.showMessageDialog(null,"o atleta será inserido no peso leve");}

  if ((peso>61.23) && (peso<=63.5)){JOptionPane.showMessageDialog(null,"o atleta será inserido no peso super leve ");}

  if ((peso>63.5) && (peso<=66.68)){JOptionPane.showMessageDialog(null,"o atleta será inserido no peso meio médio ");}
 
  if ((peso>66.68) && (peso<=69.85)){JOptionPane.showMessageDialog(null,"o atleta será inserido no peso super meio médio ");}
 
  if ((peso>69.85) && (peso<=73.3)){JOptionPane.showMessageDialog(null,"o atleta será inserido no peso médio");}

  if ((peso>73.3) && (peso<=76.2)){JOptionPane.showMessageDialog(null,"o atleta será inserido no peso super médio ");}
 
  if ((peso>76.2) && (peso<=79.38)){JOptionPane.showMessageDialog(null,"o atleta será inserido no peso meio pesado ");}

  if ((peso>79.38) && (peso<=90.72)){JOptionPane.showMessageDialog(null,"o atleta será inserido no peso cruzador ");}

  if (peso>=90.72){JOptionPane.showMessageDialog(null,"o atleta será inserido no peso pesado ");}
 
  
  
  
  
    }
    
     }
