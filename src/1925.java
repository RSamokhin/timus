import java.io.*;
import java.util.*;

public class t1925 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int k = in.nextInt();
        int I = 0, Z = 0;
        for (int i = 0 ; i < n ; i ++){
            I=I+in.nextInt();
            Z=Z+in.nextInt();
        }
        int t = I+k-Z-2*(n+1);
        out.println((t>=0)?(t):("Big Bang!"));
        out.flush();
    }
} 