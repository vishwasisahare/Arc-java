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
    //constructor overloading
public class secendTopic {
    
    secendTopic( int a, int b){
        int ans = a+b;
        System.out.println("the addition us the :"+ans);
    }
     secendTopic( int a, int b,int c){
        int ans = a-b-c;
        System.out.println("the addition us the :"+ans);
    }
      secendTopic( String a, String b){
        String ans = a+b;
        System.out.println("the addition us the :"+ans);
    }
     void show(){
         System.out.println("hello");
     }
          
    
    public static void main(String[] args) {
        secendTopic st = new secendTopic(22,66);
        secendTopic st1 = new secendTopic(22,66,55);
        secendTopic st2 = new secendTopic("vishu","sahare");
        st.show();
    }
    
}
