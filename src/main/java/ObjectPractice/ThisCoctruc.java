

package ObjectPractice;


public class ThisCoctruc {
    
   ThisCoctruc(){
       
         this(20);       
          System.out.println("hello");
    }
    
    ThisCoctruc(int a){
       
        System.out.println(a);
    }
    public static void main(String[] args) {
        
        ThisCoctruc tc = new ThisCoctruc();
        
    }
}
