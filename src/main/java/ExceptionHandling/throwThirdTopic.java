/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ayush
 */
public class throwThirdTopic {
   
    public static void main(String[] args) {
        
        try {
            // obj dc = new obj();   //using throws to compile time exception

            
            throw new IOException();    //2nd option 
        } catch (IOException ex) {
            Logger.getLogger(throwThirdTopic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    
}
