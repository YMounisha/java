import java.io.*;
class Sample{
public String activity;
    public String task;
}
public class PrivateDemo{
    public static void main(String[] args){
        Sample s=new Sample();
        s.activity = "playing";
        s.task = "eating";
        System.out.println("Activity is "+s.activity);
        System.out.println("Task is "+s.task);
    }
    
}
