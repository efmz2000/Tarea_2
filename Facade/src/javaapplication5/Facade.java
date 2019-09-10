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
        System.out.println(lista);
        int len=lista.len();
        int contador=0;
        Cliente cliente;
        while(contador<len){            
            if(Nombre.equals(lista.getNodo(contador).getDato().getNombre())){
                cliente=lista.getNodo(contador).getDato();
                Operaciones operar= new Operaciones();
                if(operacion.equals("retiro")){
                    operar.deposito(cliente, len);
                }
                if(operacion.equals("saldo")){
                    operar.verSaldo(cliente);

                }
                if(operacion.equals("deposito")){
                    operar.retiro(cliente, len);
                }

                break;
                }
            else{
                contador++;
            }
        System.out.println("Usted no es uno de nuestros clientes");           
        }
        
    }
    
}
