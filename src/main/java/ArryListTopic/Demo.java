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
public class Demo {
    
    //baically this is the colllection
    //collections = class
    //collection = interface
    
    
    public static void main(String[] args) {
        
        ArrayList<Object> list = new ArrayList<>();
        list.add(56);
        list.add(69);
        list.add("Hello my name is vishu ");
        list.add(true);
        list.add(96);
        
        System.out.println(list);
        
        System.out.println(list.clone());     //copy
        
        System.out.println(list.set(1,"yahh its me"));
        
        System.out.println(list);
        
       ArrayList<Object> list2 = new ArrayList<>();
       
       list2.add(52);
       list2.add("hiii");
       list2.add(false);
       list2.add(100);
       
      list.add(list2);
        
       System.out.println(list);
        
    }
}
