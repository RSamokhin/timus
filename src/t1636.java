import java.io.*;
import java.util.*;

public class t1636 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t1 = in.nextInt(), t2 = in.nextInt();
        int t = 0;
        for (int i = 0 ; i < 10 ; i ++){
            t = t + 20*in.nextInt();
        }
        out.println((t1+t>t2)?"Dirty debug :(":"No chance.");  
        out.flush();
    }
}