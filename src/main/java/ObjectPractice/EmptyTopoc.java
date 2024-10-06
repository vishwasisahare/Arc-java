/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPractice;

import java.util.Scanner;

/**
 *
 * @author ayush
 */
public class EmptyTopoc {
    
    public static void main(String[] args) {
        
            String data = "hey where are you now";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word");
        String userdata = sc.next();
        
        if (data.isEmpty()) {
            System.out.println("it is empty");
                 
        } else {
            System.out.println("tha data not here");
        }
    }
    
}
