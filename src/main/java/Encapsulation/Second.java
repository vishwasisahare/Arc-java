/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

public class Second {
    
    
     private int pass;
     private String name;
     private String city;
     private int userid;

   
    
    public void set(int pass){
      this.pass = pass;
    }
    
    public int getpass(){
        return pass;
    }
    
    public void set(String name){
        this.name = name;
    }
    
    public String getname(){
      return name;
    }
    
    public void setuserid(int userid){
        this.userid = userid;
    }
    
    public int getuserid(){
        return userid;
    }
    
    //using construtor
    public Second(){}
    public Second(String city ){
        this.city = city;
        
    }
    public String getcico(){
        return city ;
        
        
    }
   
    
}
