/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VectorTopic;

import java.util.HashMap;
import java.util.Map;
import javax.print.DocFlavor;

/**
 *
 * @author ayush
 */
public class MapTopic {
    
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();
        
        map.put("one", 1);
        map.put("two", 52);
        map.put("three", 45);
        map.put("four", 30);
        
        System.out.println(map);
        
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.remove(map));

    }
    
}
