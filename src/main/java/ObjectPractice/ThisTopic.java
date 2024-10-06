/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPractice;

/**
 *
 * @author ayush
 */
public class ThisTopic {
    
    int a;  //instance variable
    int roll;  //(this) refer kr raha hai current class ke instence variable ko
    
    void some(int roll){
      this.roll = roll;
    }
    
    void show(){
        System.out.println(roll);
    }
    
    void Hello(int a){
        System.out.println(a);
    }
    void hi(){
        System.out.println("i dont know");
    }
     public static void main(String[] args) {
        
         ThisTopic tt = new ThisTopic();
         tt.hi();
         tt.Hello(20);
         tt.some(2);
    }
}
