/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostocarro;

import java.util.Scanner;

/**
 *
 * @author Iago
 */
public class Impostocarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // entrada
        
       double valcar,valdis,valimpo,valimpo2,resultado;
       
       Scanner entrada= new Scanner(System.in);

       System.out.println("qual o valor do carro ?");
       
       valcar= entrada.nextDouble();
       
       //processamento 
       
       valdis= valcar*0.45;
       
       valimpo= valdis+valcar;
       
       valimpo2=valimpo*0.28;
       
       resultado= valimpo2+valimpo;
       
       System.out.println("o valor ficnal do carro é: $"+resultado);
               
               
              
               
       
    }
    
}
