/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotaçãodollar;

import java.util.Scanner;

/**
 *
 * @author Iago
 */
public class Cotaçãodollar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //entrada 
       double real,dollar,resposta;
        
       Scanner entrada= new Scanner(System.in);
        
       System.out.println("qual o valor em reais que você tem ?");
        
       real= entrada.nextDouble();
      
       System.out.println("qual a cotação do dollar hoje?");
         
       dollar= entrada.nextDouble();

       //processamento
       
       resposta= real/dollar;
       
       //saida 
       
       System.out.println("seu dinheiro em dollar é : $"+resposta);
       
       
               
               
       
    }
    
}
