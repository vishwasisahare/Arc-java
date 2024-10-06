
package Threading;

/**
 *
 * @author ayush
 
public class DemanTopic extends Thread{            //deman is used baclgrund garbadge collector
    
    @Override
    public void run(){
        if(Thread.currentThread().isAlive){
            System.out.println("Deman Thread");
        }else{
            System.out.println("not Deman Thread");
        }
    }
    
    public static void main(String[] args) {
        
        DemanTopic DT = new DemanTopic();
        DT.start();
        DT.run();
        
    }
    
    
    
}
*/