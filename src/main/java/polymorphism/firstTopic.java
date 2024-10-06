/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

//method overloading
public class firstTopic {
    
    void Demo(){
        System.out.println("hello");
    }
    void Demo(int a){
        System.out.println(a);
    }
    void Demo(String b ,String c){
        System.out.println(b+ " "+c);
    }
    
    public static void main(String[] args) {
        
        firstTopic ft = new firstTopic();
        ft.Demo();
        ft.Demo(23);
        ft.Demo("i dont", "konw");
    }
}
