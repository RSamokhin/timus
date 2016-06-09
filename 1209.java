import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        long m[]=new long[n];
        for (int i = 0 ; i < n ; i++)
               m[i]=in.nextInt();
        for (int j = 0 ; j < n ; j++){
            long k = m[j];
            double x = (-1+Math.sqrt(8*k-7))/2;
            if (x - Math.floor(x)==0)
                out.println(1);
            else
                out.println(0);
        }
        out.flush();
    }
}
