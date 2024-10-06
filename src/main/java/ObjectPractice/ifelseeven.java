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
public class ifelseeven {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any number");
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println(num+" even number");
    }else{
            System.out.println(num+" odd number ");
        }    
}
}