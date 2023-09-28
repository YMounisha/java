import java.io.*;
class Rectangle {
    int l,b,a;
    Rectangle() {
        System.out.println("This is a default constructor");
    }
    Rectangle(int x,int y) {
        l=x;
        b=y;
        a=l*b;
    }
    Rectangle (Rectangle r ) {
        this.l=r.l;
        this.b=r.b;
        a=l*b;
    }
}
public class CopyConstructorDemo {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3,5);
        Rectangle r3 = new Rectangle(r2);
        System.out.println("Area of Rectangle 1 is "+r1.a);
        System.out.println("Area of Rectangle 2 is "+r2.a);
        System.out.println("Area of Rectangle 3 is "+r3.a);
    }
}
