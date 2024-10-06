/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VectorTopic;

import java.util.Vector;

/**
 *
 * @author ayush
 */
public class first {
    
    //its also same like a ArrayList (this is also collection )
    
    public static void main(String[] args) {
        
        Vector<Object> list = new Vector<>();
        
        list.add(25);
        list.add(63);
        list.add(230);
        list.add(520);
        list.add(63);
        list.add("shan");
        
        System.out.println(list);
        
        list.add(3, 300);
      
        System.out.println(list);
        
        System.out.println(list.capacity());
        
        System.out.println(list.size());
        
        System.out.println(list.remove(6));
        
        System.out.println(list.remove("shan"));
        
        System.out.println(list);
    }
    
}
