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
public class ContainsTopic {
    
    public static void main(String[] args) {
        
        //for using find the data
        
        String data = "what know about me";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word");
        String userdata = sc.next();
        
        if (data.contains(userdata)) {
            System.out.println("userdata "+userdata);
        } else {
            System.out.println("not available");
        }
    }
    
}
