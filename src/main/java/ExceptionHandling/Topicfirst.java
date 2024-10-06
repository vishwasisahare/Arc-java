/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.Scanner;


public class Topicfirst {
    
    public static void main(String[] args) {
        
        try {
             Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a/b;
        
        System.out.println("the calculation is the "+c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
