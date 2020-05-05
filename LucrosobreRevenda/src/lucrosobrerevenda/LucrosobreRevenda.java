/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucrosobrerevenda;

import java.util.Scanner;

/**
 *
 * @author Iago
 */
public class LucrosobreRevenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // definição de variaveis 
        
       double valor,valorfinal;
       
       //entrada
       
     Scanner entrada= new Scanner(System.in);
     
    System.out.println("qual o valor de compra do produto?");
    
   valor= entrada.nextDouble();
   
      //processamento 
      
     
      valorfinal= (valor*0.65)+(valor);
      
      
     //saida
     
    System.out.println("o valor de revenda dessa produto será de: $"+valorfinal);
    
    
    }
    
}
