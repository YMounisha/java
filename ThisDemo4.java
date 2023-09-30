import java.io.*;
class A{
    A(){
        System.out.println("Default constructor ");
    }
     A(int x){
         this();
         System.out.println("Parameterized constructor x is "+x);
     }   
     }
     public class ThisDemo4{
         public static void main(String[] args){
             A a=new A(10);
         }
     }
