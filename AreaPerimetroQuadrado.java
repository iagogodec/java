/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetroquadrado;

import java.util.Scanner;

/**
 *
 * @author Iago 
 */
public class AreaPerimetroQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        // entrada de dados 
         
       double lado,perimetro,area;
       Scanner entrada =new Scanner(System.in);
       
     System.out.println("digite a medida do lado do quadrado");
     lado= entrada.nextByte();
     // processamento de dados 
     
     perimetro =lado*4;
     area = lado*lado;
     //saida 
     System.out.println("o perimetro do quadrado é :"+perimetro);
             
     
     System.out.println("a area do quadrado é :"+area);
     
    }
    
}
