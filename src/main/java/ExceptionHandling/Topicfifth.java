/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author ayush
 */
public class Topicfifth {
    
    public static void main(String[] args) {
        
        try {
            int a = 442/0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("connection......DB");
        }
    }
    
}
