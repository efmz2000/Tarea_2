
package javaapplication5;

/**
 *
 * @author Erick
 */
public class Cliente {
    private int saldo;
    private final String nombre;

    public Cliente(int plata,String nom){
        this.saldo=plata;
        this.nombre=nom;
    }

    public int getSaldo() {
        return saldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }    
}
