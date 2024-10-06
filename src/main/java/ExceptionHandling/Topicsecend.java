/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;



public class Topicsecend {
    public static void main(String[] args) {
        
        try {
             String s = null;
             String m = "vishwasi";
         System.out.println(s.length());
         System.out.println(m.length());
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        try {
            String a = "Hello";
            int b = Integer.parseInt(a);
            System.out.println(b+b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
   
    
    
}
