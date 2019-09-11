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
public class Boss {
    private Employe empleado;


    /**
     *
     * @param empleado es el objeto que vamos a observar
     */
  //  public Boss(Employe empleado){
    //  this.empleado = empleado;
//      this.empleado.setBoss(this);
  // }
    
    
    public void setEmpleado(Employe empleado){
        this.empleado = empleado;
        empleado.setBoss(this);
    }

    public void Notify() {
        if(empleado.isWorking()){
            System.out.println("I´m working");
        }else{
            System.out.println("I´m nott working");  
        }
    }
}
