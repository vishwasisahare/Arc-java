/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author ayush
 */
public class Last implements Three{

    @Override
    public void evenodd(int x) {
        if (x % 2 == 0) {
            System.out.println(x+"this is even number");
        } else {
            System.out.println(x+"this odd number");
        }
           }

    @Override
    public void methedtwo(int a, int b) {
        int c = a+b;
        System.out.println("the sum is the "+c);
    }

    @Override
    public String myname(String name) {
      String myname = name;
      return myname;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Last la = new Last();
        la.evenodd(55);
        la.methedtwo(56, 855);
        la.myname("Rohit");
        System.out.println("my name is"+la.myname("vishu"));
    }

 
    
    
}
