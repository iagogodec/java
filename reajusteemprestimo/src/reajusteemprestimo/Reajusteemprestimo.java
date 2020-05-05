/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reajusteemprestimo;

import java.util.Scanner;

/**
 *
 * @author Iago
 */
public class Reajusteemprestimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definição de variaves 
        
        double aumento,tempo,valor;
        //entrada 
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("qual o valor do emprestimo?");
        
        valor= entrada.nextDouble();
        
        System.out.println("quanto tempo até a devolução?");
        
        tempo= entrada.nextDouble();
        
        //processamento 
        
        aumento= (valor*0.02)+(valor);
        
        //saida
        
        System.out.println("o valor de devolução será de: $"+aumento);
        
        
        
        
                
                
    }
    
}
