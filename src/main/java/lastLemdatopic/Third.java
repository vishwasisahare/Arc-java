/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastLemdatopic;

/**
 *
 * @author ayush
 */
public interface Third {
 
    void hlw();
    
    default void num(){            //npn-abstract for the default function
        System.out.println("heyyyyyyyyyyyyyyyyyyyyyyyy.............");
    }
    
    default void basic(int a){
        System.out.println(a*a);
    }
            
}
