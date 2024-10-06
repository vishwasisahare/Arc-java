/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

//using a method access static
//constructor
class Demo{
    
    static {
        System.out.println("i am vishwasi");
    }
    
    Demo(){  //constructor
        System.out.println("constructor.......s");
    }
    
     Demo(int a, int b){
        System.out.println("constructor.......s"+(a+b));
    }
    
    
    static  void some(){
        System.out.println("hello");

    }
   public void entir(){
            System.out.println("hiii");
}
} 
public class Topic2 {
    
    public static void main(String[] args) {
        
        Demo.some();
        Demo dm = new Demo();
        Demo dm1 = new Demo(55,85);
        dm.entir();
    }
}
