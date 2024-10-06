/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileHandleing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ayush
 */
public class Third {
    
    public static void main(String[] args) throws IOException {
        
       File file = new File("D:\\.write.txt");
       
        FileWriter filewriter = new FileWriter(file);   //1
        filewriter.write("hello");
        filewriter.close();
        
        
        FileOutputStream fos = new FileOutputStream(file);  //2
        fos.write(65);
        fos.close();
        
        
        PrintWriter pw = new PrintWriter(file);     //3
        pw.print('a');
        pw.close();
        
        FileReader fr = new FileReader(file);        //4 for the read
        fr.read();
    }
    
}
