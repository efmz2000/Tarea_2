/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;


/**
 *
 * @author Dixon
 */
public class Tarea2Observer {
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here  


    /**
     *crea los objetos jefe y empleado 
     * ejecuta el metodo sobre el empleado que activa la notificacion a los  (observer) los jefes.
     */
      Employe juan= new Employe();
      Boss jose= new Boss(juan);
      juan.setWorking(True);
   
     
    }
}

