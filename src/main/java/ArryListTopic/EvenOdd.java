/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArryListTopic;

import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class EvenOdd {
    
    public static void main(String[] args) {
        
         ArrayList<Integer> list = new ArrayList<>();
         
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         list.add(6);
         list.add(7);
         list.add(8);
         
        System.out.println("Number" +list);
        list.removeIf(e ->(e % 2) == 0);
        System.out.println("odd number"+list);
         
       
    }
    
}
