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
public class InsertTopic {
    
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("computer");
     
        buffer.insert(2,5);
        buffer.delete(2, 5);
        
        System.out.println(buffer);
        
        
        
    }
    
}
