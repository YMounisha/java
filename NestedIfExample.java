import java.io.*;
import java.util.*;
public class NestedIfExample{
public static void main(String[] args){
int m1,m2,m3;
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of three subjects");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
int total=m1+m2+m3;
float avg=(float)total/3;
if(avg>=75){
if(avg>=95){
  System.out.println("Your average is in top 5%");
}
else if(avg>=90){
  System.out.println("Your average is in top 10%");
}
else{
  System.out.println("Student passed in distinction");
}
}
else if(avg>=40&&avg<75){
  System.out.println("Student passed");
}
else{
  System.out.println("Student failed");
}
}
} 
