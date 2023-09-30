import java.io.*;
class Adder{
    int add(int a,int b){
        return a+b;
    }
    double add(double x,double y){
    return x+y;
}
}
public class MethodOverLoadingDemo2{
    public static void main(String[] args){
        Adder ad=new Adder();
        int x=ad.add(10,20);
        double y=ad.add(9.5,99.5);
        System.out.println("Value of x is "+x);
        System.out.println("Value of y is "+y);
    }
}
