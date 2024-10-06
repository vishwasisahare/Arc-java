/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author ayush
 */
public class TwoD {
    
    public static void main(String[] args) {
        
        int a[][] = {{51,63,98},
                     {56,44,65}};
        
        for (int i = 0; i < 3; i++) {
           
            for (int j = 0; j < 3; j++) {
                
                System.out.println(a[i][j]); 
                System.out.println(" ");
            }
            System.out.println("\n");
        }
    }
    
}
