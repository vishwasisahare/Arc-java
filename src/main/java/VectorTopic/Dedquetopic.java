/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VectorTopic;

import java.util.ArrayDeque;

/**
 *
 * @author ayush
 */
public class Dedquetopic {
    
    public static void main(String[] args) {
        
        //it is used for the (add or remove) strarting and ending  LIFO FIFO
        
        ArrayDeque<Object> deque = new ArrayDeque<>();
        
        deque.add("hello");
        deque.add("hiiiiiiiiiiii");
        deque.add("fine");
        deque.add("good");
        
        System.out.println(deque);
        
        System.out.println(deque.peek()); //retrive
        System.out.println(deque);
        
        System.out.println(deque.pop());   
        System.out.println(deque);  
        
        System.out.println(deque.poll());
        System.out.println(deque); 
        
    }
}
