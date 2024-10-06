/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author ayush
 */
abstract public class Beta {
    
   abstract void set();
   
   abstract void pet();
   
   void hello(String name , String surname){
       String full = name+" "+surname;
       System.out.println(full);
   }
    
}
