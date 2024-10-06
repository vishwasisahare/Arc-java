/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

import java.util.Scanner;

/**
 *
 * @author ayush
 */
public class Demo {
    
    Demo(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1 no");
        int a = sc.nextInt();
        System.out.println("Enter a 2 no");
        int b = sc.nextInt();
        Demo dm = new Demo(a ,b);
        
    }
}
