import java.io.*;
import java.util.*;
public class StudentAverage{
public static void main(String[] args){
int m1,m2,m3;
System.out.println("Enter marks of three subjects");
Scanner sc=new Scanner(System.in);
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
float avg=(float)total/3;
if(avg>=75)
{
  System.out.println("Student passed in distinction");
}
else if(avg>=60&&avg<75){
  System.out.println("Student passed in first class");
}
else if(avg>=50&&avg<60){
  System.out.println("Student passed in second class");
}
else if(avg>=40&&avg<50){
  System.out.println("Student passed in third class");
}
else{
  System.out.println("Student is failed");
}
}
}
