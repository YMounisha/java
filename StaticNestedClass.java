import java.io.*;
class OuterClass{
    static int outer_x=10;
    int outer_y=20;
    private static int outer_z=30;
    static class StaticNestedClass{
        void display(){
            System.out.println("Outer_x value is "+outer_x);
            System.out.println("Outer_Z value is "+outer_z);
            OuterClass ot=new OuterClass();
            System.out.print("Outer_y value is "+ot.outer_y);
        }
    }
}
    public class staticNestedClassDemo{
        public static void main(String args[]){
            OuterClass.StaticNestedClass snc=new OuterClass.StaticNestedClass();
            snc.display();
    }
}
