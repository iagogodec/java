/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.Scanner;

/**
 *
 * @author iago
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definiçao de variaveis
        
       double base,altura,area;
       
       //entrada 
       
       Scanner entrada= new Scanner(System.in);
       
       System.out.println("qual a medida da base do triangulo em cm ?");
       
       base= entrada.nextDouble();
       
       System.out.println("qual a medida da altura em cm ?");
       
       altura= entrada.nextDouble();
       
       //processamento
       
       area= (base*altura)/2;
       
       //saida 
       
       System.out.println("a area do triangulo será de: "+area);
       
      
       
       
       
       
    }
    
}
