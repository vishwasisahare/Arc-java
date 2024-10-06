/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author ayush
 */
public class third extends ThirdTopic{
    
    void other(int a){
        System.out.println(a);
    }
    
    @Override
    void rahul(int a){
       
    }
    
    public static void main(String[] args) {
        
        third th = new third();
        th.other(50);
        th.some();
        th.rahul(52);
        
    }
}
