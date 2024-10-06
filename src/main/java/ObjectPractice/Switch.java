/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPractice;

import java.util.Scanner;


public class Switch {
      
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any 1 to 5 no");
        int action = sc.nextInt();
        
        switch(action){
            case 1:
                System.out.println("appicalble");
                break;
                
                 case 2:
                System.out.println("appicalble");
                break;
                
                 case 3:
                System.out.println("appicalble");
                break;
                
                 case 4:
                System.out.println("appicalble");
                break;
                
                 case 5:
                System.out.println("appicalble");
                break;
                
                default:
                    System.out.println("does not exsist");
        }
        
    }
}
