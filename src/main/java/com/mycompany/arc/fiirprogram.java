/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arc;

import java.util.Scanner;


public class fiirprogram {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        
         int i = 0;
         for(i = 0 ; i <= num ; i++){
             System.out.println(i);
         }
         
         
        System.out.println("hello , you want any fruit plz E netr any character");
        char action = sc.next().charAt(0);
        
        
         
         switch(action){
             case 'A': case 'a':
                 System.out.println("mango");
                 break;
                 
                  case 'B': case 'b':
                 System.out.println("mango");
                 break;
                 
                  case 'C': case 'c':
                 System.out.println("mango");
                 break;
                 
                  case 'D': case 'd':
                 System.out.println("mango");
                 break;
                 
                  case 'E': case 'e':
                 System.out.println("mango");
                 break;
                 
                 default:
                     System.out.println("no available");
                 
         }
    }
    
}
