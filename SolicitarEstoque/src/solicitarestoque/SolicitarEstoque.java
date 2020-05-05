/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solicitarestoque;

import java.util.Scanner;

/**
 *
 * @author Iago
 */
public class SolicitarEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definição de variaveirs
        
        double valor,qntd,valortotal;
        
       //entrada
       
       Scanner entrada= new Scanner(System.in);
       
       System.out.println("qual a quantidade de peças?");
       
       qntd= entrada.nextDouble();
       
       System.out.println("qual o valor da peça?");
       
      valor= entrada.nextDouble();
      
      //processador
      
      valortotal= qntd*valor;
      
      //saida
      
      System.out.println("o valor é: "+valortotal);
              
              
    }
    
}
