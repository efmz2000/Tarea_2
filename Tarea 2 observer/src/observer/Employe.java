/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;
import Lista.*;


/**
 *
 * @author Jafet
 */
public class Employe {
    private boolean working;
    private int quantityBoss;
    private  DoubleEndedLinkedList<Boss> listofBoss; 
    

     public  Employe(){
       listofBoss = new DoubleEndedLinkedList();       
    }
    
    public void setBoss(Boss boss){
        this.listofBoss.add(boss); 
        this.quantityBoss++;
    } 
    
 
    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
        tell_all_boss();
    }
    /**
     *avisa a todos los jefes la accion que  realice
     */
    public void tell_all_boss(){
          for (int i=0; i<getQuantityBoss(); i++){
           System.out.println(this.getListofBoss().getNodo(i).getDato());
        }
       // listofBoss.forEach((boss) -> {
       //     boss.Notify();
        //});
    }   

    /**
     * @return the quantityBoss
     */
    public int getQuantityBoss() {
        return quantityBoss;
    }


    
}
