/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


public class Beta implements Papa{

     final static int a = 5;
    @Override
    public void some() {
        System.out.println(a);
    }

    @Override
    public int hello() {
        System.out.println("there are the interface of the java concept");
       return hello();
    }
    
    public static void main(String[] args) {
        Beta be = new Beta();
        be.hello();
        be.some();
    }
    
}
