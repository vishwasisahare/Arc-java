/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author ayush
 */
public class con1 {
    
    con1(){            //default constructor
        System.out.println("hello");
    }
    con1(int a ,int b){     //paratarizeed
        System.out.println(a+b);
}
    con1(String m,String n){
        System.out.println(m+" "+n);
    }
    public static void main(String[] args) {
        
        
        con1 con = new con1("vishu","sahare");
   
        
    }
}
