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
public class ifelsematach {
    
    public static void main(String[] args) {
        
          String EmailId = "nick23@gmail.com";
        String Password = "Pass1234";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your EmailId");
        String id = sc.next();
        if (id.matches(EmailId)) {
            System.out.println("okk, Enter your your Password ");
            String pass = sc.next();
            if(pass.matches(Password)){
                System.out.println("Thank you");
            }else{
                
            }
        } else {
            System.out.println("invalid password ");
        }
    }
    
}
