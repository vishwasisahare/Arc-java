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
public class Alfa extends Beta{

    @Override
    void set() {
       String city ="nagpur";
        System.out.println("which city :"+city);
    }
    
    
    void pet() {
        String country = "india";
      
        System.out.println("i am from " +country);
    }
    
    public static void main(String[] args) {
        Alfa af = new Alfa();
        af.pet();
        af.set();
        af.hello("pushpak", "mishra");
    }

    
    
}
