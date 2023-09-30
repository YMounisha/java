import java.io.*;
class A{
    void m(){
        System.out.println("Inside method m ");
    }
     void n(){
         System.out.println("Inside method n ");
         this.m();
     }   
     }
     public class ThisDemo3{
         public static void main(String[] args){
             A a=new A();
             a.n();
         }
     }
