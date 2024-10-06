/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileHandleing;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author ayush
 */
public class FirstDemo {
    
    public static void main(String[] args) throws IOException {
        
      File file = new File("D:\\.text");
       
     file.createNewFile();
      if(file.exists()){
          System.out.println(file.canWrite());
          System.out.println(file.getName());
          System.out.println(file.canExecute());
          System.out.println(file.canRead());
         
      }else{
          System.out.println("file does not exist");
      }
       System.out.println("done");
    }

    
    
}
