/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;


public class Throwtopic {
    public static void main(String[] args) {
        
        

    
        try {
            
      int age =8;
    if(age > 18){
          throw new ArithmeticException("valid");
}else{
        System.out.println("invalid");
}
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
  
    
}
