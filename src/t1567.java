import java.io.*;
import java.util.*;

public class t1567 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        char[] m = in.nextLine().toCharArray();
        int n = 0;
        String d = ".,! ";
        for (int i = 0 ; i < m.length ; i ++){
            char l = m[i];
            int h;
            if (d.indexOf(l)>0)
                h = (d.indexOf(l))%3+1;
            else
                h = (l - 'a')%3 + 1;
           n+=h;
        }
        out.println(n);
        out.flush();
    }
}