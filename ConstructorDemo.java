import java.io.*;
 class Rectangle{
    int l,b,a;
    Rectangle(){
        l = 5;
        b = 8;
        a = l*b;
    }
}
public class ConstructorDemo{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        System.out.println("Area of Rectangle is "+r1.a);
        System.out.println("Area of Rectangle is "+r2.a);
    }
}
