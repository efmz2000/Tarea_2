/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;


/**
 *
 * @author Jafet
 */
public class Tarea2Observer {
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here  


    /**
     *
     */
      Employe juan= new Employe();
      Boss jose= new Boss();
      jose.setEmpleado(juan);
      juan.setBoss(jose);
      
      juan.printear();
   //   DoubleEndedLinkedList<String> listofBoss = juan.getListofBoss();

    /**
     *
     */


      
    
       
     
    }
}
