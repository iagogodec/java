/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo;

import java.util.Scanner;

/**
 *
 * @author Iago
 */
public class RETANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // definição de variaveis
        double area,perimetro,base,altura;
        //entrada
       Scanner entrada = new Scanner(System.in);
       
       
       System.out.println("Digite a base");
       
       base =entrada.nextDouble();
       
       System.out.println("Digite a altura");
       altura =entrada.nextDouble();
      //processamento 
      area =base*altura;
      perimetro =(base*2)+ (altura*2);
      
      //saida
      System.out.println("A área do retangulo é: "+area);
      System.out.println("o perimetro do retangulo é: "+perimetro);
       
    }
    
}
