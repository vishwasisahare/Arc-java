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
public class ReplaceToic {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String some = sc.nextLine();
        some.replace(some,"");
       // StringBuffer buffer = new StringBuffer("computer");
       // buffer.replace(2, 5, "ddddd");
        
        System.out.println(some);
    }
    
}
