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
public abstract class Demo2 implements Demo{

    public static void main(String[] args) {
      
        Demo dm = new Demo() {
            @Override
            public void hello() {
                System.out.println("this is the second method .  ");
            }
        };dm.hello();
        
    
    }

   

   
    

    
}
