/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author ayush
 */
public class Fiirst {
    
   
    
    public static void main(String[] args) {
        
        
        Second sc = new Second();
        sc.set(12348);
        sc.set("vishu");
        sc.setuserid(23);
        System.out.println("this is the password "+sc.getpass());
        System.out.println("this is the name "+sc.getname());
        System.out.println("this is the userid "+sc.getuserid());
        
        //constructor
         Second sc1 = new Second("nagpur");
         System.out.println("thie city is "+sc1.getcico());
    }
    
}
