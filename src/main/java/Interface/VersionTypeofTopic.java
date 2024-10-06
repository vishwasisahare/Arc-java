/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


public interface VersionTypeofTopic {
    
    //there are the before version 9 and 8 
    //static, default,private (How to access)
 
    public default void test(){         //for default
        System.out.println("Hello");
    }
    
    public static void method(int a ,int b){
        System.out.println(a+b);
    }
    
    default void sum(){
                this.some();
      }
    
     private void some(){
        System.out.println("12345");
    }
    
    
    
    
    
}
