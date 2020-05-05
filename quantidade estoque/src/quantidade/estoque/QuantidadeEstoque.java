/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quantidade.estoque;

import java.util.Scanner;

/**
 *
 * @author Iago
 */
public class QuantidadeEstoque {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definição de variaveis 
        
        double quantidademin,quantidademax,valortotal;
        //entrada
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("qual o valor mínimo do estoque?");
        
        quantidademin= entrada.nextDouble();
        
        System.out.println("qual o valor mxiomo do estoque?");
        
        quantidademax= entrada.nextDouble();
        
        //processamento 
        
        valortotal= (quantidademax+quantidademin)/2;
        
        //saida
        
        System.out.println(" a media do estoque é; "+valortotal);
        
        
        
      
    }
    
}
