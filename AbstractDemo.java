import java.io.*;
abstract class Animal{
    public abstract void animalSound();
    public void eat(){
        System.out.println("I can eat");
    }
}
class Cow extends Animal{
    public void animalSound(){
        System.out.println("Cow sounds Maa");
    }
}
public class AbstractDemo{
    public static void main(String[] args){
        Cow c=new Cow();
        c.animalSound();
        c.eat();
    }
}
