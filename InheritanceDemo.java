import java.io.*;
class Animal{
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}
class JerryMouse extends Animal{
    public void display(){
        System.out.println("My name is "+name);
    }
}
public class InheritanceDemo{
    public static void main(String[] args){
        JerryMouse jm=new JerryMouse();
        jm.name="Jerry-The Mouse";
        jm.display();
        jm.eat();
    }
}
