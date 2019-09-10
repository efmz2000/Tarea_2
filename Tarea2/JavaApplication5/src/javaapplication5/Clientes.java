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
public class Clientes {
    private DoubleEndedLinkedList<String> lista;
    
    public void clientes(){
        lista.add("Pedro");
        lista.add("Manuel");
        lista.add("Sara");
        lista.add("Alberto");
        lista.add("Amanda");    
    }
    public DoubleEndedLinkedList getlista(){
        return lista;
    }
}
