/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;


import listas.DoubleEndedLinkedList;
import listas.Nodo;

/**
 *
 * @author Erick
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleEndedLinkedList<CompuertaNOR> lista;
        
        lista = new DoubleEndedLinkedList();
        
        CompuertaNOR aux=new CompuertaNOR();
        aux.addEntrada(false);
        
        System.out.println(aux);
        aux.addEntrada(false);
        aux.addEntrada(false);
        aux.addEntrada(false);
        aux.addEntrada(false);
        System.out.println(aux.getListaEntradas().same());
        aux.operar(); 
        System.out.println(aux.getSalida());
        lista.add(aux);
        lista.getNodo(0).getDato().addEntrada(true);
        lista.getNodo(0).getDato().addEntrada(true);
//        System.out.println(lista.getNodo(0).getDato());
//        lista.print();
//        System.out.println("PRINT LEN " + lista.len());
     
    }
    
}
