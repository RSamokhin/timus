import java.io.*;
import java.util.*;

public class t1991 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(), k = in.nextInt();
        long q=0,w=0;
        for (int i = 0 ; i < n ; i++){
            int t = in.nextInt();
            if (t>k)
                q+=t-k;
            else
                w+=k-t;
        }        
        out.println(q);
        out.println(w);
        out.flush();
    }
} 