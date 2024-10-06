/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VectorTopic;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author ayush
 */
public class QueueTopic {
    
    public static void main(String[] args) {
        
        Queue<Object> obj = new PriorityQueue<>();
        
        obj.add("vishu");
        obj.add("push");
        obj.add("laugh");
        obj.add("uuuffh");
        
        System.out.println(obj);
    }
}
