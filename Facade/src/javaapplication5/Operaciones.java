/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Erick
 */
public class Operaciones {
    public void retiro(Cliente cliente,int retiro){
        int saldo=cliente.getSaldo();
        if (saldo<retiro){
            System.out.println("Sus fondos son insuficientes");
        }
        cliente.setSaldo(saldo-retiro);
        System.out.println("Su saldo ahora es de:");
        System.out.println(cliente.getSaldo());
    }
   public void verSaldo(Cliente cliente){
       System.out.println("Su saldo ahora es de:");
       System.out.println(cliente.getSaldo());
   }
   public void deposito(Cliente cliente,int deposito){
       int saldo=cliente.getSaldo();
       saldo= saldo+deposito;
       cliente.setSaldo(saldo);
   }
}
