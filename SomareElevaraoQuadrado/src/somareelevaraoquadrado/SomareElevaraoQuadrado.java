/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somareelevaraoquadrado;

import java.util.Scanner;

/**
 *
 * @author Iago
 */
public class SomareElevaraoQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definição de variaveis
        double a,b,c,d,resultado;
        
       //entrada
       
       Scanner entrada= new Scanner(System.in);
       
       System.out.println("qual o valor de a?");
       
       a= entrada.nextDouble();
       
       System.out.println("qual o valor de b");
       
       b= entrada.nextDouble();
        
       System.out.println("qual o valor de c?");
       
       c= entrada.nextDouble();
         
       System.out.println("qual o valor de d?");
 
       d= entrada.nextDouble();
       
      //processamento
      
     resultado= (a*a)+(b*b)+(c*c)+(d*d);
     
     //saida
     
     System.out.println("o valor é:"+resultado);
       
   }
