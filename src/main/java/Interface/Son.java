/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author ayush
 */
public class Son implements Dady ,Mom{

   
    @Override
    public void aree() {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Son ss= new Son();
        ss.aree();
    }

    
    
}
