/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;


public class Topicthree {
    
    public static void main(String[] args) {
        
        try {
            int a[] = {1,2};
            a[5] = 4;  
            System.out.println(a[0]);

        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
           
    
}
