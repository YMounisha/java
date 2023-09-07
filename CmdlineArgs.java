import java.io.*;
public class CmdlineArgs{
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x+y;
        System.out.println("Sum of "+x+ "&"+y+ "is"+z);
    }
}
