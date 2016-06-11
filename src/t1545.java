import java.io.*;
import java.util.*;

public class t1545 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String [] a = new String[26];
        for (int i = 0 ; i < 26 ; i ++){
            a[i]="";
        }
        int n = in.nextInt();
        for (int j = 0 ; j < n ; j ++){
            String t = in.next();
            int p = "abcdefghijklmnopqrstuvwxyz".indexOf(t.substring(0, 1));
            a[p]=a[p]+"\n"+t;
        }
        String f = in.next();
        out.println(a["abcdefghijklmnopqrstuvwxyz".indexOf(f)]);
        out.flush();
    }
}