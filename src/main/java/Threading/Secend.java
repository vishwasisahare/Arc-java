/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 *
 * @author ayush
 */
public class Secend implements Running{

    @Override
    public void Run() {
      
        for (int i = 0; i < 10; i++) {
            try {
                 //Thread.sleep(5000)
                 System.out.println("getname()");
                 
            } catch (Exception e) {
            }
        }
    }
    
       @Override
    public void hii() {
    
           for (int i = 0; i < 10; i++) {
            try {
                 //Thread.sleep(5000)
                 System.out.println("hii");
                 
            } catch (Exception e) {
            }
        }
    }
    public static void main(String[] args) {
        
        Secend sec = new Secend(); 
        //sec.start();   sec.join();                its join too vip first print
        //sec.setName("hello may name")             set pripority
       // hii obj = new hii();
       //obj.start();
        
    }

 
    
    
}
