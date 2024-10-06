
package ObjectPractice;

public class first {
    
    public void arc(int a, int b){
        System.out.println(a+b);
    }
    
    public void info(String name){
        System.out.println(name);
    }
    private void pass(String imppass){
        System.out.println(imppass);
    }
            
    
    public static void main(String[] args) {
        
        first fr = new first();
        fr.arc(20, 300);
        fr.info("vishwasi");
        fr.pass("vishu12345667");
    }
    
}
