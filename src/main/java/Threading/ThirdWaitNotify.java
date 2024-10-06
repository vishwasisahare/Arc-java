/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

import java.util.Scanner;

/**
 *
 * @author ayush
 */
public class ThirdWaitNotify {
    
    public static void main(String[] args) {
         
        ThirdWaitNotify twf = new ThirdWaitNotify();
        
      //  new Thread (){
           // public  void run(){ twf.u() }
      //  } .start();
      // new Thread (){
              //public void (){
        
        //}      
                
    }
}
class Demo{
    int pankajSalary = 30 * 500 ,RohanSalary = 30 * 450;
    int pankajDays , RohanDays;
    
    synchronized void v() throws InterruptedException{
        
        System.out.println("the pankaj Salary is "+pankajSalary);
        System.out.println("the pankaj Salary is "+RohanSalary);
     
    }
    synchronized void u() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a two pankaj and rohan days ");
        wait();
        
        pankajDays = sc.nextInt();
        RohanDays = sc.nextInt();
        notify();
    }
    
   
}
