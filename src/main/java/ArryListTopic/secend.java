/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArryListTopic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ayush
 */
public class secend {
    
    public static void main(String[] args) {
       
         ArrayList<Object> list = new ArrayList<>();
        System.out.println("Enter no ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        while (num != 0) {            
                 
            list.add(num);
            num = sc.nextInt();
        }
        System.out.println("-------------------------------------");
        System.out.println(list); 
                
    }
    
}
