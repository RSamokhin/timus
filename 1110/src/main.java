import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(), m = in.nextInt(), y = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int x = 0 ; x < m ; x++){
            int j=1;
            for (int i = 0 ; i < n ; i++){
                j = j * (x%m);
            }
            if (j%m==y)
                a.add(x);
        }
        if (a.size()>0)
            a.stream().forEach((f) -> {
                out.print(f+" ");
        });
        else
            out.println(-1);
        out.flush();
    }
} 