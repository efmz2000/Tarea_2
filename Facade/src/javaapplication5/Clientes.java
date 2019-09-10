
package javaapplication5;

import listas.DoubleEndedLinkedList;

/**
 *
 * @author Erick
 */
public class Clientes {
    private DoubleEndedLinkedList<Cliente> lista;
    
    public void clientes(){
        lista.add(new Cliente(200000,"Pedro"));
        lista.add(new Cliente(200000,"Manuel"));
        lista.add(new Cliente(200000,"Sara"));
        lista.add(new Cliente(200000,"Alberto"));
        lista.add(new Cliente(200000,"Amanda"));    
    }
    public DoubleEndedLinkedList getlista(){
        return lista;
    }
}
