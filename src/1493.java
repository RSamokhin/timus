import java.io.*;
import java.util.*;

public class t1493 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int a = n/1000, b=n%1000;
        if ((b+1<1000)&&(compute(b+1)==compute(a))||(b-1>=0)&&(compute(b-1)==compute(a)))
            out.println("Yes");
        else
            out.println("No");
        out.flush();
    }
    public static int compute(int b){
        return b%10+(b%100)/10+(b%1000)/100;
    }
} 