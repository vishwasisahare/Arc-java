/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbadgeCollector;

/**
 *
 * @author ayush
 */
       //garbadge collector is the 1.   object iss nulll    2.  by assigning refrence to another   3. by anonymous
public class first {
    
    public first(){
        System.out.println("construtor.......");
    }
    
    protected void finalize() throws Throwable{
        System.out.println("finalize......");
    }
    
}
