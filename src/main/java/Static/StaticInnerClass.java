/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;


public class StaticInnerClass {
    
   static class test{
        
        void Hello(){
            System.out.println("hey i am innerclassStatic");
        }
        
        public static void main(String[] args) {
            
            StaticInnerClass.test sc = new  StaticInnerClass.test();
            sc.Hello();
        }
    }
    
}
