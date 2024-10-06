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
public class iflesetypeprogram {
    
    public static void main(String[] args) {
        
        String EmailId = "vishwasisahre6791@gmail.com";
        String Password = "Pass123";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your EmailId");
        String id = sc.next();
        if (id.equalsIgnoreCase(EmailId)) {
            System.out.println("okk, Enter your your Password ");
            String pass = sc.next();
            if(pass.equalsIgnoreCase(Password)){
                System.out.println("Thank you");
            }else{
                
            }
        } else {
            System.out.println("invalid password ");
        }
        
                
    }
    
}
