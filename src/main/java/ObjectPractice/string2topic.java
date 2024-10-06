/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPractice;

/**
 *
 * @author ayush
 */
public class string2topic {
    
    public static void main(String[] args) {
        
        
        // heep memory 
        String a = "hello";
        String b = "hello ";
        String c = "hello";
        String d = "HELLO";
        //pul memory 
        String e = new String("hello");  
        String f = new String("Hello");
        
        System.out.println(a==e);
        System.out.println(a==c);
        System.out.println(c==d);
        
        
        
        
               
    }
    
}
