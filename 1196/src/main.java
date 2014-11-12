import java.io.*;
import java.util.*;
import java.util.TreeSet;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int r = 0;
        int max = 0;
        int min = 0;
        HashSet<Integer> a = new HashSet<>();
        for (int i = 0 ; i < n ; i++){
            int y = in.nextInt();
            a.add(y);
            if (i==0)
                   min = y;
            if (i==n-1)
                   max = y;
        }
        int m = in.nextInt();
        for (int j = 0 ; j < m ; j ++){
            int t = in.nextInt();
            if ((t<max)||(t>min))
                if (a.contains(t)){
                    r++;
                 }
        }
        out.println(r);
        out.flush();
    }
}