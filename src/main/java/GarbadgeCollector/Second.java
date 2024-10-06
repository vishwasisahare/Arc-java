/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbadgeCollector;

/**
 *
 * @author ayush
 */
public class Second extends first{
    
    public static void main(String[] args) {
     
      first fr = new first();
      
      first fr1 = new first();
      
      fr = fr1;    //2      by assigning refrence to another
    
      fr = null;       //1   object iss nulll 
      
      new first();           //3     by anonymous
   
      System.gc();
        
    }
}
