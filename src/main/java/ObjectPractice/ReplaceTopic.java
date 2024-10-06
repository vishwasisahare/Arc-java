/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPractice;

import com.sun.jdi.IntegerValue;
import java.util.Scanner;

/**
 *
 * @author ayush
 */
public class ReplaceTopic {
    
    public static void main(String[] args) {
        
        String data = "my name is vicky";
        String a = "hello"; //heep
        String b = new String ("hii"); //pull this is not share a refrence address
        String c = String.valueOf(0);
        
        System.out.println(data.replaceAll("vicky", "rohan"));
        //for the value of indexx
        System.out.println(a.charAt(0)); 
        //intern
        System.out.println(data.intern());
                
        
    }

   
    
}
