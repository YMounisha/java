import java.io.*;
class Adder{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
        int add(int a){
        return a;
    }
}
    public class MethodOverLoadingDemo{
        public static void main(String[] args){
            Adder ad=new Adder();
            int x=ad.add(5);
            int y=ad.add(10,20);
            int z=ad.add(x,y,0);
            System.out.println("Value of x is "+x);
            System.out.println("Value of y is "+y);
            System.out.println("Value of z is "+z);
        }
    }
