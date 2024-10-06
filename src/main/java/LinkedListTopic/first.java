/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListTopic;

import java.util.LinkedList;

/**
 *
 * @author ayush
 */
public class first {
    
    //its same like arraylist LinkedList
    
    public static void main(String[] args) {
        
        LinkedList<String> link = new LinkedList<>();
        link.add("hello");
        link.add("oppps");
        link.add("know");
        link.add("shutup");
        link.add("ufffh");
        
        System.out.println(link);
        
        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());
        
        System.out.println(link);
        
        link.clear();
                
    }
            
}
