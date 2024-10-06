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
public class Test extends Demo{

    @Override
    void some() {
       int a =20,b =5 ,c = a +b;
        System.out.println("sub is :"+c);
        
        
    }
    
    public static void main(String[] args) {
        Test ts = new Test();
        ts.some();
        ts.hi(20, 50, 85, 69);
    }
    
    
    
}
