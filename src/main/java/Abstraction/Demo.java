/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author ayush
 */
abstract public class Demo {
    int a;
    
    abstract void some();
    
    void hi(int a, int b , int c , int d){
      int result =  a+b+c-d;
       System.out.println("the sum is the "+result);
    }
    
    public static void main(String[] args) {
        
    }
    
}
