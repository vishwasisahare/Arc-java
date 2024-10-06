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

class Hello extends Thread{
    
    @Override
    public void run(){
        
        for (int i = 0; i < 1000; i++) {
            
            try {
                    Thread.sleep(1000);
            System.out.println("hello");
            } catch (Exception e) {
            }
        
        }
    }


}

class Hii extends Thread{
    
    @Override
    public void runn(){
      for (int i = 0; i < 1000; i++) {  
        try {
                    Thread.sleep(1000);
            System.out.println("hii");
            } catch (Exception e) {
            }
    }
    
}
public class first {
    
  // public static void main(String[] args) {
        
  //     Hello obj = new Hello();  obj.run();
  //     Hii obj2 = new Hii();     obj2.runn();
        
    }  

}