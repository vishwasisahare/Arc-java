/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import javax.sound.sampled.FloatControl;

/**
 *
 * @author ayush
 */
public class ThrowseendTopic {
    
     public static void main(String[] args) {
        
    

        try {
            int balance = 5000 , widthdrow =2000 ;
            
        if (balance < widthdrow) {
            
           throw new ArithmeticException("insuffieent");
           
         //  balance =  balance - widthdrow ;
          // System.out.println("balance"+balance);
        }
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
    }
}
   
    

