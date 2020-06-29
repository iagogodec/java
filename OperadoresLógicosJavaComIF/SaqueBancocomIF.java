/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saquebancocomse;

import javax.swing.JOptionPane;

public class SaqueBancocomSE {

    public static void main(String[] args) {
   
     double saque,saldofinal,saldoatual,sobra,limite;
     JOptionPane.showMessageDialog(null,"este programa mostra seu saldo no banco depois de um saque");
    saldoatual = 3000;
    limite = 3000;
    
    saque = Double.parseDouble(JOptionPane.showInputDialog(null,"Quanto deseja sacar?"));
    //processamento
    
   saldofinal = saldoatual-saque;
   
   if (saldofinal>=0) {
   
   JOptionPane.showMessageDialog(null,"seu saldo final é positivo");
   JOptionPane.showMessageDialog(null,"seu saldo final é de R$ "+saldofinal);
   } 
   if ((saldofinal<0) && (saldofinal>=(-limite))){
    
    JOptionPane.showMessageDialog(null,"você não tem limite para fazer o saque"+saldofinal);
    
  }else{
            
            JOptionPane.showMessageDialog(null,"você não pode fazer esse saque seu limite é de R$"+limite);
            
            }
   

   }
  
   
   }
    
    
    

