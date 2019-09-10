/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import listas.DoubleEndedLinkedList;

/**
 *
 * @author Erick
 */
public class Facade {
    public Facade(String Nombre, String operacion){
        DoubleEndedLinkedList<Cliente> lista= new Clientes().getlista();
        int len=lista.len();
        int contador=0;
        Cliente cliente;
        Verificar verificador=new Verificar();
        if(verificador.Verificar(lista,Nombre)){            
           
            cliente=lista.getNodo(contador).getDato();
            Operaciones operar= new Operaciones();
            if(operacion=="retiro"){
                operar.retiro(cliente, (int) (Math.random() * 500000) + 1);
                return;
            }
            if(operacion=="saldo"){
                operar.verSaldo(cliente);
                return;

            }
            if(operacion=="deposito"){
                operar.deposito(cliente,(int) (Math.random() * 5000) + 1);
                return;
            }
            System.out.println("Esa operación no esta permitida");
            return;
        }
        System.out.println("Usted no es uno de nuestros clientes");
    }    
               
        
   
    
}
