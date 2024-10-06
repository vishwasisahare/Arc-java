/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VectorTopic;

import java.util.TreeSet;

/**
 *
 * @author ayush
 */
public class TreesetTopic {
    
    //this is also collecton method ,to using  data collect
    
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<>();
        
        set.add(99);
        set.add(32);
        set.add(56);
        set.add(45);
        set.add(02);
        set.add(65);
        
        //thre are some speical method to to not anyonemathod have
        System.out.println(set);  //by default asscending order in this treeset
        System.out.println(set.pollFirst());
        System.out.println(set);
        System.out.println(set.pollLast());
        System.out.println(set);
    }
    
}
