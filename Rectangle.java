import java.io.*;
class Rectangle{
    int l,b,a;
    Rectangle()
    {
        
    }
    Rectangle(int l,int b){
         a=l*b;
}
}
public class ParametrizedConstructorDemo{
    public static void main(String arg[]){
        Rectangle r=new Rectangle(5,8);
        System.out.println("Area of rectangle"+r.a);
    }
}
