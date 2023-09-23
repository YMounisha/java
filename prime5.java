import java.util.*;
public class PrimeList3 {

  public static void main(String[] args)
  {
      int i=0,j=0,low=0,high=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the low range to display prime numbers");
      low=sc.nextInt();
      System.out.println("Enter the high range to display prime numbers");
      high=sc.nextInt();
      System.out.println("the prime numbers between "+low+" and "+high+" are:  " );
     for(i=low;i<=high;i++)
     {
        boolean flag = false;
       for (j = 2; j <= i/ 2; j++) {
      // condition for nonprime number
      if (i % j == 0) {
        flag = true;
        break;
      }
    }
    if (!flag){
      System.out.print(i+" ");
    }
     }
}
}
