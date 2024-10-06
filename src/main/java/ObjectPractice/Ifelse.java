/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPractice;

import java.util.Scanner;


public class Ifelse {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age");
        int age = sc.nextInt();
        
        if(age >= 18){
            System.out.println("you are eligible for the voting");
             char nation = sc.next().charAt(0);
             
            if (nation ==  'y') {
                System.out.println("congress you are the indian");
            } else {
                System.out.println("sorry you are not indian that why  not accepteble");
            }
        }
        else{
            System.out.println("you are not eligible for the voting ");
        }
    }
    
}
