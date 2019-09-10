
package javaapplication5;

import listas.DoubleEndedLinkedList;

/**
 *
 * @author Erick
 */
public class Verificar {
    public boolean Verificar(DoubleEndedLinkedList Lista, String Nombre){
        DoubleEndedLinkedList<Cliente> lista= Lista;
        int len=lista.len();
        int contador=0;
        while(contador<len){
            
            if(Nombre.equals(lista.getNodo(contador).getDato().getNombre())){
               return true;
            }
        contador++;
        }
        return false;
    }
}
