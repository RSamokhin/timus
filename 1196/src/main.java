import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int r = 0;
        Map a = new HashMap<>();
        for (int i = 0 ; i < n ; i++){
            long y = in.nextInt();
            a.put(y, 1);
        }
        int m = in.nextInt();
        for (int j = 0 ; j < m ; j ++){
            long t = in.nextInt();
            if (a.containsKey(t)){
                r++;
                a.remove(t);
            }
        }
        out.println(r);
        out.flush();
    }
}