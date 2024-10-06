/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPractice;


import java.util.Scanner;


public class scann {
    
   int info(int a, int b){
       return a+b;
   }
    
    public static void main(String[] args) {
    
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :" );
        int age = sc.nextInt();
        System.out.println("Enter your city :");
        String city = sc.nextLine();
        
        System.out.println("welcome to may world :");
        
         System.out.println("this is the selction of the veitable ");
         String veg = sc.nextLine();
         if (veg == "tomato") {
             System.out.println("this i want to be the veg ");
        } else if(veg == "bringel") {
             System.out.println("no ");
        }else if(veg == "chilli"){
             System.out.println("no i dont want");   
        }else{
             System.out.println("this is not a vegitable");
                    
        }
            
        
    }    
    

     
}
