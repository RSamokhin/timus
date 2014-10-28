import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(); //fibb 2-2-4-6-10
        long f0=0, f1=1;      
        long fn=f1;
            for (int i = 2 ; i <n ; i++){
                long t=f1;
                fn = fn+f1;
                f1 = f1 +f0;
                f0=t;
                 
            }
        out.println(2*fn);
        out.flush();
    }
} 